package typings
package antdLib.esMentionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionProps
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var children: reactLib.reactMod.ReactNode
  var value: java.lang.String
}

object OptionProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNode,
    value: java.lang.String,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): OptionProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], value = value)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[OptionProps]
  }
}

