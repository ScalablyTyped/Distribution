package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutAssetPropertyValueEntry extends StObject {
  
  /**
    * The ID of the IoT SiteWise asset. You must specify either a propertyAlias or both an aliasId and a propertyId. Accepts substitution templates.
    */
  var assetId: js.UndefOr[AssetId] = js.undefined
  
  /**
    * Optional. A unique identifier for this entry that you can define to better track which message caused an error in case of failure. Accepts substitution templates. Defaults to a new UUID.
    */
  var entryId: js.UndefOr[AssetPropertyEntryId] = js.undefined
  
  /**
    * The name of the property alias associated with your asset property. You must specify either a propertyAlias or both an aliasId and a propertyId. Accepts substitution templates.
    */
  var propertyAlias: js.UndefOr[AssetPropertyAlias] = js.undefined
  
  /**
    * The ID of the asset's property. You must specify either a propertyAlias or both an aliasId and a propertyId. Accepts substitution templates.
    */
  var propertyId: js.UndefOr[AssetPropertyId] = js.undefined
  
  /**
    * A list of property values to insert that each contain timestamp, quality, and value (TQV) information.
    */
  var propertyValues: AssetPropertyValueList
}
object PutAssetPropertyValueEntry {
  
  inline def apply(propertyValues: AssetPropertyValueList): PutAssetPropertyValueEntry = {
    val __obj = js.Dynamic.literal(propertyValues = propertyValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutAssetPropertyValueEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutAssetPropertyValueEntry] (val x: Self) extends AnyVal {
    
    inline def setAssetId(value: AssetId): Self = StObject.set(x, "assetId", value.asInstanceOf[js.Any])
    
    inline def setAssetIdUndefined: Self = StObject.set(x, "assetId", js.undefined)
    
    inline def setEntryId(value: AssetPropertyEntryId): Self = StObject.set(x, "entryId", value.asInstanceOf[js.Any])
    
    inline def setEntryIdUndefined: Self = StObject.set(x, "entryId", js.undefined)
    
    inline def setPropertyAlias(value: AssetPropertyAlias): Self = StObject.set(x, "propertyAlias", value.asInstanceOf[js.Any])
    
    inline def setPropertyAliasUndefined: Self = StObject.set(x, "propertyAlias", js.undefined)
    
    inline def setPropertyId(value: AssetPropertyId): Self = StObject.set(x, "propertyId", value.asInstanceOf[js.Any])
    
    inline def setPropertyIdUndefined: Self = StObject.set(x, "propertyId", js.undefined)
    
    inline def setPropertyValues(value: AssetPropertyValueList): Self = StObject.set(x, "propertyValues", value.asInstanceOf[js.Any])
    
    inline def setPropertyValuesVarargs(value: AssetPropertyValue*): Self = StObject.set(x, "propertyValues", js.Array(value*))
  }
}
