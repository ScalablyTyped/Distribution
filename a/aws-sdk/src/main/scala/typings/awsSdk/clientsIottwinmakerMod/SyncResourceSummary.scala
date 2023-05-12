package typings.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SyncResourceSummary extends StObject {
  
  /**
    * The external ID.
    */
  var externalId: js.UndefOr[Id] = js.undefined
  
  /**
    * The resource ID.
    */
  var resourceId: js.UndefOr[Id] = js.undefined
  
  /**
    * The resource type.
    */
  var resourceType: js.UndefOr[SyncResourceType] = js.undefined
  
  /**
    * The sync resource summary status.
    */
  var status: js.UndefOr[SyncResourceStatus] = js.undefined
  
  /**
    * The update date and time.
    */
  var updateDateTime: js.UndefOr[js.Date] = js.undefined
}
object SyncResourceSummary {
  
  inline def apply(): SyncResourceSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyncResourceSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SyncResourceSummary] (val x: Self) extends AnyVal {
    
    inline def setExternalId(value: Id): Self = StObject.set(x, "externalId", value.asInstanceOf[js.Any])
    
    inline def setExternalIdUndefined: Self = StObject.set(x, "externalId", js.undefined)
    
    inline def setResourceId(value: Id): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
    
    inline def setResourceType(value: SyncResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    inline def setStatus(value: SyncResourceStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setUpdateDateTime(value: js.Date): Self = StObject.set(x, "updateDateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateDateTimeUndefined: Self = StObject.set(x, "updateDateTime", js.undefined)
  }
}
