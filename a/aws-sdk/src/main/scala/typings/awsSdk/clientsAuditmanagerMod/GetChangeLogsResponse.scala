package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetChangeLogsResponse extends StObject {
  
  /**
    * The list of user activity for the control. 
    */
  var changeLogs: js.UndefOr[ChangeLogs] = js.undefined
  
  /**
    * The pagination token that's used to fetch the next set of results. 
    */
  var nextToken: js.UndefOr[Token] = js.undefined
}
object GetChangeLogsResponse {
  
  inline def apply(): GetChangeLogsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetChangeLogsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetChangeLogsResponse] (val x: Self) extends AnyVal {
    
    inline def setChangeLogs(value: ChangeLogs): Self = StObject.set(x, "changeLogs", value.asInstanceOf[js.Any])
    
    inline def setChangeLogsUndefined: Self = StObject.set(x, "changeLogs", js.undefined)
    
    inline def setChangeLogsVarargs(value: ChangeLog*): Self = StObject.set(x, "changeLogs", js.Array(value*))
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
