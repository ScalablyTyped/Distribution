package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEvidenceByEvidenceFolderResponse extends StObject {
  
  /**
    *  The list of evidence that the GetEvidenceByEvidenceFolder API returned. 
    */
  var evidence: js.UndefOr[EvidenceList] = js.undefined
  
  /**
    *  The pagination token that's used to fetch the next set of results. 
    */
  var nextToken: js.UndefOr[Token] = js.undefined
}
object GetEvidenceByEvidenceFolderResponse {
  
  inline def apply(): GetEvidenceByEvidenceFolderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEvidenceByEvidenceFolderResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetEvidenceByEvidenceFolderResponse] (val x: Self) extends AnyVal {
    
    inline def setEvidence(value: EvidenceList): Self = StObject.set(x, "evidence", value.asInstanceOf[js.Any])
    
    inline def setEvidenceUndefined: Self = StObject.set(x, "evidence", js.undefined)
    
    inline def setEvidenceVarargs(value: Evidence*): Self = StObject.set(x, "evidence", js.Array(value*))
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
