package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipelineSummary extends js.Object {
  /**
    * The date and time the pipeline was created, in timestamp format.
    */
  var created: js.UndefOr[Timestamp] = js.undefined
  /**
    * The name of the pipeline.
    */
  var name: js.UndefOr[PipelineName] = js.undefined
  /**
    * The date and time of the last update to the pipeline, in timestamp format.
    */
  var updated: js.UndefOr[Timestamp] = js.undefined
  /**
    * The version number of the pipeline.
    */
  var version: js.UndefOr[PipelineVersion] = js.undefined
}

object PipelineSummary {
  @scala.inline
  def apply(
    created: Timestamp = null,
    name: PipelineName = null,
    updated: Timestamp = null,
    version: js.UndefOr[PipelineVersion] = js.undefined
  ): PipelineSummary = {
    val __obj = js.Dynamic.literal()
    if (created != null) __obj.updateDynamic("created")(created)
    if (name != null) __obj.updateDynamic("name")(name)
    if (updated != null) __obj.updateDynamic("updated")(updated)
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[PipelineSummary]
  }
}

