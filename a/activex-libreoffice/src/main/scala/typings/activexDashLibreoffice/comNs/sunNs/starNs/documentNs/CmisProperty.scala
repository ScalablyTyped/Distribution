package typings.activexDashLibreoffice.comNs.sunNs.starNs.documentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a CMIS property. */
trait CmisProperty extends js.Object {
  /** specifies the possible choices of the values. */
  var Choices: js.Any
  /** unique ID of the Cmis property */
  var Id: String
  /** specifies if the property has multiple value */
  var MultiValued: Boolean
  /** specifies the display name of the CMIS property. */
  var Name: String
  /** specifies if the property value can be freely set or is restricted from a list of choices. */
  var OpenChoice: Boolean
  /** specifies if the property is required and can not be empty. */
  var Required: Boolean
  /** type of the property */
  var Type: String
  /** specifies if the property is updatable. */
  var Updatable: Boolean
  /** specifies value of the property */
  var Value: js.Any
}

object CmisProperty {
  @scala.inline
  def apply(
    Choices: js.Any,
    Id: String,
    MultiValued: Boolean,
    Name: String,
    OpenChoice: Boolean,
    Required: Boolean,
    Type: String,
    Updatable: Boolean,
    Value: js.Any
  ): CmisProperty = {
    val __obj = js.Dynamic.literal(Choices = Choices, Id = Id, MultiValued = MultiValued, Name = Name, OpenChoice = OpenChoice, Required = Required, Type = Type, Updatable = Updatable, Value = Value)
  
    __obj.asInstanceOf[CmisProperty]
  }
}

