package typings.antd.esMentionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.ReactNode
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
  def apply(children: ReactNode, value: String, StringDictionary: /* key */ StringDictionary[js.Any] = null): OptionProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], value = value)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[OptionProps]
  }
}

