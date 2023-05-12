package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SyncBlocker extends StObject {
  
  /**
    * The contexts for the sync blocker.
    */
  var contexts: js.UndefOr[SyncBlockerContexts] = js.undefined
  
  /**
    * The time when the sync blocker was created.
    */
  var createdAt: js.Date
  
  /**
    * The reason why the sync blocker was created.
    */
  var createdReason: String
  
  /**
    * The ID of the sync blocker.
    */
  var id: String
  
  /**
    * The time the sync blocker was resolved.
    */
  var resolvedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The reason the sync blocker was resolved.
    */
  var resolvedReason: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the sync blocker.
    */
  var status: BlockerStatus
  
  /**
    * The type of the sync blocker.
    */
  var `type`: BlockerType
}
object SyncBlocker {
  
  inline def apply(createdAt: js.Date, createdReason: String, id: String, status: BlockerStatus, `type`: BlockerType): SyncBlocker = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], createdReason = createdReason.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyncBlocker]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SyncBlocker] (val x: Self) extends AnyVal {
    
    inline def setContexts(value: SyncBlockerContexts): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
    
    inline def setContextsUndefined: Self = StObject.set(x, "contexts", js.undefined)
    
    inline def setContextsVarargs(value: SyncBlockerContext*): Self = StObject.set(x, "contexts", js.Array(value*))
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedReason(value: String): Self = StObject.set(x, "createdReason", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setResolvedAt(value: js.Date): Self = StObject.set(x, "resolvedAt", value.asInstanceOf[js.Any])
    
    inline def setResolvedAtUndefined: Self = StObject.set(x, "resolvedAt", js.undefined)
    
    inline def setResolvedReason(value: String): Self = StObject.set(x, "resolvedReason", value.asInstanceOf[js.Any])
    
    inline def setResolvedReasonUndefined: Self = StObject.set(x, "resolvedReason", js.undefined)
    
    inline def setStatus(value: BlockerStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setType(value: BlockerType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
