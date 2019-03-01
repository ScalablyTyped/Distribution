package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientContextEnv extends js.Object {
  var locale: java.lang.String
  var make: java.lang.String
  var model: java.lang.String
  var platform: java.lang.String
  var platformVersion: java.lang.String
}

object ClientContextEnv {
  @scala.inline
  def apply(
    locale: java.lang.String,
    make: java.lang.String,
    model: java.lang.String,
    platform: java.lang.String,
    platformVersion: java.lang.String
  ): ClientContextEnv = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("locale")(locale)
    __obj.updateDynamic("make")(make)
    __obj.updateDynamic("model")(model)
    __obj.updateDynamic("platform")(platform)
    __obj.updateDynamic("platformVersion")(platformVersion)
    __obj.asInstanceOf[ClientContextEnv]
  }
}

