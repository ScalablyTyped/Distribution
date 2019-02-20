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

