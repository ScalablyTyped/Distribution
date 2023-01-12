package typings.awsSdk.clientsDrsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PITPolicyRule extends StObject {
  
  /**
    * Whether this rule is enabled or not.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * How often, in the chosen units, a snapshot should be taken.
    */
  var interval: StrictlyPositiveInteger
  
  /**
    * The duration to retain a snapshot for, in the chosen units.
    */
  var retentionDuration: StrictlyPositiveInteger
  
  /**
    * The ID of the rule.
    */
  var ruleID: js.UndefOr[PositiveInteger] = js.undefined
  
  /**
    * The units used to measure the interval and retentionDuration.
    */
  var units: PITPolicyRuleUnits
}
object PITPolicyRule {
  
  inline def apply(
    interval: StrictlyPositiveInteger,
    retentionDuration: StrictlyPositiveInteger,
    units: PITPolicyRuleUnits
  ): PITPolicyRule = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], retentionDuration = retentionDuration.asInstanceOf[js.Any], units = units.asInstanceOf[js.Any])
    __obj.asInstanceOf[PITPolicyRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PITPolicyRule] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setInterval(value: StrictlyPositiveInteger): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setRetentionDuration(value: StrictlyPositiveInteger): Self = StObject.set(x, "retentionDuration", value.asInstanceOf[js.Any])
    
    inline def setRuleID(value: PositiveInteger): Self = StObject.set(x, "ruleID", value.asInstanceOf[js.Any])
    
    inline def setRuleIDUndefined: Self = StObject.set(x, "ruleID", js.undefined)
    
    inline def setUnits(value: PITPolicyRuleUnits): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
  }
}
