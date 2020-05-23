package typings.activexLibreoffice.com_.sun.star.text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the properties of the footnote area of a page or a page style. */
trait PageFootnoteInfo extends js.Object {
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
}

