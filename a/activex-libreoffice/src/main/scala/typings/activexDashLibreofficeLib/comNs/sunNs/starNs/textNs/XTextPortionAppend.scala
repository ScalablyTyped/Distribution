package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows inserting and appending formatted text portions. */
trait XTextPortionAppend
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * appends a new text portion to the paragraph at the end of the text. <p> The sequence can contain all the properties defined by the service
    * TextPortion.
    * @param Text contains the text to be appended.
    * @param CharacterAndParagraphProperties can contain all the properties defined by the service {@link Paragraph} .
    */
  def appendTextPortion(
    Text: java.lang.String,
    CharacterAndParagraphProperties: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues
  ): XTextRange
  /**
    * inserts a new text portion to the paragraph at a given position. <p> The sequence can contain all the properties defined by the service TextPortion.
    * @param Text contains the text to be inserted.
    * @param CharacterAndParagraphProperties can contain all the properties defined by the service {@link Paragraph} .
    * @param TextRange specifies the position of the insert.
    * @since LibreOffice 4.0
    */
  def insertTextPortion(
    Text: java.lang.String,
    CharacterAndParagraphProperties: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues,
    TextRange: XTextRange
  ): XTextRange
}

