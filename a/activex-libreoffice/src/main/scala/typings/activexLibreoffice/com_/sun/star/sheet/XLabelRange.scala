package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to the settings of a label range in a spreadsheet document.
  *
  * These can be column or row labels, depending on where they are used.
  * @see com.sun.star.sheet.LabelRange
  */
@js.native
trait XLabelRange extends XInterface {
  
  /** returns the cell range address for which the labels are valid. */
  var DataArea: CellRangeAddress = js.native
  
  /** returns the cell range address that contains the labels. */
  var LabelArea: CellRangeAddress = js.native
  
  /** returns the cell range address for which the labels are valid. */
  def getDataArea(): CellRangeAddress = js.native
  
  /** returns the cell range address that contains the labels. */
  def getLabelArea(): CellRangeAddress = js.native
  
  /** sets the cell range address for which the labels are valid. */
  def setDataArea(aDataArea: CellRangeAddress): Unit = js.native
  
  /** sets the cell range address that contains the labels. */
  def setLabelArea(aLabelArea: CellRangeAddress): Unit = js.native
}
object XLabelRange {
  
  @scala.inline
  def apply(
    DataArea: CellRangeAddress,
    LabelArea: CellRangeAddress,
    acquire: () => Unit,
    getDataArea: () => CellRangeAddress,
    getLabelArea: () => CellRangeAddress,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setDataArea: CellRangeAddress => Unit,
    setLabelArea: CellRangeAddress => Unit
  ): XLabelRange = {
    val __obj = js.Dynamic.literal(DataArea = DataArea.asInstanceOf[js.Any], LabelArea = LabelArea.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getDataArea = js.Any.fromFunction0(getDataArea), getLabelArea = js.Any.fromFunction0(getLabelArea), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDataArea = js.Any.fromFunction1(setDataArea), setLabelArea = js.Any.fromFunction1(setLabelArea))
    __obj.asInstanceOf[XLabelRange]
  }
  
  @scala.inline
  implicit class XLabelRangeOps[Self <: XLabelRange] (val x: Self) extends AnyVal {
    
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
    def setDataArea(value: CellRangeAddress): Self = this.set("DataArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelArea(value: CellRangeAddress): Self = this.set("LabelArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDataArea(value: () => CellRangeAddress): Self = this.set("getDataArea", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLabelArea(value: () => CellRangeAddress): Self = this.set("getLabelArea", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetDataArea(value: CellRangeAddress => Unit): Self = this.set("setDataArea", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetLabelArea(value: CellRangeAddress => Unit): Self = this.set("setLabelArea", js.Any.fromFunction1(value))
  }
}
