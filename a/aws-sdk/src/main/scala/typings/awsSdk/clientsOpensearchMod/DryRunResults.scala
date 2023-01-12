package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DryRunResults extends StObject {
  
  /**
    *  Specifies the way in which OpenSearch Service will apply an update. Possible values are:    Blue/Green - The update requires a blue/green deployment.    DynamicUpdate - No blue/green deployment required    Undetermined - The domain is in the middle of an update and can't predict the deployment type. Try again after the update is complete.    None - The request doesn't include any configuration changes.  
    */
  var DeploymentType: js.UndefOr[typings.awsSdk.clientsOpensearchMod.DeploymentType] = js.undefined
  
  /**
    * A message corresponding to the deployment type.
    */
  var Message: js.UndefOr[typings.awsSdk.clientsOpensearchMod.Message] = js.undefined
}
object DryRunResults {
  
  inline def apply(): DryRunResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DryRunResults]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DryRunResults] (val x: Self) extends AnyVal {
    
    inline def setDeploymentType(value: DeploymentType): Self = StObject.set(x, "DeploymentType", value.asInstanceOf[js.Any])
    
    inline def setDeploymentTypeUndefined: Self = StObject.set(x, "DeploymentType", js.undefined)
    
    inline def setMessage(value: Message): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
