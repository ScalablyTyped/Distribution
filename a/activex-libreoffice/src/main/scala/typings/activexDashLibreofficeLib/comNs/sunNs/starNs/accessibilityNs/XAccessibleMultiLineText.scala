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
    getLineNumberAtIndex: js.Function1[scala.Double, scala.Double],
    getNumberOfLineWithCaret: js.Function0[scala.Double],
    getSelectedText: js.Function0[java.lang.String],
    getSelectionEnd: js.Function0[scala.Double],
    getSelectionStart: js.Function0[scala.Double],
    getText: js.Function0[java.lang.String],
    getTextAtIndex: js.Function2[scala.Double, scala.Double, TextSegment],
    getTextAtLineNumber: js.Function1[scala.Double, TextSegment],
    getTextAtLineWithCaret: js.Function0[TextSegment],
    getTextBeforeIndex: js.Function2[scala.Double, scala.Double, TextSegment],
    getTextBehindIndex: js.Function2[scala.Double, scala.Double, TextSegment],
    getTextRange: js.Function2[scala.Double, scala.Double, java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setCaretPosition: js.Function1[scala.Double, scala.Boolean],
    setSelection: js.Function2[scala.Double, scala.Double, scala.Boolean]
  ): XAccessibleMultiLineText = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CaretPosition")(CaretPosition)
    __obj.updateDynamic("CharacterCount")(CharacterCount)
    __obj.updateDynamic("NumberOfLineWithCaret")(NumberOfLineWithCaret)
    __obj.updateDynamic("SelectedText")(SelectedText)
    __obj.updateDynamic("SelectionEnd")(SelectionEnd)
    __obj.updateDynamic("SelectionStart")(SelectionStart)
    __obj.updateDynamic("Text")(Text)
    __obj.updateDynamic("TextAtLineWithCaret")(TextAtLineWithCaret)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("copyText")(copyText)
    __obj.updateDynamic("getCaretPosition")(getCaretPosition)
    __obj.updateDynamic("getCharacter")(getCharacter)
    __obj.updateDynamic("getCharacterAttributes")(getCharacterAttributes)
    __obj.updateDynamic("getCharacterBounds")(getCharacterBounds)
    __obj.updateDynamic("getCharacterCount")(getCharacterCount)
    __obj.updateDynamic("getIndexAtPoint")(getIndexAtPoint)
    __obj.updateDynamic("getLineNumberAtIndex")(getLineNumberAtIndex)
    __obj.updateDynamic("getNumberOfLineWithCaret")(getNumberOfLineWithCaret)
    __obj.updateDynamic("getSelectedText")(getSelectedText)
    __obj.updateDynamic("getSelectionEnd")(getSelectionEnd)
    __obj.updateDynamic("getSelectionStart")(getSelectionStart)
    __obj.updateDynamic("getText")(getText)
    __obj.updateDynamic("getTextAtIndex")(getTextAtIndex)
    __obj.updateDynamic("getTextAtLineNumber")(getTextAtLineNumber)
    __obj.updateDynamic("getTextAtLineWithCaret")(getTextAtLineWithCaret)
    __obj.updateDynamic("getTextBeforeIndex")(getTextBeforeIndex)
    __obj.updateDynamic("getTextBehindIndex")(getTextBehindIndex)
    __obj.updateDynamic("getTextRange")(getTextRange)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setCaretPosition")(setCaretPosition)
    __obj.updateDynamic("setSelection")(setSelection)
    __obj.asInstanceOf[XAccessibleMultiLineText]
  }
}

