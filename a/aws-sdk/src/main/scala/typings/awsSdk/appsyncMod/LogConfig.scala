package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogConfig extends js.Object {
  
  /**
    * The service role that AWS AppSync will assume to publish to Amazon CloudWatch logs in your account. 
    */
  var cloudWatchLogsRoleArn: String = js.native
  
  /**
    * Set to TRUE to exclude sections that contain information such as headers, context, and evaluated mapping templates, regardless of logging level.
    */
  var excludeVerboseContent: js.UndefOr[Boolean] = js.native
  
  /**
    * The field logging level. Values can be NONE, ERROR, or ALL.     NONE: No field-level logs are captured.    ERROR: Logs the following information only for the fields that are in error:   The error section in the server response.   Field-level errors.   The generated request/response functions that got resolved for error fields.      ALL: The following information is logged for all fields in the query:   Field-level tracing information.   The generated request/response functions that got resolved for each field.    
    */
  var fieldLogLevel: FieldLogLevel = js.native
}
object LogConfig {
  
  @scala.inline
  def apply(cloudWatchLogsRoleArn: String, fieldLogLevel: FieldLogLevel): LogConfig = {
    val __obj = js.Dynamic.literal(cloudWatchLogsRoleArn = cloudWatchLogsRoleArn.asInstanceOf[js.Any], fieldLogLevel = fieldLogLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogConfig]
  }
  
  @scala.inline
  implicit class LogConfigOps[Self <: LogConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCloudWatchLogsRoleArn(value: String): Self = this.set("cloudWatchLogsRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldLogLevel(value: FieldLogLevel): Self = this.set("fieldLogLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeVerboseContent(value: Boolean): Self = this.set("excludeVerboseContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeVerboseContent: Self = this.set("excludeVerboseContent", js.undefined)
  }
}
