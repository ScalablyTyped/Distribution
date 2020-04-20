package typings.appleMapkitJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDark extends js.Object {
  /**
    * A constant indicating a dark color scheme.
    */
  val Dark: String
  /**
    * A constant indicating a light color scheme.
    */
  val Light: String
}

object AnonDark {
  @scala.inline
  def apply(Dark: String, Light: String): AnonDark = {
    val __obj = js.Dynamic.literal(Dark = Dark.asInstanceOf[js.Any], Light = Light.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDark]
  }
}

