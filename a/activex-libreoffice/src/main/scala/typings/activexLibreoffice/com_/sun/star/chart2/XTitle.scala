package typings.activexLibreoffice.com_.sun.star.chart2

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XTitle extends XInterface {
  var Text: SafeArray[XFormattedString] = js.native
  def getText(): SafeArray[XFormattedString] = js.native
  def setText(Strings: SeqEquiv[XFormattedString]): Unit = js.native
}

object XTitle {
  @scala.inline
  def apply(
    Text: SafeArray[XFormattedString],
    acquire: () => Unit,
    getText: () => SafeArray[XFormattedString],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setText: SeqEquiv[XFormattedString] => Unit
  ): XTitle = {
    val __obj = js.Dynamic.literal(Text = Text.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getText = js.Any.fromFunction0(getText), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setText = js.Any.fromFunction1(setText))
    __obj.asInstanceOf[XTitle]
  }
  @scala.inline
  implicit class XTitleOps[Self <: XTitle] (val x: Self) extends AnyVal {
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
    def setText(value: SafeArray[XFormattedString]): Self = this.set("Text", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetText(value: () => SafeArray[XFormattedString]): Self = this.set("getText", js.Any.fromFunction0(value))
    @scala.inline
    def setSetText(value: SeqEquiv[XFormattedString] => Unit): Self = this.set("setText", js.Any.fromFunction1(value))
  }
  
}

