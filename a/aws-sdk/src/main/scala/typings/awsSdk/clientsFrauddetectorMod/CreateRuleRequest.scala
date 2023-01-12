package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRuleRequest extends StObject {
  
  /**
    * The rule description.
    */
  var description: js.UndefOr[typings.awsSdk.clientsFrauddetectorMod.description] = js.undefined
  
  /**
    * The detector ID for the rule's parent detector.
    */
  var detectorId: identifier
  
  /**
    * The rule expression.
    */
  var expression: ruleExpression
  
  /**
    * The language of the rule.
    */
  var language: Language
  
  /**
    * The outcome or outcomes returned when the rule expression matches.
    */
  var outcomes: NonEmptyListOfStrings
  
  /**
    * The rule ID.
    */
  var ruleId: identifier
  
  /**
    * A collection of key and value pairs.
    */
  var tags: js.UndefOr[tagList] = js.undefined
}
object CreateRuleRequest {
  
  inline def apply(
    detectorId: identifier,
    expression: ruleExpression,
    language: Language,
    outcomes: NonEmptyListOfStrings,
    ruleId: identifier
  ): CreateRuleRequest = {
    val __obj = js.Dynamic.literal(detectorId = detectorId.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], outcomes = outcomes.asInstanceOf[js.Any], ruleId = ruleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRuleRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateRuleRequest] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDetectorId(value: identifier): Self = StObject.set(x, "detectorId", value.asInstanceOf[js.Any])
    
    inline def setExpression(value: ruleExpression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setLanguage(value: Language): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setOutcomes(value: NonEmptyListOfStrings): Self = StObject.set(x, "outcomes", value.asInstanceOf[js.Any])
    
    inline def setOutcomesVarargs(value: String*): Self = StObject.set(x, "outcomes", js.Array(value*))
    
    inline def setRuleId(value: identifier): Self = StObject.set(x, "ruleId", value.asInstanceOf[js.Any])
    
    inline def setTags(value: tagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
