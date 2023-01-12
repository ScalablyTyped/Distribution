package typings.awsSdk.clientsResourceexplorer2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SupportedResourceType extends StObject {
  
  /**
    * The unique identifier of the resource type.
    */
  var ResourceType: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Web Service that is associated with the resource type. This is the primary service that lets you create and interact with resources of this type.
    */
  var Service: js.UndefOr[String] = js.undefined
}
object SupportedResourceType {
  
  inline def apply(): SupportedResourceType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SupportedResourceType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SupportedResourceType] (val x: Self) extends AnyVal {
    
    inline def setResourceType(value: String): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    inline def setService(value: String): Self = StObject.set(x, "Service", value.asInstanceOf[js.Any])
    
    inline def setServiceUndefined: Self = StObject.set(x, "Service", js.undefined)
  }
}
