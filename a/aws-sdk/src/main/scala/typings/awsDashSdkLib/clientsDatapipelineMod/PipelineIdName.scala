package typings
package awsDashSdkLib.clientsDatapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipelineIdName extends js.Object {
  /**
    * The ID of the pipeline that was assigned by AWS Data Pipeline. This is a string of the form df-297EG78HU43EEXAMPLE.
    */
  var id: js.UndefOr[id] = js.undefined
  /**
    * The name of the pipeline.
    */
  var name: js.UndefOr[id] = js.undefined
}

object PipelineIdName {
  @scala.inline
  def apply(id: id = null, name: id = null): PipelineIdName = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[PipelineIdName]
  }
}

