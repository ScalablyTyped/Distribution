package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPreparedStatementInput extends StObject {
  
  /**
    * The name of the prepared statement to retrieve.
    */
  var StatementName: typings.awsSdk.clientsAthenaMod.StatementName
  
  /**
    * The workgroup to which the statement to be retrieved belongs.
    */
  var WorkGroup: WorkGroupName
}
object GetPreparedStatementInput {
  
  inline def apply(StatementName: StatementName, WorkGroup: WorkGroupName): GetPreparedStatementInput = {
    val __obj = js.Dynamic.literal(StatementName = StatementName.asInstanceOf[js.Any], WorkGroup = WorkGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPreparedStatementInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetPreparedStatementInput] (val x: Self) extends AnyVal {
    
    inline def setStatementName(value: StatementName): Self = StObject.set(x, "StatementName", value.asInstanceOf[js.Any])
    
    inline def setWorkGroup(value: WorkGroupName): Self = StObject.set(x, "WorkGroup", value.asInstanceOf[js.Any])
  }
}
