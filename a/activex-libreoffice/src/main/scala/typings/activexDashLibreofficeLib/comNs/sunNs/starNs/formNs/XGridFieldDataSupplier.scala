package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait XGridFieldDataSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * retrieves the actual column data for the given row
    *
    * If a column does not support the requested type, `NULL` is returned at the respective position.
    * @see XGridFieldDataSupplier.queryFieldDataType
    */
  def queryFieldData(nRow: scala.Double, xType: activexDashLibreofficeLib.`type`): activexDashInteropLib.SafeArray[_]
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
  def queryFieldDataType(xType: activexDashLibreofficeLib.`type`): activexDashInteropLib.SafeArray[scala.Boolean]
}

object XGridFieldDataSupplier {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    queryFieldData: js.Function2[scala.Double, activexDashLibreofficeLib.`type`, activexDashInteropLib.SafeArray[_]],
    queryFieldDataType: js.Function1[activexDashLibreofficeLib.`type`, activexDashInteropLib.SafeArray[scala.Boolean]],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XGridFieldDataSupplier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("queryFieldData")(queryFieldData)
    __obj.updateDynamic("queryFieldDataType")(queryFieldDataType)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XGridFieldDataSupplier]
  }
}

