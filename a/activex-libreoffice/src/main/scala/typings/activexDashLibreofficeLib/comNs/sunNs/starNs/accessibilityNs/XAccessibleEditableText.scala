package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Implement this interface to give read and write access to a text representation.
  *
  * This interface is typically used in conjunction with the {@link XAccessibleText} interface and extents it about the ability to modify the text
  * represented by that interface.
  * @since OOo 1.1.2
  */
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
  def cutText(nStartIndex: scala.Double, nEndIndex: scala.Double): scala.Boolean
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
  def deleteText(nStartIndex: scala.Double, nEndIndex: scala.Double): scala.Boolean
  /**
    * Inserts text at the specified position.
    *
    * The specified string is inserted at the given index into the text represented by this object.
    * @param sText Text that is inserted.
    * @param nIndex Index at which to insert the text. The valid range is 0..length.
    * @returns Returns a flag that indicates whether the operation has been executed successfully.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the indices are invalid
    */
  def insertText(sText: java.lang.String, nIndex: scala.Double): scala.Boolean
  /**
    * Pastes text from the clipboard.
    *
    * The text in the system clipboard is pasted into the text represented by this object at the given index. This method is similar to the {@link
    * XAccessibleEditableText.insertText()} method. If the index is not valid then the system clipboard text is not inserted.
    * @param nIndex Index at which to insert the text from the system clipboard into the text represented by this object. The valid range is 0..length.
    * @returns Returns a flag that indicates whether the operation has been executed successfully.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the index is invalid
    */
  def pasteText(nIndex: scala.Double): scala.Boolean
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
  def replaceText(nStartIndex: scala.Double, nEndIndex: scala.Double, sReplacement: java.lang.String): scala.Boolean
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
  def setAttributes(
    nStartIndex: scala.Double,
    nEndIndex: scala.Double,
    aAttributeSet: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): scala.Boolean
  /**
    * Replaces the whole text with the given text.
    *
    * The text content of this object is set to the given string.
    * @param sText The new text that replaces the old text.
    * @returns Returns a flag that indicates whether the operation has been executed successfully.
    */
  def setText(sText: java.lang.String): scala.Boolean
}

object XAccessibleEditableText {
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
    cutText: js.Function2[scala.Double, scala.Double, scala.Boolean],
    deleteText: js.Function2[scala.Double, scala.Double, scala.Boolean],
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
    getTextRange: js.Function2[scala.Double, scala.Double, java.lang.String],
    insertText: js.Function2[java.lang.String, scala.Double, scala.Boolean],
    pasteText: js.Function1[scala.Double, scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    replaceText: js.Function3[scala.Double, scala.Double, java.lang.String, scala.Boolean],
    setAttributes: js.Function3[
      scala.Double, 
      scala.Double, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      scala.Boolean
    ],
    setCaretPosition: js.Function1[scala.Double, scala.Boolean],
    setSelection: js.Function2[scala.Double, scala.Double, scala.Boolean],
    setText: js.Function1[java.lang.String, scala.Boolean]
  ): XAccessibleEditableText = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CaretPosition")(CaretPosition)
    __obj.updateDynamic("CharacterCount")(CharacterCount)
    __obj.updateDynamic("SelectedText")(SelectedText)
    __obj.updateDynamic("SelectionEnd")(SelectionEnd)
    __obj.updateDynamic("SelectionStart")(SelectionStart)
    __obj.updateDynamic("Text")(Text)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("copyText")(copyText)
    __obj.updateDynamic("cutText")(cutText)
    __obj.updateDynamic("deleteText")(deleteText)
    __obj.updateDynamic("getCaretPosition")(getCaretPosition)
    __obj.updateDynamic("getCharacter")(getCharacter)
    __obj.updateDynamic("getCharacterAttributes")(getCharacterAttributes)
    __obj.updateDynamic("getCharacterBounds")(getCharacterBounds)
    __obj.updateDynamic("getCharacterCount")(getCharacterCount)
    __obj.updateDynamic("getIndexAtPoint")(getIndexAtPoint)
    __obj.updateDynamic("getSelectedText")(getSelectedText)
    __obj.updateDynamic("getSelectionEnd")(getSelectionEnd)
    __obj.updateDynamic("getSelectionStart")(getSelectionStart)
    __obj.updateDynamic("getText")(getText)
    __obj.updateDynamic("getTextAtIndex")(getTextAtIndex)
    __obj.updateDynamic("getTextBeforeIndex")(getTextBeforeIndex)
    __obj.updateDynamic("getTextBehindIndex")(getTextBehindIndex)
    __obj.updateDynamic("getTextRange")(getTextRange)
    __obj.updateDynamic("insertText")(insertText)
    __obj.updateDynamic("pasteText")(pasteText)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("replaceText")(replaceText)
    __obj.updateDynamic("setAttributes")(setAttributes)
    __obj.updateDynamic("setCaretPosition")(setCaretPosition)
    __obj.updateDynamic("setSelection")(setSelection)
    __obj.updateDynamic("setText")(setText)
    __obj.asInstanceOf[XAccessibleEditableText]
  }
}

