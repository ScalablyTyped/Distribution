package typings.awsSdk.clientsDlmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CrossRegionCopyAction extends StObject {
  
  /**
    * The encryption settings for the copied snapshot.
    */
  var EncryptionConfiguration: typings.awsSdk.clientsDlmMod.EncryptionConfiguration
  
  var RetainRule: js.UndefOr[CrossRegionCopyRetainRule] = js.undefined
  
  /**
    * The target Region.
    */
  var Target: typings.awsSdk.clientsDlmMod.Target
}
object CrossRegionCopyAction {
  
  inline def apply(EncryptionConfiguration: EncryptionConfiguration, Target: Target): CrossRegionCopyAction = {
    val __obj = js.Dynamic.literal(EncryptionConfiguration = EncryptionConfiguration.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrossRegionCopyAction]
  }
  
  extension [Self <: CrossRegionCopyAction](x: Self) {
    
    inline def setEncryptionConfiguration(value: EncryptionConfiguration): Self = StObject.set(x, "EncryptionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setRetainRule(value: CrossRegionCopyRetainRule): Self = StObject.set(x, "RetainRule", value.asInstanceOf[js.Any])
    
    inline def setRetainRuleUndefined: Self = StObject.set(x, "RetainRule", js.undefined)
    
    inline def setTarget(value: Target): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
  }
}
