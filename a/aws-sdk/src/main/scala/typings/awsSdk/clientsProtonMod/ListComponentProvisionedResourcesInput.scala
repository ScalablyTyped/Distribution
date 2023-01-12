package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListComponentProvisionedResourcesInput extends StObject {
  
  /**
    * The name of the component whose provisioned resources you want.
    */
  var componentName: ResourceName
  
  /**
    * A token that indicates the location of the next provisioned resource in the array of provisioned resources, after the list of provisioned resources that was previously requested.
    */
  var nextToken: js.UndefOr[EmptyNextToken] = js.undefined
}
object ListComponentProvisionedResourcesInput {
  
  inline def apply(componentName: ResourceName): ListComponentProvisionedResourcesInput = {
    val __obj = js.Dynamic.literal(componentName = componentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListComponentProvisionedResourcesInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListComponentProvisionedResourcesInput] (val x: Self) extends AnyVal {
    
    inline def setComponentName(value: ResourceName): Self = StObject.set(x, "componentName", value.asInstanceOf[js.Any])
    
    inline def setNextToken(value: EmptyNextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
