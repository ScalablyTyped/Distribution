package typings.awsSdk.clientsCodepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebhookFilterRule extends StObject {
  
  /**
    * A JsonPath expression that is applied to the body/payload of the webhook. The value selected by the JsonPath expression must match the value specified in the MatchEquals field. Otherwise, the request is ignored. For more information, see Java JsonPath implementation in GitHub.
    */
  var jsonPath: JsonPath
  
  /**
    * The value selected by the JsonPath expression must match what is supplied in the MatchEquals field. Otherwise, the request is ignored. Properties from the target action configuration can be included as placeholders in this value by surrounding the action configuration key with curly brackets. For example, if the value supplied here is "refs/heads/{Branch}" and the target action has an action configuration property called "Branch" with a value of "master", the MatchEquals value is evaluated as "refs/heads/master". For a list of action configuration properties for built-in action types, see Pipeline Structure Reference Action Requirements.
    */
  var matchEquals: js.UndefOr[MatchEquals] = js.undefined
}
object WebhookFilterRule {
  
  inline def apply(jsonPath: JsonPath): WebhookFilterRule = {
    val __obj = js.Dynamic.literal(jsonPath = jsonPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookFilterRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebhookFilterRule] (val x: Self) extends AnyVal {
    
    inline def setJsonPath(value: JsonPath): Self = StObject.set(x, "jsonPath", value.asInstanceOf[js.Any])
    
    inline def setMatchEquals(value: MatchEquals): Self = StObject.set(x, "matchEquals", value.asInstanceOf[js.Any])
    
    inline def setMatchEqualsUndefined: Self = StObject.set(x, "matchEquals", js.undefined)
  }
}
