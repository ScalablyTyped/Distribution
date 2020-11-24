package typings.activexLibreoffice.com_.sun.star.form

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to the data of a GridControl
  *
  * You can retrieve the data type information and the data in a row.
  *
  * This interface allows to retrieve data even for rows which are not current, which is quite useful, as normally, you can't affect the current row in a
  * grid control without moving the cursor of the underlying {@link com.sun.star.form.component.DataForm} .
  * @deprecated Deprecated
  * @see XGrid
  * @see com.sun.star.form.control.GridControl
  * @see com.sun.star.form.component.GridControl
  */
@js.native
trait XGridFieldDataSupplier extends XInterface {
  
  /**
    * retrieves the actual column data for the given row
    *
    * If a column does not support the requested type, `NULL` is returned at the respective position.
    * @see XGridFieldDataSupplier.queryFieldDataType
    */
  def queryFieldData(nRow: Double, xType: `type`): SafeArray[_] = js.native
  
  /**
    * checks whether or not the content of the grid's columns can be retrieved in the requested format.
    *
    * Not every cell content can be retrieved in every representation. For example, in a text column, you usually won't be able to retrieve the content as
    * double. ;  To check if the type you need is supported by the columns, use this method.
    * @returns A sequence of boolean flags. Each flag corresponds to the respective column, and `TRUE` indicates that the column content can be retrieved in the
    * @see XGridColumnFactory
    * @see DataAwareControlModel
    * @see XGridFieldDataSupplier.queryFieldData
    */
  def queryFieldDataType(xType: `type`): SafeArray[Boolean] = js.native
}
object XGridFieldDataSupplier {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryFieldData: (Double, `type`) => SafeArray[_],
    queryFieldDataType: `type` => SafeArray[Boolean],
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XGridFieldDataSupplier = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryFieldData = js.Any.fromFunction2(queryFieldData), queryFieldDataType = js.Any.fromFunction1(queryFieldDataType), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XGridFieldDataSupplier]
  }
  
  @scala.inline
  implicit class XGridFieldDataSupplierOps[Self <: XGridFieldDataSupplier] (val x: Self) extends AnyVal {
    
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
    def setQueryFieldData(value: (Double, `type`) => SafeArray[_]): Self = this.set("queryFieldData", js.Any.fromFunction2(value))
    
    @scala.inline
    def setQueryFieldDataType(value: `type` => SafeArray[Boolean]): Self = this.set("queryFieldDataType", js.Any.fromFunction1(value))
  }
}
