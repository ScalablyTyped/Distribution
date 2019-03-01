package typings
package antdLib.libSelectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptGroupProps extends js.Object {
  var label: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
}

object OptGroupProps {
  @scala.inline
  def apply(label: reactLib.reactMod.ReactNs.ReactNode = null): OptGroupProps = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptGroupProps]
  }
}

