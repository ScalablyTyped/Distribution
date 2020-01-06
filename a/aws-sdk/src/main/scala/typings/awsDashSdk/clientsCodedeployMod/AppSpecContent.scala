package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppSpecContent extends js.Object {
  /**
    *  The YAML-formatted or JSON-formatted revision string.   For an AWS Lambda deployment, the content includes a Lambda function name, the alias for its original version, and the alias for its replacement version. The deployment shifts traffic from the original version of the Lambda function to the replacement version.   For an Amazon ECS deployment, the content includes the task name, information about the load balancer that serves traffic to the container, and more.   For both types of deployments, the content can specify Lambda functions that run at specified hooks, such as BeforeInstall, during a deployment. 
    */
  var content: js.UndefOr[RawStringContent] = js.native
  /**
    *  The SHA256 hash value of the revision content. 
    */
  var sha256: js.UndefOr[RawStringSha256] = js.native
}

object AppSpecContent {
  @scala.inline
  def apply(content: RawStringContent = null, sha256: RawStringSha256 = null): AppSpecContent = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (sha256 != null) __obj.updateDynamic("sha256")(sha256.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppSpecContent]
  }
}

