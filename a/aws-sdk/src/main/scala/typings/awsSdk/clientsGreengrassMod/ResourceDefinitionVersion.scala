package typings.awsSdk.clientsGreengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceDefinitionVersion extends StObject {
  
  /**
    * A list of resources.
    */
  var Resources: js.UndefOr[listOfResource] = js.undefined
}
object ResourceDefinitionVersion {
  
  inline def apply(): ResourceDefinitionVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceDefinitionVersion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourceDefinitionVersion] (val x: Self) extends AnyVal {
    
    inline def setResources(value: listOfResource): Self = StObject.set(x, "Resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "Resources", js.undefined)
    
    inline def setResourcesVarargs(value: Resource*): Self = StObject.set(x, "Resources", js.Array(value*))
  }
}
