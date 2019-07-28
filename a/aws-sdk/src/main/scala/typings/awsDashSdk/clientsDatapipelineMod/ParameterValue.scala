package typings.awsDashSdk.clientsDatapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParameterValue extends js.Object {
  /**
    * The ID of the parameter value.
    */
  var id: fieldNameString
  /**
    * The field value, expressed as a String.
    */
  var stringValue: fieldStringValue
}

object ParameterValue {
  @scala.inline
  def apply(id: fieldNameString, stringValue: fieldStringValue): ParameterValue = {
    val __obj = js.Dynamic.literal(id = id, stringValue = stringValue)
  
    __obj.asInstanceOf[ParameterValue]
  }
}

