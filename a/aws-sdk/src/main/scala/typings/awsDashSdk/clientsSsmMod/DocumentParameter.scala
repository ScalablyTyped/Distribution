package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentParameter extends js.Object {
  /**
    * If specified, the default values for the parameters. Parameters without a default value are required. Parameters with a default value are optional.
    */
  var DefaultValue: js.UndefOr[DocumentParameterDefaultValue] = js.native
  /**
    * A description of what the parameter does, how to use it, the default value, and whether or not the parameter is optional.
    */
  var Description: js.UndefOr[DocumentParameterDescrption] = js.native
  /**
    * The name of the parameter.
    */
  var Name: js.UndefOr[DocumentParameterName] = js.native
  /**
    * The type of parameter. The type can be either String or StringList.
    */
  var Type: js.UndefOr[DocumentParameterType] = js.native
}

object DocumentParameter {
  @scala.inline
  def apply(
    DefaultValue: DocumentParameterDefaultValue = null,
    Description: DocumentParameterDescrption = null,
    Name: DocumentParameterName = null,
    Type: DocumentParameterType = null
  ): DocumentParameter = {
    val __obj = js.Dynamic.literal()
    if (DefaultValue != null) __obj.updateDynamic("DefaultValue")(DefaultValue.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentParameter]
  }
}

