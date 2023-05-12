package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEvidenceResponse extends StObject {
  
  /**
    *  The evidence that the GetEvidence API returned. 
    */
  var evidence: js.UndefOr[Evidence] = js.undefined
}
object GetEvidenceResponse {
  
  inline def apply(): GetEvidenceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEvidenceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetEvidenceResponse] (val x: Self) extends AnyVal {
    
    inline def setEvidence(value: Evidence): Self = StObject.set(x, "evidence", value.asInstanceOf[js.Any])
    
    inline def setEvidenceUndefined: Self = StObject.set(x, "evidence", js.undefined)
  }
}
