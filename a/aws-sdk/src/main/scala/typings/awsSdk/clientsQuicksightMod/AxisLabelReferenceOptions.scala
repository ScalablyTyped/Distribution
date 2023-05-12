package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AxisLabelReferenceOptions extends StObject {
  
  /**
    * The column that the axis label is targeted to.
    */
  var Column: ColumnIdentifier
  
  /**
    * The field that the axis label is targeted to.
    */
  var FieldId: typings.awsSdk.clientsQuicksightMod.FieldId
}
object AxisLabelReferenceOptions {
  
  inline def apply(Column: ColumnIdentifier, FieldId: FieldId): AxisLabelReferenceOptions = {
    val __obj = js.Dynamic.literal(Column = Column.asInstanceOf[js.Any], FieldId = FieldId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisLabelReferenceOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AxisLabelReferenceOptions] (val x: Self) extends AnyVal {
    
    inline def setColumn(value: ColumnIdentifier): Self = StObject.set(x, "Column", value.asInstanceOf[js.Any])
    
    inline def setFieldId(value: FieldId): Self = StObject.set(x, "FieldId", value.asInstanceOf[js.Any])
  }
}
