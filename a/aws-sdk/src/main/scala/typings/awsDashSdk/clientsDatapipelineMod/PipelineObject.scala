package typings.awsDashSdk.clientsDatapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PipelineObject extends js.Object {
  /**
    * Key-value pairs that define the properties of the object.
    */
  var fields: fieldList = js.native
  /**
    * The ID of the object.
    */
  var id: typings.awsDashSdk.clientsDatapipelineMod.id = js.native
  /**
    * The name of the object.
    */
  var name: id = js.native
}

object PipelineObject {
  @scala.inline
  def apply(fields: fieldList, id: id, name: id): PipelineObject = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PipelineObject]
  }
}

