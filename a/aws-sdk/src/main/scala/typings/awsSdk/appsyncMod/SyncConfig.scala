package typings.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SyncConfig extends StObject {
  
  /**
    * The Conflict Detection strategy to use.    VERSION: Detect conflicts based on object versions for this resolver.    NONE: Do not detect conflicts when executing this resolver.  
    */
  var conflictDetection: js.UndefOr[ConflictDetectionType] = js.native
  
  /**
    * The Conflict Resolution strategy to perform in the event of a conflict.    OPTIMISTIC_CONCURRENCY: Resolve conflicts by rejecting mutations when versions do not match the latest version at the server.    AUTOMERGE: Resolve conflicts with the Automerge conflict resolution strategy.    LAMBDA: Resolve conflicts with a Lambda function supplied in the LambdaConflictHandlerConfig.  
    */
  var conflictHandler: js.UndefOr[ConflictHandlerType] = js.native
  
  /**
    * The LambdaConflictHandlerConfig when configuring LAMBDA as the Conflict Handler.
    */
  var lambdaConflictHandlerConfig: js.UndefOr[LambdaConflictHandlerConfig] = js.native
}
object SyncConfig {
  
  @scala.inline
  def apply(): SyncConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyncConfig]
  }
  
  @scala.inline
  implicit class SyncConfigMutableBuilder[Self <: SyncConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConflictDetection(value: ConflictDetectionType): Self = StObject.set(x, "conflictDetection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConflictDetectionUndefined: Self = StObject.set(x, "conflictDetection", js.undefined)
    
    @scala.inline
    def setConflictHandler(value: ConflictHandlerType): Self = StObject.set(x, "conflictHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConflictHandlerUndefined: Self = StObject.set(x, "conflictHandler", js.undefined)
    
    @scala.inline
    def setLambdaConflictHandlerConfig(value: LambdaConflictHandlerConfig): Self = StObject.set(x, "lambdaConflictHandlerConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLambdaConflictHandlerConfigUndefined: Self = StObject.set(x, "lambdaConflictHandlerConfig", js.undefined)
  }
}
