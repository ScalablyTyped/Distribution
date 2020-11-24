package typings.activexLibreoffice.com_.sun.star.accessibility

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@js.native
trait TextSegment extends js.Object {
  
  /** Index of the character directly behind the last character of the text segment represented by this structure. The index refers to the enclosing text. */
  var SegmentEnd: Double = js.native
  
  /** Index of the first character of the text segment represented by this structure. The index refers to the enclosing text. */
  var SegmentStart: Double = js.native
  
  /**
    * A copy of the text segment of the enclosing text delimited by the text indices {@link TextSegment.SegmentStart} and {@link TextSegment.SegmentEnd} .
    * Modifying it does not alter the enclosing text.
    */
  var SegmentText: String = js.native
}
object TextSegment {
  
  @scala.inline
  def apply(SegmentEnd: Double, SegmentStart: Double, SegmentText: String): TextSegment = {
    val __obj = js.Dynamic.literal(SegmentEnd = SegmentEnd.asInstanceOf[js.Any], SegmentStart = SegmentStart.asInstanceOf[js.Any], SegmentText = SegmentText.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextSegment]
  }
  
  @scala.inline
  implicit class TextSegmentOps[Self <: TextSegment] (val x: Self) extends AnyVal {
    
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
    def setSegmentEnd(value: Double): Self = this.set("SegmentEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentStart(value: Double): Self = this.set("SegmentStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentText(value: String): Self = this.set("SegmentText", value.asInstanceOf[js.Any])
  }
}
