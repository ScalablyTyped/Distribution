package typings.atomKeymap

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefaultTarget extends js.Object {
  var defaultTarget: js.UndefOr[HTMLElement] = js.undefined
}

object AnonDefaultTarget {
  @scala.inline
  def apply(defaultTarget: HTMLElement = null): AnonDefaultTarget = {
    val __obj = js.Dynamic.literal()
    if (defaultTarget != null) __obj.updateDynamic("defaultTarget")(defaultTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefaultTarget]
  }
}

