package typings.awsSdk.clientsIoteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IotSiteWiseAssetModelPropertyIdentifier extends StObject {
  
  /**
    *  The ID of the AWS IoT SiteWise asset model. 
    */
  var assetModelId: AssetModelId
  
  /**
    *  The ID of the AWS IoT SiteWise asset property. 
    */
  var propertyId: AssetPropertyId
}
object IotSiteWiseAssetModelPropertyIdentifier {
  
  inline def apply(assetModelId: AssetModelId, propertyId: AssetPropertyId): IotSiteWiseAssetModelPropertyIdentifier = {
    val __obj = js.Dynamic.literal(assetModelId = assetModelId.asInstanceOf[js.Any], propertyId = propertyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IotSiteWiseAssetModelPropertyIdentifier]
  }
  
  extension [Self <: IotSiteWiseAssetModelPropertyIdentifier](x: Self) {
    
    inline def setAssetModelId(value: AssetModelId): Self = StObject.set(x, "assetModelId", value.asInstanceOf[js.Any])
    
    inline def setPropertyId(value: AssetPropertyId): Self = StObject.set(x, "propertyId", value.asInstanceOf[js.Any])
  }
}
