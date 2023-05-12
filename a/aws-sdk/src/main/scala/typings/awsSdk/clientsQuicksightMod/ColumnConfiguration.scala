package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnConfiguration extends StObject {
  
  /**
    * The column.
    */
  var Column: ColumnIdentifier
  
  /**
    * The format configuration of a column.
    */
  var FormatConfiguration: js.UndefOr[typings.awsSdk.clientsQuicksightMod.FormatConfiguration] = js.undefined
  
  /**
    * The role of the column.
    */
  var Role: js.UndefOr[ColumnRole] = js.undefined
}
object ColumnConfiguration {
  
  inline def apply(Column: ColumnIdentifier): ColumnConfiguration = {
    val __obj = js.Dynamic.literal(Column = Column.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColumnConfiguration] (val x: Self) extends AnyVal {
    
    inline def setColumn(value: ColumnIdentifier): Self = StObject.set(x, "Column", value.asInstanceOf[js.Any])
    
    inline def setFormatConfiguration(value: FormatConfiguration): Self = StObject.set(x, "FormatConfiguration", value.asInstanceOf[js.Any])
    
    inline def setFormatConfigurationUndefined: Self = StObject.set(x, "FormatConfiguration", js.undefined)
    
    inline def setRole(value: ColumnRole): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "Role", js.undefined)
  }
}
