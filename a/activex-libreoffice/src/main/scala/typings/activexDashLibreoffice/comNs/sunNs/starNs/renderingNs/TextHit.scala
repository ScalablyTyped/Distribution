package typings.activexDashLibreoffice.comNs.sunNs.starNs.renderingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This structure contains hit information for {@link XTextLayout} .
  *
  * This structure is used from the {@link XTextLayout} interface to transport information regarding hit tests.
  * @since OOo 2.0
  */
trait TextHit extends js.Object {
  /**
    * This contains the entry index.
    *
    * The entry index is the index of the insertion point in the character sequence. The insertion point denotes positions **between** the actual characters
    * in the string, and can thus have values ranging from 0 up to the number of characters in the string. Hereby, an index of 0 denotes an insertion
    * position **before** the first character, and an index containing the number of characters denotes an insertion **behind** the last character.
    */
  var EntryIndex: Double
  /**
    * This member denotes whether the hit was on the leading edge.
    *
    * Each character is divided in two halves, the leading and the trailing part. The leading edge is the part of the glyph encountered first when reading
    * text of the corresponding language (i.e. the leading edge of an Arabic glyph is the right half of it, whereas it is the left half of a Latin
    * character). If the hit was on the leading edge, this member is set to `TRUE` .
    */
  var IsLeadingEdge: Boolean
}

object TextHit {
  @scala.inline
  def apply(EntryIndex: Double, IsLeadingEdge: Boolean): TextHit = {
    val __obj = js.Dynamic.literal(EntryIndex = EntryIndex, IsLeadingEdge = IsLeadingEdge)
  
    __obj.asInstanceOf[TextHit]
  }
}

