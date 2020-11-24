package typings.activexLibreoffice.com_.sun.star.text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies the properties of the footnote area of a page or a page style. */
@js.native
trait PageFootnoteInfo extends js.Object {
  
  /** contains the distance between the separator line and the footnote section. */
  var FootnoteBottomDistance: Double = js.native
  
  /**
    * contains the maximum height of the footnote section.
    *
    * If 0, the maximum is the height of the page.
    */
  var FootnoteHeight: Double = js.native
  
  /** contains the adjustment of the footnote separator line. */
  var FootnoteSeparatorLineAdjust: HorizontalAdjust = js.native
  
  /** contains the width of the pen for the footnote separator line. */
  var FootnoteSeparatorLinePenWidth: Double = js.native
  
  /** contains the relative width of the footnote separator line. */
  var FootnoteSeparatorLineWidth: Double = js.native
  
  /** contains the relative width of the footnote separator line. */
  var FootnoteSeparatorLineWidthPercent: Double = js.native
  
  /** contains the distance between the text and footnote section. */
  var FootnoteTopDistance: Double = js.native
}
object PageFootnoteInfo {
  
  @scala.inline
  def apply(
    FootnoteBottomDistance: Double,
    FootnoteHeight: Double,
    FootnoteSeparatorLineAdjust: HorizontalAdjust,
    FootnoteSeparatorLinePenWidth: Double,
    FootnoteSeparatorLineWidth: Double,
    FootnoteSeparatorLineWidthPercent: Double,
    FootnoteTopDistance: Double
  ): PageFootnoteInfo = {
    val __obj = js.Dynamic.literal(FootnoteBottomDistance = FootnoteBottomDistance.asInstanceOf[js.Any], FootnoteHeight = FootnoteHeight.asInstanceOf[js.Any], FootnoteSeparatorLineAdjust = FootnoteSeparatorLineAdjust.asInstanceOf[js.Any], FootnoteSeparatorLinePenWidth = FootnoteSeparatorLinePenWidth.asInstanceOf[js.Any], FootnoteSeparatorLineWidth = FootnoteSeparatorLineWidth.asInstanceOf[js.Any], FootnoteSeparatorLineWidthPercent = FootnoteSeparatorLineWidthPercent.asInstanceOf[js.Any], FootnoteTopDistance = FootnoteTopDistance.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageFootnoteInfo]
  }
  
  @scala.inline
  implicit class PageFootnoteInfoOps[Self <: PageFootnoteInfo] (val x: Self) extends AnyVal {
    
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
    def setFootnoteBottomDistance(value: Double): Self = this.set("FootnoteBottomDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFootnoteHeight(value: Double): Self = this.set("FootnoteHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFootnoteSeparatorLineAdjust(value: HorizontalAdjust): Self = this.set("FootnoteSeparatorLineAdjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFootnoteSeparatorLinePenWidth(value: Double): Self = this.set("FootnoteSeparatorLinePenWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFootnoteSeparatorLineWidth(value: Double): Self = this.set("FootnoteSeparatorLineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFootnoteSeparatorLineWidthPercent(value: Double): Self = this.set("FootnoteSeparatorLineWidthPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFootnoteTopDistance(value: Double): Self = this.set("FootnoteTopDistance", value.asInstanceOf[js.Any])
  }
}
