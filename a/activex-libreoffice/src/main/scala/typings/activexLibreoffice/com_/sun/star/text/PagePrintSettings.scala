package typings.activexLibreoffice.com_.sun.star.text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** These properties describe the way the {@link XPagePrintable} interface prints the page on one printer page. */
@js.native
trait PagePrintSettings extends js.Object {
  /** contains the right margin of the printer page. */
  var BottomMargin: Double = js.native
  /** contains the margin between the rows of printed pages. */
  var HoriMargin: Double = js.native
  /** defines if the printer page is used in landscape format. */
  var IsLandscape: Boolean = js.native
  /** contains the left margin of the printer page. */
  var LeftMargin: Double = js.native
  /** contains the number of pages per printed row of pages. */
  var PageColumns: Double = js.native
  /** contains the number of pages per printed column of pages. */
  var PageRows: Double = js.native
  /** contains the right margin of the printer page. */
  var RightMargin: Double = js.native
  /** contains the top margin of the printer page. */
  var TopMargin: Double = js.native
  /** contains the margin between the columns of printed pages. */
  var VertMargin: Double = js.native
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
  @scala.inline
  implicit class PagePrintSettingsOps[Self <: PagePrintSettings] (val x: Self) extends AnyVal {
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
    def setBottomMargin(value: Double): Self = this.set("BottomMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def setHoriMargin(value: Double): Self = this.set("HoriMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsLandscape(value: Boolean): Self = this.set("IsLandscape", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeftMargin(value: Double): Self = this.set("LeftMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageColumns(value: Double): Self = this.set("PageColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageRows(value: Double): Self = this.set("PageRows", value.asInstanceOf[js.Any])
    @scala.inline
    def setRightMargin(value: Double): Self = this.set("RightMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopMargin(value: Double): Self = this.set("TopMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def setVertMargin(value: Double): Self = this.set("VertMargin", value.asInstanceOf[js.Any])
  }
  
}

