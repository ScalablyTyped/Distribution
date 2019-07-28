package typings.atom.atomMod.Global

import typings.atom.atomMod.TextEditorElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLElementTagNameMap extends js.Object {
  var `atom-text-editor`: TextEditorElement
}

object HTMLElementTagNameMap {
  @scala.inline
  def apply(`atom-text-editor`: TextEditorElement): HTMLElementTagNameMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("atom-text-editor")(`atom-text-editor`)
    __obj.asInstanceOf[HTMLElementTagNameMap]
  }
}

