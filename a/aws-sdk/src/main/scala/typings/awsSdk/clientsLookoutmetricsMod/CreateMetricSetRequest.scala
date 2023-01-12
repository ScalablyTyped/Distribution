package typings.awsSdk.clientsLookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMetricSetRequest extends StObject {
  
  /**
    * The ARN of the anomaly detector that will use the dataset.
    */
  var AnomalyDetectorArn: Arn
  
  /**
    * A list of filters that specify which data is kept for anomaly detection.
    */
  var DimensionFilterList: js.UndefOr[MetricSetDimensionFilterList] = js.undefined
  
  /**
    * A list of the fields you want to treat as dimensions.
    */
  var DimensionList: js.UndefOr[typings.awsSdk.clientsLookoutmetricsMod.DimensionList] = js.undefined
  
  /**
    * A list of metrics that the dataset will contain.
    */
  var MetricList: typings.awsSdk.clientsLookoutmetricsMod.MetricList
  
  /**
    * A description of the dataset you are creating.
    */
  var MetricSetDescription: js.UndefOr[typings.awsSdk.clientsLookoutmetricsMod.MetricSetDescription] = js.undefined
  
  /**
    * The frequency with which the source data will be analyzed for anomalies.
    */
  var MetricSetFrequency: js.UndefOr[Frequency] = js.undefined
  
  /**
    * The name of the dataset.
    */
  var MetricSetName: typings.awsSdk.clientsLookoutmetricsMod.MetricSetName
  
  /**
    * Contains information about how the source data should be interpreted.
    */
  var MetricSource: typings.awsSdk.clientsLookoutmetricsMod.MetricSource
  
  /**
    * After an interval ends, the amount of seconds that the detector waits before importing data. Offset is only supported for S3, Redshift, Athena and datasources.
    */
  var Offset: js.UndefOr[typings.awsSdk.clientsLookoutmetricsMod.Offset] = js.undefined
  
  /**
    * A list of tags to apply to the dataset.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * Contains information about the column used for tracking time in your source data.
    */
  var TimestampColumn: js.UndefOr[typings.awsSdk.clientsLookoutmetricsMod.TimestampColumn] = js.undefined
  
  /**
    * The time zone in which your source data was recorded.
    */
  var Timezone: js.UndefOr[typings.awsSdk.clientsLookoutmetricsMod.Timezone] = js.undefined
}
object CreateMetricSetRequest {
  
  inline def apply(
    AnomalyDetectorArn: Arn,
    MetricList: MetricList,
    MetricSetName: MetricSetName,
    MetricSource: MetricSource
  ): CreateMetricSetRequest = {
    val __obj = js.Dynamic.literal(AnomalyDetectorArn = AnomalyDetectorArn.asInstanceOf[js.Any], MetricList = MetricList.asInstanceOf[js.Any], MetricSetName = MetricSetName.asInstanceOf[js.Any], MetricSource = MetricSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMetricSetRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateMetricSetRequest] (val x: Self) extends AnyVal {
    
    inline def setAnomalyDetectorArn(value: Arn): Self = StObject.set(x, "AnomalyDetectorArn", value.asInstanceOf[js.Any])
    
    inline def setDimensionFilterList(value: MetricSetDimensionFilterList): Self = StObject.set(x, "DimensionFilterList", value.asInstanceOf[js.Any])
    
    inline def setDimensionFilterListUndefined: Self = StObject.set(x, "DimensionFilterList", js.undefined)
    
    inline def setDimensionFilterListVarargs(value: MetricSetDimensionFilter*): Self = StObject.set(x, "DimensionFilterList", js.Array(value*))
    
    inline def setDimensionList(value: DimensionList): Self = StObject.set(x, "DimensionList", value.asInstanceOf[js.Any])
    
    inline def setDimensionListUndefined: Self = StObject.set(x, "DimensionList", js.undefined)
    
    inline def setDimensionListVarargs(value: ColumnName*): Self = StObject.set(x, "DimensionList", js.Array(value*))
    
    inline def setMetricList(value: MetricList): Self = StObject.set(x, "MetricList", value.asInstanceOf[js.Any])
    
    inline def setMetricListVarargs(value: Metric*): Self = StObject.set(x, "MetricList", js.Array(value*))
    
    inline def setMetricSetDescription(value: MetricSetDescription): Self = StObject.set(x, "MetricSetDescription", value.asInstanceOf[js.Any])
    
    inline def setMetricSetDescriptionUndefined: Self = StObject.set(x, "MetricSetDescription", js.undefined)
    
    inline def setMetricSetFrequency(value: Frequency): Self = StObject.set(x, "MetricSetFrequency", value.asInstanceOf[js.Any])
    
    inline def setMetricSetFrequencyUndefined: Self = StObject.set(x, "MetricSetFrequency", js.undefined)
    
    inline def setMetricSetName(value: MetricSetName): Self = StObject.set(x, "MetricSetName", value.asInstanceOf[js.Any])
    
    inline def setMetricSource(value: MetricSource): Self = StObject.set(x, "MetricSource", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Offset): Self = StObject.set(x, "Offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "Offset", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTimestampColumn(value: TimestampColumn): Self = StObject.set(x, "TimestampColumn", value.asInstanceOf[js.Any])
    
    inline def setTimestampColumnUndefined: Self = StObject.set(x, "TimestampColumn", js.undefined)
    
    inline def setTimezone(value: Timezone): Self = StObject.set(x, "Timezone", value.asInstanceOf[js.Any])
    
    inline def setTimezoneUndefined: Self = StObject.set(x, "Timezone", js.undefined)
  }
}
