package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.table.CellAddress
import typings.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to the settings of a consolidation descriptor.
  * @deprecated Deprecated
  * @see com.sun.star.sheet.ConsolidationDescriptor
  */
@js.native
trait XConsolidationDescriptor extends XInterface {
  /** returns the function by which the ranges are consolidated. */
  var Function: GeneralFunction = js.native
  /** returns, whether links to the original data are inserted in the output area or not. */
  var InsertLinks: Boolean = js.native
  /** returns the cell ranges which are consolidated. */
  var Sources: SafeArray[CellRangeAddress] = js.native
  /** returns the position of the top left cell of the cell range where the consolidated data are copied. */
  var StartOutputPosition: CellAddress = js.native
  /** returns, whether column headers from the cell ranges are used to find matching data or not. */
  var UseColumnHeaders: Boolean = js.native
  /** returns, whether row headers from the cell ranges are used to find matching data or not. */
  var UseRowHeaders: Boolean = js.native
  /** returns the function by which the ranges are consolidated. */
  def getFunction(): GeneralFunction = js.native
  /** returns, whether links to the original data are inserted in the output area or not. */
  def getInsertLinks(): Boolean = js.native
  /** returns the cell ranges which are consolidated. */
  def getSources(): SafeArray[CellRangeAddress] = js.native
  /** returns the position of the top left cell of the cell range where the consolidated data are copied. */
  def getStartOutputPosition(): CellAddress = js.native
  /** returns, whether column headers from the cell ranges are used to find matching data or not. */
  def getUseColumnHeaders(): Boolean = js.native
  /** returns, whether row headers from the cell ranges are used to find matching data or not. */
  def getUseRowHeaders(): Boolean = js.native
  /** sets the function by which the ranges are consolidated. */
  def setFunction(nFunction: GeneralFunction): Unit = js.native
  /** specifies if links to the original data are inserted in the output area. */
  def setInsertLinks(bInsertLinks: Boolean): Unit = js.native
  /** sets the cell ranges which are consolidated. */
  def setSources(aSources: SeqEquiv[CellRangeAddress]): Unit = js.native
  /** sets the position of the top left cell of the cell range where the consolidated data are copied. */
  def setStartOutputPosition(aStartOutputPosition: CellAddress): Unit = js.native
  /** specifies if column headers from the cell ranges are used to find matching data. */
  def setUseColumnHeaders(bUseColumnHeaders: Boolean): Unit = js.native
  /** specifies if row headers from the cell ranges are used to find matching data. */
  def setUseRowHeaders(bUseRowHeaders: Boolean): Unit = js.native
}

object XConsolidationDescriptor {
  @scala.inline
  def apply(
    Function: GeneralFunction,
    InsertLinks: Boolean,
    Sources: SafeArray[CellRangeAddress],
    StartOutputPosition: CellAddress,
    UseColumnHeaders: Boolean,
    UseRowHeaders: Boolean,
    acquire: () => Unit,
    getFunction: () => GeneralFunction,
    getInsertLinks: () => Boolean,
    getSources: () => SafeArray[CellRangeAddress],
    getStartOutputPosition: () => CellAddress,
    getUseColumnHeaders: () => Boolean,
    getUseRowHeaders: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setFunction: GeneralFunction => Unit,
    setInsertLinks: Boolean => Unit,
    setSources: SeqEquiv[CellRangeAddress] => Unit,
    setStartOutputPosition: CellAddress => Unit,
    setUseColumnHeaders: Boolean => Unit,
    setUseRowHeaders: Boolean => Unit
  ): XConsolidationDescriptor = {
    val __obj = js.Dynamic.literal(Function = Function.asInstanceOf[js.Any], InsertLinks = InsertLinks.asInstanceOf[js.Any], Sources = Sources.asInstanceOf[js.Any], StartOutputPosition = StartOutputPosition.asInstanceOf[js.Any], UseColumnHeaders = UseColumnHeaders.asInstanceOf[js.Any], UseRowHeaders = UseRowHeaders.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getFunction = js.Any.fromFunction0(getFunction), getInsertLinks = js.Any.fromFunction0(getInsertLinks), getSources = js.Any.fromFunction0(getSources), getStartOutputPosition = js.Any.fromFunction0(getStartOutputPosition), getUseColumnHeaders = js.Any.fromFunction0(getUseColumnHeaders), getUseRowHeaders = js.Any.fromFunction0(getUseRowHeaders), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setFunction = js.Any.fromFunction1(setFunction), setInsertLinks = js.Any.fromFunction1(setInsertLinks), setSources = js.Any.fromFunction1(setSources), setStartOutputPosition = js.Any.fromFunction1(setStartOutputPosition), setUseColumnHeaders = js.Any.fromFunction1(setUseColumnHeaders), setUseRowHeaders = js.Any.fromFunction1(setUseRowHeaders))
    __obj.asInstanceOf[XConsolidationDescriptor]
  }
  @scala.inline
  implicit class XConsolidationDescriptorOps[Self <: XConsolidationDescriptor] (val x: Self) extends AnyVal {
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
    def setFunction(value: GeneralFunction): Self = this.set("Function", value.asInstanceOf[js.Any])
    @scala.inline
    def setInsertLinks(value: Boolean): Self = this.set("InsertLinks", value.asInstanceOf[js.Any])
    @scala.inline
    def setSources(value: SafeArray[CellRangeAddress]): Self = this.set("Sources", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartOutputPosition(value: CellAddress): Self = this.set("StartOutputPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseColumnHeaders(value: Boolean): Self = this.set("UseColumnHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseRowHeaders(value: Boolean): Self = this.set("UseRowHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetFunction(value: () => GeneralFunction): Self = this.set("getFunction", js.Any.fromFunction0(value))
    @scala.inline
    def setGetInsertLinks(value: () => Boolean): Self = this.set("getInsertLinks", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSources(value: () => SafeArray[CellRangeAddress]): Self = this.set("getSources", js.Any.fromFunction0(value))
    @scala.inline
    def setGetStartOutputPosition(value: () => CellAddress): Self = this.set("getStartOutputPosition", js.Any.fromFunction0(value))
    @scala.inline
    def setGetUseColumnHeaders(value: () => Boolean): Self = this.set("getUseColumnHeaders", js.Any.fromFunction0(value))
    @scala.inline
    def setGetUseRowHeaders(value: () => Boolean): Self = this.set("getUseRowHeaders", js.Any.fromFunction0(value))
    @scala.inline
    def setSetFunction(value: GeneralFunction => Unit): Self = this.set("setFunction", js.Any.fromFunction1(value))
    @scala.inline
    def setSetInsertLinks(value: Boolean => Unit): Self = this.set("setInsertLinks", js.Any.fromFunction1(value))
    @scala.inline
    def setSetSources(value: SeqEquiv[CellRangeAddress] => Unit): Self = this.set("setSources", js.Any.fromFunction1(value))
    @scala.inline
    def setSetStartOutputPosition(value: CellAddress => Unit): Self = this.set("setStartOutputPosition", js.Any.fromFunction1(value))
    @scala.inline
    def setSetUseColumnHeaders(value: Boolean => Unit): Self = this.set("setUseColumnHeaders", js.Any.fromFunction1(value))
    @scala.inline
    def setSetUseRowHeaders(value: Boolean => Unit): Self = this.set("setUseRowHeaders", js.Any.fromFunction1(value))
  }
  
}

