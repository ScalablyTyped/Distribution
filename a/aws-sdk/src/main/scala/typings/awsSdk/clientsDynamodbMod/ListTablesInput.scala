package typings.awsSdk.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTablesInput extends StObject {
  
  /**
    * The first table name that this operation will evaluate. Use the value that was returned for LastEvaluatedTableName in a previous operation, so that you can obtain the next page of results.
    */
  var ExclusiveStartTableName: js.UndefOr[TableName] = js.undefined
  
  /**
    * A maximum number of table names to return. If this parameter is not specified, the limit is 100.
    */
  var Limit: js.UndefOr[ListTablesInputLimit] = js.undefined
}
object ListTablesInput {
  
  inline def apply(): ListTablesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTablesInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTablesInput] (val x: Self) extends AnyVal {
    
    inline def setExclusiveStartTableName(value: TableName): Self = StObject.set(x, "ExclusiveStartTableName", value.asInstanceOf[js.Any])
    
    inline def setExclusiveStartTableNameUndefined: Self = StObject.set(x, "ExclusiveStartTableName", js.undefined)
    
    inline def setLimit(value: ListTablesInputLimit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
  }
}
