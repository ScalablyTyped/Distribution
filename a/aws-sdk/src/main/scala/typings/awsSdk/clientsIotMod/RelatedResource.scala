package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelatedResource extends StObject {
  
  /**
    * Other information about the resource.
    */
  var additionalInfo: js.UndefOr[StringMap] = js.undefined
  
  /**
    * Information that identifies the resource.
    */
  var resourceIdentifier: js.UndefOr[ResourceIdentifier] = js.undefined
  
  /**
    * The type of resource.
    */
  var resourceType: js.UndefOr[ResourceType] = js.undefined
}
object RelatedResource {
  
  inline def apply(): RelatedResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelatedResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RelatedResource] (val x: Self) extends AnyVal {
    
    inline def setAdditionalInfo(value: StringMap): Self = StObject.set(x, "additionalInfo", value.asInstanceOf[js.Any])
    
    inline def setAdditionalInfoUndefined: Self = StObject.set(x, "additionalInfo", js.undefined)
    
    inline def setResourceIdentifier(value: ResourceIdentifier): Self = StObject.set(x, "resourceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setResourceIdentifierUndefined: Self = StObject.set(x, "resourceIdentifier", js.undefined)
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
  }
}
