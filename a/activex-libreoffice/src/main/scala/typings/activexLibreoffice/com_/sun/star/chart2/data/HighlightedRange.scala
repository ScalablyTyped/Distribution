package typings.activexLibreoffice.com_.sun.star.chart2.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HighlightedRange extends js.Object {
  
  /**
    * If the highlighted range is visually highlighted and this member is `TRUE` , the range given in {@link RangeRepresentation} may be included in a
    * merged range rectangle spanning a bigger range.
    */
  var AllowMerginigWithOtherRanges: Boolean = js.native
  
  /** Only take the cell at position Index out of the given Range. If this value is -1 take the whole sequence. */
  var Index: Double = js.native
  
  /** Use this color for marking the range. This color may be ignored and replaced by a better fitting color, if it would be otherwise not well visible. */
  var PreferredColor: Double = js.native
  
  /** The range representation string of the highlighted range. */
  var RangeRepresentation: String = js.native
}
object HighlightedRange {
  
  @scala.inline
  def apply(
    AllowMerginigWithOtherRanges: Boolean,
    Index: Double,
    PreferredColor: Double,
    RangeRepresentation: String
  ): HighlightedRange = {
    val __obj = js.Dynamic.literal(AllowMerginigWithOtherRanges = AllowMerginigWithOtherRanges.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], PreferredColor = PreferredColor.asInstanceOf[js.Any], RangeRepresentation = RangeRepresentation.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightedRange]
  }
  
  @scala.inline
  implicit class HighlightedRangeOps[Self <: HighlightedRange] (val x: Self) extends AnyVal {
    
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
    def setAllowMerginigWithOtherRanges(value: Boolean): Self = this.set("AllowMerginigWithOtherRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("Index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredColor(value: Double): Self = this.set("PreferredColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeRepresentation(value: String): Self = this.set("RangeRepresentation", value.asInstanceOf[js.Any])
  }
}
