package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuditImage extends StObject {
  
  var BoundingBox: js.UndefOr[typings.awsSdk.clientsRekognitionMod.BoundingBox] = js.undefined
  
  /**
    * The Base64-encoded bytes representing an image selected from the Face Liveness video and returned for audit purposes.
    */
  var Bytes: js.UndefOr[LivenessImageBlob] = js.undefined
  
  var S3Object: js.UndefOr[typings.awsSdk.clientsRekognitionMod.S3Object] = js.undefined
}
object AuditImage {
  
  inline def apply(): AuditImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuditImage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuditImage] (val x: Self) extends AnyVal {
    
    inline def setBoundingBox(value: BoundingBox): Self = StObject.set(x, "BoundingBox", value.asInstanceOf[js.Any])
    
    inline def setBoundingBoxUndefined: Self = StObject.set(x, "BoundingBox", js.undefined)
    
    inline def setBytes(value: LivenessImageBlob): Self = StObject.set(x, "Bytes", value.asInstanceOf[js.Any])
    
    inline def setBytesUndefined: Self = StObject.set(x, "Bytes", js.undefined)
    
    inline def setS3Object(value: S3Object): Self = StObject.set(x, "S3Object", value.asInstanceOf[js.Any])
    
    inline def setS3ObjectUndefined: Self = StObject.set(x, "S3Object", js.undefined)
  }
}
