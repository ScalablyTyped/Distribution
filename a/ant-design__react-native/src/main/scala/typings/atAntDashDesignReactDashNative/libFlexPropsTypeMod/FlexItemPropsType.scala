package typings.atAntDashDesignReactDashNative.libFlexPropsTypeMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlexItemPropsType extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
}

object FlexItemPropsType {
  @scala.inline
  def apply(children: ReactNode = null, disabled: js.UndefOr[Boolean] = js.undefined): FlexItemPropsType = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexItemPropsType]
  }
}

