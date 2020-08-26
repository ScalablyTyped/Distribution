package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValues
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows inserting and appending paragraphs. */
@js.native
trait XParagraphAppend extends XInterface {
  /**
    * appends a new and empty paragraph at the end of the text.
    *
    * The properties are applied to the last paragraph before the new paragraph is inserted.
    * @param CharacterAndParagraphProperties can contain all the properties defined by the service {@link Paragraph} .
    */
  def finishParagraph(CharacterAndParagraphProperties: PropertyValues): XTextRange = js.native
  /**
    * inserts a new and empty paragraph to the text at a given position.
    *
    * The properties are applied to the last paragraph before the new paragraph is inserted.
    * @param CharacterAndParagraphProperties can contain all the properties defined by the service {@link Paragraph} .
    * @param TextRange specifies the position of the insertion.
    * @since LibreOffice 4.0
    */
  def finishParagraphInsert(CharacterAndParagraphProperties: PropertyValues, TextRange: XTextRange): XTextRange = js.native
}

object XParagraphAppend {
  @scala.inline
  def apply(
    acquire: () => Unit,
    finishParagraph: PropertyValues => XTextRange,
    finishParagraphInsert: (PropertyValues, XTextRange) => XTextRange,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XParagraphAppend = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), finishParagraph = js.Any.fromFunction1(finishParagraph), finishParagraphInsert = js.Any.fromFunction2(finishParagraphInsert), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XParagraphAppend]
  }
  @scala.inline
  implicit class XParagraphAppendOps[Self <: XParagraphAppend] (val x: Self) extends AnyVal {
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
    def setFinishParagraph(value: PropertyValues => XTextRange): Self = this.set("finishParagraph", js.Any.fromFunction1(value))
    @scala.inline
    def setFinishParagraphInsert(value: (PropertyValues, XTextRange) => XTextRange): Self = this.set("finishParagraphInsert", js.Any.fromFunction2(value))
  }
  
}

