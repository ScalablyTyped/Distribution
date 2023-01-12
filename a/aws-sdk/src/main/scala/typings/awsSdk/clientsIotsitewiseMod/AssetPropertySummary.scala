package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssetPropertySummary extends StObject {
  
  /**
    * The alias that identifies the property, such as an OPC-UA server data stream path (for example, /company/windfarm/3/turbine/7/temperature). For more information, see Mapping industrial data streams to asset properties in the IoT SiteWise User Guide.
    */
  var alias: js.UndefOr[PropertyAlias] = js.undefined
  
  /**
    *  The ID of the composite model that contains the asset property. 
    */
  var assetCompositeModelId: js.UndefOr[ID] = js.undefined
  
  /**
    * The ID of the property.
    */
  var id: js.UndefOr[ID] = js.undefined
  
  var notification: js.UndefOr[PropertyNotification] = js.undefined
  
  /**
    *  The unit of measure (such as Newtons or RPM) of the asset property. 
    */
  var unit: js.UndefOr[PropertyUnit] = js.undefined
}
object AssetPropertySummary {
  
  inline def apply(): AssetPropertySummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssetPropertySummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssetPropertySummary] (val x: Self) extends AnyVal {
    
    inline def setAlias(value: PropertyAlias): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    inline def setAssetCompositeModelId(value: ID): Self = StObject.set(x, "assetCompositeModelId", value.asInstanceOf[js.Any])
    
    inline def setAssetCompositeModelIdUndefined: Self = StObject.set(x, "assetCompositeModelId", js.undefined)
    
    inline def setId(value: ID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setNotification(value: PropertyNotification): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
    
    inline def setNotificationUndefined: Self = StObject.set(x, "notification", js.undefined)
    
    inline def setUnit(value: PropertyUnit): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
