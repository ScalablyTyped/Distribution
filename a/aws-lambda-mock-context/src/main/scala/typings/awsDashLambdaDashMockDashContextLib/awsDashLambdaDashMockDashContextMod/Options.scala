package typings
package awsDashLambdaDashMockDashContextLib.awsDashLambdaDashMockDashContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var account: js.UndefOr[java.lang.String] = js.undefined
  var alias: js.UndefOr[java.lang.String] = js.undefined
  var functionName: js.UndefOr[java.lang.String] = js.undefined
  var functionVersion: js.UndefOr[java.lang.String] = js.undefined
  var memoryLimitInMB: js.UndefOr[java.lang.String] = js.undefined
  var region: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    account: java.lang.String = null,
    alias: java.lang.String = null,
    functionName: java.lang.String = null,
    functionVersion: java.lang.String = null,
    memoryLimitInMB: java.lang.String = null,
    region: java.lang.String = null
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

