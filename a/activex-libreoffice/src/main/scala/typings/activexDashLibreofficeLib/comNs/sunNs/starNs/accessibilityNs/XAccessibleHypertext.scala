package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Implement this interface to expose the hypertext structure of a document.
  *
  * The {@link XAccessibleHypertext} interface is the main interface to expose hyperlinks in a document, typically a text document, that are used to
  * reference other (parts of) documents. For supporting the XAccessibleHypertext::getLinkIndex() method of this interface and other character related
  * methods of the {@link XAccessibleHyperlink} interface, it is necessary to also support the {@link XAccessibleText} interface.
  * @see XAccessibleHyperlink, XAccessibleText
  * @since OOo 1.1.2
  */
trait XAccessibleHypertext extends XAccessibleText {
  /**
    * Returns the number of links and link groups contained within this hypertext document.
    * @returns The number of links and link groups within this hypertext document. Returns 0 if there is no link.
    */
  val HyperLinkCount: scala.Double
  /**
    * Return the specified link.
    *
    * The returned {@link XAccessibleHyperlink} object encapsulates the hyperlink and provides several kinds of information describing it.
    * @param nLinkIndex This index specifies the hyperlink to return.
    * @returns If the given index is valid, i.e. lies in the interval from 0 to the number of links minus one, a reference to the specified hyperlink object is
    */
  def getHyperLink(nLinkIndex: scala.Double): XAccessibleHyperlink
  /**
    * Returns the number of links and link groups contained within this hypertext document.
    * @returns The number of links and link groups within this hypertext document. Returns 0 if there is no link.
    */
  def getHyperLinkCount(): scala.Double
  /**
    * Returns the index of the hyperlink that is associated with this character index.
    *
    * In a HTML document this is the case when a <a href> tag spans (includes) the given character index.
    * @param nCharIndex Index of the character for which to return the link index. If the {@link XAccessibleText} interface is used to represent the text cont
    * @returns Returns the index of the hyperlink that is associated with this character index, or throws an exception if there is no hyperlink associated with
    * @see XAccessibleText.
    */
  def getHyperLinkIndex(nCharIndex: scala.Double): scala.Double
}

object XAccessibleHypertext {
  @scala.inline
  def apply(
    CaretPosition: scala.Double,
    CharacterCount: scala.Double,
    HyperLinkCount: scala.Double,
    SelectedText: java.lang.String,
    SelectionEnd: scala.Double,
    SelectionStart: scala.Double,
    Text: java.lang.String,
    acquire: js.Function0[scala.Unit],
    copyText: js.Function2[scala.Double, scala.Double, scala.Boolean],
    getCaretPosition: js.Function0[scala.Double],
    getCharacter: js.Function1[scala.Double, java.lang.String],
    getCharacterAttributes: js.Function2[
      scala.Double, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
    ],
    getCharacterBounds: js.Function1[scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle],
    getCharacterCount: js.Function0[scala.Double],
    getHyperLink: js.Function1[scala.Double, XAccessibleHyperlink],
    getHyperLinkCount: js.Function0[scala.Double],
    getHyperLinkIndex: js.Function1[scala.Double, scala.Double],
    getIndexAtPoint: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point, scala.Double],
    getSelectedText: js.Function0[java.lang.String],
    getSelectionEnd: js.Function0[scala.Double],
    getSelectionStart: js.Function0[scala.Double],
    getText: js.Function0[java.lang.String],
    getTextAtIndex: js.Function2[scala.Double, scala.Double, TextSegment],
    getTextBeforeIndex: js.Function2[scala.Double, scala.Double, TextSegment],
    getTextBehindIndex: js.Function2[scala.Double, scala.Double, TextSegment],
    getTextRange: js.Function2[scala.Double, scala.Double, java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setCaretPosition: js.Function1[scala.Double, scala.Boolean],
    setSelection: js.Function2[scala.Double, scala.Double, scala.Boolean]
  ): XAccessibleHypertext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CaretPosition")(CaretPosition)
    __obj.updateDynamic("CharacterCount")(CharacterCount)
    __obj.updateDynamic("HyperLinkCount")(HyperLinkCount)
    __obj.updateDynamic("SelectedText")(SelectedText)
    __obj.updateDynamic("SelectionEnd")(SelectionEnd)
    __obj.updateDynamic("SelectionStart")(SelectionStart)
    __obj.updateDynamic("Text")(Text)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("copyText")(copyText)
    __obj.updateDynamic("getCaretPosition")(getCaretPosition)
    __obj.updateDynamic("getCharacter")(getCharacter)
    __obj.updateDynamic("getCharacterAttributes")(getCharacterAttributes)
    __obj.updateDynamic("getCharacterBounds")(getCharacterBounds)
    __obj.updateDynamic("getCharacterCount")(getCharacterCount)
    __obj.updateDynamic("getHyperLink")(getHyperLink)
    __obj.updateDynamic("getHyperLinkCount")(getHyperLinkCount)
    __obj.updateDynamic("getHyperLinkIndex")(getHyperLinkIndex)
    __obj.updateDynamic("getIndexAtPoint")(getIndexAtPoint)
    __obj.updateDynamic("getSelectedText")(getSelectedText)
    __obj.updateDynamic("getSelectionEnd")(getSelectionEnd)
    __obj.updateDynamic("getSelectionStart")(getSelectionStart)
    __obj.updateDynamic("getText")(getText)
    __obj.updateDynamic("getTextAtIndex")(getTextAtIndex)
    __obj.updateDynamic("getTextBeforeIndex")(getTextBeforeIndex)
    __obj.updateDynamic("getTextBehindIndex")(getTextBehindIndex)
    __obj.updateDynamic("getTextRange")(getTextRange)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setCaretPosition")(setCaretPosition)
    __obj.updateDynamic("setSelection")(setSelection)
    __obj.asInstanceOf[XAccessibleHypertext]
  }
}

