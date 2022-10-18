package typings.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionBasedCollectionScheme extends StObject {
  
  /**
    * Specifies the version of the conditional expression language.
    */
  var conditionLanguageVersion: js.UndefOr[languageVersion] = js.undefined
  
  /**
    * The logical expression used to recognize what data to collect. For example, $variable.Vehicle.OutsideAirTemperature &gt;= 105.0.
    */
  var expression: eventExpression
  
  /**
    * The minimum duration of time between two triggering events to collect data, in milliseconds.  If a signal changes often, you might want to collect data at a slower rate. 
    */
  var minimumTriggerIntervalMs: js.UndefOr[uint32] = js.undefined
  
  /**
    * Whether to collect data for all triggering events (ALWAYS). Specify (RISING_EDGE), or specify only when the condition first evaluates to false. For example, triggering on "AirbagDeployed"; Users aren't interested on triggering when the airbag is already exploded; they only care about the change from not deployed =&gt; deployed.
    */
  var triggerMode: js.UndefOr[TriggerMode] = js.undefined
}
object ConditionBasedCollectionScheme {
  
  inline def apply(expression: eventExpression): ConditionBasedCollectionScheme = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionBasedCollectionScheme]
  }
  
  extension [Self <: ConditionBasedCollectionScheme](x: Self) {
    
    inline def setConditionLanguageVersion(value: languageVersion): Self = StObject.set(x, "conditionLanguageVersion", value.asInstanceOf[js.Any])
    
    inline def setConditionLanguageVersionUndefined: Self = StObject.set(x, "conditionLanguageVersion", js.undefined)
    
    inline def setExpression(value: eventExpression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setMinimumTriggerIntervalMs(value: uint32): Self = StObject.set(x, "minimumTriggerIntervalMs", value.asInstanceOf[js.Any])
    
    inline def setMinimumTriggerIntervalMsUndefined: Self = StObject.set(x, "minimumTriggerIntervalMs", js.undefined)
    
    inline def setTriggerMode(value: TriggerMode): Self = StObject.set(x, "triggerMode", value.asInstanceOf[js.Any])
    
    inline def setTriggerModeUndefined: Self = StObject.set(x, "triggerMode", js.undefined)
  }
}
