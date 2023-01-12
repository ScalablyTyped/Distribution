package typings.activexLibreoffice.com_.sun.star.sheet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
trait XDataPilotDataLayoutFieldSupplier extends StObject {
  
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
object XDataPilotDataLayoutFieldSupplier {
  
  inline def apply(DataLayoutField: XDataPilotField, getDataLayoutField: () => XDataPilotField): XDataPilotDataLayoutFieldSupplier = {
    val __obj = js.Dynamic.literal(DataLayoutField = DataLayoutField.asInstanceOf[js.Any], getDataLayoutField = js.Any.fromFunction0(getDataLayoutField))
    __obj.asInstanceOf[XDataPilotDataLayoutFieldSupplier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XDataPilotDataLayoutFieldSupplier] (val x: Self) extends AnyVal {
    
    inline def setDataLayoutField(value: XDataPilotField): Self = StObject.set(x, "DataLayoutField", value.asInstanceOf[js.Any])
    
    inline def setGetDataLayoutField(value: () => XDataPilotField): Self = StObject.set(x, "getDataLayoutField", js.Any.fromFunction0(value))
  }
}
