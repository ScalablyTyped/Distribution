package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventRiskType extends StObject {
  
  /**
    * Indicates whether compromised credentials were detected during an authentication event.
    */
  var CompromisedCredentialsDetected: js.UndefOr[WrappedBooleanType] = js.undefined
  
  /**
    * The risk decision.
    */
  var RiskDecision: js.UndefOr[RiskDecisionType] = js.undefined
  
  /**
    * The risk level.
    */
  var RiskLevel: js.UndefOr[RiskLevelType] = js.undefined
}
object EventRiskType {
  
  inline def apply(): EventRiskType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventRiskType]
  }
  
  extension [Self <: EventRiskType](x: Self) {
    
    inline def setCompromisedCredentialsDetected(value: WrappedBooleanType): Self = StObject.set(x, "CompromisedCredentialsDetected", value.asInstanceOf[js.Any])
    
    inline def setCompromisedCredentialsDetectedUndefined: Self = StObject.set(x, "CompromisedCredentialsDetected", js.undefined)
    
    inline def setRiskDecision(value: RiskDecisionType): Self = StObject.set(x, "RiskDecision", value.asInstanceOf[js.Any])
    
    inline def setRiskDecisionUndefined: Self = StObject.set(x, "RiskDecision", js.undefined)
    
    inline def setRiskLevel(value: RiskLevelType): Self = StObject.set(x, "RiskLevel", value.asInstanceOf[js.Any])
    
    inline def setRiskLevelUndefined: Self = StObject.set(x, "RiskLevel", js.undefined)
  }
}
