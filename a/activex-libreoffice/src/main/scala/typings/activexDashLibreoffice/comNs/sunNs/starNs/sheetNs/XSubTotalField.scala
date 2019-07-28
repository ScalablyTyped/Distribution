package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to the settings of a field in a subtotal descriptor.
  * @see com.sun.star.sheet.SubTotalField
  * @see com.sun.star.sheet.SubTotalDescriptor
  */
trait XSubTotalField extends XInterface {
  /** returns the column by which entries are grouped. */
  var GroupColumn: Double
  /** returns the definitions of which columns should have subtotals added to them. */
  var SubTotalColumns: SafeArray[SubTotalColumn]
  /** returns the column by which entries are grouped. */
  def getGroupColumn(): Double
  /** returns the definitions of which columns should have subtotals added to them. */
  def getSubTotalColumns(): SafeArray[SubTotalColumn]
  /** sets the column by which entries are grouped. */
  def setGroupColumn(nGroupColumn: Double): Unit
  /** sets the definitions of which columns should have subtotals added to them. */
  def setSubTotalColumns(aSubTotalColumns: SeqEquiv[SubTotalColumn]): Unit
}

object XSubTotalField {
  @scala.inline
  def apply(
    GroupColumn: Double,
    SubTotalColumns: SafeArray[SubTotalColumn],
    acquire: () => Unit,
    getGroupColumn: () => Double,
    getSubTotalColumns: () => SafeArray[SubTotalColumn],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setGroupColumn: Double => Unit,
    setSubTotalColumns: SeqEquiv[SubTotalColumn] => Unit
  ): XSubTotalField = {
    val __obj = js.Dynamic.literal(GroupColumn = GroupColumn, SubTotalColumns = SubTotalColumns, acquire = js.Any.fromFunction0(acquire), getGroupColumn = js.Any.fromFunction0(getGroupColumn), getSubTotalColumns = js.Any.fromFunction0(getSubTotalColumns), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setGroupColumn = js.Any.fromFunction1(setGroupColumn), setSubTotalColumns = js.Any.fromFunction1(setSubTotalColumns))
  
    __obj.asInstanceOf[XSubTotalField]
  }
}

