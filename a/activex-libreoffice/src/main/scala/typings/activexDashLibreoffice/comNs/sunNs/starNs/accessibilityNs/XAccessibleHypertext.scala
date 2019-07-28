package typings.activexDashLibreoffice.comNs.sunNs.starNs.accessibilityNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Point
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Rectangle
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import typings.std.SafeArray
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
  val HyperLinkCount: Double
  /**
    * Return the specified link.
    *
    * The returned {@link XAccessibleHyperlink} object encapsulates the hyperlink and provides several kinds of information describing it.
    * @param nLinkIndex This index specifies the hyperlink to return.
    * @returns If the given index is valid, i.e. lies in the interval from 0 to the number of links minus one, a reference to the specified hyperlink object is
    */
  def getHyperLink(nLinkIndex: Double): XAccessibleHyperlink
  /**
    * Returns the number of links and link groups contained within this hypertext document.
    * @returns The number of links and link groups within this hypertext document. Returns 0 if there is no link.
    */
  def getHyperLinkCount(): Double
  /**
    * Returns the index of the hyperlink that is associated with this character index.
    *
    * In a HTML document this is the case when a <a href> tag spans (includes) the given character index.
    * @param nCharIndex Index of the character for which to return the link index. If the {@link XAccessibleText} interface is used to represent the text cont
    * @returns Returns the index of the hyperlink that is associated with this character index, or throws an exception if there is no hyperlink associated with
    * @see XAccessibleText.
    */
  def getHyperLinkIndex(nCharIndex: Double): Double
}

object XAccessibleHypertext {
  @scala.inline
  def apply(
    CaretPosition: Double,
    CharacterCount: Double,
    HyperLinkCount: Double,
    SelectedText: String,
    SelectionEnd: Double,
    SelectionStart: Double,
    Text: String,
    acquire: () => Unit,
    copyText: (Double, Double) => Boolean,
    getCaretPosition: () => Double,
    getCharacter: Double => String,
    getCharacterAttributes: (Double, SeqEquiv[String]) => SafeArray[PropertyValue],
    getCharacterBounds: Double => Rectangle,
    getCharacterCount: () => Double,
    getHyperLink: Double => XAccessibleHyperlink,
    getHyperLinkCount: () => Double,
    getHyperLinkIndex: Double => Double,
    getIndexAtPoint: Point => Double,
    getSelectedText: () => String,
    getSelectionEnd: () => Double,
    getSelectionStart: () => Double,
    getText: () => String,
    getTextAtIndex: (Double, Double) => TextSegment,
    getTextBeforeIndex: (Double, Double) => TextSegment,
    getTextBehindIndex: (Double, Double) => TextSegment,
    getTextRange: (Double, Double) => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setCaretPosition: Double => Boolean,
    setSelection: (Double, Double) => Boolean
  ): XAccessibleHypertext = {
    val __obj = js.Dynamic.literal(CaretPosition = CaretPosition, CharacterCount = CharacterCount, HyperLinkCount = HyperLinkCount, SelectedText = SelectedText, SelectionEnd = SelectionEnd, SelectionStart = SelectionStart, Text = Text, acquire = js.Any.fromFunction0(acquire), copyText = js.Any.fromFunction2(copyText), getCaretPosition = js.Any.fromFunction0(getCaretPosition), getCharacter = js.Any.fromFunction1(getCharacter), getCharacterAttributes = js.Any.fromFunction2(getCharacterAttributes), getCharacterBounds = js.Any.fromFunction1(getCharacterBounds), getCharacterCount = js.Any.fromFunction0(getCharacterCount), getHyperLink = js.Any.fromFunction1(getHyperLink), getHyperLinkCount = js.Any.fromFunction0(getHyperLinkCount), getHyperLinkIndex = js.Any.fromFunction1(getHyperLinkIndex), getIndexAtPoint = js.Any.fromFunction1(getIndexAtPoint), getSelectedText = js.Any.fromFunction0(getSelectedText), getSelectionEnd = js.Any.fromFunction0(getSelectionEnd), getSelectionStart = js.Any.fromFunction0(getSelectionStart), getText = js.Any.fromFunction0(getText), getTextAtIndex = js.Any.fromFunction2(getTextAtIndex), getTextBeforeIndex = js.Any.fromFunction2(getTextBeforeIndex), getTextBehindIndex = js.Any.fromFunction2(getTextBehindIndex), getTextRange = js.Any.fromFunction2(getTextRange), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setCaretPosition = js.Any.fromFunction1(setCaretPosition), setSelection = js.Any.fromFunction2(setSelection))
  
    __obj.asInstanceOf[XAccessibleHypertext]
  }
}

