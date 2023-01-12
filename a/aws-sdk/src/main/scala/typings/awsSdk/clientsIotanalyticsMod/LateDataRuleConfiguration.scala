package typings.awsSdk.clientsIotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LateDataRuleConfiguration extends StObject {
  
  /**
    * The information needed to configure a delta time session window.
    */
  var deltaTimeSessionWindowConfiguration: js.UndefOr[DeltaTimeSessionWindowConfiguration] = js.undefined
}
object LateDataRuleConfiguration {
  
  inline def apply(): LateDataRuleConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LateDataRuleConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LateDataRuleConfiguration] (val x: Self) extends AnyVal {
    
    inline def setDeltaTimeSessionWindowConfiguration(value: DeltaTimeSessionWindowConfiguration): Self = StObject.set(x, "deltaTimeSessionWindowConfiguration", value.asInstanceOf[js.Any])
    
    inline def setDeltaTimeSessionWindowConfigurationUndefined: Self = StObject.set(x, "deltaTimeSessionWindowConfiguration", js.undefined)
  }
}
