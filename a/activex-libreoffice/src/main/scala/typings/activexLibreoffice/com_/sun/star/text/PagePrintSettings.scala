package typings.activexLibreoffice.com_.sun.star.text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** These properties describe the way the {@link XPagePrintable} interface prints the page on one printer page. */
trait PagePrintSettings extends js.Object {
  /** contains the right margin of the printer page. */
  var BottomMargin: Double
  /** contains the margin between the rows of printed pages. */
  var HoriMargin: Double
  /** defines if the printer page is used in landscape format. */
  var IsLandscape: Boolean
  /** contains the left margin of the printer page. */
  var LeftMargin: Double
  /** contains the number of pages per printed row of pages. */
  var PageColumns: Double
  /** contains the number of pages per printed column of pages. */
  var PageRows: Double
  /** contains the right margin of the printer page. */
  var RightMargin: Double
  /** contains the top margin of the printer page. */
  var TopMargin: Double
  /** contains the margin between the columns of printed pages. */
  var VertMargin: Double
}

object PagePrintSettings {
  @scala.inline
  def apply(
    BottomMargin: Double,
    HoriMargin: Double,
    IsLandscape: Boolean,
    LeftMargin: Double,
    PageColumns: Double,
    PageRows: Double,
    RightMargin: Double,
    TopMargin: Double,
    VertMargin: Double
  ): PagePrintSettings = {
    val __obj = js.Dynamic.literal(BottomMargin = BottomMargin.asInstanceOf[js.Any], HoriMargin = HoriMargin.asInstanceOf[js.Any], IsLandscape = IsLandscape.asInstanceOf[js.Any], LeftMargin = LeftMargin.asInstanceOf[js.Any], PageColumns = PageColumns.asInstanceOf[js.Any], PageRows = PageRows.asInstanceOf[js.Any], RightMargin = RightMargin.asInstanceOf[js.Any], TopMargin = TopMargin.asInstanceOf[js.Any], VertMargin = VertMargin.asInstanceOf[js.Any])
    __obj.asInstanceOf[PagePrintSettings]
  }
}

