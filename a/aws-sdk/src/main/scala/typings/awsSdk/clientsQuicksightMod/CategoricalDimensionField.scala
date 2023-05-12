package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CategoricalDimensionField extends StObject {
  
  /**
    * The column that is used in the CategoricalDimensionField.
    */
  var Column: ColumnIdentifier
  
  /**
    * The custom field ID.
    */
  var FieldId: typings.awsSdk.clientsQuicksightMod.FieldId
  
  /**
    * The format configuration of the field.
    */
  var FormatConfiguration: js.UndefOr[StringFormatConfiguration] = js.undefined
  
  /**
    * The custom hierarchy ID.
    */
  var HierarchyId: js.UndefOr[typings.awsSdk.clientsQuicksightMod.HierarchyId] = js.undefined
}
object CategoricalDimensionField {
  
  inline def apply(Column: ColumnIdentifier, FieldId: FieldId): CategoricalDimensionField = {
    val __obj = js.Dynamic.literal(Column = Column.asInstanceOf[js.Any], FieldId = FieldId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CategoricalDimensionField]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CategoricalDimensionField] (val x: Self) extends AnyVal {
    
    inline def setColumn(value: ColumnIdentifier): Self = StObject.set(x, "Column", value.asInstanceOf[js.Any])
    
    inline def setFieldId(value: FieldId): Self = StObject.set(x, "FieldId", value.asInstanceOf[js.Any])
    
    inline def setFormatConfiguration(value: StringFormatConfiguration): Self = StObject.set(x, "FormatConfiguration", value.asInstanceOf[js.Any])
    
    inline def setFormatConfigurationUndefined: Self = StObject.set(x, "FormatConfiguration", js.undefined)
    
    inline def setHierarchyId(value: HierarchyId): Self = StObject.set(x, "HierarchyId", value.asInstanceOf[js.Any])
    
    inline def setHierarchyIdUndefined: Self = StObject.set(x, "HierarchyId", js.undefined)
  }
}
