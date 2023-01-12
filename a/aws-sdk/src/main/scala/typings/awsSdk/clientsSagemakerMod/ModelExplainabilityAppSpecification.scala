package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelExplainabilityAppSpecification extends StObject {
  
  /**
    * JSON formatted S3 file that defines explainability parameters. For more information on this JSON configuration file, see Configure model explainability parameters.
    */
  var ConfigUri: S3Uri
  
  /**
    * Sets the environment variables in the Docker container.
    */
  var Environment: js.UndefOr[MonitoringEnvironmentMap] = js.undefined
  
  /**
    * The container image to be run by the model explainability job.
    */
  var ImageUri: typings.awsSdk.clientsSagemakerMod.ImageUri
}
object ModelExplainabilityAppSpecification {
  
  inline def apply(ConfigUri: S3Uri, ImageUri: ImageUri): ModelExplainabilityAppSpecification = {
    val __obj = js.Dynamic.literal(ConfigUri = ConfigUri.asInstanceOf[js.Any], ImageUri = ImageUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelExplainabilityAppSpecification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModelExplainabilityAppSpecification] (val x: Self) extends AnyVal {
    
    inline def setConfigUri(value: S3Uri): Self = StObject.set(x, "ConfigUri", value.asInstanceOf[js.Any])
    
    inline def setEnvironment(value: MonitoringEnvironmentMap): Self = StObject.set(x, "Environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "Environment", js.undefined)
    
    inline def setImageUri(value: ImageUri): Self = StObject.set(x, "ImageUri", value.asInstanceOf[js.Any])
  }
}
