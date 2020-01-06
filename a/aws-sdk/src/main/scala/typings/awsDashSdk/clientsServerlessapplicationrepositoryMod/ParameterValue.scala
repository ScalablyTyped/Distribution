package typings.awsDashSdk.clientsServerlessapplicationrepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParameterValue extends js.Object {
  /**
    * The key associated with the parameter. If you don't specify a key and value for a particular parameter, AWS CloudFormation
    uses the default value that is specified in your template.
    */
  var Name: __string = js.native
  /**
    * The input value associated with the parameter.
    */
  var Value: __string = js.native
}

object ParameterValue {
  @scala.inline
  def apply(Name: __string, Value: __string): ParameterValue = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ParameterValue]
  }
}

