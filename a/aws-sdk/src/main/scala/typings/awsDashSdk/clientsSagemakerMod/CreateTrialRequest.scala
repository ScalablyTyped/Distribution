package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTrialRequest extends js.Object {
  /**
    * The name of the trial as displayed. The name doesn't need to be unique. If DisplayName isn't specified, TrialName is displayed.
    */
  var DisplayName: js.UndefOr[ExperimentEntityName] = js.native
  /**
    * The name of the experiment to associate the trial with.
    */
  var ExperimentName: ExperimentEntityName = js.native
  /**
    * A list of tags to associate with the trial. You can use Search API to search on the tags.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The name of the trial. The name must be unique in your AWS account and is not case-sensitive.
    */
  var TrialName: ExperimentEntityName = js.native
}

object CreateTrialRequest {
  @scala.inline
  def apply(
    ExperimentName: ExperimentEntityName,
    TrialName: ExperimentEntityName,
    DisplayName: ExperimentEntityName = null,
    Tags: TagList = null
  ): CreateTrialRequest = {
    val __obj = js.Dynamic.literal(ExperimentName = ExperimentName.asInstanceOf[js.Any], TrialName = TrialName.asInstanceOf[js.Any])
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTrialRequest]
  }
}

