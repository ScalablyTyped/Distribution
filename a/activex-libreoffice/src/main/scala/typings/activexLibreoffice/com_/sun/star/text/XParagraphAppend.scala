package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValues
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows inserting and appending paragraphs. */
trait XParagraphAppend extends XInterface {
  /**
    * appends a new and empty paragraph at the end of the text.
    *
    * The properties are applied to the last paragraph before the new paragraph is inserted.
    * @param CharacterAndParagraphProperties can contain all the properties defined by the service {@link Paragraph} .
    */
  def finishParagraph(CharacterAndParagraphProperties: PropertyValues): XTextRange
  /**
    * inserts a new and empty paragraph to the text at a given position.
    *
    * The properties are applied to the last paragraph before the new paragraph is inserted.
    * @param CharacterAndParagraphProperties can contain all the properties defined by the service {@link Paragraph} .
    * @param TextRange specifies the position of the insertion.
    * @since LibreOffice 4.0
    */
  def finishParagraphInsert(CharacterAndParagraphProperties: PropertyValues, TextRange: XTextRange): XTextRange
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
}

