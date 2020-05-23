package typings.awsLambdaMockContext.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextOptions extends js.Object {
  var account: js.UndefOr[String] = js.undefined
  var alias: js.UndefOr[String] = js.undefined
  var functionName: js.UndefOr[String] = js.undefined
  var functionVersion: js.UndefOr[String] = js.undefined
  var memoryLimitInMB: js.UndefOr[String] = js.undefined
  var region: js.UndefOr[String] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object ContextOptions {
  @scala.inline
  def apply(
    account: String = null,
    alias: String = null,
    functionName: String = null,
    functionVersion: String = null,
    memoryLimitInMB: String = null,
    region: String = null,
    timeout: js.UndefOr[Double] = js.undefined
  ): ContextOptions = {
    val __obj = js.Dynamic.literal()
    if (account != null) __obj.updateDynamic("account")(account.asInstanceOf[js.Any])
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (functionName != null) __obj.updateDynamic("functionName")(functionName.asInstanceOf[js.Any])
    if (functionVersion != null) __obj.updateDynamic("functionVersion")(functionVersion.asInstanceOf[js.Any])
    if (memoryLimitInMB != null) __obj.updateDynamic("memoryLimitInMB")(memoryLimitInMB.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextOptions]
  }
}

