package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Implement this interface to give provide a mapping between text index and line numbers.
  *
  * This interface is typically used in conjunction with the {@link XAccessibleText} interface and extents it with a notion of line numbers
  * @since OOo 3.0
  */
trait XAccessibleMultiLineText extends XAccessibleText {
  /**
    * Returns the number of the line in which the caret is located.
    *
    * The line number returned will most of the time be identical to calling {@link XAccessibleMultiLineText.getLineNumberAtIndex()} with the index returned
    * by {@link XAccessibleText.getCaretPosition()} beside the following special case:
    *
    * Some text implementations place the caret at the end of the current line when the **End** key gets pressed. Since the index of this position is
    * identical to the one of the first character of the following line, {@link XAccessibleMultiLineText.getLineNumberAtIndex()} will return the line
    * following the current one in this case.
    * @returns Returns the index of the line in which the caret is located or -1 if the paragraph does not have a valid caret position.
    */
  val NumberOfLineWithCaret: scala.Double
  /**
    * Returns the text of the line in which the caret is located.
    *
    * The substring returned will most of the time be identical to calling {@link XAccessibleText.getTextAtIndex()} with the index returned by {@link
    * XAccessibleText.getCaretPosition()} and type {@link AccessibleTextType.LINE} beside the following special case:
    *
    * Some text implementations place the caret at the end of the current line when the **End** key gets pressed. Since the index of this position is
    * identical to the one of the first character of the following line, {@link XAccessibleMultiLineText.getLineNumberAtIndex()} will return the line
    * following the current one in this case.
    * @returns Returns the requested text portion. This portion may be empty or invalid if the paragraph object does not have a valid caret position.
    */
  val TextAtLineWithCaret: TextSegment
  /**
    * Returns the line number at the specified index.
    *
    * For a text object that is spread over multiple lines, this method provides a mapping from a text index to the corresponding line number.
    * @param nIndex Index for which the line number should be returned. The valid range is 0..length.
    * @returns Returns the line number of the specified text index.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the index is invalid.
    */
  def getLineNumberAtIndex(nIndex: scala.Double): scala.Double
  /**
    * Returns the number of the line in which the caret is located.
    *
    * The line number returned will most of the time be identical to calling {@link XAccessibleMultiLineText.getLineNumberAtIndex()} with the index returned
    * by {@link XAccessibleText.getCaretPosition()} beside the following special case:
    *
    * Some text implementations place the caret at the end of the current line when the **End** key gets pressed. Since the index of this position is
    * identical to the one of the first character of the following line, {@link XAccessibleMultiLineText.getLineNumberAtIndex()} will return the line
    * following the current one in this case.
    * @returns Returns the index of the line in which the caret is located or -1 if the paragraph does not have a valid caret position.
    */
  def getNumberOfLineWithCaret(): scala.Double
  /**
    * Returns the text of the specified line.
    *
    * Returns the substring of text that makes up the specified line number.
    *
    * The number of lines can be obtained by calling {@link XAccessibleMultiLineText.getLineNumberAtIndex()} with the index of the last character. In a
    * loop, the last line has been reached when {@link TextSegment.SegmentEnd} of the returned value is equal to the index of the last character of the
    * text.
    * @param nLineNo The number of the line to return the substring from. The valid range is 0..getLineNumberAtIndex(getCharacterCount()).
    * @returns Returns the requested text portion. This portion may be empty or invalid when no appropriate text portion is found.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the line number is invalid
    */
  def getTextAtLineNumber(nLineNo: scala.Double): TextSegment
  /**
    * Returns the text of the line in which the caret is located.
    *
    * The substring returned will most of the time be identical to calling {@link XAccessibleText.getTextAtIndex()} with the index returned by {@link
    * XAccessibleText.getCaretPosition()} and type {@link AccessibleTextType.LINE} beside the following special case:
    *
    * Some text implementations place the caret at the end of the current line when the **End** key gets pressed. Since the index of this position is
    * identical to the one of the first character of the following line, {@link XAccessibleMultiLineText.getLineNumberAtIndex()} will return the line
    * following the current one in this case.
    * @returns Returns the requested text portion. This portion may be empty or invalid if the paragraph object does not have a valid caret position.
    */
  def getTextAtLineWithCaret(): TextSegment
}

