package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rule extends StObject {
  
  /**
    * Condition of the rule, expressed using the following variables: pattern, anchoring, context.
    *
    * @deprecated This parameter is deprecated in favor of `conditions`.
    */
  val condition: js.UndefOr[Condition] = js.native
  
  /**
    * Conditions of the rule, expressed using the following variables: pattern, anchoring, context.
    */
  val conditions: js.UndefOr[js.Array[Condition]] = js.native
  
  /**
    * Consequence of the rule. At least one of the following object must be used: params, promote, hide, userData.
    */
  val consequence: js.UndefOr[Consequence] = js.native
  
  /**
    * This field is intended for rule management purposes, in particular to ease searching for rules and presenting them to human readers. It is not interpreted by the API.
    */
  val description: js.UndefOr[String] = js.native
  
  /**
    * Whether the rule is enabled. Disabled rules remain in the index, but are not applied at query time.
    */
  val enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Unique identifier for the rule (format: [A-Za-z0-9_-]+).
    */
  val objectID: String = js.native
  
  /**
    * By default, rules are permanently valid. When validity periods are specified, the rule applies only during those periods; it is ignored the rest of the time.
    * The list must not be empty.
    */
  val validity: js.UndefOr[js.Array[TimeRange]] = js.native
}
object Rule {
  
  @scala.inline
  def apply(objectID: String): Rule = {
    val __obj = js.Dynamic.literal(objectID = objectID.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rule]
  }
  
  @scala.inline
  implicit class RuleMutableBuilder[Self <: Rule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCondition(value: Condition): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    @scala.inline
    def setConditions(value: js.Array[Condition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    @scala.inline
    def setConditionsVarargs(value: Condition*): Self = StObject.set(x, "conditions", js.Array(value :_*))
    
    @scala.inline
    def setConsequence(value: Consequence): Self = StObject.set(x, "consequence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsequenceUndefined: Self = StObject.set(x, "consequence", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setObjectID(value: String): Self = StObject.set(x, "objectID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidity(value: js.Array[TimeRange]): Self = StObject.set(x, "validity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidityUndefined: Self = StObject.set(x, "validity", js.undefined)
    
    @scala.inline
    def setValidityVarargs(value: TimeRange*): Self = StObject.set(x, "validity", js.Array(value :_*))
  }
}
