package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Trial extends js.Object {
  var CreatedBy: js.UndefOr[UserContext] = js.native
  /**
    * When the trial was created.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.native
  /**
    * The name of the trial as displayed. If DisplayName isn't specified, TrialName is displayed.
    */
  var DisplayName: js.UndefOr[ExperimentEntityName] = js.native
  /**
    * The name of the experiment the trial is part of.
    */
  var ExperimentName: js.UndefOr[ExperimentEntityName] = js.native
  var LastModifiedBy: js.UndefOr[UserContext] = js.native
  /**
    * Who last modified the trial.
    */
  var LastModifiedTime: js.UndefOr[Timestamp] = js.native
  var Source: js.UndefOr[TrialSource] = js.native
  /**
    * The list of tags that are associated with the trial. You can use Search API to search on the tags.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The Amazon Resource Name (ARN) of the trial.
    */
  var TrialArn: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.TrialArn] = js.native
  /**
    * A list of the components associated with the trial. For each component, a summary of the component's properties is included.
    */
  var TrialComponentSummaries: js.UndefOr[TrialComponentSimpleSummaries] = js.native
  /**
    * The name of the trial.
    */
  var TrialName: js.UndefOr[ExperimentEntityName] = js.native
}

object Trial {
  @scala.inline
  def apply(
    CreatedBy: UserContext = null,
    CreationTime: Timestamp = null,
    DisplayName: ExperimentEntityName = null,
    ExperimentName: ExperimentEntityName = null,
    LastModifiedBy: UserContext = null,
    LastModifiedTime: Timestamp = null,
    Source: TrialSource = null,
    Tags: TagList = null,
    TrialArn: TrialArn = null,
    TrialComponentSummaries: TrialComponentSimpleSummaries = null,
    TrialName: ExperimentEntityName = null
  ): Trial = {
    val __obj = js.Dynamic.literal()
    if (CreatedBy != null) __obj.updateDynamic("CreatedBy")(CreatedBy.asInstanceOf[js.Any])
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName.asInstanceOf[js.Any])
    if (ExperimentName != null) __obj.updateDynamic("ExperimentName")(ExperimentName.asInstanceOf[js.Any])
    if (LastModifiedBy != null) __obj.updateDynamic("LastModifiedBy")(LastModifiedBy.asInstanceOf[js.Any])
    if (LastModifiedTime != null) __obj.updateDynamic("LastModifiedTime")(LastModifiedTime.asInstanceOf[js.Any])
    if (Source != null) __obj.updateDynamic("Source")(Source.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (TrialArn != null) __obj.updateDynamic("TrialArn")(TrialArn.asInstanceOf[js.Any])
    if (TrialComponentSummaries != null) __obj.updateDynamic("TrialComponentSummaries")(TrialComponentSummaries.asInstanceOf[js.Any])
    if (TrialName != null) __obj.updateDynamic("TrialName")(TrialName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Trial]
  }
}

