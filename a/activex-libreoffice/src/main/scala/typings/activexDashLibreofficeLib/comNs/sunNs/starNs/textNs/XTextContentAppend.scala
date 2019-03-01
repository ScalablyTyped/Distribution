package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows inserting and appending text content. */
trait XTextContentAppend
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * appends a text content at the end of the text. <p> The sequence can contain all the properties defined by the service
    *
    * Paragraph.
    * @param TextContent contains the object to be inserted.
    * @param CharacterAndParagraphProperties can contain all the properties defined by the service {@link Paragraph} .
    * @returns the anchor text range of the inserted text content.
    */
  def appendTextContent(
    TextContent: XTextContent,
    CharacterAndParagraphProperties: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues
  ): XTextRange
  /**
    * inserts a text content at the given position.
    * @param TextContent contains the object to be inserted.
    * @param CharacterAndParagraphProperties can contain all the properties defined by the service {@link Paragraph} .
    * @param TextRange insert position
    * @returns the anchor text range of the inserted text content.
    * @since LibreOffice 4.0
    */
  def insertTextContentWithProperties(
    TextContent: XTextContent,
    CharacterAndParagraphProperties: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues,
    TextRange: XTextRange
  ): XTextRange
}

object XTextContentAppend {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    appendTextContent: js.Function2[
      XTextContent, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues, 
      XTextRange
    ],
    insertTextContentWithProperties: js.Function3[
      XTextContent, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues, 
      XTextRange, 
      XTextRange
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XTextContentAppend = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("appendTextContent")(appendTextContent)
    __obj.updateDynamic("insertTextContentWithProperties")(insertTextContentWithProperties)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XTextContentAppend]
  }
}

