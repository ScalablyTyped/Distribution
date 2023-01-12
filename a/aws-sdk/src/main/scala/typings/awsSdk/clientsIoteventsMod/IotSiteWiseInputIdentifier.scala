package typings.awsSdk.clientsIoteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IotSiteWiseInputIdentifier extends StObject {
  
  /**
    *  The identifier of the AWS IoT SiteWise asset model property. 
    */
  var iotSiteWiseAssetModelPropertyIdentifier: js.UndefOr[IotSiteWiseAssetModelPropertyIdentifier] = js.undefined
}
object IotSiteWiseInputIdentifier {
  
  inline def apply(): IotSiteWiseInputIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IotSiteWiseInputIdentifier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IotSiteWiseInputIdentifier] (val x: Self) extends AnyVal {
    
    inline def setIotSiteWiseAssetModelPropertyIdentifier(value: IotSiteWiseAssetModelPropertyIdentifier): Self = StObject.set(x, "iotSiteWiseAssetModelPropertyIdentifier", value.asInstanceOf[js.Any])
    
    inline def setIotSiteWiseAssetModelPropertyIdentifierUndefined: Self = StObject.set(x, "iotSiteWiseAssetModelPropertyIdentifier", js.undefined)
  }
}
