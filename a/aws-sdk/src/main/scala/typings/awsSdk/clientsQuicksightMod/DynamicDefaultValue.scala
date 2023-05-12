package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DynamicDefaultValue extends StObject {
  
  /**
    * The column that contains the default value of each user or group.
    */
  var DefaultValueColumn: ColumnIdentifier
  
  /**
    * The column that contains the group name.
    */
  var GroupNameColumn: js.UndefOr[ColumnIdentifier] = js.undefined
  
  /**
    * The column that contains the username.
    */
  var UserNameColumn: js.UndefOr[ColumnIdentifier] = js.undefined
}
object DynamicDefaultValue {
  
  inline def apply(DefaultValueColumn: ColumnIdentifier): DynamicDefaultValue = {
    val __obj = js.Dynamic.literal(DefaultValueColumn = DefaultValueColumn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamicDefaultValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DynamicDefaultValue] (val x: Self) extends AnyVal {
    
    inline def setDefaultValueColumn(value: ColumnIdentifier): Self = StObject.set(x, "DefaultValueColumn", value.asInstanceOf[js.Any])
    
    inline def setGroupNameColumn(value: ColumnIdentifier): Self = StObject.set(x, "GroupNameColumn", value.asInstanceOf[js.Any])
    
    inline def setGroupNameColumnUndefined: Self = StObject.set(x, "GroupNameColumn", js.undefined)
    
    inline def setUserNameColumn(value: ColumnIdentifier): Self = StObject.set(x, "UserNameColumn", value.asInstanceOf[js.Any])
    
    inline def setUserNameColumnUndefined: Self = StObject.set(x, "UserNameColumn", js.undefined)
  }
}
