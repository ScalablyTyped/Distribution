package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreparedStatementSummary extends StObject {
  
  /**
    * The last modified time of the prepared statement.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the prepared statement.
    */
  var StatementName: js.UndefOr[typings.awsSdk.clientsAthenaMod.StatementName] = js.undefined
}
object PreparedStatementSummary {
  
  inline def apply(): PreparedStatementSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreparedStatementSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PreparedStatementSummary] (val x: Self) extends AnyVal {
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setStatementName(value: StatementName): Self = StObject.set(x, "StatementName", value.asInstanceOf[js.Any])
    
    inline def setStatementNameUndefined: Self = StObject.set(x, "StatementName", js.undefined)
  }
}
