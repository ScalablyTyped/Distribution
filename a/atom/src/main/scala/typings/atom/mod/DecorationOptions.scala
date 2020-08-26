package typings.atom.mod

import typings.atom.atomStrings.`line-number`
import typings.atom.atomStrings.block
import typings.atom.atomStrings.cursor_
import typings.atom.atomStrings.gutter
import typings.atom.atomStrings.highlight
import typings.atom.atomStrings.line
import typings.atom.atomStrings.overlay
import typings.atom.atomStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecorationOptions extends SharedDecorationOptions {
  /** The name of the gutter we're decorating, if type is "gutter". */
  var gutterName: js.UndefOr[String] = js.native
  /** One of several supported decoration types. */
  var `type`: js.UndefOr[line | `line-number` | text | highlight | overlay | gutter | block | cursor_] = js.native
}

object DecorationOptions {
  @scala.inline
  def apply(): DecorationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DecorationOptions]
  }
  @scala.inline
  implicit class DecorationOptionsOps[Self <: DecorationOptions] (val x: Self) extends AnyVal {
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
    def setGutterName(value: String): Self = this.set("gutterName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGutterName: Self = this.set("gutterName", js.undefined)
    @scala.inline
    def setType(value: line | `line-number` | text | highlight | overlay | gutter | block | cursor_): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

