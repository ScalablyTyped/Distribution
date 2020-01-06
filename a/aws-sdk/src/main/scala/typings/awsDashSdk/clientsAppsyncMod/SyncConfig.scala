package typings.awsDashSdk.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    conflictDetection: ConflictDetectionType = null,
    conflictHandler: ConflictHandlerType = null,
    lambdaConflictHandlerConfig: LambdaConflictHandlerConfig = null
  ): SyncConfig = {
    val __obj = js.Dynamic.literal()
    if (conflictDetection != null) __obj.updateDynamic("conflictDetection")(conflictDetection.asInstanceOf[js.Any])
    if (conflictHandler != null) __obj.updateDynamic("conflictHandler")(conflictHandler.asInstanceOf[js.Any])
    if (lambdaConflictHandlerConfig != null) __obj.updateDynamic("lambdaConflictHandlerConfig")(lambdaConflictHandlerConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyncConfig]
  }
}

