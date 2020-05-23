package typings.angularStrap.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Padding extends js.Object {
  var padding: String | Double
  var selector: String
}

object Padding {
  @scala.inline
  def apply(padding: String | Double, selector: String): Padding = {
    val __obj = js.Dynamic.literal(padding = padding.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[Padding]
  }
}

