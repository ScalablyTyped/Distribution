package typings.awsSdk.clientsAppsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SyncConfig extends StObject {
  
  /**
    * The Conflict Detection strategy to use.    VERSION: Detect conflicts based on object versions for this resolver.    NONE: Do not detect conflicts when invoking this resolver.  
    */
  var conflictDetection: js.UndefOr[ConflictDetectionType] = js.undefined
  
  /**
    * The Conflict Resolution strategy to perform in the event of a conflict.    OPTIMISTIC_CONCURRENCY: Resolve conflicts by rejecting mutations when versions don't match the latest version at the server.    AUTOMERGE: Resolve conflicts with the Automerge conflict resolution strategy.    LAMBDA: Resolve conflicts with an Lambda function supplied in the LambdaConflictHandlerConfig.  
    */
  var conflictHandler: js.UndefOr[ConflictHandlerType] = js.undefined
  
  /**
    * The LambdaConflictHandlerConfig when configuring LAMBDA as the Conflict Handler.
    */
  var lambdaConflictHandlerConfig: js.UndefOr[LambdaConflictHandlerConfig] = js.undefined
}
object SyncConfig {
  
  inline def apply(): SyncConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyncConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SyncConfig] (val x: Self) extends AnyVal {
    
    inline def setConflictDetection(value: ConflictDetectionType): Self = StObject.set(x, "conflictDetection", value.asInstanceOf[js.Any])
    
    inline def setConflictDetectionUndefined: Self = StObject.set(x, "conflictDetection", js.undefined)
    
    inline def setConflictHandler(value: ConflictHandlerType): Self = StObject.set(x, "conflictHandler", value.asInstanceOf[js.Any])
    
    inline def setConflictHandlerUndefined: Self = StObject.set(x, "conflictHandler", js.undefined)
    
    inline def setLambdaConflictHandlerConfig(value: LambdaConflictHandlerConfig): Self = StObject.set(x, "lambdaConflictHandlerConfig", value.asInstanceOf[js.Any])
    
    inline def setLambdaConflictHandlerConfigUndefined: Self = StObject.set(x, "lambdaConflictHandlerConfig", js.undefined)
  }
}
