package typings.awsSdk

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import typings.awsSdk.libServiceMod.ServiceConfigurationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientsSagemakermetricsMod {
  
  @JSImport("aws-sdk/clients/sagemakermetrics", JSImport.Namespace)
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  open class ^ () extends SageMakerMetrics {
    def this(options: ClientConfiguration) = this()
  }
  
  trait BatchPutMetricsError extends StObject {
    
    /**
      * The error code of an error that occured when attempting to put metrics.    METRIC_LIMIT_EXCEEDED: The maximum amount of metrics per resource is exceeded.    INTERNAL_ERROR: An internal error occured.    VALIDATION_ERROR: The metric data failed validation.    CONFLICT_ERROR: Multiple requests attempted to modify the same data simultaneously.  
      */
    var Code: js.UndefOr[PutMetricsErrorCode] = js.undefined
    
    /**
      * An index that corresponds to the metric in the request.
      */
    var MetricIndex: js.UndefOr[Integer] = js.undefined
  }
  object BatchPutMetricsError {
    
    inline def apply(): BatchPutMetricsError = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BatchPutMetricsError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BatchPutMetricsError] (val x: Self) extends AnyVal {
      
      inline def setCode(value: PutMetricsErrorCode): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
      
      inline def setMetricIndex(value: Integer): Self = StObject.set(x, "MetricIndex", value.asInstanceOf[js.Any])
      
      inline def setMetricIndexUndefined: Self = StObject.set(x, "MetricIndex", js.undefined)
    }
  }
  
  type BatchPutMetricsErrorList = js.Array[BatchPutMetricsError]
  
  trait BatchPutMetricsRequest extends StObject {
    
    /**
      * A list of raw metric values to put.
      */
    var MetricData: RawMetricDataList
    
    /**
      * The name of the Trial Component to associate with the metrics.
      */
    var TrialComponentName: ExperimentEntityName
  }
  object BatchPutMetricsRequest {
    
    inline def apply(MetricData: RawMetricDataList, TrialComponentName: ExperimentEntityName): BatchPutMetricsRequest = {
      val __obj = js.Dynamic.literal(MetricData = MetricData.asInstanceOf[js.Any], TrialComponentName = TrialComponentName.asInstanceOf[js.Any])
      __obj.asInstanceOf[BatchPutMetricsRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BatchPutMetricsRequest] (val x: Self) extends AnyVal {
      
      inline def setMetricData(value: RawMetricDataList): Self = StObject.set(x, "MetricData", value.asInstanceOf[js.Any])
      
      inline def setMetricDataVarargs(value: RawMetricData*): Self = StObject.set(x, "MetricData", js.Array(value*))
      
      inline def setTrialComponentName(value: ExperimentEntityName): Self = StObject.set(x, "TrialComponentName", value.asInstanceOf[js.Any])
    }
  }
  
  trait BatchPutMetricsResponse extends StObject {
    
    /**
      * Lists any errors that occur when inserting metric data.
      */
    var Errors: js.UndefOr[BatchPutMetricsErrorList] = js.undefined
  }
  object BatchPutMetricsResponse {
    
    inline def apply(): BatchPutMetricsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BatchPutMetricsResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BatchPutMetricsResponse] (val x: Self) extends AnyVal {
      
      inline def setErrors(value: BatchPutMetricsErrorList): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsUndefined: Self = StObject.set(x, "Errors", js.undefined)
      
      inline def setErrorsVarargs(value: BatchPutMetricsError*): Self = StObject.set(x, "Errors", js.Array(value*))
    }
  }
  
  trait Blob extends StObject
  
  trait ClientApiVersions extends StObject {
    
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[typings.awsSdk.clientsSagemakermetricsMod.apiVersion] = js.undefined
  }
  object ClientApiVersions {
    
    inline def apply(): ClientApiVersions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientApiVersions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClientApiVersions] (val x: Self) extends AnyVal {
      
      inline def setApiVersion(value: apiVersion): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    }
  }
  
  @js.native
  trait ClientConfiguration
    extends ServiceConfigurationOptions
       with ClientApiVersions
  
  type Double = scala.Double
  
  type ExperimentEntityName = String
  
  type Integer = scala.Double
  
  type MetricName = String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.METRIC_LIMIT_EXCEEDED
    - typings.awsSdk.awsSdkStrings.INTERNAL_ERROR
    - typings.awsSdk.awsSdkStrings.VALIDATION_ERROR
    - typings.awsSdk.awsSdkStrings.CONFLICT_ERROR
    - java.lang.String
  */
  type PutMetricsErrorCode = _PutMetricsErrorCode | String
  
  trait RawMetricData extends StObject {
    
    /**
      * The name of the metric.
      */
    var MetricName: typings.awsSdk.clientsSagemakermetricsMod.MetricName
    
    /**
      * The metric step (epoch). 
      */
    var Step: js.UndefOr[typings.awsSdk.clientsSagemakermetricsMod.Step] = js.undefined
    
    /**
      * The time that the metric was recorded.
      */
    var Timestamp: js.Date
    
    /**
      * The metric value.
      */
    var Value: Double
  }
  object RawMetricData {
    
    inline def apply(MetricName: MetricName, Timestamp: js.Date, Value: Double): RawMetricData = {
      val __obj = js.Dynamic.literal(MetricName = MetricName.asInstanceOf[js.Any], Timestamp = Timestamp.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawMetricData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RawMetricData] (val x: Self) extends AnyVal {
      
      inline def setMetricName(value: MetricName): Self = StObject.set(x, "MetricName", value.asInstanceOf[js.Any])
      
      inline def setStep(value: Step): Self = StObject.set(x, "Step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "Step", js.undefined)
      
      inline def setTimestamp(value: js.Date): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    }
  }
  
  type RawMetricDataList = js.Array[RawMetricData]
  
  @js.native
  trait SageMakerMetrics extends Service {
    
    /**
      * Used to ingest training metrics into SageMaker. These metrics can be visualized in SageMaker Studio and retrieved with the GetMetrics API. 
      */
    def batchPutMetrics(): Request[BatchPutMetricsResponse, AWSError] = js.native
    def batchPutMetrics(callback: js.Function2[/* err */ AWSError, /* data */ BatchPutMetricsResponse, Unit]): Request[BatchPutMetricsResponse, AWSError] = js.native
    /**
      * Used to ingest training metrics into SageMaker. These metrics can be visualized in SageMaker Studio and retrieved with the GetMetrics API. 
      */
    def batchPutMetrics(params: BatchPutMetricsRequest): Request[BatchPutMetricsResponse, AWSError] = js.native
    def batchPutMetrics(
      params: BatchPutMetricsRequest,
      callback: js.Function2[/* err */ AWSError, /* data */ BatchPutMetricsResponse, Unit]
    ): Request[BatchPutMetricsResponse, AWSError] = js.native
    
    @JSName("config")
    var config_SageMakerMetrics: ConfigBase & ClientConfiguration = js.native
  }
  
  type Step = scala.Double
  
  type Timestamp = js.Date
  
  trait _PutMetricsErrorCode extends StObject
  
  trait _apiVersion extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2022-09-30`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
