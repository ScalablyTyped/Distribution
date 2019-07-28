package typings.awsDashSdk.clientsDatapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParameterObject extends js.Object {
  /**
    * The attributes of the parameter object.
    */
  var attributes: ParameterAttributeList
  /**
    * The ID of the parameter object. 
    */
  var id: fieldNameString
}

object ParameterObject {
  @scala.inline
  def apply(attributes: ParameterAttributeList, id: fieldNameString): ParameterObject = {
    val __obj = js.Dynamic.literal(attributes = attributes, id = id)
  
    __obj.asInstanceOf[ParameterObject]
  }
}

