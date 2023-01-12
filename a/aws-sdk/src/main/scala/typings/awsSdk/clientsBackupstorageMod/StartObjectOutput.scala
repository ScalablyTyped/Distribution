package typings.awsSdk.clientsBackupstorageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartObjectOutput extends StObject {
  
  /**
    * Upload Id for a given upload.
    */
  var UploadId: String
}
object StartObjectOutput {
  
  inline def apply(UploadId: String): StartObjectOutput = {
    val __obj = js.Dynamic.literal(UploadId = UploadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartObjectOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartObjectOutput] (val x: Self) extends AnyVal {
    
    inline def setUploadId(value: String): Self = StObject.set(x, "UploadId", value.asInstanceOf[js.Any])
  }
}
