package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FreeTrialFeatureConfigurationResult extends StObject {
  
  /**
    * The number of the remaining free trial days for the feature.
    */
  var FreeTrialDaysRemaining: js.UndefOr[Integer] = js.undefined
  
  /**
    * The name of the feature for which the free trial is configured.
    */
  var Name: js.UndefOr[FreeTrialFeatureResult] = js.undefined
}
object FreeTrialFeatureConfigurationResult {
  
  inline def apply(): FreeTrialFeatureConfigurationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FreeTrialFeatureConfigurationResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FreeTrialFeatureConfigurationResult] (val x: Self) extends AnyVal {
    
    inline def setFreeTrialDaysRemaining(value: Integer): Self = StObject.set(x, "FreeTrialDaysRemaining", value.asInstanceOf[js.Any])
    
    inline def setFreeTrialDaysRemainingUndefined: Self = StObject.set(x, "FreeTrialDaysRemaining", js.undefined)
    
    inline def setName(value: FreeTrialFeatureResult): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
