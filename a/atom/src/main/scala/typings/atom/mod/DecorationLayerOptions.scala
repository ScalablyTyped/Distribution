package typings.atom.mod

import typings.atom.atomStrings.`line-number`
import typings.atom.atomStrings.block
import typings.atom.atomStrings.cursor_
import typings.atom.atomStrings.highlight
import typings.atom.atomStrings.line
import typings.atom.atomStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecorationLayerOptions extends SharedDecorationOptions {
  /** One of several supported decoration types. */
  var `type`: js.UndefOr[line | `line-number` | text | highlight | block | cursor_] = js.native
}

object DecorationLayerOptions {
  @scala.inline
  def apply(): DecorationLayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DecorationLayerOptions]
  }
  @scala.inline
  implicit class DecorationLayerOptionsOps[Self <: DecorationLayerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setType(value: line | `line-number` | text | highlight | block | cursor_): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

