package typings.awsSdk.accessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidatePolicyResponse extends StObject {
  
  /**
    * The list of findings in a policy returned by IAM Access Analyzer based on its suite of policy checks.
    */
  var findings: ValidatePolicyFindingList
  
  /**
    * A token used for pagination of results returned.
    */
  var nextToken: js.UndefOr[Token] = js.undefined
}
object ValidatePolicyResponse {
  
  inline def apply(findings: ValidatePolicyFindingList): ValidatePolicyResponse = {
    val __obj = js.Dynamic.literal(findings = findings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidatePolicyResponse]
  }
  
  extension [Self <: ValidatePolicyResponse](x: Self) {
    
    inline def setFindings(value: ValidatePolicyFindingList): Self = StObject.set(x, "findings", value.asInstanceOf[js.Any])
    
    inline def setFindingsVarargs(value: ValidatePolicyFinding*): Self = StObject.set(x, "findings", js.Array(value*))
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
