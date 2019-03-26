package typings
package agDashGridLib.distLibGridPanelScrollVisibleServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetScrollsVisibleParams extends js.Object {
  var bodyHorizontalScrollShowing: scala.Boolean
  var leftVerticalScrollShowing: scala.Boolean
  var rightVerticalScrollShowing: scala.Boolean
}

object SetScrollsVisibleParams {
  @scala.inline
  def apply(
    bodyHorizontalScrollShowing: scala.Boolean,
    leftVerticalScrollShowing: scala.Boolean,
    rightVerticalScrollShowing: scala.Boolean
  ): SetScrollsVisibleParams = {
    val __obj = js.Dynamic.literal(bodyHorizontalScrollShowing = bodyHorizontalScrollShowing, leftVerticalScrollShowing = leftVerticalScrollShowing, rightVerticalScrollShowing = rightVerticalScrollShowing)
  
    __obj.asInstanceOf[SetScrollsVisibleParams]
  }
}

