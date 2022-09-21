package typings.awsSdk.backupstorageMod

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
  
  extension [Self <: StartObjectOutput](x: Self) {
    
    inline def setUploadId(value: String): Self = StObject.set(x, "UploadId", value.asInstanceOf[js.Any])
  }
}
