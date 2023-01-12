package typings.awsSdk.clientsFisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateExperimentTemplateLogConfigurationInput extends StObject {
  
  /**
    * The configuration for experiment logging to Amazon CloudWatch Logs.
    */
  var cloudWatchLogsConfiguration: js.UndefOr[ExperimentTemplateCloudWatchLogsLogConfigurationInput] = js.undefined
  
  /**
    * The schema version.
    */
  var logSchemaVersion: LogSchemaVersion
  
  /**
    * The configuration for experiment logging to Amazon S3.
    */
  var s3Configuration: js.UndefOr[ExperimentTemplateS3LogConfigurationInput] = js.undefined
}
object CreateExperimentTemplateLogConfigurationInput {
  
  inline def apply(logSchemaVersion: LogSchemaVersion): CreateExperimentTemplateLogConfigurationInput = {
    val __obj = js.Dynamic.literal(logSchemaVersion = logSchemaVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateExperimentTemplateLogConfigurationInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateExperimentTemplateLogConfigurationInput] (val x: Self) extends AnyVal {
    
    inline def setCloudWatchLogsConfiguration(value: ExperimentTemplateCloudWatchLogsLogConfigurationInput): Self = StObject.set(x, "cloudWatchLogsConfiguration", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchLogsConfigurationUndefined: Self = StObject.set(x, "cloudWatchLogsConfiguration", js.undefined)
    
    inline def setLogSchemaVersion(value: LogSchemaVersion): Self = StObject.set(x, "logSchemaVersion", value.asInstanceOf[js.Any])
    
    inline def setS3Configuration(value: ExperimentTemplateS3LogConfigurationInput): Self = StObject.set(x, "s3Configuration", value.asInstanceOf[js.Any])
    
    inline def setS3ConfigurationUndefined: Self = StObject.set(x, "s3Configuration", js.undefined)
  }
}
