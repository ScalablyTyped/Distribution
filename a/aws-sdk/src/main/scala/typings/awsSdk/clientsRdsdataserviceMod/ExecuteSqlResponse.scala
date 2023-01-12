package typings.awsSdk.clientsRdsdataserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecuteSqlResponse extends StObject {
  
  /**
    * The results of the SQL statement or statements.
    */
  var sqlStatementResults: js.UndefOr[SqlStatementResults] = js.undefined
}
object ExecuteSqlResponse {
  
  inline def apply(): ExecuteSqlResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecuteSqlResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExecuteSqlResponse] (val x: Self) extends AnyVal {
    
    inline def setSqlStatementResults(value: SqlStatementResults): Self = StObject.set(x, "sqlStatementResults", value.asInstanceOf[js.Any])
    
    inline def setSqlStatementResultsUndefined: Self = StObject.set(x, "sqlStatementResults", js.undefined)
    
    inline def setSqlStatementResultsVarargs(value: SqlStatementResult*): Self = StObject.set(x, "sqlStatementResults", js.Array(value*))
  }
}
