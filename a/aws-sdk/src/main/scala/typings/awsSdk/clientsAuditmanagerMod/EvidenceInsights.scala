package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvidenceInsights extends StObject {
  
  /**
    * The number of compliance check evidence that Audit Manager classified as compliant. This includes evidence that was collected from Security Hub with a Pass ruling, or collected from Config with a Compliant ruling. 
    */
  var compliantEvidenceCount: js.UndefOr[NullableInteger] = js.undefined
  
  /**
    * The number of evidence that a compliance check ruling isn't available for. Evidence is inconclusive when the associated control uses Security Hub or Config as a data source but you didn't enable those services. This is also the case when a control uses a data source that doesn’t support compliance checks (for example, manual evidence, API calls, or CloudTrail).   If evidence has a compliance check status of not applicable in the console, it's classified as inconclusive in EvidenceInsights data. 
    */
  var inconclusiveEvidenceCount: js.UndefOr[NullableInteger] = js.undefined
  
  /**
    * The number of compliance check evidence that Audit Manager classified as non-compliant. This includes evidence that was collected from Security Hub with a Fail ruling, or collected from Config with a Non-compliant ruling. 
    */
  var noncompliantEvidenceCount: js.UndefOr[NullableInteger] = js.undefined
}
object EvidenceInsights {
  
  inline def apply(): EvidenceInsights = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EvidenceInsights]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EvidenceInsights] (val x: Self) extends AnyVal {
    
    inline def setCompliantEvidenceCount(value: NullableInteger): Self = StObject.set(x, "compliantEvidenceCount", value.asInstanceOf[js.Any])
    
    inline def setCompliantEvidenceCountUndefined: Self = StObject.set(x, "compliantEvidenceCount", js.undefined)
    
    inline def setInconclusiveEvidenceCount(value: NullableInteger): Self = StObject.set(x, "inconclusiveEvidenceCount", value.asInstanceOf[js.Any])
    
    inline def setInconclusiveEvidenceCountUndefined: Self = StObject.set(x, "inconclusiveEvidenceCount", js.undefined)
    
    inline def setNoncompliantEvidenceCount(value: NullableInteger): Self = StObject.set(x, "noncompliantEvidenceCount", value.asInstanceOf[js.Any])
    
    inline def setNoncompliantEvidenceCountUndefined: Self = StObject.set(x, "noncompliantEvidenceCount", js.undefined)
  }
}
