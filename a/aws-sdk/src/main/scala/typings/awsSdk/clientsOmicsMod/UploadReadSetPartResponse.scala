package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadReadSetPartResponse extends StObject {
  
  /**
    *  An identifier used to confirm that parts are being added to the intended upload. 
    */
  var checksum: String
}
object UploadReadSetPartResponse {
  
  inline def apply(checksum: String): UploadReadSetPartResponse = {
    val __obj = js.Dynamic.literal(checksum = checksum.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadReadSetPartResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UploadReadSetPartResponse] (val x: Self) extends AnyVal {
    
    inline def setChecksum(value: String): Self = StObject.set(x, "checksum", value.asInstanceOf[js.Any])
  }
}
