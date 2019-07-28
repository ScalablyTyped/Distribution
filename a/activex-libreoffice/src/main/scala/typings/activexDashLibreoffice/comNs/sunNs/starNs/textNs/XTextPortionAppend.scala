package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValues
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows inserting and appending formatted text portions. */
trait XTextPortionAppend extends XInterface {
  /**
    * appends a new text portion to the paragraph at the end of the text. <p> The sequence can contain all the properties defined by the service
    * TextPortion.
    * @param Text contains the text to be appended.
    * @param CharacterAndParagraphProperties can contain all the properties defined by the service {@link Paragraph} .
    */
  def appendTextPortion(Text: String, CharacterAndParagraphProperties: PropertyValues): XTextRange
  /**
    * inserts a new text portion to the paragraph at a given position. <p> The sequence can contain all the properties defined by the service TextPortion.
    * @param Text contains the text to be inserted.
    * @param CharacterAndParagraphProperties can contain all the properties defined by the service {@link Paragraph} .
    * @param TextRange specifies the position of the insert.
    * @since LibreOffice 4.0
    */
  def insertTextPortion(Text: String, CharacterAndParagraphProperties: PropertyValues, TextRange: XTextRange): XTextRange
}

object XTextPortionAppend {
  @scala.inline
  def apply(
    acquire: () => Unit,
    appendTextPortion: (String, PropertyValues) => XTextRange,
    insertTextPortion: (String, PropertyValues, XTextRange) => XTextRange,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XTextPortionAppend = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), appendTextPortion = js.Any.fromFunction2(appendTextPortion), insertTextPortion = js.Any.fromFunction3(insertTextPortion), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XTextPortionAppend]
  }
}

