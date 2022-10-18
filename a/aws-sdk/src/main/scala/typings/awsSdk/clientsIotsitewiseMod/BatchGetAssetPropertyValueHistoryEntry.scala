package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetAssetPropertyValueHistoryEntry extends StObject {
  
  /**
    * The ID of the asset in which the asset property was created.
    */
  var assetId: js.UndefOr[ID] = js.undefined
  
  /**
    * The inclusive end of the range from which to query historical data, expressed in seconds in Unix epoch time.
    */
  var endDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ID of the entry.
    */
  var entryId: EntryId
  
  /**
    * The alias that identifies the property, such as an OPC-UA server data stream path (for example, /company/windfarm/3/turbine/7/temperature). For more information, see Mapping industrial data streams to asset properties in the IoT SiteWise User Guide.
    */
  var propertyAlias: js.UndefOr[AssetPropertyAlias] = js.undefined
  
  /**
    * The ID of the asset property.
    */
  var propertyId: js.UndefOr[ID] = js.undefined
  
  /**
    * The quality by which to filter asset data.
    */
  var qualities: js.UndefOr[Qualities] = js.undefined
  
  /**
    * The exclusive start of the range from which to query historical data, expressed in seconds in Unix epoch time.
    */
  var startDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The chronological sorting order of the requested information. Default: ASCENDING 
    */
  var timeOrdering: js.UndefOr[TimeOrdering] = js.undefined
}
object BatchGetAssetPropertyValueHistoryEntry {
  
  inline def apply(entryId: EntryId): BatchGetAssetPropertyValueHistoryEntry = {
    val __obj = js.Dynamic.literal(entryId = entryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetAssetPropertyValueHistoryEntry]
  }
  
  extension [Self <: BatchGetAssetPropertyValueHistoryEntry](x: Self) {
    
    inline def setAssetId(value: ID): Self = StObject.set(x, "assetId", value.asInstanceOf[js.Any])
    
    inline def setAssetIdUndefined: Self = StObject.set(x, "assetId", js.undefined)
    
    inline def setEndDate(value: js.Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    inline def setEntryId(value: EntryId): Self = StObject.set(x, "entryId", value.asInstanceOf[js.Any])
    
    inline def setPropertyAlias(value: AssetPropertyAlias): Self = StObject.set(x, "propertyAlias", value.asInstanceOf[js.Any])
    
    inline def setPropertyAliasUndefined: Self = StObject.set(x, "propertyAlias", js.undefined)
    
    inline def setPropertyId(value: ID): Self = StObject.set(x, "propertyId", value.asInstanceOf[js.Any])
    
    inline def setPropertyIdUndefined: Self = StObject.set(x, "propertyId", js.undefined)
    
    inline def setQualities(value: Qualities): Self = StObject.set(x, "qualities", value.asInstanceOf[js.Any])
    
    inline def setQualitiesUndefined: Self = StObject.set(x, "qualities", js.undefined)
    
    inline def setQualitiesVarargs(value: Quality*): Self = StObject.set(x, "qualities", js.Array(value*))
    
    inline def setStartDate(value: js.Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    
    inline def setTimeOrdering(value: TimeOrdering): Self = StObject.set(x, "timeOrdering", value.asInstanceOf[js.Any])
    
    inline def setTimeOrderingUndefined: Self = StObject.set(x, "timeOrdering", js.undefined)
  }
}
