package typings.awsSdk.clientsCloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMetricStreamOutput extends StObject {
  
  /**
    * The ARN of the metric stream.
    */
  var Arn: js.UndefOr[AmazonResourceName] = js.undefined
  
  /**
    * The date that the metric stream was created.
    */
  var CreationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * If this array of metric namespaces is present, then these namespaces are the only metric namespaces that are not streamed by this metric stream. In this case, all other metric namespaces in the account are streamed by this metric stream.
    */
  var ExcludeFilters: js.UndefOr[MetricStreamFilters] = js.undefined
  
  /**
    * The ARN of the Amazon Kinesis Firehose delivery stream that is used by this metric stream.
    */
  var FirehoseArn: js.UndefOr[AmazonResourceName] = js.undefined
  
  /**
    * If this array of metric namespaces is present, then these namespaces are the only metric namespaces that are streamed by this metric stream.
    */
  var IncludeFilters: js.UndefOr[MetricStreamFilters] = js.undefined
  
  /**
    * The date of the most recent update to the metric stream's configuration.
    */
  var LastUpdateDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the metric stream.
    */
  var Name: js.UndefOr[MetricStreamName] = js.undefined
  
  /**
    * The output format for the stream. Valid values are json and opentelemetry0.7. For more information about metric stream output formats, see Metric streams output formats.
    */
  var OutputFormat: js.UndefOr[MetricStreamOutputFormat] = js.undefined
  
  /**
    * The ARN of the IAM role that is used by this metric stream.
    */
  var RoleArn: js.UndefOr[AmazonResourceName] = js.undefined
  
  /**
    * The state of the metric stream. The possible values are running and stopped.
    */
  var State: js.UndefOr[MetricStreamState] = js.undefined
  
  /**
    * Each entry in this array displays information about one or more metrics that include additional statistics in the metric stream. For more information about the additional statistics, see  CloudWatch statistics definitions. 
    */
  var StatisticsConfigurations: js.UndefOr[MetricStreamStatisticsConfigurations] = js.undefined
}
object GetMetricStreamOutput {
  
  inline def apply(): GetMetricStreamOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMetricStreamOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetMetricStreamOutput] (val x: Self) extends AnyVal {
    
    inline def setArn(value: AmazonResourceName): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    inline def setExcludeFilters(value: MetricStreamFilters): Self = StObject.set(x, "ExcludeFilters", value.asInstanceOf[js.Any])
    
    inline def setExcludeFiltersUndefined: Self = StObject.set(x, "ExcludeFilters", js.undefined)
    
    inline def setExcludeFiltersVarargs(value: MetricStreamFilter*): Self = StObject.set(x, "ExcludeFilters", js.Array(value*))
    
    inline def setFirehoseArn(value: AmazonResourceName): Self = StObject.set(x, "FirehoseArn", value.asInstanceOf[js.Any])
    
    inline def setFirehoseArnUndefined: Self = StObject.set(x, "FirehoseArn", js.undefined)
    
    inline def setIncludeFilters(value: MetricStreamFilters): Self = StObject.set(x, "IncludeFilters", value.asInstanceOf[js.Any])
    
    inline def setIncludeFiltersUndefined: Self = StObject.set(x, "IncludeFilters", js.undefined)
    
    inline def setIncludeFiltersVarargs(value: MetricStreamFilter*): Self = StObject.set(x, "IncludeFilters", js.Array(value*))
    
    inline def setLastUpdateDate(value: js.Date): Self = StObject.set(x, "LastUpdateDate", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateDateUndefined: Self = StObject.set(x, "LastUpdateDate", js.undefined)
    
    inline def setName(value: MetricStreamName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setOutputFormat(value: MetricStreamOutputFormat): Self = StObject.set(x, "OutputFormat", value.asInstanceOf[js.Any])
    
    inline def setOutputFormatUndefined: Self = StObject.set(x, "OutputFormat", js.undefined)
    
    inline def setRoleArn(value: AmazonResourceName): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setState(value: MetricStreamState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setStatisticsConfigurations(value: MetricStreamStatisticsConfigurations): Self = StObject.set(x, "StatisticsConfigurations", value.asInstanceOf[js.Any])
    
    inline def setStatisticsConfigurationsUndefined: Self = StObject.set(x, "StatisticsConfigurations", js.undefined)
    
    inline def setStatisticsConfigurationsVarargs(value: MetricStreamStatisticsConfiguration*): Self = StObject.set(x, "StatisticsConfigurations", js.Array(value*))
  }
}
