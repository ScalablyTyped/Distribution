package typings.awsSdk.clientsFisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateExperimentTemplateLogConfigurationInput extends StObject {
  
  /**
    * The configuration for experiment logging to Amazon CloudWatch Logs.
    */
  var cloudWatchLogsConfiguration: js.UndefOr[ExperimentTemplateCloudWatchLogsLogConfigurationInput] = js.undefined
  
  /**
    * The schema version.
    */
  var logSchemaVersion: js.UndefOr[LogSchemaVersion] = js.undefined
  
  /**
    * The configuration for experiment logging to Amazon S3.
    */
  var s3Configuration: js.UndefOr[ExperimentTemplateS3LogConfigurationInput] = js.undefined
}
object UpdateExperimentTemplateLogConfigurationInput {
  
  inline def apply(): UpdateExperimentTemplateLogConfigurationInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateExperimentTemplateLogConfigurationInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateExperimentTemplateLogConfigurationInput] (val x: Self) extends AnyVal {
    
    inline def setCloudWatchLogsConfiguration(value: ExperimentTemplateCloudWatchLogsLogConfigurationInput): Self = StObject.set(x, "cloudWatchLogsConfiguration", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchLogsConfigurationUndefined: Self = StObject.set(x, "cloudWatchLogsConfiguration", js.undefined)
    
    inline def setLogSchemaVersion(value: LogSchemaVersion): Self = StObject.set(x, "logSchemaVersion", value.asInstanceOf[js.Any])
    
    inline def setLogSchemaVersionUndefined: Self = StObject.set(x, "logSchemaVersion", js.undefined)
    
    inline def setS3Configuration(value: ExperimentTemplateS3LogConfigurationInput): Self = StObject.set(x, "s3Configuration", value.asInstanceOf[js.Any])
    
    inline def setS3ConfigurationUndefined: Self = StObject.set(x, "s3Configuration", js.undefined)
  }
}
