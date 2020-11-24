package typings.activexLibreoffice.com_.sun.star.accessibility

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.Point
import typings.activexLibreoffice.com_.sun.star.awt.Rectangle
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Implement this interface to give read and write access to a text representation.
  *
  * This interface is typically used in conjunction with the {@link XAccessibleText} interface and extents it about the ability to modify the text
  * represented by that interface.
  * @since OOo 1.1.2
  */
@js.native
trait XAccessibleEditableText extends XAccessibleText {
  
  /**
    * Copies the text range into the clipboard.
    *
    * The specified text between and including the two given indices is copied into the system clipboard and is deleted afterwards from the text represented
    * by this object. This is equivalent to calling first {@link XAccessibleText.copyText()} and then {@link XAccessibleEditableText.deleteText()} with the
    * given start and end indices.
    *
    * The text indices are interpreted like those in the {@link XAccessibleText.getTextRange()} method.
    * @param nStartIndex Start index of the text to moved into the clipboard. The valid range is 0..length.
    * @param nEndIndex End index of the text to moved into the clipboard. The valid range is 0..length.
    * @returns Returns a flag that indicates whether the operation has been executed successfully.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the indices are invalid
    */
  def cutText(nStartIndex: Double, nEndIndex: Double): Boolean = js.native
  
  /**
    * Deletes a range of text.
    *
    * The text between and including the two given indices is deleted from the text represented by this object.
    *
    * The text indices are interpreted like those in the {@link XAccessibleText.getTextRange()} method.
    * @param nStartIndex Start index of the text to be deleted. The valid range is 0..length.
    * @param nEndIndex End index of the text to be deleted. The valid range is 0..length.
    * @returns Returns a flag that indicates whether the operation has been executed successfully.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the indices are invalid
    */
  def deleteText(nStartIndex: Double, nEndIndex: Double): Boolean = js.native
  
  /**
    * Inserts text at the specified position.
    *
    * The specified string is inserted at the given index into the text represented by this object.
    * @param sText Text that is inserted.
    * @param nIndex Index at which to insert the text. The valid range is 0..length.
    * @returns Returns a flag that indicates whether the operation has been executed successfully.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the indices are invalid
    */
  def insertText(sText: String, nIndex: Double): Boolean = js.native
  
  /**
    * Pastes text from the clipboard.
    *
    * The text in the system clipboard is pasted into the text represented by this object at the given index. This method is similar to the {@link
    * XAccessibleEditableText.insertText()} method. If the index is not valid then the system clipboard text is not inserted.
    * @param nIndex Index at which to insert the text from the system clipboard into the text represented by this object. The valid range is 0..length.
    * @returns Returns a flag that indicates whether the operation has been executed successfully.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the index is invalid
    */
  def pasteText(nIndex: Double): Boolean = js.native
  
  /**
    * Replaces text.
    *
    * The text between the two given indices is replaced by the specified replacement string. This method is equivalent to calling first {@link
    * XAccessibleEditableText.deleteText()} with the two indices and afterwards calling {@link XAccessibleEditableText.insertText()} with the replacement
    * text and the start index.
    *
    * The text indices are interpreted like those in the {@link XAccessibleText.getTextRange()} method.
    * @param nStartIndex Start index of the text to be replaced. The valid range is 0..length.
    * @param nEndIndex Start index of the text to be replaced. The valid range is 0..length.
    * @param sReplacement The Text that replaces the text between the given indices.
    * @returns Returns a flag that indicates whether the operation has been executed successfully.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the indices are invalid
    */
  def replaceText(nStartIndex: Double, nEndIndex: Double, sReplacement: String): Boolean = js.native
  
  /**
    * Replaces the attributes of a text range by the given set of attributes.
    *
    * Sets the attributes for the text between and including the two given indices to those given. The old attributes of this text portion are replaced by
    * the new list of attributes.
    *
    * The text indices are interpreted like those in the {@link XAccessibleText.getTextRange()} method.
    * @param nStartIndex Start index of the text whose attributes are modified. The valid range is 0..length.
    * @param nEndIndex Start index of the text whose attributes are modified. The valid range is 0..length.
    * @param aAttributeSet Set of attributes that replaces the old list of attributes of the specified text portion.
    * @returns Returns a flag that indicates whether the operation has been executed successfully.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the indices are invalid
    */
  def setAttributes(nStartIndex: Double, nEndIndex: Double, aAttributeSet: SeqEquiv[PropertyValue]): Boolean = js.native
  
