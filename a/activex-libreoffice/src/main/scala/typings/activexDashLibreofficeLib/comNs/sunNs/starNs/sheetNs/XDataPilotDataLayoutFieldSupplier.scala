package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides access to the {@link DataPilotField} used to layout multiple data fields.
  *
  * This data field can be inserted into the rows dimension or columns dimension by changing its {@link DataPilotField.Orientation} property. This
  * interface can be used to access the data layout field before multiple data fields are inserted into the DataPilot table. It remains invisible as long
  * as the DataPilot table contains at most one data field.
  * @see com.sun.star.sheet.DataPilotDescriptor
  * @see com.sun.star.sheet.DataPilotTable
  */
trait XDataPilotDataLayoutFieldSupplier extends js.Object {
  /**
    * Returns the {@link DataPilotField} used to layout multiple data fields.
    *
    * If the field does not exist yet, it will be created. It is possible to insert this field into the rows or columns dimension by changing its {@link
    * DataPilotField.Orientation} property.
    */
  val DataLayoutField: XDataPilotField
  /**
    * Returns the {@link DataPilotField} used to layout multiple data fields.
    *
    * If the field does not exist yet, it will be created. It is possible to insert this field into the rows or columns dimension by changing its {@link
    * DataPilotField.Orientation} property.
    */
  def getDataLayoutField(): XDataPilotField
}

