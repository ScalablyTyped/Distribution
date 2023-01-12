package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEnvironmentProvisionedResourcesOutput extends StObject {
  
  /**
    * A token that indicates the location of the next environment provisioned resource in the array of provisioned resources, after the current requested list of environment provisioned resources.
    */
  var nextToken: js.UndefOr[EmptyNextToken] = js.undefined
  
  /**
    * An array of environment provisioned resources.
    */
  var provisionedResources: ProvisionedResourceList
}
object ListEnvironmentProvisionedResourcesOutput {
  
  inline def apply(provisionedResources: ProvisionedResourceList): ListEnvironmentProvisionedResourcesOutput = {
    val __obj = js.Dynamic.literal(provisionedResources = provisionedResources.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEnvironmentProvisionedResourcesOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListEnvironmentProvisionedResourcesOutput] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: EmptyNextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setProvisionedResources(value: ProvisionedResourceList): Self = StObject.set(x, "provisionedResources", value.asInstanceOf[js.Any])
    
    inline def setProvisionedResourcesVarargs(value: ProvisionedResource*): Self = StObject.set(x, "provisionedResources", js.Array(value*))
  }
}
