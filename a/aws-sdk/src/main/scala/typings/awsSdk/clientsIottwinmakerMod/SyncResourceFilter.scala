package typings.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SyncResourceFilter extends StObject {
  
  /**
    * The external ID.
    */
  var externalId: js.UndefOr[Id] = js.undefined
  
  /**
    * The sync resource filter resource ID.
    */
  var resourceId: js.UndefOr[Id] = js.undefined
  
  /**
    * The sync resource filter resource type
    */
  var resourceType: js.UndefOr[SyncResourceType] = js.undefined
  
  /**
    * The sync resource filter's state.
    */
  var state: js.UndefOr[SyncResourceState] = js.undefined
}
object SyncResourceFilter {
  
  inline def apply(): SyncResourceFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyncResourceFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SyncResourceFilter] (val x: Self) extends AnyVal {
    
    inline def setExternalId(value: Id): Self = StObject.set(x, "externalId", value.asInstanceOf[js.Any])
    
    inline def setExternalIdUndefined: Self = StObject.set(x, "externalId", js.undefined)
    
    inline def setResourceId(value: Id): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
    
    inline def setResourceType(value: SyncResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    inline def setState(value: SyncResourceState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
