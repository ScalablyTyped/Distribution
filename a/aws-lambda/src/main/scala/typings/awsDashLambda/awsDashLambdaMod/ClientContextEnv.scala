package typings.awsDashLambda.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientContextEnv extends js.Object {
  var locale: String
  var make: String
  var model: String
  var platform: String
  var platformVersion: String
}

object ClientContextEnv {
  @scala.inline
  def apply(locale: String, make: String, model: String, platform: String, platformVersion: String): ClientContextEnv = {
    val __obj = js.Dynamic.literal(locale = locale, make = make, model = model, platform = platform, platformVersion = platformVersion)
  
    __obj.asInstanceOf[ClientContextEnv]
  }
}

