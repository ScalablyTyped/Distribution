package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataQualityAppSpecification extends StObject {
  
  /**
    * The arguments to send to the container that the monitoring job runs.
    */
  var ContainerArguments: js.UndefOr[MonitoringContainerArguments] = js.undefined
  
  /**
    * The entrypoint for a container used to run a monitoring job.
    */
  var ContainerEntrypoint: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ContainerEntrypoint] = js.undefined
  
  /**
    * Sets the environment variables in the container that the monitoring job runs.
    */
  var Environment: js.UndefOr[MonitoringEnvironmentMap] = js.undefined
  
  /**
    * The container image that the data quality monitoring job runs.
    */
  var ImageUri: typings.awsSdk.clientsSagemakerMod.ImageUri
  
  /**
    * An Amazon S3 URI to a script that is called after analysis has been performed. Applicable only for the built-in (first party) containers.
    */
  var PostAnalyticsProcessorSourceUri: js.UndefOr[S3Uri] = js.undefined
  
  /**
    * An Amazon S3 URI to a script that is called per row prior to running analysis. It can base64 decode the payload and convert it into a flatted json so that the built-in container can use the converted data. Applicable only for the built-in (first party) containers.
    */
  var RecordPreprocessorSourceUri: js.UndefOr[S3Uri] = js.undefined
}
object DataQualityAppSpecification {
  
  inline def apply(ImageUri: ImageUri): DataQualityAppSpecification = {
    val __obj = js.Dynamic.literal(ImageUri = ImageUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataQualityAppSpecification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataQualityAppSpecification] (val x: Self) extends AnyVal {
    
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
    
    inline def setRecordPreprocessorSourceUri(value: S3Uri): Self = StObject.set(x, "RecordPreprocessorSourceUri", value.asInstanceOf[js.Any])
    
    inline def setRecordPreprocessorSourceUriUndefined: Self = StObject.set(x, "RecordPreprocessorSourceUri", js.undefined)
  }
}
