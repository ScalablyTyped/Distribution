package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateDimensionField extends StObject {
  
  /**
    * The column that is used in the DateDimensionField.
    */
  var Column: ColumnIdentifier
  
  /**
    * The date granularity of the DateDimensionField. Choose one of the following options:    YEAR     QUARTER     MONTH     WEEK     DAY     HOUR     MINUTE     SECOND     MILLISECOND   
    */
  var DateGranularity: js.UndefOr[TimeGranularity] = js.undefined
  
  /**
    * The custom field ID.
    */
  var FieldId: typings.awsSdk.clientsQuicksightMod.FieldId
  
  /**
    * The format configuration of the field.
    */
  var FormatConfiguration: js.UndefOr[DateTimeFormatConfiguration] = js.undefined
  
  /**
    * The custom hierarchy ID.
    */
  var HierarchyId: js.UndefOr[typings.awsSdk.clientsQuicksightMod.HierarchyId] = js.undefined
}
object DateDimensionField {
  
  inline def apply(Column: ColumnIdentifier, FieldId: FieldId): DateDimensionField = {
    val __obj = js.Dynamic.literal(Column = Column.asInstanceOf[js.Any], FieldId = FieldId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateDimensionField]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DateDimensionField] (val x: Self) extends AnyVal {
    
    inline def setColumn(value: ColumnIdentifier): Self = StObject.set(x, "Column", value.asInstanceOf[js.Any])
    
    inline def setDateGranularity(value: TimeGranularity): Self = StObject.set(x, "DateGranularity", value.asInstanceOf[js.Any])
    
    inline def setDateGranularityUndefined: Self = StObject.set(x, "DateGranularity", js.undefined)
    
    inline def setFieldId(value: FieldId): Self = StObject.set(x, "FieldId", value.asInstanceOf[js.Any])
    
    inline def setFormatConfiguration(value: DateTimeFormatConfiguration): Self = StObject.set(x, "FormatConfiguration", value.asInstanceOf[js.Any])
    
    inline def setFormatConfigurationUndefined: Self = StObject.set(x, "FormatConfiguration", js.undefined)
    
    inline def setHierarchyId(value: HierarchyId): Self = StObject.set(x, "HierarchyId", value.asInstanceOf[js.Any])
    
    inline def setHierarchyIdUndefined: Self = StObject.set(x, "HierarchyId", js.undefined)
  }
}
