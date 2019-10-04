package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutActionRevisionInput extends js.Object {
  /**
    * The name of the action that processes the revision.
    */
  var actionName: ActionName
  /**
    * Represents information about the version (or revision) of an action.
    */
  var actionRevision: ActionRevision
  /**
    * The name of the pipeline that starts processing the revision to the source.
    */
  var pipelineName: PipelineName
  /**
    * The name of the stage that contains the action that acts on the revision.
    */
  var stageName: StageName
}

object PutActionRevisionInput {
  @scala.inline
  def apply(
    actionName: ActionName,
    actionRevision: ActionRevision,
    pipelineName: PipelineName,
    stageName: StageName
  ): PutActionRevisionInput = {
    val __obj = js.Dynamic.literal(actionName = actionName, actionRevision = actionRevision, pipelineName = pipelineName, stageName = stageName)
  
    __obj.asInstanceOf[PutActionRevisionInput]
  }
}

