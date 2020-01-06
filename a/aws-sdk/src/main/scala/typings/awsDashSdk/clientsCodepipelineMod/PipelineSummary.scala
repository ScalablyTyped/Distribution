package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PipelineSummary extends js.Object {
  /**
    * The date and time the pipeline was created, in timestamp format.
    */
  var created: js.UndefOr[Timestamp] = js.native
  /**
    * The name of the pipeline.
    */
  var name: js.UndefOr[PipelineName] = js.native
  /**
    * The date and time of the last update to the pipeline, in timestamp format.
    */
  var updated: js.UndefOr[Timestamp] = js.native
  /**
    * The version number of the pipeline.
    */
  var version: js.UndefOr[PipelineVersion] = js.native
}

object PipelineSummary {
  @scala.inline
  def apply(
    created: Timestamp = null,
    name: PipelineName = null,
    updated: Timestamp = null,
    version: Int | Double = null
  ): PipelineSummary = {
    val __obj = js.Dynamic.literal()
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipelineSummary]
  }
}

