package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutConfigRuleRequest extends StObject {
  
  /**
    * The rule that you want to add to your account.
    */
  var ConfigRule: typings.awsSdk.clientsConfigserviceMod.ConfigRule
  
  /**
    * An array of tag object.
    */
  var Tags: js.UndefOr[TagsList] = js.undefined
}
object PutConfigRuleRequest {
  
  inline def apply(ConfigRule: ConfigRule): PutConfigRuleRequest = {
    val __obj = js.Dynamic.literal(ConfigRule = ConfigRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutConfigRuleRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutConfigRuleRequest] (val x: Self) extends AnyVal {
    
    inline def setConfigRule(value: ConfigRule): Self = StObject.set(x, "ConfigRule", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagsList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
