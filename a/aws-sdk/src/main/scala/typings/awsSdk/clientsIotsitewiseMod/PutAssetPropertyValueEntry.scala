package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutAssetPropertyValueEntry extends StObject {
  
  /**
    * The ID of the asset to update.
    */
  var assetId: js.UndefOr[ID] = js.undefined
  
  /**
    * The user specified ID for the entry. You can use this ID to identify which entries failed.
    */
  var entryId: EntryId
  
  /**
    * The alias that identifies the property, such as an OPC-UA server data stream path (for example, /company/windfarm/3/turbine/7/temperature). For more information, see Mapping industrial data streams to asset properties in the IoT SiteWise User Guide.
    */
  var propertyAlias: js.UndefOr[AssetPropertyAlias] = js.undefined
  
  /**
    * The ID of the asset property for this entry.
    */
  var propertyId: js.UndefOr[ID] = js.undefined
  
  /**
    * The list of property values to upload. You can specify up to 10 propertyValues array elements. 
    */
  var propertyValues: AssetPropertyValues
}
object PutAssetPropertyValueEntry {
  
  inline def apply(entryId: EntryId, propertyValues: AssetPropertyValues): PutAssetPropertyValueEntry = {
    val __obj = js.Dynamic.literal(entryId = entryId.asInstanceOf[js.Any], propertyValues = propertyValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutAssetPropertyValueEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutAssetPropertyValueEntry] (val x: Self) extends AnyVal {
    
    inline def setAssetId(value: ID): Self = StObject.set(x, "assetId", value.asInstanceOf[js.Any])
    
    inline def setAssetIdUndefined: Self = StObject.set(x, "assetId", js.undefined)
    
    inline def setEntryId(value: EntryId): Self = StObject.set(x, "entryId", value.asInstanceOf[js.Any])
    
    inline def setPropertyAlias(value: AssetPropertyAlias): Self = StObject.set(x, "propertyAlias", value.asInstanceOf[js.Any])
    
    inline def setPropertyAliasUndefined: Self = StObject.set(x, "propertyAlias", js.undefined)
    
    inline def setPropertyId(value: ID): Self = StObject.set(x, "propertyId", value.asInstanceOf[js.Any])
    
    inline def setPropertyIdUndefined: Self = StObject.set(x, "propertyId", js.undefined)
    
    inline def setPropertyValues(value: AssetPropertyValues): Self = StObject.set(x, "propertyValues", value.asInstanceOf[js.Any])
    
    inline def setPropertyValuesVarargs(value: AssetPropertyValue*): Self = StObject.set(x, "propertyValues", js.Array(value*))
  }
}
