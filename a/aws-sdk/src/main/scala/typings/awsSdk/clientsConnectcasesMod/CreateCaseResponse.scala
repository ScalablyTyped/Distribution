package typings.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCaseResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the case.
    */
  var caseArn: CaseArn
  
  /**
    * A unique identifier of the case.
    */
  var caseId: CaseId
}
object CreateCaseResponse {
  
  inline def apply(caseArn: CaseArn, caseId: CaseId): CreateCaseResponse = {
    val __obj = js.Dynamic.literal(caseArn = caseArn.asInstanceOf[js.Any], caseId = caseId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCaseResponse]
  }
  
  extension [Self <: CreateCaseResponse](x: Self) {
    
    inline def setCaseArn(value: CaseArn): Self = StObject.set(x, "caseArn", value.asInstanceOf[js.Any])
    
    inline def setCaseId(value: CaseId): Self = StObject.set(x, "caseId", value.asInstanceOf[js.Any])
  }
}
