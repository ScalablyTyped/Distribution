package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to the settings of a field in a subtotal descriptor.
  * @see com.sun.star.sheet.SubTotalField
  * @see com.sun.star.sheet.SubTotalDescriptor
  */
@js.native
trait XSubTotalField extends XInterface {
  
  /** returns the column by which entries are grouped. */
  var GroupColumn: Double = js.native
  
  /** returns the definitions of which columns should have subtotals added to them. */
  var SubTotalColumns: SafeArray[SubTotalColumn] = js.native
  
  /** returns the column by which entries are grouped. */
  def getGroupColumn(): Double = js.native
  
  /** returns the definitions of which columns should have subtotals added to them. */
  def getSubTotalColumns(): SafeArray[SubTotalColumn] = js.native
  
  /** sets the column by which entries are grouped. */
  def setGroupColumn(nGroupColumn: Double): Unit = js.native
  
  /** sets the definitions of which columns should have subtotals added to them. */
  def setSubTotalColumns(aSubTotalColumns: SeqEquiv[SubTotalColumn]): Unit = js.native
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
    val __obj = js.Dynamic.literal(GroupColumn = GroupColumn.asInstanceOf[js.Any], SubTotalColumns = SubTotalColumns.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getGroupColumn = js.Any.fromFunction0(getGroupColumn), getSubTotalColumns = js.Any.fromFunction0(getSubTotalColumns), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setGroupColumn = js.Any.fromFunction1(setGroupColumn), setSubTotalColumns = js.Any.fromFunction1(setSubTotalColumns))
    __obj.asInstanceOf[XSubTotalField]
  }
  
  @scala.inline
  implicit class XSubTotalFieldOps[Self <: XSubTotalField] (val x: Self) extends AnyVal {
    
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
    def setGroupColumn(value: Double): Self = this.set("GroupColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubTotalColumns(value: SafeArray[SubTotalColumn]): Self = this.set("SubTotalColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetGroupColumn(value: () => Double): Self = this.set("getGroupColumn", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSubTotalColumns(value: () => SafeArray[SubTotalColumn]): Self = this.set("getSubTotalColumns", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetGroupColumn(value: Double => Unit): Self = this.set("setGroupColumn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSubTotalColumns(value: SeqEquiv[SubTotalColumn] => Unit): Self = this.set("setSubTotalColumns", js.Any.fromFunction1(value))
  }
}
