package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAuditFindingsResponse extends StObject {
  
  /**
    * The findings (results) of the audit.
    */
  var findings: js.UndefOr[AuditFindings] = js.undefined
  
  /**
    * A token that can be used to retrieve the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListAuditFindingsResponse {
  
  inline def apply(): ListAuditFindingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAuditFindingsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAuditFindingsResponse] (val x: Self) extends AnyVal {
    
    inline def setFindings(value: AuditFindings): Self = StObject.set(x, "findings", value.asInstanceOf[js.Any])
    
    inline def setFindingsUndefined: Self = StObject.set(x, "findings", js.undefined)
    
    inline def setFindingsVarargs(value: AuditFinding*): Self = StObject.set(x, "findings", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
