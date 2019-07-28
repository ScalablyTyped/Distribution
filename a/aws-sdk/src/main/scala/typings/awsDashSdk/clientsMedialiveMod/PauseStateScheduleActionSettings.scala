package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PauseStateScheduleActionSettings extends js.Object {
  var Pipelines: js.UndefOr[__listOfPipelinePauseStateSettings] = js.undefined
}

object PauseStateScheduleActionSettings {
  @scala.inline
  def apply(Pipelines: __listOfPipelinePauseStateSettings = null): PauseStateScheduleActionSettings = {
    val __obj = js.Dynamic.literal()
    if (Pipelines != null) __obj.updateDynamic("Pipelines")(Pipelines)
    __obj.asInstanceOf[PauseStateScheduleActionSettings]
  }
}

