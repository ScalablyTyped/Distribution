package typings.antd.esTableInterfaceMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.MouseEventHandler
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdditionalCellProps
  extends /* name */ StringDictionary[js.Any] {
  var onClick: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
}

object AdditionalCellProps {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    onClick: MouseEventHandler[HTMLElement] = null
  ): AdditionalCellProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    __obj.asInstanceOf[AdditionalCellProps]
  }
}

