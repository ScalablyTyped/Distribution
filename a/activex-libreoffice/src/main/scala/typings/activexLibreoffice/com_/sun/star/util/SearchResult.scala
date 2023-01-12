package typings.activexLibreoffice.com_.sun.star.util

import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchResult extends StObject {
  
  var endOffset: SafeArray[Double]
  
  var startOffset: SafeArray[Double]
  
  /**
    * Number of subexpressions.
    *
    * If it is 0, then no match found; this value is 1 for ABSOLUTE and APPROXIMATE match. The start and endOffset are always dependent on the search
    * direction.
    *
    * For example, if you search "X" in the text "-X-" the offsets are: for forward:    start = 1, end = 2
    *
    *
    *
    * for backward:   start = 2, end = 1
    *
    *
    *
    * Forward, the startOffset is inclusive, the endOffset exclusive. Backward, the startOffset is exclusive, the endOffset inclusive.
    *
    * For regular expressions it can be greater than 1. If the value is 1, startoffset[0] and endoffset[0] points to the matching sub string if value is >
    * 1, still startoffset[0] and endoffset[0] points to the matching substring for whole regular expression startoffset[i] and endoffset[i] points to the
    * matching substring of i th matching substring.
    */
  var subRegExpressions: Double
}
object SearchResult {
  
  inline def apply(endOffset: SafeArray[Double], startOffset: SafeArray[Double], subRegExpressions: Double): SearchResult = {
    val __obj = js.Dynamic.literal(endOffset = endOffset.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any], subRegExpressions = subRegExpressions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchResult] (val x: Self) extends AnyVal {
    
    inline def setEndOffset(value: SafeArray[Double]): Self = StObject.set(x, "endOffset", value.asInstanceOf[js.Any])
    
    inline def setStartOffset(value: SafeArray[Double]): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
    
    inline def setSubRegExpressions(value: Double): Self = StObject.set(x, "subRegExpressions", value.asInstanceOf[js.Any])
  }
}
