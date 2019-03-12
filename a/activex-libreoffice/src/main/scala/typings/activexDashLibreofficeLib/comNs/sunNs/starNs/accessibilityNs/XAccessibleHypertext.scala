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
    acquire: () => scala.Unit,
    copyText: (scala.Double, scala.Double) => scala.Boolean,
    getCaretPosition: () => scala.Double,
    getCharacter: scala.Double => java.lang.String,
    getCharacterAttributes: (scala.Double, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]) => stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    getCharacterBounds: scala.Double => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle,
    getCharacterCount: () => scala.Double,
    getHyperLink: scala.Double => XAccessibleHyperlink,
    getHyperLinkCount: () => scala.Double,
    getHyperLinkIndex: scala.Double => scala.Double,
    getIndexAtPoint: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point => scala.Double,
    getSelectedText: () => java.lang.String,
    getSelectionEnd: () => scala.Double,
    getSelectionStart: () => scala.Double,
    getText: () => java.lang.String,
    getTextAtIndex: (scala.Double, scala.Double) => TextSegment,
    getTextBeforeIndex: (scala.Double, scala.Double) => TextSegment,
    getTextBehindIndex: (scala.Double, scala.Double) => TextSegment,
    getTextRange: (scala.Double, scala.Double) => java.lang.String,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setCaretPosition: scala.Double => scala.Boolean,
    setSelection: (scala.Double, scala.Double) => scala.Boolean
  ): XAccessibleHypertext = {
    val __obj = js.Dynamic.literal(CaretPosition = CaretPosition, CharacterCount = CharacterCount, HyperLinkCount = HyperLinkCount, SelectedText = SelectedText, SelectionEnd = SelectionEnd, SelectionStart = SelectionStart, Text = Text, acquire = js.Any.fromFunction0(acquire), copyText = js.Any.fromFunction2(copyText), getCaretPosition = js.Any.fromFunction0(getCaretPosition), getCharacter = js.Any.fromFunction1(getCharacter), getCharacterAttributes = js.Any.fromFunction2(getCharacterAttributes), getCharacterBounds = js.Any.fromFunction1(getCharacterBounds), getCharacterCount = js.Any.fromFunction0(getCharacterCount), getHyperLink = js.Any.fromFunction1(getHyperLink), getHyperLinkCount = js.Any.fromFunction0(getHyperLinkCount), getHyperLinkIndex = js.Any.fromFunction1(getHyperLinkIndex), getIndexAtPoint = js.Any.fromFunction1(getIndexAtPoint), getSelectedText = js.Any.fromFunction0(getSelectedText), getSelectionEnd = js.Any.fromFunction0(getSelectionEnd), getSelectionStart = js.Any.fromFunction0(getSelectionStart), getText = js.Any.fromFunction0(getText), getTextAtIndex = js.Any.fromFunction2(getTextAtIndex), getTextBeforeIndex = js.Any.fromFunction2(getTextBeforeIndex), getTextBehindIndex = js.Any.fromFunction2(getTextBehindIndex), getTextRange = js.Any.fromFunction2(getTextRange), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setCaretPosition = js.Any.fromFunction1(setCaretPosition), setSelection = js.Any.fromFunction2(setSelection))
  
    __obj.asInstanceOf[XAccessibleHypertext]
  }
}

