package typings.awsSdk.clientsAccessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAccessPreviewFindingsResponse extends StObject {
  
  /**
    * A list of access preview findings that match the specified filter criteria.
    */
  var findings: AccessPreviewFindingsList
  
  /**
    * A token used for pagination of results returned.
    */
  var nextToken: js.UndefOr[Token] = js.undefined
}
object ListAccessPreviewFindingsResponse {
  
  inline def apply(findings: AccessPreviewFindingsList): ListAccessPreviewFindingsResponse = {
    val __obj = js.Dynamic.literal(findings = findings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAccessPreviewFindingsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAccessPreviewFindingsResponse] (val x: Self) extends AnyVal {
    
    inline def setFindings(value: AccessPreviewFindingsList): Self = StObject.set(x, "findings", value.asInstanceOf[js.Any])
    
    inline def setFindingsVarargs(value: AccessPreviewFinding*): Self = StObject.set(x, "findings", js.Array(value*))
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
