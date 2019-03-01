package typings
package apigeeDashAccessLib.apigeeDashAccessMod.ApigeeAccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheOptions extends js.Object {
  var defaultTtl: js.UndefOr[scala.Double] = js.undefined
  var resource: js.UndefOr[java.lang.String] = js.undefined
  var scope: js.UndefOr[
    apigeeDashAccessLib.apigeeDashAccessLibStrings.global | apigeeDashAccessLib.apigeeDashAccessLibStrings.application | apigeeDashAccessLib.apigeeDashAccessLibStrings.exclusive
  ] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object CacheOptions {
  @scala.inline
  def apply(
    defaultTtl: scala.Int | scala.Double = null,
    resource: java.lang.String = null,
    scope: apigeeDashAccessLib.apigeeDashAccessLibStrings.global | apigeeDashAccessLib.apigeeDashAccessLibStrings.application | apigeeDashAccessLib.apigeeDashAccessLibStrings.exclusive = null,
    timeout: scala.Int | scala.Double = null
  ): CacheOptions = {
    val __obj = js.Dynamic.literal()
    if (defaultTtl != null) __obj.updateDynamic("defaultTtl")(defaultTtl.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource)
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheOptions]
  }
}

