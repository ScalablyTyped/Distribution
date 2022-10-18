package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelQualityAppSpecification extends StObject {
  
  /**
    * An array of arguments for the container used to run the monitoring job.
    */
  var ContainerArguments: js.UndefOr[MonitoringContainerArguments] = js.undefined
  
  /**
    * Specifies the entrypoint for a container that the monitoring job runs.
    */
  var ContainerEntrypoint: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ContainerEntrypoint] = js.undefined
  
  /**
    * Sets the environment variables in the container that the monitoring job runs.
    */
  var Environment: js.UndefOr[MonitoringEnvironmentMap] = js.undefined
  
  /**
    * The address of the container image that the monitoring job runs.
    */
  var ImageUri: typings.awsSdk.clientsSagemakerMod.ImageUri
  
  /**
    * An Amazon S3 URI to a script that is called after analysis has been performed. Applicable only for the built-in (first party) containers.
    */
  var PostAnalyticsProcessorSourceUri: js.UndefOr[S3Uri] = js.undefined
  
  /**
    * The machine learning problem type of the model that the monitoring job monitors.
    */
  var ProblemType: js.UndefOr[MonitoringProblemType] = js.undefined
  
  /**
    * An Amazon S3 URI to a script that is called per row prior to running analysis. It can base64 decode the payload and convert it into a flatted json so that the built-in container can use the converted data. Applicable only for the built-in (first party) containers.
    */
  var RecordPreprocessorSourceUri: js.UndefOr[S3Uri] = js.undefined
}
object ModelQualityAppSpecification {
  
  inline def apply(ImageUri: ImageUri): ModelQualityAppSpecification = {
    val __obj = js.Dynamic.literal(ImageUri = ImageUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelQualityAppSpecification]
  }
  
  extension [Self <: ModelQualityAppSpecification](x: Self) {
    
    inline def setContainerArguments(value: MonitoringContainerArguments): Self = StObject.set(x, "ContainerArguments", value.asInstanceOf[js.Any])
    
    inline def setContainerArgumentsUndefined: Self = StObject.set(x, "ContainerArguments", js.undefined)
    
    inline def setContainerArgumentsVarargs(value: ContainerArgument*): Self = StObject.set(x, "ContainerArguments", js.Array(value*))
    
    inline def setContainerEntrypoint(value: ContainerEntrypoint): Self = StObject.set(x, "ContainerEntrypoint", value.asInstanceOf[js.Any])
    
    inline def setContainerEntrypointUndefined: Self = StObject.set(x, "ContainerEntrypoint", js.undefined)
    
    inline def setContainerEntrypointVarargs(value: ContainerEntrypointString*): Self = StObject.set(x, "ContainerEntrypoint", js.Array(value*))
    
    inline def setEnvironment(value: MonitoringEnvironmentMap): Self = StObject.set(x, "Environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "Environment", js.undefined)
    
    inline def setImageUri(value: ImageUri): Self = StObject.set(x, "ImageUri", value.asInstanceOf[js.Any])
    
    inline def setPostAnalyticsProcessorSourceUri(value: S3Uri): Self = StObject.set(x, "PostAnalyticsProcessorSourceUri", value.asInstanceOf[js.Any])
    
    inline def setPostAnalyticsProcessorSourceUriUndefined: Self = StObject.set(x, "PostAnalyticsProcessorSourceUri", js.undefined)
    
    inline def setProblemType(value: MonitoringProblemType): Self = StObject.set(x, "ProblemType", value.asInstanceOf[js.Any])
    
    inline def setProblemTypeUndefined: Self = StObject.set(x, "ProblemType", js.undefined)
    
    inline def setRecordPreprocessorSourceUri(value: S3Uri): Self = StObject.set(x, "RecordPreprocessorSourceUri", value.asInstanceOf[js.Any])
    
    inline def setRecordPreprocessorSourceUriUndefined: Self = StObject.set(x, "RecordPreprocessorSourceUri", js.undefined)
  }
}
