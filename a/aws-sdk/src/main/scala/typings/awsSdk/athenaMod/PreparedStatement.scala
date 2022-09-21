package typings.awsSdk.athenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreparedStatement extends StObject {
  
  /**
    * The description of the prepared statement.
    */
  var Description: js.UndefOr[DescriptionString] = js.undefined
  
  /**
    * The last modified time of the prepared statement.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The query string for the prepared statement.
    */
  var QueryStatement: js.UndefOr[QueryString] = js.undefined
  
  /**
    * The name of the prepared statement.
    */
  var StatementName: js.UndefOr[typings.awsSdk.athenaMod.StatementName] = js.undefined
  
  /**
    * The name of the workgroup to which the prepared statement belongs.
    */
  var WorkGroupName: js.UndefOr[typings.awsSdk.athenaMod.WorkGroupName] = js.undefined
}
object PreparedStatement {
  
  inline def apply(): PreparedStatement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreparedStatement]
  }
  
  extension [Self <: PreparedStatement](x: Self) {
    
    inline def setDescription(value: DescriptionString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setQueryStatement(value: QueryString): Self = StObject.set(x, "QueryStatement", value.asInstanceOf[js.Any])
    
    inline def setQueryStatementUndefined: Self = StObject.set(x, "QueryStatement", js.undefined)
    
    inline def setStatementName(value: StatementName): Self = StObject.set(x, "StatementName", value.asInstanceOf[js.Any])
    
    inline def setStatementNameUndefined: Self = StObject.set(x, "StatementName", js.undefined)
    
    inline def setWorkGroupName(value: WorkGroupName): Self = StObject.set(x, "WorkGroupName", value.asInstanceOf[js.Any])
    
    inline def setWorkGroupNameUndefined: Self = StObject.set(x, "WorkGroupName", js.undefined)
  }
}
