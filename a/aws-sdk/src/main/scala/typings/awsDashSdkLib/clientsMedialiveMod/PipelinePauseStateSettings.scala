package typings
package awsDashSdkLib.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipelinePauseStateSettings extends js.Object {
  /**
    * Pipeline ID to pause ("PIPELINE_0" or "PIPELINE_1").
    */
  var PipelineId: awsDashSdkLib.clientsMedialiveMod.PipelineId
}

object PipelinePauseStateSettings {
  @scala.inline
  def apply(PipelineId: PipelineId): PipelinePauseStateSettings = {
    val __obj = js.Dynamic.literal(PipelineId = PipelineId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PipelinePauseStateSettings]
  }
}

