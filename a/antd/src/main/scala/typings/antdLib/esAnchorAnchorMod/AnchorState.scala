package typings
package antdLib.esAnchorAnchorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnchorState extends js.Object {
  var activeLink: scala.Null | java.lang.String
}

object AnchorState {
  @scala.inline
  def apply(activeLink: java.lang.String = null): AnchorState = {
    val __obj = js.Dynamic.literal()
    if (activeLink != null) __obj.updateDynamic("activeLink")(activeLink)
    __obj.asInstanceOf[AnchorState]
  }
}

