package typings.antd.mentionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionProps
  extends /* key */ StringDictionary[js.Any] {
  var children: ReactNode
  var value: String
}

object OptionProps {
  @scala.inline
  def apply(
    value: String,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    children: ReactNode = null
  ): OptionProps = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionProps]
  }
}

