package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Remediation extends StObject {
  
  /**
    * An object that contains information about the recommended course of action to remediate the finding.
    */
  var recommendation: js.UndefOr[Recommendation] = js.undefined
}
object Remediation {
  
  inline def apply(): Remediation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Remediation]
  }
  
  extension [Self <: Remediation](x: Self) {
    
    inline def setRecommendation(value: Recommendation): Self = StObject.set(x, "recommendation", value.asInstanceOf[js.Any])
    
    inline def setRecommendationUndefined: Self = StObject.set(x, "recommendation", js.undefined)
  }
}
