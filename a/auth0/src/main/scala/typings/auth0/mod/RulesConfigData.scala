package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RulesConfigData extends js.Object {
  /**
    * Value for a rules config variable.
    */
  var value: String
}

object RulesConfigData {
  @scala.inline
  def apply(value: String): RulesConfigData = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RulesConfigData]
  }
}

