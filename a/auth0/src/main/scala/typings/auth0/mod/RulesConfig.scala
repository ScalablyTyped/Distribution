package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RulesConfig extends js.Object {
  /**
    * Key for a rules config variable.
    */
  var key: String
}

object RulesConfig {
  @scala.inline
  def apply(key: String): RulesConfig = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RulesConfig]
  }
}

