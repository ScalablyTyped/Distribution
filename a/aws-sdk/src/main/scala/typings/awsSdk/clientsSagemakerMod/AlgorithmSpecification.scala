package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlgorithmSpecification extends StObject {
  
  /**
    * The name of the algorithm resource to use for the training job. This must be an algorithm resource that you created or subscribe to on Amazon Web Services Marketplace.  You must specify either the algorithm name to the AlgorithmName parameter or the image URI of the algorithm container to the TrainingImage parameter. Note that the AlgorithmName parameter is mutually exclusive with the TrainingImage parameter. If you specify a value for the AlgorithmName parameter, you can't specify a value for TrainingImage, and vice versa. If you specify values for both parameters, the training job might break; if you don't specify any value for both parameters, the training job might raise a null error. 
    */
  var AlgorithmName: js.UndefOr[ArnOrName] = js.undefined
  
  /**
    * The arguments for a container used to run a training job. See How Amazon SageMaker Runs Your Training Image for additional information.
    */
  var ContainerArguments: js.UndefOr[TrainingContainerArguments] = js.undefined
  
  /**
    * The entrypoint script for a Docker container used to run a training job. This script takes precedence over the default train processing instructions. See How Amazon SageMaker Runs Your Training Image for more information.
    */
  var ContainerEntrypoint: js.UndefOr[TrainingContainerEntrypoint] = js.undefined
  
  /**
    * To generate and save time-series metrics during training, set to true. The default is false and time-series metrics aren't generated except in the following cases:   You use one of the SageMaker built-in algorithms   You use one of the following Prebuilt SageMaker Docker Images:   Tensorflow (version &gt;= 1.15)   MXNet (version &gt;= 1.6)   PyTorch (version &gt;= 1.3)     You specify at least one MetricDefinition   
    */
  var EnableSageMakerMetricsTimeSeries: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A list of metric definition objects. Each object specifies the metric name and regular expressions used to parse algorithm logs. SageMaker publishes each metric to Amazon CloudWatch.
    */
  var MetricDefinitions: js.UndefOr[MetricDefinitionList] = js.undefined
  
  /**
    * The registry path of the Docker image that contains the training algorithm. For information about docker registry paths for SageMaker built-in algorithms, see Docker Registry Paths and Example Code in the Amazon SageMaker developer guide. SageMaker supports both registry/repository[:tag] and registry/repository[@digest] image path formats. For more information about using your custom training container, see Using Your Own Algorithms with Amazon SageMaker.  You must specify either the algorithm name to the AlgorithmName parameter or the image URI of the algorithm container to the TrainingImage parameter. For more information, see the note in the AlgorithmName parameter description. 
    */
  var TrainingImage: js.UndefOr[AlgorithmImage] = js.undefined
  
  var TrainingInputMode: typings.awsSdk.clientsSagemakerMod.TrainingInputMode
}
object AlgorithmSpecification {
  
  inline def apply(TrainingInputMode: TrainingInputMode): AlgorithmSpecification = {
    val __obj = js.Dynamic.literal(TrainingInputMode = TrainingInputMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlgorithmSpecification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AlgorithmSpecification] (val x: Self) extends AnyVal {
    
    inline def setAlgorithmName(value: ArnOrName): Self = StObject.set(x, "AlgorithmName", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmNameUndefined: Self = StObject.set(x, "AlgorithmName", js.undefined)
    
    inline def setContainerArguments(value: TrainingContainerArguments): Self = StObject.set(x, "ContainerArguments", value.asInstanceOf[js.Any])
    
    inline def setContainerArgumentsUndefined: Self = StObject.set(x, "ContainerArguments", js.undefined)
    
    inline def setContainerArgumentsVarargs(value: TrainingContainerArgument*): Self = StObject.set(x, "ContainerArguments", js.Array(value*))
    
    inline def setContainerEntrypoint(value: TrainingContainerEntrypoint): Self = StObject.set(x, "ContainerEntrypoint", value.asInstanceOf[js.Any])
    
    inline def setContainerEntrypointUndefined: Self = StObject.set(x, "ContainerEntrypoint", js.undefined)
    
    inline def setContainerEntrypointVarargs(value: TrainingContainerEntrypointString*): Self = StObject.set(x, "ContainerEntrypoint", js.Array(value*))
    
    inline def setEnableSageMakerMetricsTimeSeries(value: Boolean): Self = StObject.set(x, "EnableSageMakerMetricsTimeSeries", value.asInstanceOf[js.Any])
    
    inline def setEnableSageMakerMetricsTimeSeriesUndefined: Self = StObject.set(x, "EnableSageMakerMetricsTimeSeries", js.undefined)
    
    inline def setMetricDefinitions(value: MetricDefinitionList): Self = StObject.set(x, "MetricDefinitions", value.asInstanceOf[js.Any])
    
    inline def setMetricDefinitionsUndefined: Self = StObject.set(x, "MetricDefinitions", js.undefined)
    
    inline def setMetricDefinitionsVarargs(value: MetricDefinition*): Self = StObject.set(x, "MetricDefinitions", js.Array(value*))
    
    inline def setTrainingImage(value: AlgorithmImage): Self = StObject.set(x, "TrainingImage", value.asInstanceOf[js.Any])
    
    inline def setTrainingImageUndefined: Self = StObject.set(x, "TrainingImage", js.undefined)
    
    inline def setTrainingInputMode(value: TrainingInputMode): Self = StObject.set(x, "TrainingInputMode", value.asInstanceOf[js.Any])
  }
}
