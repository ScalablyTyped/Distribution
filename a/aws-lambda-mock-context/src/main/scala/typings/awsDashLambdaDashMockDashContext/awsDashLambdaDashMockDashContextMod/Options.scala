package typings.awsDashLambdaDashMockDashContext.awsDashLambdaDashMockDashContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var account: js.UndefOr[String] = js.undefined
  var alias: js.UndefOr[String] = js.undefined
  var functionName: js.UndefOr[String] = js.undefined
  var functionVersion: js.UndefOr[String] = js.undefined
  var memoryLimitInMB: js.UndefOr[String] = js.undefined
  var region: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    account: String = null,
    alias: String = null,
    functionName: String = null,
    functionVersion: String = null,
    memoryLimitInMB: String = null,
    region: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (account != null) __obj.updateDynamic("account")(account)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (functionName != null) __obj.updateDynamic("functionName")(functionName)
    if (functionVersion != null) __obj.updateDynamic("functionVersion")(functionVersion)
    if (memoryLimitInMB != null) __obj.updateDynamic("memoryLimitInMB")(memoryLimitInMB)
    if (region != null) __obj.updateDynamic("region")(region)
    __obj.asInstanceOf[Options]
  }
}

