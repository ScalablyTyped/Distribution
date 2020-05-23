package typings.appleMapkitJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dark extends js.Object {
  /**
    * A constant indicating a dark color scheme.
    */
  val Dark: String
  /**
    * A constant indicating a light color scheme.
    */
  val Light: String
}

object Dark {
  @scala.inline
  def apply(Dark: String, Light: String): Dark = {
    val __obj = js.Dynamic.literal(Dark = Dark.asInstanceOf[js.Any], Light = Light.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dark]
  }
}

