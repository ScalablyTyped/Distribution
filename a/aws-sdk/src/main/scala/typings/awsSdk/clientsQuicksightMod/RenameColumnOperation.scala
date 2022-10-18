package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenameColumnOperation extends StObject {
  
  /**
    * The name of the column to be renamed.
    */
  var ColumnName: typings.awsSdk.clientsQuicksightMod.ColumnName
  
  /**
    * The new name for the column.
    */
  var NewColumnName: ColumnName
}
object RenameColumnOperation {
  
  inline def apply(ColumnName: ColumnName, NewColumnName: ColumnName): RenameColumnOperation = {
    val __obj = js.Dynamic.literal(ColumnName = ColumnName.asInstanceOf[js.Any], NewColumnName = NewColumnName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenameColumnOperation]
  }
  
  extension [Self <: RenameColumnOperation](x: Self) {
    
    inline def setColumnName(value: ColumnName): Self = StObject.set(x, "ColumnName", value.asInstanceOf[js.Any])
    
    inline def setNewColumnName(value: ColumnName): Self = StObject.set(x, "NewColumnName", value.asInstanceOf[js.Any])
  }
}
