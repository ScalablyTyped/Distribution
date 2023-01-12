package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroundTruthManifest extends StObject {
  
  var S3Object: js.UndefOr[typings.awsSdk.clientsRekognitionMod.S3Object] = js.undefined
}
object GroundTruthManifest {
  
  inline def apply(): GroundTruthManifest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroundTruthManifest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GroundTruthManifest] (val x: Self) extends AnyVal {
    
    inline def setS3Object(value: S3Object): Self = StObject.set(x, "S3Object", value.asInstanceOf[js.Any])
    
    inline def setS3ObjectUndefined: Self = StObject.set(x, "S3Object", js.undefined)
  }
}
