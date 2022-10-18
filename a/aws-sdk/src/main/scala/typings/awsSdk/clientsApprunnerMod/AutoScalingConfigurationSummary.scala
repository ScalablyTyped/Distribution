package typings.awsSdk.clientsApprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoScalingConfigurationSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of this auto scaling configuration.
    */
  var AutoScalingConfigurationArn: js.UndefOr[AppRunnerResourceArn] = js.undefined
  
  /**
    * The customer-provided auto scaling configuration name. It can be used in multiple revisions of a configuration.
    */
  var AutoScalingConfigurationName: js.UndefOr[typings.awsSdk.clientsApprunnerMod.AutoScalingConfigurationName] = js.undefined
  
  /**
    * The revision of this auto scaling configuration. It's unique among all the active configurations ("Status": "ACTIVE") with the same AutoScalingConfigurationName.
    */
  var AutoScalingConfigurationRevision: js.UndefOr[Integer] = js.undefined
}
object AutoScalingConfigurationSummary {
  
  inline def apply(): AutoScalingConfigurationSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoScalingConfigurationSummary]
  }
  
  extension [Self <: AutoScalingConfigurationSummary](x: Self) {
    
    inline def setAutoScalingConfigurationArn(value: AppRunnerResourceArn): Self = StObject.set(x, "AutoScalingConfigurationArn", value.asInstanceOf[js.Any])
    
    inline def setAutoScalingConfigurationArnUndefined: Self = StObject.set(x, "AutoScalingConfigurationArn", js.undefined)
    
    inline def setAutoScalingConfigurationName(value: AutoScalingConfigurationName): Self = StObject.set(x, "AutoScalingConfigurationName", value.asInstanceOf[js.Any])
    
    inline def setAutoScalingConfigurationNameUndefined: Self = StObject.set(x, "AutoScalingConfigurationName", js.undefined)
    
    inline def setAutoScalingConfigurationRevision(value: Integer): Self = StObject.set(x, "AutoScalingConfigurationRevision", value.asInstanceOf[js.Any])
    
    inline def setAutoScalingConfigurationRevisionUndefined: Self = StObject.set(x, "AutoScalingConfigurationRevision", js.undefined)
  }
}
