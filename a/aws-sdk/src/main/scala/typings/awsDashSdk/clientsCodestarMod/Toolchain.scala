package typings.awsDashSdk.clientsCodestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Toolchain extends js.Object {
  /**
    * The service role ARN for AWS CodeStar to use for the toolchain template during stack provisioning.
    */
  var roleArn: js.UndefOr[RoleArn] = js.undefined
  /**
    * The Amazon S3 location where the toolchain template file provided with the project request is stored. AWS CodeStar retrieves the file during project creation.
    */
  var source: ToolchainSource
  /**
    * The list of parameter overrides to be passed into the toolchain template during stack provisioning, if any.
    */
  var stackParameters: js.UndefOr[TemplateParameterMap] = js.undefined
}

object Toolchain {
  @scala.inline
  def apply(source: ToolchainSource, roleArn: RoleArn = null, stackParameters: TemplateParameterMap = null): Toolchain = {
    val __obj = js.Dynamic.literal(source = source)
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn)
    if (stackParameters != null) __obj.updateDynamic("stackParameters")(stackParameters)
    __obj.asInstanceOf[Toolchain]
  }
}

