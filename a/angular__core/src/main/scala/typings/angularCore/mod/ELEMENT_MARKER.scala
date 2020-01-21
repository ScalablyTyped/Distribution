package typings.angularCore.mod

import typings.angularCore.angularCoreStrings.element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ELEMENT_MARKER extends js.Object {
  var marker: element
}

object ELEMENT_MARKER {
  @scala.inline
  def apply(marker: element): ELEMENT_MARKER = {
    val __obj = js.Dynamic.literal(marker = marker.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ELEMENT_MARKER]
  }
}

