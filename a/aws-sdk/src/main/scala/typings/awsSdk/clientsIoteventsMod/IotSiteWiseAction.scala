package typings.awsSdk.clientsIoteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IotSiteWiseAction extends StObject {
  
  /**
    * The ID of the asset that has the specified property.
    */
  var assetId: js.UndefOr[AssetId] = js.undefined
  
  /**
    * A unique identifier for this entry. You can use the entry ID to track which data entry causes an error in case of failure. The default is a new unique identifier.
    */
  var entryId: js.UndefOr[AssetPropertyEntryId] = js.undefined
  
  /**
    * The alias of the asset property.
    */
  var propertyAlias: js.UndefOr[AssetPropertyAlias] = js.undefined
  
  /**
    * The ID of the asset property.
    */
  var propertyId: js.UndefOr[AssetPropertyId] = js.undefined
  
  /**
    * The value to send to the asset property. This value contains timestamp, quality, and value (TQV) information. 
    */
  var propertyValue: js.UndefOr[AssetPropertyValue] = js.undefined
}
object IotSiteWiseAction {
  
  inline def apply(): IotSiteWiseAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IotSiteWiseAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IotSiteWiseAction] (val x: Self) extends AnyVal {
    
    inline def setAssetId(value: AssetId): Self = StObject.set(x, "assetId", value.asInstanceOf[js.Any])
    
    inline def setAssetIdUndefined: Self = StObject.set(x, "assetId", js.undefined)
    
    inline def setEntryId(value: AssetPropertyEntryId): Self = StObject.set(x, "entryId", value.asInstanceOf[js.Any])
    
    inline def setEntryIdUndefined: Self = StObject.set(x, "entryId", js.undefined)
    
    inline def setPropertyAlias(value: AssetPropertyAlias): Self = StObject.set(x, "propertyAlias", value.asInstanceOf[js.Any])
    
    inline def setPropertyAliasUndefined: Self = StObject.set(x, "propertyAlias", js.undefined)
    
    inline def setPropertyId(value: AssetPropertyId): Self = StObject.set(x, "propertyId", value.asInstanceOf[js.Any])
    
    inline def setPropertyIdUndefined: Self = StObject.set(x, "propertyId", js.undefined)
    
    inline def setPropertyValue(value: AssetPropertyValue): Self = StObject.set(x, "propertyValue", value.asInstanceOf[js.Any])
    
    inline def setPropertyValueUndefined: Self = StObject.set(x, "propertyValue", js.undefined)
  }
}
