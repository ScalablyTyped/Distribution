package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnaggregatedField extends StObject {
  
  /**
    * The column that is used in the UnaggregatedField.
    */
  var Column: ColumnIdentifier
  
  /**
    * The custom field ID.
    */
  var FieldId: typings.awsSdk.clientsQuicksightMod.FieldId
  
  /**
    * The format configuration of the field.
    */
  var FormatConfiguration: js.UndefOr[typings.awsSdk.clientsQuicksightMod.FormatConfiguration] = js.undefined
}
object UnaggregatedField {
  
  inline def apply(Column: ColumnIdentifier, FieldId: FieldId): UnaggregatedField = {
    val __obj = js.Dynamic.literal(Column = Column.asInstanceOf[js.Any], FieldId = FieldId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnaggregatedField]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnaggregatedField] (val x: Self) extends AnyVal {
    
    inline def setColumn(value: ColumnIdentifier): Self = StObject.set(x, "Column", value.asInstanceOf[js.Any])
    
    inline def setFieldId(value: FieldId): Self = StObject.set(x, "FieldId", value.asInstanceOf[js.Any])
    
    inline def setFormatConfiguration(value: FormatConfiguration): Self = StObject.set(x, "FormatConfiguration", value.asInstanceOf[js.Any])
    
    inline def setFormatConfigurationUndefined: Self = StObject.set(x, "FormatConfiguration", js.undefined)
  }
}
