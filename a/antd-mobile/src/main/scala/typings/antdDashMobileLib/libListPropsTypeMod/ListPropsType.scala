package typings
package antdDashMobileLib.libListPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPropsType extends js.Object {
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var renderFooter: js.UndefOr[js.Function0[reactLib.reactMod.ReactNode]] = js.undefined
  var renderHeader: js.UndefOr[js.Function0[reactLib.reactMod.ReactNode]] = js.undefined
}

object ListPropsType {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNode = null,
    renderFooter: () => reactLib.reactMod.ReactNode = null,
    renderHeader: () => reactLib.reactMod.ReactNode = null
  ): ListPropsType = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (renderFooter != null) __obj.updateDynamic("renderFooter")(js.Any.fromFunction0(renderFooter))
    if (renderHeader != null) __obj.updateDynamic("renderHeader")(js.Any.fromFunction0(renderHeader))
    __obj.asInstanceOf[ListPropsType]
  }
}

