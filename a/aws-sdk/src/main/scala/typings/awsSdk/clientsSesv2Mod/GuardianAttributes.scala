package typings.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GuardianAttributes extends StObject {
  
  /**
    * Specifies the status of your VDM optimized shared delivery. Can be one of the following:    ENABLED – Amazon SES enables optimized shared delivery for your account.    DISABLED – Amazon SES disables optimized shared delivery for your account.  
    */
  var OptimizedSharedDelivery: js.UndefOr[FeatureStatus] = js.undefined
}
object GuardianAttributes {
  
  inline def apply(): GuardianAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GuardianAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GuardianAttributes] (val x: Self) extends AnyVal {
    
    inline def setOptimizedSharedDelivery(value: FeatureStatus): Self = StObject.set(x, "OptimizedSharedDelivery", value.asInstanceOf[js.Any])
    
    inline def setOptimizedSharedDeliveryUndefined: Self = StObject.set(x, "OptimizedSharedDelivery", js.undefined)
  }
}
