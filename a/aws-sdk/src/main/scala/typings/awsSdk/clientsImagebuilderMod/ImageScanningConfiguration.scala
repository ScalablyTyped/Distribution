package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageScanningConfiguration extends StObject {
  
  /**
    * Contains Amazon ECR settings for vulnerability scans.
    */
  var ecrConfiguration: js.UndefOr[EcrConfiguration] = js.undefined
  
  /**
    * A setting that indicates whether Image Builder keeps a snapshot of the vulnerability scans that Amazon Inspector runs against the build instance when you create a new image.
    */
  var imageScanningEnabled: js.UndefOr[NullableBoolean] = js.undefined
}
object ImageScanningConfiguration {
  
  inline def apply(): ImageScanningConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageScanningConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageScanningConfiguration] (val x: Self) extends AnyVal {
    
    inline def setEcrConfiguration(value: EcrConfiguration): Self = StObject.set(x, "ecrConfiguration", value.asInstanceOf[js.Any])
    
    inline def setEcrConfigurationUndefined: Self = StObject.set(x, "ecrConfiguration", js.undefined)
    
    inline def setImageScanningEnabled(value: NullableBoolean): Self = StObject.set(x, "imageScanningEnabled", value.asInstanceOf[js.Any])
    
    inline def setImageScanningEnabledUndefined: Self = StObject.set(x, "imageScanningEnabled", js.undefined)
  }
}
