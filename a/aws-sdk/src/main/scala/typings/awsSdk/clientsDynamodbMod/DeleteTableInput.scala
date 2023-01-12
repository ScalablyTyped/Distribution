package typings.awsSdk.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTableInput extends StObject {
  
  /**
    * The name of the table to delete.
    */
  var TableName: typings.awsSdk.clientsDynamodbMod.TableName
}
object DeleteTableInput {
  
  inline def apply(TableName: TableName): DeleteTableInput = {
    val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTableInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteTableInput] (val x: Self) extends AnyVal {
    
    inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}
