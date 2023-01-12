package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPreparedStatementOutput extends StObject {
  
  /**
    * The name of the prepared statement that was retrieved.
    */
  var PreparedStatement: js.UndefOr[typings.awsSdk.clientsAthenaMod.PreparedStatement] = js.undefined
}
object GetPreparedStatementOutput {
  
  inline def apply(): GetPreparedStatementOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPreparedStatementOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetPreparedStatementOutput] (val x: Self) extends AnyVal {
    
    inline def setPreparedStatement(value: PreparedStatement): Self = StObject.set(x, "PreparedStatement", value.asInstanceOf[js.Any])
    
    inline def setPreparedStatementUndefined: Self = StObject.set(x, "PreparedStatement", js.undefined)
  }
}
