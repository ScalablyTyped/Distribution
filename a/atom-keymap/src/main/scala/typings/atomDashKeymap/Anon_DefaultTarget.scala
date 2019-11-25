package typings.atomDashKeymap

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultTarget extends js.Object {
  var defaultTarget: js.UndefOr[HTMLElement] = js.undefined
}

object Anon_DefaultTarget {
  @scala.inline
  def apply(defaultTarget: HTMLElement = null): Anon_DefaultTarget = {
    val __obj = js.Dynamic.literal()
    if (defaultTarget != null) __obj.updateDynamic("defaultTarget")(defaultTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DefaultTarget]
  }
}

