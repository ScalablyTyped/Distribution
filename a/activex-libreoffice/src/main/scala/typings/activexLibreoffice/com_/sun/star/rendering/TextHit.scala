package typings.activexLibreoffice.com_.sun.star.rendering

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This structure contains hit information for {@link XTextLayout} .
  *
  * This structure is used from the {@link XTextLayout} interface to transport information regarding hit tests.
  * @since OOo 2.0
  */
@js.native
trait TextHit extends StObject {
  
  /**
    * This contains the entry index.
    *
    * The entry index is the index of the insertion point in the character sequence. The insertion point denotes positions **between** the actual characters
    * in the string, and can thus have values ranging from 0 up to the number of characters in the string. Hereby, an index of 0 denotes an insertion
    * position **before** the first character, and an index containing the number of characters denotes an insertion **behind** the last character.
    */
  var EntryIndex: Double = js.native
  
  /**
    * This member denotes whether the hit was on the leading edge.
    *
    * Each character is divided in two halves, the leading and the trailing part. The leading edge is the part of the glyph encountered first when reading
    * text of the corresponding language (i.e. the leading edge of an Arabic glyph is the right half of it, whereas it is the left half of a Latin
    * character). If the hit was on the leading edge, this member is set to `TRUE` .
    */
  var IsLeadingEdge: Boolean = js.native
}
object TextHit {
  
  @scala.inline
  def apply(EntryIndex: Double, IsLeadingEdge: Boolean): TextHit = {
    val __obj = js.Dynamic.literal(EntryIndex = EntryIndex.asInstanceOf[js.Any], IsLeadingEdge = IsLeadingEdge.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextHit]
  }
  
  @scala.inline
  implicit class TextHitMutableBuilder[Self <: TextHit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntryIndex(value: Double): Self = StObject.set(x, "EntryIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLeadingEdge(value: Boolean): Self = StObject.set(x, "IsLeadingEdge", value.asInstanceOf[js.Any])
  }
}
