package typings.apigeeAccess.mod.ApigeeAccess

import typings.apigeeAccess.apigeeAccessStrings.application
import typings.apigeeAccess.apigeeAccessStrings.exclusive
import typings.apigeeAccess.apigeeAccessStrings.global
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheOptions extends js.Object {
  var defaultTtl: js.UndefOr[Double] = js.undefined
  var resource: js.UndefOr[String] = js.undefined
  var scope: js.UndefOr[global | application | exclusive] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object CacheOptions {
  @scala.inline
  def apply(
    defaultTtl: Int | Double = null,
    resource: String = null,
    scope: global | application | exclusive = null,
    timeout: Int | Double = null
  ): CacheOptions = {
    val __obj = js.Dynamic.literal()
    if (defaultTtl != null) __obj.updateDynamic("defaultTtl")(defaultTtl.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheOptions]
  }
}

