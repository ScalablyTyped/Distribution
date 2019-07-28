package typings.awsDashSdk.clientsFirehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessorParameter extends js.Object {
  /**
    * The name of the parameter.
    */
  var ParameterName: ProcessorParameterName
  /**
    * The parameter value.
    */
  var ParameterValue: ProcessorParameterValue
}

object ProcessorParameter {
  @scala.inline
  def apply(ParameterName: ProcessorParameterName, ParameterValue: ProcessorParameterValue): ProcessorParameter = {
    val __obj = js.Dynamic.literal(ParameterName = ParameterName.asInstanceOf[js.Any], ParameterValue = ParameterValue)
  
    __obj.asInstanceOf[ProcessorParameter]
  }
}

