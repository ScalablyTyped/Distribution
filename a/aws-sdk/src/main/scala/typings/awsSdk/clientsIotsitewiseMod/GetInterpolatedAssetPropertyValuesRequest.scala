package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInterpolatedAssetPropertyValuesRequest extends StObject {
  
  /**
    * The ID of the asset.
    */
  var assetId: js.UndefOr[ID] = js.undefined
  
  /**
    * The inclusive end of the range from which to interpolate data, expressed in seconds in Unix epoch time.
    */
  var endTimeInSeconds: TimeInSeconds
  
  /**
    * The nanosecond offset converted from endTimeInSeconds.
    */
  var endTimeOffsetInNanos: js.UndefOr[OffsetInNanos] = js.undefined
  
  /**
    * The time interval in seconds over which to interpolate data. Each interval starts when the previous one ends.
    */
  var intervalInSeconds: IntervalInSeconds
  
  /**
    * The query interval for the window, in seconds. IoT SiteWise computes each interpolated value by using data points from the timestamp of each interval, minus the window to the timestamp of each interval plus the window. If not specified, the window ranges between the start time minus the interval and the end time plus the interval.    If you specify a value for the intervalWindowInSeconds parameter, the value for the type parameter must be LINEAR_INTERPOLATION.   If a data point isn't found during the specified query window, IoT SiteWise won't return an interpolated value for the interval. This indicates that there's a gap in the ingested data points.    For example, you can get the interpolated temperature values for a wind turbine every 24 hours over a duration of 7 days. If the interpolation starts on July 1, 2021, at 9 AM with a window of 2 hours, IoT SiteWise uses the data points from 7 AM (9 AM minus 2 hours) to 11 AM (9 AM plus 2 hours) on July 2, 2021 to compute the first interpolated value. Next, IoT SiteWise uses the data points from 7 AM (9 AM minus 2 hours) to 11 AM (9 AM plus 2 hours) on July 3, 2021 to compute the second interpolated value, and so on. 
    */
  var intervalWindowInSeconds: js.UndefOr[IntervalWindowInSeconds] = js.undefined
  
  /**
    * The maximum number of results to return for each paginated request. If not specified, the default value is 10.
    */
  var maxResults: js.UndefOr[MaxInterpolatedResults] = js.undefined
  
  /**
    * The token to be used for the next set of paginated results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The alias that identifies the property, such as an OPC-UA server data stream path (for example, /company/windfarm/3/turbine/7/temperature). For more information, see Mapping industrial data streams to asset properties in the IoT SiteWise User Guide.
    */
  var propertyAlias: js.UndefOr[AssetPropertyAlias] = js.undefined
  
  /**
    * The ID of the asset property.
    */
  var propertyId: js.UndefOr[ID] = js.undefined
  
  /**
    * The quality of the asset property value. You can use this parameter as a filter to choose only the asset property values that have a specific quality.
    */
  var quality: Quality
  
  /**
    * The exclusive start of the range from which to interpolate data, expressed in seconds in Unix epoch time.
    */
  var startTimeInSeconds: TimeInSeconds
  
  /**
    * The nanosecond offset converted from startTimeInSeconds.
    */
  var startTimeOffsetInNanos: js.UndefOr[OffsetInNanos] = js.undefined
  
  /**
    * The interpolation type. Valid values: LINEAR_INTERPOLATION | LOCF_INTERPOLATION     LINEAR_INTERPOLATION – Estimates missing data using linear interpolation. For example, you can use this operation to return the interpolated temperature values for a wind turbine every 24 hours over a duration of 7 days. If the interpolation starts July 1, 2021, at 9 AM, IoT SiteWise returns the first interpolated value on July 2, 2021, at 9 AM, the second interpolated value on July 3, 2021, at 9 AM, and so on.    LOCF_INTERPOLATION – Estimates missing data using last observation carried forward interpolation If no data point is found for an interval, IoT SiteWise returns the last observed data point for the previous interval and carries forward this interpolated value until a new data point is found. For example, you can get the state of an on-off valve every 24 hours over a duration of 7 days. If the interpolation starts July 1, 2021, at 9 AM, IoT SiteWise returns the last observed data point between July 1, 2021, at 9 AM and July 2, 2021, at 9 AM as the first interpolated value. If a data point isn't found after 9 AM on July 2, 2021, IoT SiteWise uses the same interpolated value for the rest of the days.  
    */
  var `type`: InterpolationType
}
object GetInterpolatedAssetPropertyValuesRequest {
  
  inline def apply(
    endTimeInSeconds: TimeInSeconds,
    intervalInSeconds: IntervalInSeconds,
    quality: Quality,
    startTimeInSeconds: TimeInSeconds,
    `type`: InterpolationType
  ): GetInterpolatedAssetPropertyValuesRequest = {
    val __obj = js.Dynamic.literal(endTimeInSeconds = endTimeInSeconds.asInstanceOf[js.Any], intervalInSeconds = intervalInSeconds.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any], startTimeInSeconds = startTimeInSeconds.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInterpolatedAssetPropertyValuesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetInterpolatedAssetPropertyValuesRequest] (val x: Self) extends AnyVal {
    
    inline def setAssetId(value: ID): Self = StObject.set(x, "assetId", value.asInstanceOf[js.Any])
    
    inline def setAssetIdUndefined: Self = StObject.set(x, "assetId", js.undefined)
    
    inline def setEndTimeInSeconds(value: TimeInSeconds): Self = StObject.set(x, "endTimeInSeconds", value.asInstanceOf[js.Any])
    
    inline def setEndTimeOffsetInNanos(value: OffsetInNanos): Self = StObject.set(x, "endTimeOffsetInNanos", value.asInstanceOf[js.Any])
    
    inline def setEndTimeOffsetInNanosUndefined: Self = StObject.set(x, "endTimeOffsetInNanos", js.undefined)
    
    inline def setIntervalInSeconds(value: IntervalInSeconds): Self = StObject.set(x, "intervalInSeconds", value.asInstanceOf[js.Any])
    
    inline def setIntervalWindowInSeconds(value: IntervalWindowInSeconds): Self = StObject.set(x, "intervalWindowInSeconds", value.asInstanceOf[js.Any])
    
    inline def setIntervalWindowInSecondsUndefined: Self = StObject.set(x, "intervalWindowInSeconds", js.undefined)
    
    inline def setMaxResults(value: MaxInterpolatedResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setPropertyAlias(value: AssetPropertyAlias): Self = StObject.set(x, "propertyAlias", value.asInstanceOf[js.Any])
    
    inline def setPropertyAliasUndefined: Self = StObject.set(x, "propertyAlias", js.undefined)
    
    inline def setPropertyId(value: ID): Self = StObject.set(x, "propertyId", value.asInstanceOf[js.Any])
    
    inline def setPropertyIdUndefined: Self = StObject.set(x, "propertyId", js.undefined)
    
    inline def setQuality(value: Quality): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    inline def setStartTimeInSeconds(value: TimeInSeconds): Self = StObject.set(x, "startTimeInSeconds", value.asInstanceOf[js.Any])
    
    inline def setStartTimeOffsetInNanos(value: OffsetInNanos): Self = StObject.set(x, "startTimeOffsetInNanos", value.asInstanceOf[js.Any])
    
    inline def setStartTimeOffsetInNanosUndefined: Self = StObject.set(x, "startTimeOffsetInNanos", js.undefined)
    
    inline def setType(value: InterpolationType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
