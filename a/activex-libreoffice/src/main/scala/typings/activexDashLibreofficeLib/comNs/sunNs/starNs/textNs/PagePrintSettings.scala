package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** These properties describe the way the {@link XPagePrintable} interface prints the page on one printer page. */
trait PagePrintSettings extends js.Object {
  /** contains the right margin of the printer page. */
  var BottomMargin: scala.Double
  /** contains the margin between the rows of printed pages. */
  var HoriMargin: scala.Double
  /** defines if the printer page is used in landscape format. */
  var IsLandscape: scala.Boolean
  /** contains the left margin of the printer page. */
  var LeftMargin: scala.Double
  /** contains the number of pages per printed row of pages. */
  var PageColumns: scala.Double
  /** contains the number of pages per printed column of pages. */
  var PageRows: scala.Double
  /** contains the right margin of the printer page. */
  var RightMargin: scala.Double
  /** contains the top margin of the printer page. */
  var TopMargin: scala.Double
  /** contains the margin between the columns of printed pages. */
  var VertMargin: scala.Double
}

object PagePrintSettings {
  @scala.inline
  def apply(
    BottomMargin: scala.Double,
    HoriMargin: scala.Double,
    IsLandscape: scala.Boolean,
    LeftMargin: scala.Double,
    PageColumns: scala.Double,
    PageRows: scala.Double,
    RightMargin: scala.Double,
    TopMargin: scala.Double,
    VertMargin: scala.Double
  ): PagePrintSettings = {
    val __obj = js.Dynamic.literal(BottomMargin = BottomMargin, HoriMargin = HoriMargin, IsLandscape = IsLandscape, LeftMargin = LeftMargin, PageColumns = PageColumns, PageRows = PageRows, RightMargin = RightMargin, TopMargin = TopMargin, VertMargin = VertMargin)
  
    __obj.asInstanceOf[PagePrintSettings]
  }
}

