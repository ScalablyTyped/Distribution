package typings.awsSdk.clientsDatabrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidationConfiguration extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the ruleset to be validated in the profile job. The TargetArn of the selected ruleset should be the same as the Amazon Resource Name (ARN) of the dataset that is associated with the profile job.
    */
  var RulesetArn: Arn
  
  /**
    * Mode of data quality validation. Default mode is “CHECK_ALL” which verifies all rules defined in the selected ruleset.
    */
  var ValidationMode: js.UndefOr[typings.awsSdk.clientsDatabrewMod.ValidationMode] = js.undefined
}
object ValidationConfiguration {
  
  inline def apply(RulesetArn: Arn): ValidationConfiguration = {
    val __obj = js.Dynamic.literal(RulesetArn = RulesetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationConfiguration]
  }
  
  extension [Self <: ValidationConfiguration](x: Self) {
    
    inline def setRulesetArn(value: Arn): Self = StObject.set(x, "RulesetArn", value.asInstanceOf[js.Any])
    
    inline def setValidationMode(value: ValidationMode): Self = StObject.set(x, "ValidationMode", value.asInstanceOf[js.Any])
    
    inline def setValidationModeUndefined: Self = StObject.set(x, "ValidationMode", js.undefined)
  }
}
