package typings.actionsDashOnDashGoogle.distFrameworkFrameworkMod

import org.scalablytyped.runtime.StringDictionary
import typings.actionsDashOnDashGoogle.distFrameworkExpressMod.Express
import typings.actionsDashOnDashGoogle.distFrameworkLambdaMod.Lambda
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuiltinFrameworks extends Frameworks {
  /**
    * Plug and play web framework support for express using body-parser
    * @public
    */
  var express: Express
  /**
    * Plug and play web framework support for lambda API gateway
    * @public
    */
  var lambda: Lambda
}

object BuiltinFrameworks {
  @scala.inline
  def apply(
    express: Express,
    lambda: Lambda,
    StringDictionary: /** @public */
  StringDictionary[Framework[js.Function]] = null
  ): BuiltinFrameworks = {
    val __obj = js.Dynamic.literal(express = express, lambda = lambda)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[BuiltinFrameworks]
  }
}

