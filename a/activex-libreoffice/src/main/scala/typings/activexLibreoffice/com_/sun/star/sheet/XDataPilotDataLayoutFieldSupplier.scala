package typings.activexLibreoffice.com_.sun.star.sheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides access to the {@link DataPilotField} used to layout multiple data fields.
  *
  * This data field can be inserted into the rows dimension or columns dimension by changing its {@link DataPilotField.Orientation} property. This
  * interface can be used to access the data layout field before multiple data fields are inserted into the DataPilot table. It remains invisible as long
  * as the DataPilot table contains at most one data field.
  * @see com.sun.star.sheet.DataPilotDescriptor
  * @see com.sun.star.sheet.DataPilotTable
  */
@js.native
trait XDataPilotDataLayoutFieldSupplier extends js.Object {
  
  /**
    * Returns the {@link DataPilotField} used to layout multiple data fields.
    *
    * If the field does not exist yet, it will be created. It is possible to insert this field into the rows or columns dimension by changing its {@link
    * DataPilotField.Orientation} property.
    */
  val DataLayoutField: XDataPilotField = js.native
  
  /**
    * Returns the {@link DataPilotField} used to layout multiple data fields.
    *
    * If the field does not exist yet, it will be created. It is possible to insert this field into the rows or columns dimension by changing its {@link
    * DataPilotField.Orientation} property.
    */
  def getDataLayoutField(): XDataPilotField = js.native
}
object XDataPilotDataLayoutFieldSupplier {
  
  @scala.inline
  def apply(DataLayoutField: XDataPilotField, getDataLayoutField: () => XDataPilotField): XDataPilotDataLayoutFieldSupplier = {
    val __obj = js.Dynamic.literal(DataLayoutField = DataLayoutField.asInstanceOf[js.Any], getDataLayoutField = js.Any.fromFunction0(getDataLayoutField))
    __obj.asInstanceOf[XDataPilotDataLayoutFieldSupplier]
  }
  
  @scala.inline
  implicit class XDataPilotDataLayoutFieldSupplierOps[Self <: XDataPilotDataLayoutFieldSupplier] (val x: Self) extends AnyVal {
    
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
    def setDataLayoutField(value: XDataPilotField): Self = this.set("DataLayoutField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDataLayoutField(value: () => XDataPilotField): Self = this.set("getDataLayoutField", js.Any.fromFunction0(value))
  }
}
