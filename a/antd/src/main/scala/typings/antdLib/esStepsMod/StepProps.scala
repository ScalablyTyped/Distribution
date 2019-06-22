package typings
package antdLib.esStepsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var description: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var icon: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var onClick: js.UndefOr[reactLib.reactMod.MouseEventHandler[stdLib.HTMLElement]] = js.undefined
  var status: js.UndefOr[
    antdLib.antdLibStrings.wait | antdLib.antdLibStrings.process | antdLib.antdLibStrings.finish | antdLib.antdLibStrings.error
  ] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var title: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
}

object StepProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    description: reactLib.reactMod.ReactNode = null,
    icon: reactLib.reactMod.ReactNode = null,
    onClick: reactLib.reactMod.MouseEventHandler[stdLib.HTMLElement] = null,
    status: antdLib.antdLibStrings.wait | antdLib.antdLibStrings.process | antdLib.antdLibStrings.finish | antdLib.antdLibStrings.error = null,
    style: reactLib.reactMod.CSSProperties = null,
    title: reactLib.reactMod.ReactNode = null
  ): StepProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepProps]
  }
}

