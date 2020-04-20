package typings.acmeClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProduction extends js.Object {
  var production: String
  var staging: String
}

object AnonProduction {
  @scala.inline
  def apply(production: String, staging: String): AnonProduction = {
    val __obj = js.Dynamic.literal(production = production.asInstanceOf[js.Any], staging = staging.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonProduction]
  }
}

