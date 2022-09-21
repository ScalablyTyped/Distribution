package typings.awsSdk.auditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEvidenceFoldersByAssessmentResponse extends StObject {
  
  /**
    *  The list of evidence folders that the GetEvidenceFoldersByAssessment API returned. 
    */
  var evidenceFolders: js.UndefOr[AssessmentEvidenceFolders] = js.undefined
  
  /**
    *  The pagination token that's used to fetch the next set of results. 
    */
  var nextToken: js.UndefOr[Token] = js.undefined
}
object GetEvidenceFoldersByAssessmentResponse {
  
  inline def apply(): GetEvidenceFoldersByAssessmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEvidenceFoldersByAssessmentResponse]
  }
  
  extension [Self <: GetEvidenceFoldersByAssessmentResponse](x: Self) {
    
    inline def setEvidenceFolders(value: AssessmentEvidenceFolders): Self = StObject.set(x, "evidenceFolders", value.asInstanceOf[js.Any])
    
    inline def setEvidenceFoldersUndefined: Self = StObject.set(x, "evidenceFolders", js.undefined)
    
    inline def setEvidenceFoldersVarargs(value: AssessmentEvidenceFolder*): Self = StObject.set(x, "evidenceFolders", js.Array(value*))
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
