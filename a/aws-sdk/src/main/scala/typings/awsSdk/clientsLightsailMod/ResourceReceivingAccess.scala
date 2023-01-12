package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceReceivingAccess extends StObject {
  
  /**
    * The name of the Lightsail instance.
    */
  var name: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The Lightsail resource type (for example, Instance).
    */
  var resourceType: js.UndefOr[NonEmptyString] = js.undefined
}
object ResourceReceivingAccess {
  
  inline def apply(): ResourceReceivingAccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceReceivingAccess]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourceReceivingAccess] (val x: Self) extends AnyVal {
    
    inline def setName(value: NonEmptyString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setResourceType(value: NonEmptyString): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
  }
}
