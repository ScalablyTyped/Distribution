package typings.awsDashSdk.clientsFrauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateVariableRequest extends js.Object {
  /**
    * The source of the data.
    */
  var dataSource: DataSource = js.native
  /**
    * The data type.
    */
  var dataType: DataType = js.native
  /**
    * The default value for the variable when no value is received.
    */
  var defaultValue: String = js.native
  /**
    * The description.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The name of the variable.
    */
  var name: String = js.native
  /**
    * The variable type.
    */
  var variableType: js.UndefOr[String] = js.native
}

object CreateVariableRequest {
  @scala.inline
  def apply(
    dataSource: DataSource,
    dataType: DataType,
    defaultValue: String,
    name: String,
    description: String = null,
    variableType: String = null
  ): CreateVariableRequest = {
    val __obj = js.Dynamic.literal(dataSource = dataSource.asInstanceOf[js.Any], dataType = dataType.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (variableType != null) __obj.updateDynamic("variableType")(variableType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVariableRequest]
  }
}