object XAccessibleMultiLineText {
  @scala.inline
  def apply(
    CaretPosition: scala.Double,
    CharacterCount: scala.Double,
    NumberOfLineWithCaret: scala.Double,
    SelectedText: java.lang.String,
    SelectionEnd: scala.Double,
    SelectionStart: scala.Double,
    Text: java.lang.String,
    TextAtLineWithCaret: TextSegment,
    acquire: () => scala.Unit,
    copyText: (scala.Double, scala.Double) => scala.Boolean,
    getCaretPosition: () => scala.Double,
    getCharacter: scala.Double => java.lang.String,
    getCharacterAttributes: (scala.Double, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]) => stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    getCharacterBounds: scala.Double => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle,
    getCharacterCount: () => scala.Double,
    getIndexAtPoint: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point => scala.Double,
    getLineNumberAtIndex: scala.Double => scala.Double,
    getNumberOfLineWithCaret: () => scala.Double,
    getSelectedText: () => java.lang.String,
    getSelectionEnd: () => scala.Double,
    getSelectionStart: () => scala.Double,
    getText: () => java.lang.String,
    getTextAtIndex: (scala.Double, scala.Double) => TextSegment,
    getTextAtLineNumber: scala.Double => TextSegment,
    getTextAtLineWithCaret: () => TextSegment,
    getTextBeforeIndex: (scala.Double, scala.Double) => TextSegment,
    getTextBehindIndex: (scala.Double, scala.Double) => TextSegment,
    getTextRange: (scala.Double, scala.Double) => java.lang.String,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setCaretPosition: scala.Double => scala.Boolean,
    setSelection: (scala.Double, scala.Double) => scala.Boolean
  ): XAccessibleMultiLineText = {
    val __obj = js.Dynamic.literal(CaretPosition = CaretPosition, CharacterCount = CharacterCount, NumberOfLineWithCaret = NumberOfLineWithCaret, SelectedText = SelectedText, SelectionEnd = SelectionEnd, SelectionStart = SelectionStart, Text = Text, TextAtLineWithCaret = TextAtLineWithCaret, acquire = js.Any.fromFunction0(acquire), copyText = js.Any.fromFunction2(copyText), getCaretPosition = js.Any.fromFunction0(getCaretPosition), getCharacter = js.Any.fromFunction1(getCharacter), getCharacterAttributes = js.Any.fromFunction2(getCharacterAttributes), getCharacterBounds = js.Any.fromFunction1(getCharacterBounds), getCharacterCount = js.Any.fromFunction0(getCharacterCount), getIndexAtPoint = js.Any.fromFunction1(getIndexAtPoint), getLineNumberAtIndex = js.Any.fromFunction1(getLineNumberAtIndex), getNumberOfLineWithCaret = js.Any.fromFunction0(getNumberOfLineWithCaret), getSelectedText = js.Any.fromFunction0(getSelectedText), getSelectionEnd = js.Any.fromFunction0(getSelectionEnd), getSelectionStart = js.Any.fromFunction0(getSelectionStart), getText = js.Any.fromFunction0(getText), getTextAtIndex = js.Any.fromFunction2(getTextAtIndex), getTextAtLineNumber = js.Any.fromFunction1(getTextAtLineNumber), getTextAtLineWithCaret = js.Any.fromFunction0(getTextAtLineWithCaret), getTextBeforeIndex = js.Any.fromFunction2(getTextBeforeIndex), getTextBehindIndex = js.Any.fromFunction2(getTextBehindIndex), getTextRange = js.Any.fromFunction2(getTextRange), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setCaretPosition = js.Any.fromFunction1(setCaretPosition), setSelection = js.Any.fromFunction2(setSelection))
  
    __obj.asInstanceOf[XAccessibleMultiLineText]
  }
}

