package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPipelineInput extends js.Object {
  /**
    * The name of the pipeline for which you want to get information. Pipeline names must be unique under an AWS user account.
    */
  var name: PipelineName = js.native
  /**
    * The version number of the pipeline. If you do not specify a version, defaults to the current version.
    */
  var version: js.UndefOr[PipelineVersion] = js.native
}

object GetPipelineInput {
  @scala.inline
  def apply(name: PipelineName, version: Int | Double = null): GetPipelineInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPipelineInput]
  }
}

