package typings.activexLibreoffice.com_.sun.star.util

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchResult extends js.Object {
  var endOffset: SafeArray[Double] = js.native
  var startOffset: SafeArray[Double] = js.native
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
  var subRegExpressions: Double = js.native
}

object SearchResult {
  @scala.inline
  def apply(endOffset: SafeArray[Double], startOffset: SafeArray[Double], subRegExpressions: Double): SearchResult = {
    val __obj = js.Dynamic.literal(endOffset = endOffset.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any], subRegExpressions = subRegExpressions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResult]
  }
  @scala.inline
  implicit class SearchResultOps[Self <: SearchResult] (val x: Self) extends AnyVal {
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
    def setEndOffset(value: SafeArray[Double]): Self = this.set("endOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartOffset(value: SafeArray[Double]): Self = this.set("startOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubRegExpressions(value: Double): Self = this.set("subRegExpressions", value.asInstanceOf[js.Any])
  }
  
}

