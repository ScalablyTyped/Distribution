package typings.ariClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigTuple extends js.Object {
  /**
    * A configuration object attribute.
    */
  var attribute: String
  /**
    * The value for the attribute.
    */
  var value: String
}

object ConfigTuple {
  @scala.inline
  def apply(attribute: String, value: String): ConfigTuple = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigTuple]
  }
}

