package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SyncConfig extends js.Object {
  
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
  implicit class SyncConfigOps[Self <: SyncConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConflictDetection(value: ConflictDetectionType): Self = this.set("conflictDetection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConflictDetection: Self = this.set("conflictDetection", js.undefined)
    
    @scala.inline
    def setConflictHandler(value: ConflictHandlerType): Self = this.set("conflictHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConflictHandler: Self = this.set("conflictHandler", js.undefined)
    
    @scala.inline
    def setLambdaConflictHandlerConfig(value: LambdaConflictHandlerConfig): Self = this.set("lambdaConflictHandlerConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLambdaConflictHandlerConfig: Self = this.set("lambdaConflictHandlerConfig", js.undefined)
  }
}
