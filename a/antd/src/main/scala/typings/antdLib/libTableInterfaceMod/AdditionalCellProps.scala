package typings
package antdLib.libTableInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdditionalCellProps
  extends /* name */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var onClick: js.UndefOr[reactLib.reactMod.ReactNs.MouseEventHandler[reactLib.HTMLElement]] = js.undefined
}

object AdditionalCellProps {
  @scala.inline
  def apply(
    StringDictionary: /* name */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    onClick: reactLib.reactMod.ReactNs.MouseEventHandler[reactLib.HTMLElement] = null
  ): AdditionalCellProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    __obj.asInstanceOf[AdditionalCellProps]
  }
}

