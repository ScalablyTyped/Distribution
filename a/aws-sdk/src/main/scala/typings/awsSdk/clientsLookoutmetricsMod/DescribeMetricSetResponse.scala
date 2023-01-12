package typings.awsSdk.clientsLookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeMetricSetResponse extends StObject {
  
  /**
    * The ARN of the detector that contains the dataset.
    */
  var AnomalyDetectorArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The time at which the dataset was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The dimensions and their values that were used to filter the dataset.
    */
  var DimensionFilterList: js.UndefOr[MetricSetDimensionFilterList] = js.undefined
  
  /**
    * A list of the dimensions chosen for analysis.
    */
  var DimensionList: js.UndefOr[typings.awsSdk.clientsLookoutmetricsMod.DimensionList] = js.undefined
  
  /**
    * The time at which the dataset was last modified.
    */
  var LastModificationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A list of the metrics defined by the dataset.
    */
  var MetricList: js.UndefOr[typings.awsSdk.clientsLookoutmetricsMod.MetricList] = js.undefined
  
  /**
    * The ARN of the dataset.
    */
  var MetricSetArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The dataset's description.
    */
  var MetricSetDescription: js.UndefOr[typings.awsSdk.clientsLookoutmetricsMod.MetricSetDescription] = js.undefined
  
  /**
    * The interval at which the data will be analyzed for anomalies.
    */
  var MetricSetFrequency: js.UndefOr[Frequency] = js.undefined
  
  /**
    * The name of the dataset.
    */
  var MetricSetName: js.UndefOr[typings.awsSdk.clientsLookoutmetricsMod.MetricSetName] = js.undefined
  
  /**
    * Contains information about the dataset's source data.
    */
  var MetricSource: js.UndefOr[typings.awsSdk.clientsLookoutmetricsMod.MetricSource] = js.undefined
  
  /**
    * After an interval ends, the amount of seconds that the detector waits before importing data. Offset is only supported for S3, Redshift, Athena and datasources.
    */
  var Offset: js.UndefOr[typings.awsSdk.clientsLookoutmetricsMod.Offset] = js.undefined
  
  /**
    * Contains information about the column used for tracking time in your source data.
    */
  var TimestampColumn: js.UndefOr[typings.awsSdk.clientsLookoutmetricsMod.TimestampColumn] = js.undefined
  
  /**
    * The time zone in which the dataset's data was recorded.
    */
  var Timezone: js.UndefOr[typings.awsSdk.clientsLookoutmetricsMod.Timezone] = js.undefined
}
object DescribeMetricSetResponse {
  
  inline def apply(): DescribeMetricSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeMetricSetResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeMetricSetResponse] (val x: Self) extends AnyVal {
    
    inline def setAnomalyDetectorArn(value: Arn): Self = StObject.set(x, "AnomalyDetectorArn", value.asInstanceOf[js.Any])
    
    inline def setAnomalyDetectorArnUndefined: Self = StObject.set(x, "AnomalyDetectorArn", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDimensionFilterList(value: MetricSetDimensionFilterList): Self = StObject.set(x, "DimensionFilterList", value.asInstanceOf[js.Any])
    
    inline def setDimensionFilterListUndefined: Self = StObject.set(x, "DimensionFilterList", js.undefined)
    
    inline def setDimensionFilterListVarargs(value: MetricSetDimensionFilter*): Self = StObject.set(x, "DimensionFilterList", js.Array(value*))
    
    inline def setDimensionList(value: DimensionList): Self = StObject.set(x, "DimensionList", value.asInstanceOf[js.Any])
    
    inline def setDimensionListUndefined: Self = StObject.set(x, "DimensionList", js.undefined)
    
    inline def setDimensionListVarargs(value: ColumnName*): Self = StObject.set(x, "DimensionList", js.Array(value*))
    
    inline def setLastModificationTime(value: js.Date): Self = StObject.set(x, "LastModificationTime", value.asInstanceOf[js.Any])
    
    inline def setLastModificationTimeUndefined: Self = StObject.set(x, "LastModificationTime", js.undefined)
    
    inline def setMetricList(value: MetricList): Self = StObject.set(x, "MetricList", value.asInstanceOf[js.Any])
    
    inline def setMetricListUndefined: Self = StObject.set(x, "MetricList", js.undefined)
    
    inline def setMetricListVarargs(value: Metric*): Self = StObject.set(x, "MetricList", js.Array(value*))
    
    inline def setMetricSetArn(value: Arn): Self = StObject.set(x, "MetricSetArn", value.asInstanceOf[js.Any])
    
    inline def setMetricSetArnUndefined: Self = StObject.set(x, "MetricSetArn", js.undefined)
    
    inline def setMetricSetDescription(value: MetricSetDescription): Self = StObject.set(x, "MetricSetDescription", value.asInstanceOf[js.Any])
    
    inline def setMetricSetDescriptionUndefined: Self = StObject.set(x, "MetricSetDescription", js.undefined)
    
    inline def setMetricSetFrequency(value: Frequency): Self = StObject.set(x, "MetricSetFrequency", value.asInstanceOf[js.Any])
    
    inline def setMetricSetFrequencyUndefined: Self = StObject.set(x, "MetricSetFrequency", js.undefined)
    
    inline def setMetricSetName(value: MetricSetName): Self = StObject.set(x, "MetricSetName", value.asInstanceOf[js.Any])
    
    inline def setMetricSetNameUndefined: Self = StObject.set(x, "MetricSetName", js.undefined)
    
    inline def setMetricSource(value: MetricSource): Self = StObject.set(x, "MetricSource", value.asInstanceOf[js.Any])
    
    inline def setMetricSourceUndefined: Self = StObject.set(x, "MetricSource", js.undefined)
    
    inline def setOffset(value: Offset): Self = StObject.set(x, "Offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "Offset", js.undefined)
    
    inline def setTimestampColumn(value: TimestampColumn): Self = StObject.set(x, "TimestampColumn", value.asInstanceOf[js.Any])
    
    inline def setTimestampColumnUndefined: Self = StObject.set(x, "TimestampColumn", js.undefined)
    
    inline def setTimezone(value: Timezone): Self = StObject.set(x, "Timezone", value.asInstanceOf[js.Any])
    
    inline def setTimezoneUndefined: Self = StObject.set(x, "Timezone", js.undefined)
  }
}
