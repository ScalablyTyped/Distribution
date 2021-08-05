package typings.activexLibreoffice.com_.sun.star.text

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies the properties of the footnote area of a page or a page style. */
trait PageFootnoteInfo extends StObject {
  
  /** contains the distance between the separator line and the footnote section. */
  var FootnoteBottomDistance: Double
  
  /**
    * contains the maximum height of the footnote section.
    *
    * If 0, the maximum is the height of the page.
    */
  var FootnoteHeight: Double
  
  /** contains the adjustment of the footnote separator line. */
  var FootnoteSeparatorLineAdjust: HorizontalAdjust
  
  /** contains the width of the pen for the footnote separator line. */
  var FootnoteSeparatorLinePenWidth: Double
  
  /** contains the relative width of the footnote separator line. */
  var FootnoteSeparatorLineWidth: Double
  
  /** contains the relative width of the footnote separator line. */
  var FootnoteSeparatorLineWidthPercent: Double
  
  /** contains the distance between the text and footnote section. */
  var FootnoteTopDistance: Double
}
object PageFootnoteInfo {
  
  inline def apply(
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
  
  extension [Self <: PageFootnoteInfo](x: Self) {
    
    inline def setFootnoteBottomDistance(value: Double): Self = StObject.set(x, "FootnoteBottomDistance", value.asInstanceOf[js.Any])
    
    inline def setFootnoteHeight(value: Double): Self = StObject.set(x, "FootnoteHeight", value.asInstanceOf[js.Any])
    
    inline def setFootnoteSeparatorLineAdjust(value: HorizontalAdjust): Self = StObject.set(x, "FootnoteSeparatorLineAdjust", value.asInstanceOf[js.Any])
    
    inline def setFootnoteSeparatorLinePenWidth(value: Double): Self = StObject.set(x, "FootnoteSeparatorLinePenWidth", value.asInstanceOf[js.Any])
    
    inline def setFootnoteSeparatorLineWidth(value: Double): Self = StObject.set(x, "FootnoteSeparatorLineWidth", value.asInstanceOf[js.Any])
    
    inline def setFootnoteSeparatorLineWidthPercent(value: Double): Self = StObject.set(x, "FootnoteSeparatorLineWidthPercent", value.asInstanceOf[js.Any])
    
    inline def setFootnoteTopDistance(value: Double): Self = StObject.set(x, "FootnoteTopDistance", value.asInstanceOf[js.Any])
  }
}
