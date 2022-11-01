package typings.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GuardianOptions extends StObject {
  
  /**
    * Specifies the status of your VDM optimized shared delivery. Can be one of the following:    ENABLED – Amazon SES enables optimized shared delivery for the configuration set.    DISABLED – Amazon SES disables optimized shared delivery for the configuration set.  
    */
  var OptimizedSharedDelivery: js.UndefOr[FeatureStatus] = js.undefined
}
object GuardianOptions {
  
  inline def apply(): GuardianOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GuardianOptions]
  }
  
  extension [Self <: GuardianOptions](x: Self) {
    
    inline def setOptimizedSharedDelivery(value: FeatureStatus): Self = StObject.set(x, "OptimizedSharedDelivery", value.asInstanceOf[js.Any])
    
    inline def setOptimizedSharedDeliveryUndefined: Self = StObject.set(x, "OptimizedSharedDelivery", js.undefined)
  }
}
