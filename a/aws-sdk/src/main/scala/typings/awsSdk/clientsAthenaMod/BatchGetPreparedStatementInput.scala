package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetPreparedStatementInput extends StObject {
  
  /**
    * A list of prepared statement names to return.
    */
  var PreparedStatementNames: PreparedStatementNameList
  
  /**
    * The name of the workgroup to which the prepared statements belong.
    */
  var WorkGroup: WorkGroupName
}
object BatchGetPreparedStatementInput {
  
  inline def apply(PreparedStatementNames: PreparedStatementNameList, WorkGroup: WorkGroupName): BatchGetPreparedStatementInput = {
    val __obj = js.Dynamic.literal(PreparedStatementNames = PreparedStatementNames.asInstanceOf[js.Any], WorkGroup = WorkGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetPreparedStatementInput]
  }
  
  extension [Self <: BatchGetPreparedStatementInput](x: Self) {
    
    inline def setPreparedStatementNames(value: PreparedStatementNameList): Self = StObject.set(x, "PreparedStatementNames", value.asInstanceOf[js.Any])
    
    inline def setPreparedStatementNamesVarargs(value: StatementName*): Self = StObject.set(x, "PreparedStatementNames", js.Array(value*))
    
    inline def setWorkGroup(value: WorkGroupName): Self = StObject.set(x, "WorkGroup", value.asInstanceOf[js.Any])
  }
}
