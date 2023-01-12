package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteConfigRuleRequest extends StObject {
  
  /**
    * The name of the Config rule that you want to delete.
    */
  var ConfigRuleName: typings.awsSdk.clientsConfigserviceMod.ConfigRuleName
}
object DeleteConfigRuleRequest {
  
  inline def apply(ConfigRuleName: ConfigRuleName): DeleteConfigRuleRequest = {
    val __obj = js.Dynamic.literal(ConfigRuleName = ConfigRuleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteConfigRuleRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteConfigRuleRequest] (val x: Self) extends AnyVal {
    
    inline def setConfigRuleName(value: ConfigRuleName): Self = StObject.set(x, "ConfigRuleName", value.asInstanceOf[js.Any])
  }
}
