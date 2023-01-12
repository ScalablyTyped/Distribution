package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutItemInput extends StObject {
  
  /**
    * The table where the message data will be written.
    */
  var tableName: TableName
}
object PutItemInput {
  
  inline def apply(tableName: TableName): PutItemInput = {
    val __obj = js.Dynamic.literal(tableName = tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutItemInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutItemInput] (val x: Self) extends AnyVal {
    
    inline def setTableName(value: TableName): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
  }
}
