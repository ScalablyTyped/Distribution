package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePreparedStatementInput extends StObject {
  
  /**
    * The description of the prepared statement.
    */
  var Description: js.UndefOr[DescriptionString] = js.undefined
  
  /**
    * The query string for the prepared statement.
    */
  var QueryStatement: QueryString
  
  /**
    * The name of the prepared statement.
    */
  var StatementName: typings.awsSdk.clientsAthenaMod.StatementName
  
  /**
    * The workgroup for the prepared statement.
    */
  var WorkGroup: WorkGroupName
}
object UpdatePreparedStatementInput {
  
  inline def apply(QueryStatement: QueryString, StatementName: StatementName, WorkGroup: WorkGroupName): UpdatePreparedStatementInput = {
    val __obj = js.Dynamic.literal(QueryStatement = QueryStatement.asInstanceOf[js.Any], StatementName = StatementName.asInstanceOf[js.Any], WorkGroup = WorkGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePreparedStatementInput]
  }
  
  extension [Self <: UpdatePreparedStatementInput](x: Self) {
    
    inline def setDescription(value: DescriptionString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setQueryStatement(value: QueryString): Self = StObject.set(x, "QueryStatement", value.asInstanceOf[js.Any])
    
    inline def setStatementName(value: StatementName): Self = StObject.set(x, "StatementName", value.asInstanceOf[js.Any])
    
    inline def setWorkGroup(value: WorkGroupName): Self = StObject.set(x, "WorkGroup", value.asInstanceOf[js.Any])
  }
}
