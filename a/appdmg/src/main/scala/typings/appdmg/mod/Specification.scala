package typings.appdmg.mod

import typings.appdmg.appdmgStrings.UDBZ
import typings.appdmg.appdmgStrings.UDCO
import typings.appdmg.appdmgStrings.UDRO
import typings.appdmg.appdmgStrings.UDRW
import typings.appdmg.appdmgStrings.UDZO
import typings.appdmg.appdmgStrings.ULFO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Specification extends js.Object {
  var background: js.UndefOr[String] = js.native
  var `background-color`: js.UndefOr[String] = js.native
  var `code-sign`: js.UndefOr[SpecificationCodeSign] = js.native
  var contents: js.Array[SpecificationContents] = js.native
  var format: UDRW | UDRO | UDCO | UDZO | UDBZ | ULFO = js.native
  var icon: js.UndefOr[String] = js.native
  var `icon-size`: js.UndefOr[Double] = js.native
  var title: String = js.native
  var window: js.UndefOr[SpecificationWindow] = js.native
}

object Specification {
  @scala.inline
  def apply(
    contents: js.Array[SpecificationContents],
    format: UDRW | UDRO | UDCO | UDZO | UDBZ | ULFO,
    title: String
  ): Specification = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Specification]
  }
  @scala.inline
  implicit class SpecificationOps[Self <: Specification] (val x: Self) extends AnyVal {
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
    def setContentsVarargs(value: SpecificationContents*): Self = this.set("contents", js.Array(value :_*))
    @scala.inline
    def setContents(value: js.Array[SpecificationContents]): Self = this.set("contents", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormat(value: UDRW | UDRO | UDCO | UDZO | UDBZ | ULFO): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackground(value: String): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    @scala.inline
    def `setBackground-color`(value: String): Self = this.set("background-color", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBackground-color`: Self = this.set("background-color", js.undefined)
    @scala.inline
    def `setCode-sign`(value: SpecificationCodeSign): Self = this.set("code-sign", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCode-sign`: Self = this.set("code-sign", js.undefined)
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def `setIcon-size`(value: Double): Self = this.set("icon-size", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteIcon-size`: Self = this.set("icon-size", js.undefined)
    @scala.inline
    def setWindow(value: SpecificationWindow): Self = this.set("window", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindow: Self = this.set("window", js.undefined)
  }
  
}

