package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskRunProperties extends js.Object {
  /**
    * The configuration properties for an exporting labels task run.
    */
  var ExportLabelsTaskRunProperties: js.UndefOr[typings.awsDashSdk.clientsGlueMod.ExportLabelsTaskRunProperties] = js.native
  /**
    * The configuration properties for a find matches task run.
    */
  var FindMatchesTaskRunProperties: js.UndefOr[typings.awsDashSdk.clientsGlueMod.FindMatchesTaskRunProperties] = js.native
  /**
    * The configuration properties for an importing labels task run.
    */
  var ImportLabelsTaskRunProperties: js.UndefOr[typings.awsDashSdk.clientsGlueMod.ImportLabelsTaskRunProperties] = js.native
  /**
    * The configuration properties for a labeling set generation task run.
    */
  var LabelingSetGenerationTaskRunProperties: js.UndefOr[typings.awsDashSdk.clientsGlueMod.LabelingSetGenerationTaskRunProperties] = js.native
  /**
    * The type of task run.
    */
  var TaskType: js.UndefOr[typings.awsDashSdk.clientsGlueMod.TaskType] = js.native
}

object TaskRunProperties {
  @scala.inline
  def apply(
    ExportLabelsTaskRunProperties: ExportLabelsTaskRunProperties = null,
    FindMatchesTaskRunProperties: FindMatchesTaskRunProperties = null,
    ImportLabelsTaskRunProperties: ImportLabelsTaskRunProperties = null,
    LabelingSetGenerationTaskRunProperties: LabelingSetGenerationTaskRunProperties = null,
    TaskType: TaskType = null
  ): TaskRunProperties = {
    val __obj = js.Dynamic.literal()
    if (ExportLabelsTaskRunProperties != null) __obj.updateDynamic("ExportLabelsTaskRunProperties")(ExportLabelsTaskRunProperties.asInstanceOf[js.Any])
    if (FindMatchesTaskRunProperties != null) __obj.updateDynamic("FindMatchesTaskRunProperties")(FindMatchesTaskRunProperties.asInstanceOf[js.Any])
    if (ImportLabelsTaskRunProperties != null) __obj.updateDynamic("ImportLabelsTaskRunProperties")(ImportLabelsTaskRunProperties.asInstanceOf[js.Any])
    if (LabelingSetGenerationTaskRunProperties != null) __obj.updateDynamic("LabelingSetGenerationTaskRunProperties")(LabelingSetGenerationTaskRunProperties.asInstanceOf[js.Any])
    if (TaskType != null) __obj.updateDynamic("TaskType")(TaskType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskRunProperties]
  }
}

