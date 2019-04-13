package typings
package awsDashSdkLib.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StageState extends js.Object {
  /**
    * The state of the stage.
    */
  var actionStates: js.UndefOr[ActionStateList] = js.undefined
  /**
    * The state of the inbound transition, which is either enabled or disabled.
    */
  var inboundTransitionState: js.UndefOr[TransitionState] = js.undefined
  /**
    * Information about the latest execution in the stage, including its ID and status.
    */
  var latestExecution: js.UndefOr[StageExecution] = js.undefined
  /**
    * The name of the stage.
    */
  var stageName: js.UndefOr[StageName] = js.undefined
}

object StageState {
  @scala.inline
  def apply(
    actionStates: ActionStateList = null,
    inboundTransitionState: TransitionState = null,
    latestExecution: StageExecution = null,
    stageName: StageName = null
  ): StageState = {
    val __obj = js.Dynamic.literal()
    if (actionStates != null) __obj.updateDynamic("actionStates")(actionStates)
    if (inboundTransitionState != null) __obj.updateDynamic("inboundTransitionState")(inboundTransitionState)
    if (latestExecution != null) __obj.updateDynamic("latestExecution")(latestExecution)
    if (stageName != null) __obj.updateDynamic("stageName")(stageName)
    __obj.asInstanceOf[StageState]
  }
}

