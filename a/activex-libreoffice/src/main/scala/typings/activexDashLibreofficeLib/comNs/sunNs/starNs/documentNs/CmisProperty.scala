package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a CMIS property. */
trait CmisProperty extends js.Object {
  /** specifies the possible choices of the values. */
  var Choices: js.Any
  /** unique ID of the Cmis property */
  var Id: java.lang.String
  /** specifies if the property has multiple value */
  var MultiValued: scala.Boolean
  /** specifies the display name of the CMIS property. */
  var Name: java.lang.String
  /** specifies if the property value can be freely set or is restricted from a list of choices. */
  var OpenChoice: scala.Boolean
  /** specifies if the property is required and can not be empty. */
  var Required: scala.Boolean
  /** type of the property */
  var Type: java.lang.String
  /** specifies if the property is updatable. */
  var Updatable: scala.Boolean
  /** specifies value of the property */
  var Value: js.Any
}

object CmisProperty {
  @scala.inline
  def apply(
    Choices: js.Any,
    Id: java.lang.String,
    MultiValued: scala.Boolean,
    Name: java.lang.String,
    OpenChoice: scala.Boolean,
    Required: scala.Boolean,
    Type: java.lang.String,
    Updatable: scala.Boolean,
    Value: js.Any
  ): CmisProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Choices")(Choices)
    __obj.updateDynamic("Id")(Id)
    __obj.updateDynamic("MultiValued")(MultiValued)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("OpenChoice")(OpenChoice)
    __obj.updateDynamic("Required")(Required)
    __obj.updateDynamic("Type")(Type)
    __obj.updateDynamic("Updatable")(Updatable)
    __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[CmisProperty]
  }
}

