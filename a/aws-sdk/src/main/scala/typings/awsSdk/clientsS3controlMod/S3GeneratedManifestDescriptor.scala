package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3GeneratedManifestDescriptor extends StObject {
  
  /**
    * The format of the generated manifest.
    */
  var Format: js.UndefOr[GeneratedManifestFormat] = js.undefined
  
  var Location: js.UndefOr[JobManifestLocation] = js.undefined
}
object S3GeneratedManifestDescriptor {
  
  inline def apply(): S3GeneratedManifestDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3GeneratedManifestDescriptor]
  }
  
  extension [Self <: S3GeneratedManifestDescriptor](x: Self) {
    
    inline def setFormat(value: GeneratedManifestFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "Format", js.undefined)
    
    inline def setLocation(value: JobManifestLocation): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "Location", js.undefined)
  }
}
