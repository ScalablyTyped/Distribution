package typings.awsDashSdk.clientsFrauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VariableEntry extends js.Object {
  /**
    * The data source of the variable entry.
    */
  var dataSource: js.UndefOr[String] = js.native
  /**
    * The data type of the variable entry.
    */
  var dataType: js.UndefOr[String] = js.native
  /**
    * The default value of the variable entry.
    */
  var defaultValue: js.UndefOr[String] = js.native
  /**
    * The description of the variable entry.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The name of the variable entry.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The type of the variable entry.
    */
  var variableType: js.UndefOr[String] = js.native
}

object VariableEntry {
  @scala.inline
  def apply(
    dataSource: String = null,
    dataType: String = null,
    defaultValue: String = null,
    description: String = null,
    name: String = null,
    variableType: String = null
  ): VariableEntry = {
    val __obj = js.Dynamic.literal()
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (dataType != null) __obj.updateDynamic("dataType")(dataType.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (variableType != null) __obj.updateDynamic("variableType")(variableType.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableEntry]
  }
}

