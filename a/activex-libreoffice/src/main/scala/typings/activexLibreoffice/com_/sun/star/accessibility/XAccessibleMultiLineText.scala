package typings.activexLibreoffice.com_.sun.star.accessibility

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.Point
import typings.activexLibreoffice.com_.sun.star.awt.Rectangle
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Implement this interface to give provide a mapping between text index and line numbers.
  *
  * This interface is typically used in conjunction with the {@link XAccessibleText} interface and extents it with a notion of line numbers
  * @since OOo 3.0
  */
@js.native
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
  val NumberOfLineWithCaret: Double = js.native
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
  val TextAtLineWithCaret: TextSegment = js.native
  /**
    * Returns the line number at the specified index.
    *
    * For a text object that is spread over multiple lines, this method provides a mapping from a text index to the corresponding line number.
    * @param nIndex Index for which the line number should be returned. The valid range is 0..length.
    * @returns Returns the line number of the specified text index.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the index is invalid.
    */
  def getLineNumberAtIndex(nIndex: Double): Double = js.native
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
  def getNumberOfLineWithCaret(): Double = js.native
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
  def getTextAtLineNumber(nLineNo: Double): TextSegment = js.native
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
  def getTextAtLineWithCaret(): TextSegment = js.native
}

object XAccessibleMultiLineText {
  @scala.inline
  def apply(
    CaretPosition: Double,
    CharacterCount: Double,
    NumberOfLineWithCaret: Double,
    SelectedText: String,
    SelectionEnd: Double,
    SelectionStart: Double,
    Text: String,
    TextAtLineWithCaret: TextSegment,
    acquire: () => Unit,
    copyText: (Double, Double) => Boolean,
    getCaretPosition: () => Double,
    getCharacter: Double => String,
    getCharacterAttributes: (Double, SeqEquiv[String]) => SafeArray[PropertyValue],
    getCharacterBounds: Double => Rectangle,
    getCharacterCount: () => Double,
    getIndexAtPoint: Point => Double,
    getLineNumberAtIndex: Double => Double,
    getNumberOfLineWithCaret: () => Double,
    getSelectedText: () => String,
    getSelectionEnd: () => Double,
    getSelectionStart: () => Double,
    getText: () => String,
    getTextAtIndex: (Double, Double) => TextSegment,
    getTextAtLineNumber: Double => TextSegment,
    getTextAtLineWithCaret: () => TextSegment,
    getTextBeforeIndex: (Double, Double) => TextSegment,
    getTextBehindIndex: (Double, Double) => TextSegment,
    getTextRange: (Double, Double) => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setCaretPosition: Double => Boolean,
    setSelection: (Double, Double) => Boolean
  ): XAccessibleMultiLineText = {
    val __obj = js.Dynamic.literal(CaretPosition = CaretPosition.asInstanceOf[js.Any], CharacterCount = CharacterCount.asInstanceOf[js.Any], NumberOfLineWithCaret = NumberOfLineWithCaret.asInstanceOf[js.Any], SelectedText = SelectedText.asInstanceOf[js.Any], SelectionEnd = SelectionEnd.asInstanceOf[js.Any], SelectionStart = SelectionStart.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], TextAtLineWithCaret = TextAtLineWithCaret.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), copyText = js.Any.fromFunction2(copyText), getCaretPosition = js.Any.fromFunction0(getCaretPosition), getCharacter = js.Any.fromFunction1(getCharacter), getCharacterAttributes = js.Any.fromFunction2(getCharacterAttributes), getCharacterBounds = js.Any.fromFunction1(getCharacterBounds), getCharacterCount = js.Any.fromFunction0(getCharacterCount), getIndexAtPoint = js.Any.fromFunction1(getIndexAtPoint), getLineNumberAtIndex = js.Any.fromFunction1(getLineNumberAtIndex), getNumberOfLineWithCaret = js.Any.fromFunction0(getNumberOfLineWithCaret), getSelectedText = js.Any.fromFunction0(getSelectedText), getSelectionEnd = js.Any.fromFunction0(getSelectionEnd), getSelectionStart = js.Any.fromFunction0(getSelectionStart), getText = js.Any.fromFunction0(getText), getTextAtIndex = js.Any.fromFunction2(getTextAtIndex), getTextAtLineNumber = js.Any.fromFunction1(getTextAtLineNumber), getTextAtLineWithCaret = js.Any.fromFunction0(getTextAtLineWithCaret), getTextBeforeIndex = js.Any.fromFunction2(getTextBeforeIndex), getTextBehindIndex = js.Any.fromFunction2(getTextBehindIndex), getTextRange = js.Any.fromFunction2(getTextRange), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setCaretPosition = js.Any.fromFunction1(setCaretPosition), setSelection = js.Any.fromFunction2(setSelection))
    __obj.asInstanceOf[XAccessibleMultiLineText]
  }
  @scala.inline
  implicit class XAccessibleMultiLineTextOps[Self <: XAccessibleMultiLineText] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNumberOfLineWithCaret(value: Double): Self = this.set("NumberOfLineWithCaret", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextAtLineWithCaret(value: TextSegment): Self = this.set("TextAtLineWithCaret", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetLineNumberAtIndex(value: Double => Double): Self = this.set("getLineNumberAtIndex", js.Any.fromFunction1(value))
    @scala.inline
    def setGetNumberOfLineWithCaret(value: () => Double): Self = this.set("getNumberOfLineWithCaret", js.Any.fromFunction0(value))
    @scala.inline
    def setGetTextAtLineNumber(value: Double => TextSegment): Self = this.set("getTextAtLineNumber", js.Any.fromFunction1(value))
    @scala.inline
    def setGetTextAtLineWithCaret(value: () => TextSegment): Self = this.set("getTextAtLineWithCaret", js.Any.fromFunction0(value))
  }
  
}