  /**
    * Replaces the whole text with the given text.
    *
    * The text content of this object is set to the given string.
    * @param sText The new text that replaces the old text.
    * @returns Returns a flag that indicates whether the operation has been executed successfully.
    */
  def setText(sText: String): Boolean = js.native
}
object XAccessibleEditableText {
  
  @scala.inline
  def apply(
    CaretPosition: Double,
    CharacterCount: Double,
    SelectedText: String,
    SelectionEnd: Double,
    SelectionStart: Double,
    Text: String,
    acquire: () => Unit,
    copyText: (Double, Double) => Boolean,
    cutText: (Double, Double) => Boolean,
    deleteText: (Double, Double) => Boolean,
    getCaretPosition: () => Double,
    getCharacter: Double => String,
    getCharacterAttributes: (Double, SeqEquiv[String]) => SafeArray[PropertyValue],
    getCharacterBounds: Double => Rectangle,
    getCharacterCount: () => Double,
    getIndexAtPoint: Point => Double,
    getSelectedText: () => String,
    getSelectionEnd: () => Double,
    getSelectionStart: () => Double,
    getText: () => String,
    getTextAtIndex: (Double, Double) => TextSegment,
    getTextBeforeIndex: (Double, Double) => TextSegment,
    getTextBehindIndex: (Double, Double) => TextSegment,
    getTextRange: (Double, Double) => String,
    insertText: (String, Double) => Boolean,
    pasteText: Double => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    replaceText: (Double, Double, String) => Boolean,
    setAttributes: (Double, Double, SeqEquiv[PropertyValue]) => Boolean,
    setCaretPosition: Double => Boolean,
    setSelection: (Double, Double) => Boolean,
    setText: String => Boolean
  ): XAccessibleEditableText = {
    val __obj = js.Dynamic.literal(CaretPosition = CaretPosition.asInstanceOf[js.Any], CharacterCount = CharacterCount.asInstanceOf[js.Any], SelectedText = SelectedText.asInstanceOf[js.Any], SelectionEnd = SelectionEnd.asInstanceOf[js.Any], SelectionStart = SelectionStart.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), copyText = js.Any.fromFunction2(copyText), cutText = js.Any.fromFunction2(cutText), deleteText = js.Any.fromFunction2(deleteText), getCaretPosition = js.Any.fromFunction0(getCaretPosition), getCharacter = js.Any.fromFunction1(getCharacter), getCharacterAttributes = js.Any.fromFunction2(getCharacterAttributes), getCharacterBounds = js.Any.fromFunction1(getCharacterBounds), getCharacterCount = js.Any.fromFunction0(getCharacterCount), getIndexAtPoint = js.Any.fromFunction1(getIndexAtPoint), getSelectedText = js.Any.fromFunction0(getSelectedText), getSelectionEnd = js.Any.fromFunction0(getSelectionEnd), getSelectionStart = js.Any.fromFunction0(getSelectionStart), getText = js.Any.fromFunction0(getText), getTextAtIndex = js.Any.fromFunction2(getTextAtIndex), getTextBeforeIndex = js.Any.fromFunction2(getTextBeforeIndex), getTextBehindIndex = js.Any.fromFunction2(getTextBehindIndex), getTextRange = js.Any.fromFunction2(getTextRange), insertText = js.Any.fromFunction2(insertText), pasteText = js.Any.fromFunction1(pasteText), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), replaceText = js.Any.fromFunction3(replaceText), setAttributes = js.Any.fromFunction3(setAttributes), setCaretPosition = js.Any.fromFunction1(setCaretPosition), setSelection = js.Any.fromFunction2(setSelection), setText = js.Any.fromFunction1(setText))
    __obj.asInstanceOf[XAccessibleEditableText]
  }
  
  @scala.inline
  implicit class XAccessibleEditableTextOps[Self <: XAccessibleEditableText] (val x: Self) extends AnyVal {
    
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
    def setCutText(value: (Double, Double) => Boolean): Self = this.set("cutText", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDeleteText(value: (Double, Double) => Boolean): Self = this.set("deleteText", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInsertText(value: (String, Double) => Boolean): Self = this.set("insertText", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPasteText(value: Double => Boolean): Self = this.set("pasteText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReplaceText(value: (Double, Double, String) => Boolean): Self = this.set("replaceText", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetAttributes(value: (Double, Double, SeqEquiv[PropertyValue]) => Boolean): Self = this.set("setAttributes", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetText(value: String => Boolean): Self = this.set("setText", js.Any.fromFunction1(value))
  }
}
