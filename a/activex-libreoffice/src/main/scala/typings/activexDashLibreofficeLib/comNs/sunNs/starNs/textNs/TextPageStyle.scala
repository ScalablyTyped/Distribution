package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

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
  var FootnoteHeight: scala.Double
  /**
    * contains the adjustment of the separator line between the text and the footnote area.
    * @see com.sun.star.text.HorizontalAdjust
    */
  var FootnoteLineAdjust: scala.Double
  /** contains the color of the separator line between the text and the footnote area. */
  var FootnoteLineColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /** contains the distance between the footnote area and the separator line between the text and the footnote area (in 1/100 mm). */
  var FootnoteLineDistance: scala.Double
  /** contains the relative width of the separator line between the text and the footnote area (in percent). */
  var FootnoteLineRelativeWidth: scala.Double
  /** contains the distance between the text and the separator line between the text and the footnote area (in 1/100 mm). */
  var FootnoteLineTextDistance: scala.Double
  /** contains the weight of the separator line between the text and the footnote area (in 1/100 mm). */
  var FootnoteLineWeight: scala.Double
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
  var RegisterModeActive: scala.Boolean
  /** contains the name of the paragraph style that is used as reference of the register mode. */
  var RegisterParagraphStyle: java.lang.String
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
    FootnoteHeight: scala.Double,
    FootnoteLineAdjust: scala.Double,
    FootnoteLineColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    FootnoteLineDistance: scala.Double,
    FootnoteLineRelativeWidth: scala.Double,
    FootnoteLineTextDistance: scala.Double,
    FootnoteLineWeight: scala.Double,
    HeaderText: XText,
    HeaderTextFirst: XText,
    HeaderTextLeft: XText,
    HeaderTextRight: XText,
    RegisterModeActive: scala.Boolean,
    RegisterParagraphStyle: java.lang.String,
    TextColumns: XTextColumns
  ): TextPageStyle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("FooterText")(FooterText)
    __obj.updateDynamic("FooterTextFirst")(FooterTextFirst)
    __obj.updateDynamic("FooterTextLeft")(FooterTextLeft)
    __obj.updateDynamic("FooterTextRight")(FooterTextRight)
    __obj.updateDynamic("FootnoteHeight")(FootnoteHeight)
    __obj.updateDynamic("FootnoteLineAdjust")(FootnoteLineAdjust)
    __obj.updateDynamic("FootnoteLineColor")(FootnoteLineColor)
    __obj.updateDynamic("FootnoteLineDistance")(FootnoteLineDistance)
    __obj.updateDynamic("FootnoteLineRelativeWidth")(FootnoteLineRelativeWidth)
    __obj.updateDynamic("FootnoteLineTextDistance")(FootnoteLineTextDistance)
    __obj.updateDynamic("FootnoteLineWeight")(FootnoteLineWeight)
    __obj.updateDynamic("HeaderText")(HeaderText)
    __obj.updateDynamic("HeaderTextFirst")(HeaderTextFirst)
    __obj.updateDynamic("HeaderTextLeft")(HeaderTextLeft)
    __obj.updateDynamic("HeaderTextRight")(HeaderTextRight)
    __obj.updateDynamic("RegisterModeActive")(RegisterModeActive)
    __obj.updateDynamic("RegisterParagraphStyle")(RegisterParagraphStyle)
    __obj.updateDynamic("TextColumns")(TextColumns)
    __obj.asInstanceOf[TextPageStyle]
  }
}

