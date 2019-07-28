package typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchResult extends js.Object {
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
  @scala.inline
  def apply(endOffset: SafeArray[Double], startOffset: SafeArray[Double], subRegExpressions: Double): SearchResult = {
    val __obj = js.Dynamic.literal(endOffset = endOffset, startOffset = startOffset, subRegExpressions = subRegExpressions)
  
    __obj.asInstanceOf[SearchResult]
  }
}

