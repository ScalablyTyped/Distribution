package typings
package antdLib.libStepsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var description: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var icon: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var onClick: js.UndefOr[reactLib.reactMod.ReactNs.MouseEventHandler[_]] = js.undefined
  var status: js.UndefOr[
    antdLib.antdLibStrings.wait | antdLib.antdLibStrings.process | antdLib.antdLibStrings.finish | antdLib.antdLibStrings.error
  ] = js.undefined
  var title: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
}

object StepProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    description: reactLib.reactMod.ReactNs.ReactNode = null,
    icon: reactLib.reactMod.ReactNs.ReactNode = null,
    onClick: reactLib.reactMod.ReactNs.MouseEventHandler[_] = null,
    status: antdLib.antdLibStrings.wait | antdLib.antdLibStrings.process | antdLib.antdLibStrings.finish | antdLib.antdLibStrings.error = null,
    title: reactLib.reactMod.ReactNs.ReactNode = null
  ): StepProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepProps]
  }
}

