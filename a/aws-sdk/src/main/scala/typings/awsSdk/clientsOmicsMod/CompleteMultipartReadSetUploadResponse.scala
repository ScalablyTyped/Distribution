package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompleteMultipartReadSetUploadResponse extends StObject {
  
  /**
    *  The read set ID created for an uploaded read set. 
    */
  var readSetId: ReadSetId
}
object CompleteMultipartReadSetUploadResponse {
  
  inline def apply(readSetId: ReadSetId): CompleteMultipartReadSetUploadResponse = {
    val __obj = js.Dynamic.literal(readSetId = readSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompleteMultipartReadSetUploadResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompleteMultipartReadSetUploadResponse] (val x: Self) extends AnyVal {
    
    inline def setReadSetId(value: ReadSetId): Self = StObject.set(x, "readSetId", value.asInstanceOf[js.Any])
  }
}
