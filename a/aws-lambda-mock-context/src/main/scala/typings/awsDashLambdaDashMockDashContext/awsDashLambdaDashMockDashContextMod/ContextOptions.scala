package typings.awsDashLambdaDashMockDashContext.awsDashLambdaDashMockDashContextMod

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
    timeout: Int | Double = null
  ): ContextOptions = {
    val __obj = js.Dynamic.literal()
    if (account != null) __obj.updateDynamic("account")(account)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (functionName != null) __obj.updateDynamic("functionName")(functionName)
    if (functionVersion != null) __obj.updateDynamic("functionVersion")(functionVersion)
    if (memoryLimitInMB != null) __obj.updateDynamic("memoryLimitInMB")(memoryLimitInMB)
    if (region != null) __obj.updateDynamic("region")(region)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextOptions]
  }
}

