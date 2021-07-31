package typings.awsSdk.accessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFindingsResponse extends StObject {
  
  /**
    * A list of findings retrieved from the analyzer that match the filter criteria specified, if any.
    */
  var findings: FindingsList
  
  /**
    * A token used for pagination of results returned.
    */
  var nextToken: js.UndefOr[Token] = js.undefined
}
object ListFindingsResponse {
  
  @scala.inline
  def apply(findings: FindingsList): ListFindingsResponse = {
    val __obj = js.Dynamic.literal(findings = findings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFindingsResponse]
  }
  
  @scala.inline
  implicit class ListFindingsResponseMutableBuilder[Self <: ListFindingsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFindings(value: FindingsList): Self = StObject.set(x, "findings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindingsVarargs(value: FindingSummary*): Self = StObject.set(x, "findings", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: Token): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
