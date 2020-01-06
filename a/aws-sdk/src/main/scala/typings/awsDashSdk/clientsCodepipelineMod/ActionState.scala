package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionState extends js.Object {
  /**
    * The name of the action.
    */
  var actionName: js.UndefOr[ActionName] = js.native
  /**
    * Represents information about the version (or revision) of an action.
    */
  var currentRevision: js.UndefOr[ActionRevision] = js.native
  /**
    * A URL link for more information about the state of the action, such as a deployment group details page.
    */
  var entityUrl: js.UndefOr[Url] = js.native
  /**
    * Represents information about the run of an action.
    */
  var latestExecution: js.UndefOr[ActionExecution] = js.native
  /**
    * A URL link for more information about the revision, such as a commit details page.
    */
  var revisionUrl: js.UndefOr[Url] = js.native
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
    if (actionName != null) __obj.updateDynamic("actionName")(actionName.asInstanceOf[js.Any])
    if (currentRevision != null) __obj.updateDynamic("currentRevision")(currentRevision.asInstanceOf[js.Any])
    if (entityUrl != null) __obj.updateDynamic("entityUrl")(entityUrl.asInstanceOf[js.Any])
    if (latestExecution != null) __obj.updateDynamic("latestExecution")(latestExecution.asInstanceOf[js.Any])
    if (revisionUrl != null) __obj.updateDynamic("revisionUrl")(revisionUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionState]
  }
}

