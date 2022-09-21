package typings.awsSdk.athenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetPreparedStatementOutput extends StObject {
  
  /**
    * The list of prepared statements returned.
    */
  var PreparedStatements: js.UndefOr[PreparedStatementDetailsList] = js.undefined
  
  /**
    * A list of one or more prepared statements that were requested but could not be returned.
    */
  var UnprocessedPreparedStatementNames: js.UndefOr[UnprocessedPreparedStatementNameList] = js.undefined
}
object BatchGetPreparedStatementOutput {
  
  inline def apply(): BatchGetPreparedStatementOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetPreparedStatementOutput]
  }
  
  extension [Self <: BatchGetPreparedStatementOutput](x: Self) {
    
    inline def setPreparedStatements(value: PreparedStatementDetailsList): Self = StObject.set(x, "PreparedStatements", value.asInstanceOf[js.Any])
    
    inline def setPreparedStatementsUndefined: Self = StObject.set(x, "PreparedStatements", js.undefined)
    
    inline def setPreparedStatementsVarargs(value: PreparedStatement*): Self = StObject.set(x, "PreparedStatements", js.Array(value*))
    
    inline def setUnprocessedPreparedStatementNames(value: UnprocessedPreparedStatementNameList): Self = StObject.set(x, "UnprocessedPreparedStatementNames", value.asInstanceOf[js.Any])
    
    inline def setUnprocessedPreparedStatementNamesUndefined: Self = StObject.set(x, "UnprocessedPreparedStatementNames", js.undefined)
    
    inline def setUnprocessedPreparedStatementNamesVarargs(value: UnprocessedPreparedStatementName*): Self = StObject.set(x, "UnprocessedPreparedStatementNames", js.Array(value*))
  }
}
