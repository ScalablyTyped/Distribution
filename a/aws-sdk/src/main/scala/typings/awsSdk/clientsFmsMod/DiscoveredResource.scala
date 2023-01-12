package typings.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiscoveredResource extends StObject {
  
  /**
    * The Amazon Web Services account ID associated with the discovered resource.
    */
  var AccountId: js.UndefOr[AWSAccountId] = js.undefined
  
  /**
    * The name of the discovered resource.
    */
  var Name: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The type of the discovered resource.
    */
  var Type: js.UndefOr[ResourceType] = js.undefined
  
  /**
    * The universal resource identifier (URI) of the discovered resource.
    */
  var URI: js.UndefOr[Identifier] = js.undefined
}
object DiscoveredResource {
  
  inline def apply(): DiscoveredResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiscoveredResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DiscoveredResource] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: AWSAccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setType(value: ResourceType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setURI(value: Identifier): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    
    inline def setURIUndefined: Self = StObject.set(x, "URI", js.undefined)
  }
}
