package typings.activexLibreoffice.com_.sun.star.table

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to the settings of a chart object in a table or spreadsheet.
  * @see com.sun.star.table.TableChart
  */
@js.native
trait XTableChart extends XInterface {
  /** returns, whether the cells of the topmost row of the source data are interpreted as column headers. */
  var HasColumnHeaders: Boolean = js.native
  /** returns, whether the cells of the leftmost column of the source data are interpreted as row headers. */
  var HasRowHeaders: Boolean = js.native
  /** returns the cell ranges that contain the data for the chart. */
  var Ranges: SafeArray[CellRangeAddress] = js.native
  /** returns, whether the cells of the topmost row of the source data are interpreted as column headers. */
  def getHasColumnHeaders(): Boolean = js.native
  /** returns, whether the cells of the leftmost column of the source data are interpreted as row headers. */
  def getHasRowHeaders(): Boolean = js.native
  /** returns the cell ranges that contain the data for the chart. */
  def getRanges(): SafeArray[CellRangeAddress] = js.native
  /** specifies whether the cells of the topmost row of the source data are interpreted as column headers. */
  def setHasColumnHeaders(bHasColumnHeaders: Boolean): Unit = js.native
  /** specifies whether the cells of the leftmost column of the source data are interpreted as row headers. */
  def setHasRowHeaders(bHasRowHeaders: Boolean): Unit = js.native
  /** sets the cell ranges that contain the data for the chart. */
  def setRanges(aRanges: SeqEquiv[CellRangeAddress]): Unit = js.native
}

object XTableChart {
  @scala.inline
  def apply(
    HasColumnHeaders: Boolean,
    HasRowHeaders: Boolean,
    Ranges: SafeArray[CellRangeAddress],
    acquire: () => Unit,
    getHasColumnHeaders: () => Boolean,
    getHasRowHeaders: () => Boolean,
    getRanges: () => SafeArray[CellRangeAddress],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setHasColumnHeaders: Boolean => Unit,
    setHasRowHeaders: Boolean => Unit,
    setRanges: SeqEquiv[CellRangeAddress] => Unit
  ): XTableChart = {
    val __obj = js.Dynamic.literal(HasColumnHeaders = HasColumnHeaders.asInstanceOf[js.Any], HasRowHeaders = HasRowHeaders.asInstanceOf[js.Any], Ranges = Ranges.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getHasColumnHeaders = js.Any.fromFunction0(getHasColumnHeaders), getHasRowHeaders = js.Any.fromFunction0(getHasRowHeaders), getRanges = js.Any.fromFunction0(getRanges), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setHasColumnHeaders = js.Any.fromFunction1(setHasColumnHeaders), setHasRowHeaders = js.Any.fromFunction1(setHasRowHeaders), setRanges = js.Any.fromFunction1(setRanges))
    __obj.asInstanceOf[XTableChart]
  }
  @scala.inline
  implicit class XTableChartOps[Self <: XTableChart] (val x: Self) extends AnyVal {
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
    def setHasColumnHeaders(value: Boolean): Self = this.set("HasColumnHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasRowHeaders(value: Boolean): Self = this.set("HasRowHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def setRanges(value: SafeArray[CellRangeAddress]): Self = this.set("Ranges", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetHasColumnHeaders(value: () => Boolean): Self = this.set("getHasColumnHeaders", js.Any.fromFunction0(value))
    @scala.inline
    def setGetHasRowHeaders(value: () => Boolean): Self = this.set("getHasRowHeaders", js.Any.fromFunction0(value))
    @scala.inline
    def setGetRanges(value: () => SafeArray[CellRangeAddress]): Self = this.set("getRanges", js.Any.fromFunction0(value))
    @scala.inline
    def setSetHasColumnHeaders(value: Boolean => Unit): Self = this.set("setHasColumnHeaders", js.Any.fromFunction1(value))
    @scala.inline
    def setSetHasRowHeaders(value: Boolean => Unit): Self = this.set("setHasRowHeaders", js.Any.fromFunction1(value))
    @scala.inline
    def setSetRanges(value: SeqEquiv[CellRangeAddress] => Unit): Self = this.set("setRanges", js.Any.fromFunction1(value))
  }
  
}

