package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateExperimentRequest extends js.Object {
  /**
    * The description of the experiment.
    */
  var Description: js.UndefOr[ExperimentDescription] = js.native
  /**
    * The name of the experiment as displayed. The name doesn't need to be unique. If you don't specify DisplayName, the value in ExperimentName is displayed.
    */
  var DisplayName: js.UndefOr[ExperimentEntityName] = js.native
  /**
    * The name of the experiment. The name must be unique in your AWS account and is not case-sensitive.
    */
  var ExperimentName: ExperimentEntityName = js.native
  /**
    * A list of tags to associate with the experiment. You can use Search API to search on the tags.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CreateExperimentRequest {
  @scala.inline
  def apply(
    ExperimentName: ExperimentEntityName,
    Description: ExperimentDescription = null,
    DisplayName: ExperimentEntityName = null,
    Tags: TagList = null
  ): CreateExperimentRequest = {
    val __obj = js.Dynamic.literal(ExperimentName = ExperimentName.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateExperimentRequest]
  }
}

