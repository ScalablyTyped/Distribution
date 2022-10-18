package typings.awsSdk.clientsEsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DryRunResults extends StObject {
  
  /**
    *  Specifies the deployment mechanism through which the update shall be applied on the domain. Possible responses are Blue/Green (The update will require a blue/green deployment.) DynamicUpdate (The update can be applied in-place without a Blue/Green deployment required.) Undetermined (The domain is undergoing an update which needs to complete before the deployment type can be predicted.) None (The configuration change matches the current configuration and will not result in any update.) 
    */
  var DeploymentType: js.UndefOr[typings.awsSdk.clientsEsMod.DeploymentType] = js.undefined
  
  /**
    * Contains an optional message associated with the DryRunResults.
    */
  var Message: js.UndefOr[typings.awsSdk.clientsEsMod.Message] = js.undefined
}
object DryRunResults {
  
  inline def apply(): DryRunResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DryRunResults]
  }
  
  extension [Self <: DryRunResults](x: Self) {
    
    inline def setDeploymentType(value: DeploymentType): Self = StObject.set(x, "DeploymentType", value.asInstanceOf[js.Any])
    
    inline def setDeploymentTypeUndefined: Self = StObject.set(x, "DeploymentType", js.undefined)
    
    inline def setMessage(value: Message): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
