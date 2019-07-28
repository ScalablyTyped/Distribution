package typings.awsDashSdk.clientsDatapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipelineObject extends js.Object {
  /**
    * Key-value pairs that define the properties of the object.
    */
  var fields: fieldList
  /**
    * The ID of the object.
    */
  var id: typings.awsDashSdk.clientsDatapipelineMod.id
  /**
    * The name of the object.
    */
  var name: id
}

object PipelineObject {
  @scala.inline
  def apply(fields: fieldList, id: id, name: id): PipelineObject = {
    val __obj = js.Dynamic.literal(fields = fields, id = id, name = name)
  
    __obj.asInstanceOf[PipelineObject]
  }
}

