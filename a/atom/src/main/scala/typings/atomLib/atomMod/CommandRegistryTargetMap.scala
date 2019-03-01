package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandRegistryTargetMap
  extends atomLib.atomMod.Global.HTMLElementTagNameMap
     with /* key */ org.scalablytyped.runtime.StringDictionary[stdLib.EventTarget]

object CommandRegistryTargetMap {
  @scala.inline
  def apply(
    `atom-text-editor`: TextEditorElement,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[stdLib.EventTarget] = null
  ): CommandRegistryTargetMap = {
    val __obj = js.Dynamic.literal(`atom-text-editor` = `atom-text-editor`)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[CommandRegistryTargetMap]
  }
}

