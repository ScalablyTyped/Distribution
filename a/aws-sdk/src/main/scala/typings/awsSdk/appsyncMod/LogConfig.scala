package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    cloudWatchLogsRoleArn: String,
    fieldLogLevel: FieldLogLevel,
    excludeVerboseContent: js.UndefOr[scala.Boolean] = js.undefined
  ): LogConfig = {
    val __obj = js.Dynamic.literal(cloudWatchLogsRoleArn = cloudWatchLogsRoleArn.asInstanceOf[js.Any], fieldLogLevel = fieldLogLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(excludeVerboseContent)) __obj.updateDynamic("excludeVerboseContent")(excludeVerboseContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogConfig]
  }
}

