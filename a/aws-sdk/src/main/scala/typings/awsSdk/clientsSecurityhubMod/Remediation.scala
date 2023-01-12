package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Remediation extends StObject {
  
  /**
    * A recommendation on the steps to take to remediate the issue identified by a finding.
    */
  var Recommendation: js.UndefOr[typings.awsSdk.clientsSecurityhubMod.Recommendation] = js.undefined
}
object Remediation {
  
  inline def apply(): Remediation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Remediation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Remediation] (val x: Self) extends AnyVal {
    
    inline def setRecommendation(value: Recommendation): Self = StObject.set(x, "Recommendation", value.asInstanceOf[js.Any])
    
    inline def setRecommendationUndefined: Self = StObject.set(x, "Recommendation", js.undefined)
  }
}
