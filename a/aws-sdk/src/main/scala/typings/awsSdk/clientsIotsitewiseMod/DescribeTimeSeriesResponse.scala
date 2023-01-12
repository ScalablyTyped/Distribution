package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTimeSeriesResponse extends StObject {
  
  /**
    * The alias that identifies the time series.
    */
  var alias: js.UndefOr[PropertyAlias] = js.undefined
  
  /**
    * The ID of the asset in which the asset property was created.
    */
  var assetId: js.UndefOr[ID] = js.undefined
  
  /**
    * The data type of the time series. If you specify STRUCT, you must also specify dataTypeSpec to identify the type of the structure for this time series.
    */
  var dataType: PropertyDataType
  
  /**
    * The data type of the structure for this time series. This parameter is required for time series that have the STRUCT data type. The options for this parameter depend on the type of the composite model in which you created the asset property that is associated with your time series. Use AWS/ALARM_STATE for alarm state in alarm composite models.
    */
  var dataTypeSpec: js.UndefOr[Name] = js.undefined
  
  /**
    * The ID of the asset property.
    */
  var propertyId: js.UndefOr[ID] = js.undefined
  
  /**
    * The date that the time series was created, in Unix epoch time.
    */
  var timeSeriesCreationDate: js.Date
  
  /**
    * The ID of the time series.
    */
  var timeSeriesId: TimeSeriesId
  
  /**
    * The date that the time series was last updated, in Unix epoch time.
    */
  var timeSeriesLastUpdateDate: js.Date
}
object DescribeTimeSeriesResponse {
  
  inline def apply(
    dataType: PropertyDataType,
    timeSeriesCreationDate: js.Date,
    timeSeriesId: TimeSeriesId,
    timeSeriesLastUpdateDate: js.Date
  ): DescribeTimeSeriesResponse = {
    val __obj = js.Dynamic.literal(dataType = dataType.asInstanceOf[js.Any], timeSeriesCreationDate = timeSeriesCreationDate.asInstanceOf[js.Any], timeSeriesId = timeSeriesId.asInstanceOf[js.Any], timeSeriesLastUpdateDate = timeSeriesLastUpdateDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTimeSeriesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeTimeSeriesResponse] (val x: Self) extends AnyVal {
    
    inline def setAlias(value: PropertyAlias): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    inline def setAssetId(value: ID): Self = StObject.set(x, "assetId", value.asInstanceOf[js.Any])
    
    inline def setAssetIdUndefined: Self = StObject.set(x, "assetId", js.undefined)
    
    inline def setDataType(value: PropertyDataType): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDataTypeSpec(value: Name): Self = StObject.set(x, "dataTypeSpec", value.asInstanceOf[js.Any])
    
    inline def setDataTypeSpecUndefined: Self = StObject.set(x, "dataTypeSpec", js.undefined)
    
    inline def setPropertyId(value: ID): Self = StObject.set(x, "propertyId", value.asInstanceOf[js.Any])
    
    inline def setPropertyIdUndefined: Self = StObject.set(x, "propertyId", js.undefined)
    
    inline def setTimeSeriesCreationDate(value: js.Date): Self = StObject.set(x, "timeSeriesCreationDate", value.asInstanceOf[js.Any])
    
    inline def setTimeSeriesId(value: TimeSeriesId): Self = StObject.set(x, "timeSeriesId", value.asInstanceOf[js.Any])
    
    inline def setTimeSeriesLastUpdateDate(value: js.Date): Self = StObject.set(x, "timeSeriesLastUpdateDate", value.asInstanceOf[js.Any])
  }
}
