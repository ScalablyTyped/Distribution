package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.com_.sun.star.util.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a page style for a text document.
  *
  * This service extends the service {@link com.sun.star.style.PageStyle} with specific properties for text documents.
  */
trait TextPageStyle extends js.Object {
  /**
    * contains the interface to the text of the footer.
    * @see com.sun.star.text.Text
    */
  var FooterText: XText
  /**
    * contains the interface to the text of the footer of a first page.
    * @see com.sun.star.text.Text
    * @since LibreOffice 4.0
    */
  var FooterTextFirst: XText
  /**
    * contains the interface to the text of the footer of a left page.
    * @see com.sun.star.text.Text
    */
  var FooterTextLeft: XText
  /**
    * contains the interface to the text of the footer of a right page.
    * @see com.sun.star.text.Text
    */
  var FooterTextRight: XText
  /**
    * contains the maximum height of the footnote area (in 1/100 mm).
    *
    * If set to zero, the height of the current page is used as limit.
    */
  var FootnoteHeight: Double
  /**
    * contains the adjustment of the separator line between the text and the footnote area.
    * @see com.sun.star.text.HorizontalAdjust
    */
  var FootnoteLineAdjust: Double
  /** contains the color of the separator line between the text and the footnote area. */
  var FootnoteLineColor: Color
  /** contains the distance between the footnote area and the separator line between the text and the footnote area (in 1/100 mm). */
  var FootnoteLineDistance: Double
  /** contains the relative width of the separator line between the text and the footnote area (in percent). */
  var FootnoteLineRelativeWidth: Double
  /** contains the distance between the text and the separator line between the text and the footnote area (in 1/100 mm). */
  var FootnoteLineTextDistance: Double
  /** contains the weight of the separator line between the text and the footnote area (in 1/100 mm). */
  var FootnoteLineWeight: Double
  /**
    * contains the interface to the text of the header.
    * @see com.sun.star.text.Text
    */
  var HeaderText: XText
  /**
    * contains the interface to the text of the header of first pages.
    * @see com.sun.star.text.Text
    * @since LibreOffice 4.0
    */
  var HeaderTextFirst: XText
  /**
    * contains the interface to the text of the header of left pages.
    * @see com.sun.star.text.Text
    */
  var HeaderTextLeft: XText
  /**
    * contains the interface to the text of the header of right pages.
    * @see com.sun.star.text.Text
    */
  var HeaderTextRight: XText
  /** determines whether the register mode is active on that page. */
  var RegisterModeActive: Boolean
  /** contains the name of the paragraph style that is used as reference of the register mode. */
  var RegisterParagraphStyle: String
  /** contains the column settings of the page. */
  var TextColumns: XTextColumns
}

object TextPageStyle {
  @scala.inline
  def apply(
    FooterText: XText,
    FooterTextFirst: XText,
    FooterTextLeft: XText,
    FooterTextRight: XText,
    FootnoteHeight: Double,
    FootnoteLineAdjust: Double,
    FootnoteLineColor: Color,
    FootnoteLineDistance: Double,
    FootnoteLineRelativeWidth: Double,
    FootnoteLineTextDistance: Double,
    FootnoteLineWeight: Double,
    HeaderText: XText,
    HeaderTextFirst: XText,
    HeaderTextLeft: XText,
    HeaderTextRight: XText,
    RegisterModeActive: Boolean,
    RegisterParagraphStyle: String,
    TextColumns: XTextColumns
  ): TextPageStyle = {
    val __obj = js.Dynamic.literal(FooterText = FooterText.asInstanceOf[js.Any], FooterTextFirst = FooterTextFirst.asInstanceOf[js.Any], FooterTextLeft = FooterTextLeft.asInstanceOf[js.Any], FooterTextRight = FooterTextRight.asInstanceOf[js.Any], FootnoteHeight = FootnoteHeight.asInstanceOf[js.Any], FootnoteLineAdjust = FootnoteLineAdjust.asInstanceOf[js.Any], FootnoteLineColor = FootnoteLineColor.asInstanceOf[js.Any], FootnoteLineDistance = FootnoteLineDistance.asInstanceOf[js.Any], FootnoteLineRelativeWidth = FootnoteLineRelativeWidth.asInstanceOf[js.Any], FootnoteLineTextDistance = FootnoteLineTextDistance.asInstanceOf[js.Any], FootnoteLineWeight = FootnoteLineWeight.asInstanceOf[js.Any], HeaderText = HeaderText.asInstanceOf[js.Any], HeaderTextFirst = HeaderTextFirst.asInstanceOf[js.Any], HeaderTextLeft = HeaderTextLeft.asInstanceOf[js.Any], HeaderTextRight = HeaderTextRight.asInstanceOf[js.Any], RegisterModeActive = RegisterModeActive.asInstanceOf[js.Any], RegisterParagraphStyle = RegisterParagraphStyle.asInstanceOf[js.Any], TextColumns = TextColumns.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextPageStyle]
  }
}

