package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WafAction extends StObject {
  
  /**
    * Specifies how you want WAF to respond to requests that match the settings in a rule. Valid settings include the following:    ALLOW - WAF allows requests    BLOCK - WAF blocks requests    COUNT - WAF increments a counter of the requests that match all of the conditions in the rule. WAF then continues to inspect the web request based on the remaining rules in the web ACL. You can't specify COUNT for the default action for a web ACL.  
    */
  var Type: js.UndefOr[NonEmptyString] = js.undefined
}
object WafAction {
  
  inline def apply(): WafAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WafAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WafAction] (val x: Self) extends AnyVal {
    
    inline def setType(value: NonEmptyString): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
