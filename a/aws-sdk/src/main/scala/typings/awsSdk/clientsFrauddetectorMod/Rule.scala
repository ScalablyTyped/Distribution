package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rule extends StObject {
  
  /**
    * The detector for which the rule is associated.
    */
  var detectorId: identifier
  
  /**
    * The rule ID.
    */
  var ruleId: identifier
  
  /**
    * The rule version.
    */
  var ruleVersion: wholeNumberVersionString
}
object Rule {
  
  inline def apply(detectorId: identifier, ruleId: identifier, ruleVersion: wholeNumberVersionString): Rule = {
    val __obj = js.Dynamic.literal(detectorId = detectorId.asInstanceOf[js.Any], ruleId = ruleId.asInstanceOf[js.Any], ruleVersion = ruleVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rule]
  }
  
  extension [Self <: Rule](x: Self) {
    
    inline def setDetectorId(value: identifier): Self = StObject.set(x, "detectorId", value.asInstanceOf[js.Any])
    
    inline def setRuleId(value: identifier): Self = StObject.set(x, "ruleId", value.asInstanceOf[js.Any])
    
    inline def setRuleVersion(value: wholeNumberVersionString): Self = StObject.set(x, "ruleVersion", value.asInstanceOf[js.Any])
  }
}
