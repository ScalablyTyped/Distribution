package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Implement this interface to give read-only access to a text.
  *
  * The {@link XAccessibleText} interface should be implemented by all UNO components that present textual information on the display like buttons, text
  * entry fields, or text portions of the document window. The interface provides access to the text's content, attributes, and spatial location. However,
  * text can not be modified with this interface. That is the task of the {@link XAccessibleEditableText} interface.
  *
  * The text length, i.e. the number of characters in the text, is returned by {@link XAccessibleText.getCharacterCount()} . All methods that operate on
  * particular characters (e.g. XAccessibleText::getCharacterAt()) use character indices from 0 to length-1. All methods that operate on character
  * positions (e.g. {@link XAccessibleText.getTextRange()} ) use indices from 0 to length.
  *
  * Please note that accessible text does not necessarily support selection. In this case it should behave as if there where no selection. An empty
  * selection is used for example to express the current cursor position.
  * @since OOo 1.1.2
  */
trait XAccessibleText
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Return the position of the caret.
    *
    * Returns the offset of the caret. The caret is often called text cursor. The caret is actually the position between two characters. Its position/offset
    * is that of the character to the right of it.
    * @returns The returned offset is relative to the text represented by this object.
    */
  var CaretPosition: scala.Double
  /**
    * Return the number of characters in the represented text.
    *
    * Returns the number of characters in the text represented by this object or, in other words, the text length.
    * @returns Returns the number of characters of this object's text. A zero value indicates an empty text.
    */
  val CharacterCount: scala.Double
  /**
    * Return the selected text.
    *
    * Returns the portion of the text that is selected.
    * @returns The returned text is the selected portion of the object's text. If no text is selected when this method is called or when selection is not suppor
    */
  val SelectedText: java.lang.String
  /**
    * Return the position of the end of the selection.
    *
    * Returns the index of the end of the selected text.
    * @returns If there is no selection or selection is not supported the position of selection start and end will be the same undefined value.
    */
  val SelectionEnd: scala.Double
  /**
    * Return the position of the start of the selection.
    *
    * Returns the index of the start of the selected text.
    * @returns If there is no selection or selection is not supported the position of selection start and end will be the same undefined value.
    */
  val SelectionStart: scala.Double
  /**
    * Return the whole text.
    *
    * Returns the complete text. This is equivalent to a call to {@link XAccessibleText.getTextRange()} with the arguments zero and `getCharacterCount()-1`
    * .
    * @returns Returns a string that contains the complete text.
    */
  val Text: java.lang.String
  /**
    * Copy the specified text into the clipboard.
    *
    * Copy the specified text into the clipboard. The text that is copied is the same text that would have been selected by the {@link
    * XAccessibleText.getTextRange()} method.
    *
    * The other clipboard related methods {@link XAccessibleEditableText.cutText()} and {@link XAccessibleEditableText.deleteText()} can be found in the
    * {@link XAccessibleEditableText} because of their destructive nature.
    * @param nStartIndex Start index of the text to copied into the clipboard. The valid range is 0..length.
    * @param nEndIndex End index of the text to copied into the clipboard. The valid range is 0..length.
    * @returns Returns `TRUE` if the specified text has been copied successfully into the clipboard.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the indices are invalid
    */
  def copyText(nStartIndex: scala.Double, nEndIndex: scala.Double): scala.Boolean
  /**
    * Return the position of the caret.
    *
    * Returns the offset of the caret. The caret is often called text cursor. The caret is actually the position between two characters. Its position/offset
    * is that of the character to the right of it.
    * @returns The returned offset is relative to the text represented by this object.
    */
  def getCaretPosition(): scala.Double
  /**
    * Return the character at the specified position.
    *
    * Returns the character at the given index.
    * @param nIndex The index of the character to return. The valid range is 0..length-1.
    * @returns the character at the index nIndex.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the index is invalid
    */
  def getCharacter(nIndex: scala.Double): java.lang.String
  /**
    * Get the attribute set for the specified position.
    *
    * Returns a set of attributes that are associated for the character at the given index. To prevent the method from returning possibly large sets of
    * attributes that the caller is not interested in the caller has to provide a list of attributes that he wants to be returned.
    * @param nIndex The index of the character for which to return its attributes. The valid range is 0..length-1.
    * @param aRequestedAttributes This string sequence defines the set of attributes that the caller is interested in. When there are attributes defined that
    * @returns Returns the explicitly or implicitly (empty aRequestedAttributes argument) requested attributes of the specified character. Each attribute is rep
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the index is invalid
    */
  def getCharacterAttributes(
    nIndex: scala.Double,
    aRequestedAttributes: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]
  ): activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  /**
    * Return the bounding box of the specified position.
    *
    * Returns the bounding box of the indexed character.
    *
    * The virtual character after the last character of the represented text, i.e. the one at position length is a special case. It represents the current
    * input position and will therefore typically be queried by AT more often than other positions. Because it does not represent an existing character its
    * bounding box is defined in relation to preceding characters. It should be roughly equivalent to the bounding box of some character when inserted at
    * the end of the text. Its height typically being the maximal height of all the characters in the text or the height of the preceding character, its
    * width being at least one pixel so that the bounding box is not degenerate. ;  Note that the index "length" is not always valid. Whether it is or not
    * is implementation dependent. It typically is when text is editable or otherwise when on the screen the caret can be placed behind the text. You can be
    * sure that the index is valid after you have received a AccessibleEventId::CARET event for this index.
    * @param nIndex Index of the character for which to return its bounding box. The valid range is 0..length.
    * @returns The bounding box of the referenced character. The bounding box of the virtual character at position length has to have non-empty dimensions.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the index is invalid
    */
  def getCharacterBounds(nIndex: scala.Double): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle
  /**
    * Return the number of characters in the represented text.
    *
    * Returns the number of characters in the text represented by this object or, in other words, the text length.
    * @returns Returns the number of characters of this object's text. A zero value indicates an empty text.
    */
  def getCharacterCount(): scala.Double
  /**
    * Return the text position for the specified screen position.
    *
    * Given a point in local coordinates, i.e. relative to the coordinate system of the object, return the zero-based index of the character under that
    * point. The same functionality could be achieved by using the bounding boxes for each character as returned by {@link
    * XAccessibleText.getCharacterBounds()} . The method {@link XAccessibleText.getIndexAtPoint()} , however, can be implemented in a more efficient way.
    * @param aPoint The position for which to look up the index of the character that is rendered on to the display at that point.
    * @returns Index of the character under the given point or -1 if the point is invalid or there is no character under the point.
    */
  def getIndexAtPoint(aPoint: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point): scala.Double
  /**
    * Return the selected text.
    *
    * Returns the portion of the text that is selected.
    * @returns The returned text is the selected portion of the object's text. If no text is selected when this method is called or when selection is not suppor
    */
  def getSelectedText(): java.lang.String
  /**
    * Return the position of the end of the selection.
    *
    * Returns the index of the end of the selected text.
    * @returns If there is no selection or selection is not supported the position of selection start and end will be the same undefined value.
    */
  def getSelectionEnd(): scala.Double
  /**
    * Return the position of the start of the selection.
    *
    * Returns the index of the start of the selected text.
    * @returns If there is no selection or selection is not supported the position of selection start and end will be the same undefined value.
    */
  def getSelectionStart(): scala.Double
  /**
    * Return the whole text.
    *
    * Returns the complete text. This is equivalent to a call to {@link XAccessibleText.getTextRange()} with the arguments zero and `getCharacterCount()-1`
    * .
    * @returns Returns a string that contains the complete text.
    */
  def getText(): java.lang.String
  /**
    * Get a text portion around the given position.
    *
    * Returns the substring of the specified text type that contains the character at the given index, if any. For example, given the text type {@link
    * AccessibleTextType.WORD} , the word which contains the character at position nIndex is returned, or an empty string if no word is found at the that
    * position.
    * @param nIndex Index of the character whose containing text portion is to be returned. The valid range is 0..length.
    * @param nTextType The type of the text portion to return. See {@link AccessibleTextType} for the complete list.
    * @returns Returns the requested text portion. This portion may be empty or invalid when no appropriate text portion is found or text type is invalid.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the index is invalid
    * @throws com::sun::star::lang::IllegalArgumentException if the given text type is not valid.
    */
  def getTextAtIndex(nIndex: scala.Double, nTextType: scala.Double): TextSegment
  /**
    * Get a text portion before the given position.
    *
    * Returns the substring of the specified text type that is located before the given character and does not include it. The result of this method should
    * be same as a result for {@link XAccessibleText.getTextAtIndex()} with a suitably decreased index value.
    *
    * For example, if text type is {@link AccessibleTextType.WORD} , then the complete word that is closest to and located before nIndex is returned.
    *
    * If the index is valid, but no suitable word (or other text type) is found, an empty text segment is returned.
    * @param nIndex Index of the character for which to return the text part before it. The index character will not be part of the returned string. The valid
    * @param nTextType The type of the text portion to return. See {@link AccessibleTextType} for the complete list.
    * @returns Returns the requested text portion. This portion may be empty or invalid when no appropriate text portion is found or text type is invalid.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the index is invalid.
    * @throws com::sun::star::lang::IllegalArgumentException if the given text type is not valid.
    */
  def getTextBeforeIndex(nIndex: scala.Double, nTextType: scala.Double): TextSegment
  /**
    * Get a text portion behind the given position.
    *
    * Returns the substring of the specified text type that is located after the given character and does not include it. The result of this method should
    * be same as a result for {@link XAccessibleText.getTextAtIndex()} with a suitably increased index value.
    *
    * For example, if text type is {@link AccessibleTextType.WORD} , then the complete word that is closest to and located behind nIndex is returned.
    *
    * If the index is valid, but no suitable word (or other text type) is found, an empty string is returned.
    * @param nIndex Index of the character for which to return the text part after it. The index character will be part of the returned string. The valid rang
    * @param nTextType The type of the text portion to return. See {@link AccessibleTextType} for the complete list.
    * @returns Returns the requested text portion. This portion may be empty or invalid when no appropriate text portion is found or text type is invalid.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the index is invalid
    * @throws com::sun::star::lang::IllegalArgumentException if the given text type is not valid.
    */
  def getTextBehindIndex(nIndex: scala.Double, nTextType: scala.Double): TextSegment
  /**
    * Return the specified text range.
    *
    * Returns the substring between the two given indices.
    *
    * The substring starts with the character at nStartIndex (inclusive) and up to the character at nEndIndex (exclusive), if nStartIndex is less or equal
    * nEndIndex. If nEndIndex is lower than nStartIndex, the result is the same as a call with the two arguments being exchanged.
    *
    * The whole text can be requested by passing the indices zero and `getCharacterCount()` . If both indices have the same value, an empty string is
    * returned.
    * @param nStartIndex Index of the first character to include in the returned string. The valid range is 0..length.
    * @param nEndIndex Index of the last character to exclude in the returned string. The valid range is 0..length.
    * @returns Returns the substring starting with the character at nStartIndex (inclusive) and up to the character at nEndIndex (exclusive), if nStartIndex is
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the indices are invalid
    */
  def getTextRange(nStartIndex: scala.Double, nEndIndex: scala.Double): java.lang.String
  /**
    * Set the position of the caret.
    *
    * The caret is often called text cursor. The caret is actually the position between two characters. Its position/offset is that of the character to the
    * right of it.
    *
    * Setting the caret position may or may not alter the current selection. A change of the selection is notified to the accessibility event listeners with
    * an AccessibleEventId::ACCESSIBLE_SELECTION_EVENT.
    *
    * When the new caret position differs from the old one (which, of course, is the standard case) this is notified to the accessibility event listeners
    * with an AccessibleEventId::ACCESSIBLE_CARET_EVENT.
    * @param nIndex The new index of the caret. This caret is actually placed to the left side of the character with that index. An index of 0 places the care
    * @returns Returns `TRUE` if the caret has been moved and `FALSE` otherwise. A `TRUE` value does not necessarily mean that the caret has been positioned exa
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the index is not valid.
    */
  def setCaretPosition(nIndex: scala.Double): scala.Boolean
  /**
    * Set a new selection.
    *
    * Sets the selected text portion according to the given indices. The old selection is replaced by the new selection.
    *
    * The selection encompasses the same string of text that {@link XAccessibleText.getTextRange()} would have selected. See there for details.
    *
    * Setting the selection may or may not change the caret position. Typically the caret is moved to the position after the second argument. When the caret
    * is moved this is notified to the accessibility event listeners with an AccessibleEventId::ACCESSIBLE_CARET_EVENT.
    * @param nStartIndex The first character of the new selection. The valid range is 0..length.
    * @param nEndIndex The position after the last character of the new selection. The valid range is 0..length.
    * @returns Returns `TRUE` if the selection has been set successfully and `FALSE` otherwise or when selection is not supported.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the indices are invalid
    */
  def setSelection(nStartIndex: scala.Double, nEndIndex: scala.Double): scala.Boolean
}

object XAccessibleText {
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
    getTextRange: js.Function2[scala.Double, scala.Double, java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setCaretPosition: js.Function1[scala.Double, scala.Boolean],
    setSelection: js.Function2[scala.Double, scala.Double, scala.Boolean]
  ): XAccessibleText = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CaretPosition")(CaretPosition)
    __obj.updateDynamic("CharacterCount")(CharacterCount)
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
    __obj.asInstanceOf[XAccessibleText]
  }
}

