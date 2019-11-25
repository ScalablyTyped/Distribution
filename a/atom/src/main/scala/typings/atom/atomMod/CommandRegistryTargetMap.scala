package typings.atom.atomMod

import org.scalablytyped.runtime.StringDictionary
import typings.atom.atomMod._Global_.HTMLElementTagNameMap
import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandRegistryTargetMap
  extends HTMLElementTagNameMap
     with /* key */ StringDictionary[EventTarget]

object CommandRegistryTargetMap {
  @scala.inline
  def apply(
    `atom-text-editor`: TextEditorElement,
    StringDictionary: /* key */ StringDictionary[EventTarget] = null
  ): CommandRegistryTargetMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("atom-text-editor")(`atom-text-editor`.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[CommandRegistryTargetMap]
  }
}

