package typings
package atAntDashDesignReactDashNativeLib.esFlexPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlexPropsType extends js.Object {
  var align: js.UndefOr[
    atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.start | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.center | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.end | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.baseline | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.stretch
  ] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var direction: js.UndefOr[
    atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.row | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.`row-reverse` | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.column | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.`column-reverse`
  ] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var justify: js.UndefOr[
    atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.start | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.end | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.center | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.between | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.around
  ] = js.undefined
  var wrap: js.UndefOr[
    atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.nowrap | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.wrap | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.`wrap-reverse`
  ] = js.undefined
}

object FlexPropsType {
  @scala.inline
  def apply(
    align: atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.start | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.center | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.end | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.baseline | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.stretch = null,
    children: reactLib.reactMod.ReactNode = null,
    direction: atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.row | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.`row-reverse` | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.column | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.`column-reverse` = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    justify: atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.start | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.end | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.center | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.between | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.around = null,
    wrap: atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.nowrap | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.wrap | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.`wrap-reverse` = null
  ): FlexPropsType = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (justify != null) __obj.updateDynamic("justify")(justify.asInstanceOf[js.Any])
    if (wrap != null) __obj.updateDynamic("wrap")(wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexPropsType]
  }
}

