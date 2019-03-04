package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Implement this interface to expose the text markups of a text.
  *
  * The {@link XAccessibleTextMarkup} interface is the main interface to expose text markups in a text, typically of a text document, that are used to
  * reference other (parts of) documents. For supporting the XAccessibleTextMarkup::getTextMarkupIndex() method of this interface and other character
  * related methods of the {@link XAccessibleTextMarkup} interface, it is necessary to also support the {@link XAccessibleText} interface.
  * @see XAccessibleText
  * @since OOo 3.0
  */
trait XAccessibleTextMarkup extends XAccessibleText {
  /**
    * Returns the text segment of the text markup of the given index and of the given text mark type
    *
    * Throws IndexOutOfBoundsException, if given index is out of valid range.
    *
    * Throws IllegalArgumentException, if given text markup type is out of valid range.
    * @param TextMarkupIndex This index specifies the text markup to return.
    * @param TextMarkupType This specifies the type of the text markup to be returned - see TextMarkupType.
    * @returns If the given index is in range [0..getTextMarkupCount(TextMarkupType)-1], the text segment - see {@link TextSegment} - of the text markup of the
    */
  def getTextMarkup(TextMarkupIndex: scala.Double, TextMarkupType: scala.Double): TextSegment
  /**
    * returns a sequence of the text segments of the text markups at the given character index and of the given text markup type.
    *
    * Throws IndexOutOfBoundsException, if given character index is out of range [0..number of characters in the text).
    *
    * Throws IllegalArgumentException, if given text markup type is out of valid range.
    * @param CharIndex This index specifies the character index in the text.
    * @param TextMarkupType This specifies the type of the text markups to be returned - see TextMarkupType.
    * @returns If character index is in range [0..number of characters in the text-1], a sequence of TextSegments of the text markups at given character index o
    */
  def getTextMarkupAtIndex(CharIndex: scala.Double, TextMarkupType: scala.Double): activexDashInteropLib.SafeArray[TextSegment]
  /**
    * Returns the number of text markup of the given text markup type of a text.
    *
    * Throws IllegalArgumentException, if given text markup type is out of valid range.
    * @param TextMarkupType This specifies the type of text markups, whose count should be returned - see TextMarkupType.
    * @returns The number of text markup of the given text markup type. Returns 0 if there is no text markup.
    */
  def getTextMarkupCount(TextMarkupType: scala.Double): scala.Double
}

object XAccessibleTextMarkup {
  @scala.inline
  def apply(
    CaretPosition: scala.Double,
    CharacterCount: scala.Double,
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
    getIndexAtPoint: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point, scala.Double],
    getSelectedText: js.Function0[java.lang.String],
    getSelectionEnd: js.Function0[scala.Double],
    getSelectionStart: js.Function0[scala.Double],
    getText: js.Function0[java.lang.String],
    getTextAtIndex: js.Function2[scala.Double, scala.Double, TextSegment],
    getTextBeforeIndex: js.Function2[scala.Double, scala.Double, TextSegment],
    getTextBehindIndex: js.Function2[scala.Double, scala.Double, TextSegment],
    getTextMarkup: js.Function2[scala.Double, scala.Double, TextSegment],
    getTextMarkupAtIndex: js.Function2[scala.Double, scala.Double, activexDashInteropLib.SafeArray[TextSegment]],
    getTextMarkupCount: js.Function1[scala.Double, scala.Double],
    getTextRange: js.Function2[scala.Double, scala.Double, java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setCaretPosition: js.Function1[scala.Double, scala.Boolean],
    setSelection: js.Function2[scala.Double, scala.Double, scala.Boolean]
  ): XAccessibleTextMarkup = {
    val __obj = js.Dynamic.literal(CaretPosition = CaretPosition, CharacterCount = CharacterCount, SelectedText = SelectedText, SelectionEnd = SelectionEnd, SelectionStart = SelectionStart, Text = Text, acquire = acquire, copyText = copyText, getCaretPosition = getCaretPosition, getCharacter = getCharacter, getCharacterAttributes = getCharacterAttributes, getCharacterBounds = getCharacterBounds, getCharacterCount = getCharacterCount, getIndexAtPoint = getIndexAtPoint, getSelectedText = getSelectedText, getSelectionEnd = getSelectionEnd, getSelectionStart = getSelectionStart, getText = getText, getTextAtIndex = getTextAtIndex, getTextBeforeIndex = getTextBeforeIndex, getTextBehindIndex = getTextBehindIndex, getTextMarkup = getTextMarkup, getTextMarkupAtIndex = getTextMarkupAtIndex, getTextMarkupCount = getTextMarkupCount, getTextRange = getTextRange, queryInterface = queryInterface, release = release, setCaretPosition = setCaretPosition, setSelection = setSelection)
  
    __obj.asInstanceOf[XAccessibleTextMarkup]
  }
}

