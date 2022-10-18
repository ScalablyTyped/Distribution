package typings.awsSdk.clientsCloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutMetricStreamInput extends StObject {
  
  /**
    * If you specify this parameter, the stream sends metrics from all metric namespaces except for the namespaces that you specify here. You cannot include ExcludeFilters and IncludeFilters in the same operation.
    */
  var ExcludeFilters: js.UndefOr[MetricStreamFilters] = js.undefined
  
  /**
    * The ARN of the Amazon Kinesis Firehose delivery stream to use for this metric stream. This Amazon Kinesis Firehose delivery stream must already exist and must be in the same account as the metric stream.
    */
  var FirehoseArn: AmazonResourceName
  
  /**
    * If you specify this parameter, the stream sends only the metrics from the metric namespaces that you specify here. You cannot include IncludeFilters and ExcludeFilters in the same operation.
    */
  var IncludeFilters: js.UndefOr[MetricStreamFilters] = js.undefined
  
  /**
    * If you are creating a new metric stream, this is the name for the new stream. The name must be different than the names of other metric streams in this account and Region. If you are updating a metric stream, specify the name of that stream here. Valid characters are A-Z, a-z, 0-9, "-" and "_".
    */
  var Name: MetricStreamName
  
  /**
    * The output format for the stream. Valid values are json and opentelemetry0.7. For more information about metric stream output formats, see  Metric streams output formats.
    */
  var OutputFormat: MetricStreamOutputFormat
  
  /**
    * The ARN of an IAM role that this metric stream will use to access Amazon Kinesis Firehose resources. This IAM role must already exist and must be in the same account as the metric stream. This IAM role must include the following permissions:   firehose:PutRecord   firehose:PutRecordBatch  
    */
  var RoleArn: AmazonResourceName
  
  /**
    * By default, a metric stream always sends the MAX, MIN, SUM, and SAMPLECOUNT statistics for each metric that is streamed. You can use this parameter to have the metric stream also send additional statistics in the stream. This array can have up to 100 members. For each entry in this array, you specify one or more metrics and the list of additional statistics to stream for those metrics. The additional statistics that you can stream depend on the stream's OutputFormat. If the OutputFormat is json, you can stream any additional statistic that is supported by CloudWatch, listed in  CloudWatch statistics definitions. If the OutputFormat is opentelemetry0.7, you can stream percentile statistics such as p95, p99.9 and so on.
    */
  var StatisticsConfigurations: js.UndefOr[MetricStreamStatisticsConfigurations] = js.undefined
  
  /**
    * A list of key-value pairs to associate with the metric stream. You can associate as many as 50 tags with a metric stream. Tags can help you organize and categorize your resources. You can also use them to scope user permissions by granting a user permission to access or change only resources with certain tag values. You can use this parameter only when you are creating a new metric stream. If you are using this operation to update an existing metric stream, any tags you specify in this parameter are ignored. To change the tags of an existing metric stream, use TagResource or UntagResource.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object PutMetricStreamInput {
  
  inline def apply(
    FirehoseArn: AmazonResourceName,
    Name: MetricStreamName,
    OutputFormat: MetricStreamOutputFormat,
    RoleArn: AmazonResourceName
  ): PutMetricStreamInput = {
    val __obj = js.Dynamic.literal(FirehoseArn = FirehoseArn.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], OutputFormat = OutputFormat.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutMetricStreamInput]
  }
  
  extension [Self <: PutMetricStreamInput](x: Self) {
    
    inline def setExcludeFilters(value: MetricStreamFilters): Self = StObject.set(x, "ExcludeFilters", value.asInstanceOf[js.Any])
    
    inline def setExcludeFiltersUndefined: Self = StObject.set(x, "ExcludeFilters", js.undefined)
    
    inline def setExcludeFiltersVarargs(value: MetricStreamFilter*): Self = StObject.set(x, "ExcludeFilters", js.Array(value*))
    
    inline def setFirehoseArn(value: AmazonResourceName): Self = StObject.set(x, "FirehoseArn", value.asInstanceOf[js.Any])
    
    inline def setIncludeFilters(value: MetricStreamFilters): Self = StObject.set(x, "IncludeFilters", value.asInstanceOf[js.Any])
    
    inline def setIncludeFiltersUndefined: Self = StObject.set(x, "IncludeFilters", js.undefined)
    
    inline def setIncludeFiltersVarargs(value: MetricStreamFilter*): Self = StObject.set(x, "IncludeFilters", js.Array(value*))
    
    inline def setName(value: MetricStreamName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOutputFormat(value: MetricStreamOutputFormat): Self = StObject.set(x, "OutputFormat", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: AmazonResourceName): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setStatisticsConfigurations(value: MetricStreamStatisticsConfigurations): Self = StObject.set(x, "StatisticsConfigurations", value.asInstanceOf[js.Any])
    
    inline def setStatisticsConfigurationsUndefined: Self = StObject.set(x, "StatisticsConfigurations", js.undefined)
    
    inline def setStatisticsConfigurationsVarargs(value: MetricStreamStatisticsConfiguration*): Self = StObject.set(x, "StatisticsConfigurations", js.Array(value*))
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
