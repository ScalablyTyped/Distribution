package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobManifestGenerator extends StObject {
  
  /**
    * The S3 job ManifestGenerator's configuration details.
    */
  var S3JobManifestGenerator: js.UndefOr[typings.awsSdk.clientsS3controlMod.S3JobManifestGenerator] = js.undefined
}
object JobManifestGenerator {
  
  inline def apply(): JobManifestGenerator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobManifestGenerator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JobManifestGenerator] (val x: Self) extends AnyVal {
    
    inline def setS3JobManifestGenerator(value: S3JobManifestGenerator): Self = StObject.set(x, "S3JobManifestGenerator", value.asInstanceOf[js.Any])
    
    inline def setS3JobManifestGeneratorUndefined: Self = StObject.set(x, "S3JobManifestGenerator", js.undefined)
  }
}
