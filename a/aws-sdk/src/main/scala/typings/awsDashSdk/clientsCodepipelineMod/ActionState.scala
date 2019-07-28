package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionState extends js.Object {
  /**
    * The name of the action.
    */
  var actionName: js.UndefOr[ActionName] = js.undefined
  /**
    * Represents information about the version (or revision) of an action.
    */
  var currentRevision: js.UndefOr[ActionRevision] = js.undefined
  /**
    * A URL link for more information about the state of the action, such as a deployment group details page.
    */
  var entityUrl: js.UndefOr[Url] = js.undefined
  /**
    * Represents information about the run of an action.
    */
  var latestExecution: js.UndefOr[ActionExecution] = js.undefined
  /**
    * A URL link for more information about the revision, such as a commit details page.
    */
  var revisionUrl: js.UndefOr[Url] = js.undefined
}

object ActionState {
  @scala.inline
  def apply(
    actionName: ActionName = null,
    currentRevision: ActionRevision = null,
    entityUrl: Url = null,
    latestExecution: ActionExecution = null,
    revisionUrl: Url = null
  ): ActionState = {
    val __obj = js.Dynamic.literal()
    if (actionName != null) __obj.updateDynamic("actionName")(actionName)
    if (currentRevision != null) __obj.updateDynamic("currentRevision")(currentRevision)
    if (entityUrl != null) __obj.updateDynamic("entityUrl")(entityUrl)
    if (latestExecution != null) __obj.updateDynamic("latestExecution")(latestExecution)
    if (revisionUrl != null) __obj.updateDynamic("revisionUrl")(revisionUrl)
    __obj.asInstanceOf[ActionState]
  }
}

