package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This structure describes a text segment that is embedded in a larger portion of text. It is used for example by the {@link XAccessibleText} interface
  * to describe a text portion that was inserted into or deleted from an accessible text.
  *
  * The indices {@link TextSegment.SegmentStart} and {@link TextSegment.SegmentEnd} refer to the enclosing text. The {@link TextSegment.SegmentText}
  * member contains the text between these two indices including the start index but not the end index. With it you can use this structure without having
  * to access the {@link XAccessibleText} interface that represents the enclosing text.
  *
  * An empty text segment is expressed by {@link TextSegment.SegmentStart} and {@link TextSegment.SegmentEnd} set to the same value. While a value of -1
  * signals an error (like the request for a word after the last character of a text) all other values define the empty string at that position.
  *
  * The {@link SegmentText} member is a copy of the corresponding text segment of the enclosing text. Modifying this structure does not alter the
  * enclosing text.
  * @see XAccessibleText
  * @since OOo 1.1.2
  */
trait TextSegment extends js.Object {
  /** Index of the character directly behind the last character of the text segment represented by this structure. The index refers to the enclosing text. */
  var SegmentEnd: scala.Double
  /** Index of the first character of the text segment represented by this structure. The index refers to the enclosing text. */
  var SegmentStart: scala.Double
  /**
    * A copy of the text segment of the enclosing text delimited by the text indices {@link TextSegment.SegmentStart} and {@link TextSegment.SegmentEnd} .
    * Modifying it does not alter the enclosing text.
    */
  var SegmentText: java.lang.String
}

object TextSegment {
  @scala.inline
  def apply(SegmentEnd: scala.Double, SegmentStart: scala.Double, SegmentText: java.lang.String): TextSegment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("SegmentEnd")(SegmentEnd)
    __obj.updateDynamic("SegmentStart")(SegmentStart)
    __obj.updateDynamic("SegmentText")(SegmentText)
    __obj.asInstanceOf[TextSegment]
  }
}

