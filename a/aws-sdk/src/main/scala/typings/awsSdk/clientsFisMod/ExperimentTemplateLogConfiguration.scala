package typings.awsSdk.clientsFisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExperimentTemplateLogConfiguration extends StObject {
  
  /**
    * The configuration for experiment logging to Amazon CloudWatch Logs.
    */
  var cloudWatchLogsConfiguration: js.UndefOr[ExperimentTemplateCloudWatchLogsLogConfiguration] = js.undefined
  
  /**
    * The schema version.
    */
  var logSchemaVersion: js.UndefOr[LogSchemaVersion] = js.undefined
  
  /**
    * The configuration for experiment logging to Amazon S3.
    */
  var s3Configuration: js.UndefOr[ExperimentTemplateS3LogConfiguration] = js.undefined
}
object ExperimentTemplateLogConfiguration {
  
  inline def apply(): ExperimentTemplateLogConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExperimentTemplateLogConfiguration]
  }
  
  extension [Self <: ExperimentTemplateLogConfiguration](x: Self) {
    
    inline def setCloudWatchLogsConfiguration(value: ExperimentTemplateCloudWatchLogsLogConfiguration): Self = StObject.set(x, "cloudWatchLogsConfiguration", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchLogsConfigurationUndefined: Self = StObject.set(x, "cloudWatchLogsConfiguration", js.undefined)
    
    inline def setLogSchemaVersion(value: LogSchemaVersion): Self = StObject.set(x, "logSchemaVersion", value.asInstanceOf[js.Any])
    
    inline def setLogSchemaVersionUndefined: Self = StObject.set(x, "logSchemaVersion", js.undefined)
    
    inline def setS3Configuration(value: ExperimentTemplateS3LogConfiguration): Self = StObject.set(x, "s3Configuration", value.asInstanceOf[js.Any])
    
    inline def setS3ConfigurationUndefined: Self = StObject.set(x, "s3Configuration", js.undefined)
  }
}
