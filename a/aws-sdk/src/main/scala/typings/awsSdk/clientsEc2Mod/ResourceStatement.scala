package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceStatement extends StObject {
  
  /**
    * The resource types.
    */
  var ResourceTypes: js.UndefOr[ValueStringList] = js.undefined
  
  /**
    * The resources.
    */
  var Resources: js.UndefOr[ValueStringList] = js.undefined
}
object ResourceStatement {
  
  inline def apply(): ResourceStatement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceStatement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourceStatement] (val x: Self) extends AnyVal {
    
    inline def setResourceTypes(value: ValueStringList): Self = StObject.set(x, "ResourceTypes", value.asInstanceOf[js.Any])
    
    inline def setResourceTypesUndefined: Self = StObject.set(x, "ResourceTypes", js.undefined)
    
    inline def setResourceTypesVarargs(value: String*): Self = StObject.set(x, "ResourceTypes", js.Array(value*))
    
    inline def setResources(value: ValueStringList): Self = StObject.set(x, "Resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "Resources", js.undefined)
    
    inline def setResourcesVarargs(value: String*): Self = StObject.set(x, "Resources", js.Array(value*))
  }
}
