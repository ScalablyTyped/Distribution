package typings.activexLibreoffice.com_.sun.star.accessibility

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.Point
import typings.activexLibreoffice.com_.sun.star.awt.Rectangle
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Implement this interface to expose the text markups of a text.
  *
  * The {@link XAccessibleTextMarkup} interface is the main interface to expose text markups in a text, typically of a text document, that are used to
  * reference other (parts of) documents. For supporting the XAccessibleTextMarkup::getTextMarkupIndex() method of this interface and other character
  * related methods of the {@link XAccessibleTextMarkup} interface, it is necessary to also support the {@link XAccessibleText} interface.
  * @see XAccessibleText
  * @since OOo 3.0
  */
@js.native
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
  def getTextMarkup(TextMarkupIndex: Double, TextMarkupType: Double): TextSegment = js.native
  
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
  def getTextMarkupAtIndex(CharIndex: Double, TextMarkupType: Double): SafeArray[TextSegment] = js.native
  
  /**
    * Returns the number of text markup of the given text markup type of a text.
    *
    * Throws IllegalArgumentException, if given text markup type is out of valid range.
    * @param TextMarkupType This specifies the type of text markups, whose count should be returned - see TextMarkupType.
    * @returns The number of text markup of the given text markup type. Returns 0 if there is no text markup.
    */
  def getTextMarkupCount(TextMarkupType: Double): Double = js.native
}
object XAccessibleTextMarkup {
  
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
    getTextMarkup: (Double, Double) => TextSegment,
    getTextMarkupAtIndex: (Double, Double) => SafeArray[TextSegment],
    getTextMarkupCount: Double => Double,
    getTextRange: (Double, Double) => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setCaretPosition: Double => Boolean,
    setSelection: (Double, Double) => Boolean
  ): XAccessibleTextMarkup = {
    val __obj = js.Dynamic.literal(CaretPosition = CaretPosition.asInstanceOf[js.Any], CharacterCount = CharacterCount.asInstanceOf[js.Any], SelectedText = SelectedText.asInstanceOf[js.Any], SelectionEnd = SelectionEnd.asInstanceOf[js.Any], SelectionStart = SelectionStart.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), copyText = js.Any.fromFunction2(copyText), getCaretPosition = js.Any.fromFunction0(getCaretPosition), getCharacter = js.Any.fromFunction1(getCharacter), getCharacterAttributes = js.Any.fromFunction2(getCharacterAttributes), getCharacterBounds = js.Any.fromFunction1(getCharacterBounds), getCharacterCount = js.Any.fromFunction0(getCharacterCount), getIndexAtPoint = js.Any.fromFunction1(getIndexAtPoint), getSelectedText = js.Any.fromFunction0(getSelectedText), getSelectionEnd = js.Any.fromFunction0(getSelectionEnd), getSelectionStart = js.Any.fromFunction0(getSelectionStart), getText = js.Any.fromFunction0(getText), getTextAtIndex = js.Any.fromFunction2(getTextAtIndex), getTextBeforeIndex = js.Any.fromFunction2(getTextBeforeIndex), getTextBehindIndex = js.Any.fromFunction2(getTextBehindIndex), getTextMarkup = js.Any.fromFunction2(getTextMarkup), getTextMarkupAtIndex = js.Any.fromFunction2(getTextMarkupAtIndex), getTextMarkupCount = js.Any.fromFunction1(getTextMarkupCount), getTextRange = js.Any.fromFunction2(getTextRange), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setCaretPosition = js.Any.fromFunction1(setCaretPosition), setSelection = js.Any.fromFunction2(setSelection))
    __obj.asInstanceOf[XAccessibleTextMarkup]
  }
  
  @scala.inline
  implicit class XAccessibleTextMarkupMutableBuilder[Self <: XAccessibleTextMarkup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetTextMarkup(value: (Double, Double) => TextSegment): Self = StObject.set(x, "getTextMarkup", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetTextMarkupAtIndex(value: (Double, Double) => SafeArray[TextSegment]): Self = StObject.set(x, "getTextMarkupAtIndex", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetTextMarkupCount(value: Double => Double): Self = StObject.set(x, "getTextMarkupCount", js.Any.fromFunction1(value))
  }
}
