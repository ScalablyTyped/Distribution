package typings.awsSdk.athenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePreparedStatementInput extends StObject {
  
  /**
    * The name of the prepared statement to delete.
    */
  var StatementName: typings.awsSdk.athenaMod.StatementName
  
  /**
    * The workgroup to which the statement to be deleted belongs.
    */
  var WorkGroup: WorkGroupName
}
object DeletePreparedStatementInput {
  
  inline def apply(StatementName: StatementName, WorkGroup: WorkGroupName): DeletePreparedStatementInput = {
    val __obj = js.Dynamic.literal(StatementName = StatementName.asInstanceOf[js.Any], WorkGroup = WorkGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePreparedStatementInput]
  }
  
  extension [Self <: DeletePreparedStatementInput](x: Self) {
    
    inline def setStatementName(value: StatementName): Self = StObject.set(x, "StatementName", value.asInstanceOf[js.Any])
    
    inline def setWorkGroup(value: WorkGroupName): Self = StObject.set(x, "WorkGroup", value.asInstanceOf[js.Any])
  }
}
