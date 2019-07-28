package typings.atAntDashDesignProDashLayout.esTypingsMod

import typings.history.historyMod.LocationDescriptor
import typings.history.historyMod.LocationState
import typings.react.reactMod.AnchorHTMLAttributes
import typings.react.reactMod.Ref
import typings.std.HTMLAnchorElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkProps extends AnchorHTMLAttributes[HTMLAnchorElement] {
  var innerRef: js.UndefOr[Ref[HTMLAnchorElement]] = js.undefined
  var replace: js.UndefOr[Boolean] = js.undefined
  var to: LocationDescriptor[LocationState]
}

object LinkProps {
  @scala.inline
  def apply(
    to: LocationDescriptor[LocationState],
    AnchorHTMLAttributes: AnchorHTMLAttributes[HTMLAnchorElement] = null,
    innerRef: Ref[HTMLAnchorElement] = null,
    replace: js.UndefOr[Boolean] = js.undefined
  ): LinkProps = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, AnchorHTMLAttributes)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (!js.isUndefined(replace)) __obj.updateDynamic("replace")(replace)
    __obj.asInstanceOf[LinkProps]
  }
}

