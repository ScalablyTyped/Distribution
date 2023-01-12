package typings.awsSdk.clientsEcrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageScanningConfiguration extends StObject {
  
  /**
    * The setting that determines whether images are scanned after being pushed to a repository. If set to true, images will be scanned after being pushed. If this parameter is not specified, it will default to false and images will not be scanned unless a scan is manually started with the API_StartImageScan API.
    */
  var scanOnPush: js.UndefOr[ScanOnPushFlag] = js.undefined
}
object ImageScanningConfiguration {
  
  inline def apply(): ImageScanningConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageScanningConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageScanningConfiguration] (val x: Self) extends AnyVal {
    
    inline def setScanOnPush(value: ScanOnPushFlag): Self = StObject.set(x, "scanOnPush", value.asInstanceOf[js.Any])
    
    inline def setScanOnPushUndefined: Self = StObject.set(x, "scanOnPush", js.undefined)
  }
}
