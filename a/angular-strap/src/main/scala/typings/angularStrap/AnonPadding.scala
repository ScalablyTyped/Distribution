package typings.angularStrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPadding extends js.Object {
  var padding: String | Double
  var selector: String
}

object AnonPadding {
  @scala.inline
  def apply(padding: String | Double, selector: String): AnonPadding = {
    val __obj = js.Dynamic.literal(padding = padding.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPadding]
  }
}

