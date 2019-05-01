package typings
package antdDashMobileLib.libListPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPropsType extends js.Object {
  var renderFooter: js.UndefOr[js.Function0[reactLib.reactMod.ReactNode] | reactLib.reactMod.ReactNode] = js.undefined
  var renderHeader: js.UndefOr[js.Function0[reactLib.reactMod.ReactNode] | reactLib.reactMod.ReactNode] = js.undefined
}

object ListPropsType {
  @scala.inline
  def apply(
    renderFooter: js.Function0[reactLib.reactMod.ReactNode] | reactLib.reactMod.ReactNode = null,
    renderHeader: js.Function0[reactLib.reactMod.ReactNode] | reactLib.reactMod.ReactNode = null
  ): ListPropsType = {
    val __obj = js.Dynamic.literal()
    if (renderFooter != null) __obj.updateDynamic("renderFooter")(renderFooter.asInstanceOf[js.Any])
    if (renderHeader != null) __obj.updateDynamic("renderHeader")(renderHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPropsType]
  }
}

