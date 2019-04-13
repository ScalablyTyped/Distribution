package typings
package antdDashMobileLib.libListPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPropsType extends js.Object {
  var children: js.UndefOr[
    antdDashMobileLib.antdDashMobileLibNumbers.`false` | reactLib.reactMod.Global.JSXNs.Element | js.Array[reactLib.reactMod.Global.JSXNs.Element]
  ] = js.undefined
  var renderFooter: js.UndefOr[
    js.Function0[reactLib.reactMod.ReactType[_]] | java.lang.String | reactLib.reactMod.Global.JSXNs.Element
  ] = js.undefined
  var renderHeader: js.UndefOr[
    js.Function0[reactLib.reactMod.ReactType[_]] | java.lang.String | reactLib.reactMod.Global.JSXNs.Element
  ] = js.undefined
}

object ListPropsType {
  @scala.inline
  def apply(
    children: antdDashMobileLib.antdDashMobileLibNumbers.`false` | reactLib.reactMod.Global.JSXNs.Element | js.Array[reactLib.reactMod.Global.JSXNs.Element] = null,
    renderFooter: js.Function0[reactLib.reactMod.ReactType[_]] | java.lang.String | reactLib.reactMod.Global.JSXNs.Element = null,
    renderHeader: js.Function0[reactLib.reactMod.ReactType[_]] | java.lang.String | reactLib.reactMod.Global.JSXNs.Element = null
  ): ListPropsType = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (renderFooter != null) __obj.updateDynamic("renderFooter")(renderFooter.asInstanceOf[js.Any])
    if (renderHeader != null) __obj.updateDynamic("renderHeader")(renderHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPropsType]
  }
}

