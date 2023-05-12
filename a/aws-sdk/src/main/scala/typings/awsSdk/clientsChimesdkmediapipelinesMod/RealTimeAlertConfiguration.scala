package typings.awsSdk.clientsChimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RealTimeAlertConfiguration extends StObject {
  
  /**
    * Turns off real-time alerts.
    */
  var Disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The rules in the alert. Rules specify the words or phrases that you want to be notified about.
    */
  var Rules: js.UndefOr[RealTimeAlertRuleList] = js.undefined
}
object RealTimeAlertConfiguration {
  
  inline def apply(): RealTimeAlertConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RealTimeAlertConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RealTimeAlertConfiguration] (val x: Self) extends AnyVal {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "Disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "Disabled", js.undefined)
    
    inline def setRules(value: RealTimeAlertRuleList): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "Rules", js.undefined)
    
    inline def setRulesVarargs(value: RealTimeAlertRule*): Self = StObject.set(x, "Rules", js.Array(value*))
  }
}
