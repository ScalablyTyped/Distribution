package typings.awsDashSdk.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModificationState extends js.Object {
  /**
    * The resource.
    */
  var Resource: js.UndefOr[ModificationResourceEnum] = js.undefined
  /**
    * The modification state.
    */
  var State: js.UndefOr[ModificationStateEnum] = js.undefined
}

object ModificationState {
  @scala.inline
  def apply(Resource: ModificationResourceEnum = null, State: ModificationStateEnum = null): ModificationState = {
    val __obj = js.Dynamic.literal()
    if (Resource != null) __obj.updateDynamic("Resource")(Resource.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModificationState]
  }
}

