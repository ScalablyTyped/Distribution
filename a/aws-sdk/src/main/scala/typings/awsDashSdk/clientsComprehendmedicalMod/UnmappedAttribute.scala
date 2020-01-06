package typings.awsDashSdk.clientsComprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmappedAttribute extends js.Object {
  /**
    *  The specific attribute that has been extracted but not mapped to an entity. 
    */
  var Attribute: js.UndefOr[typings.awsDashSdk.clientsComprehendmedicalMod.Attribute] = js.native
  /**
    *  The type of the attribute, could be one of the following values: "MEDICATION", "MEDICAL_CONDITION", "ANATOMY", "TEST_AND_TREATMENT_PROCEDURE" or "PROTECTED_HEALTH_INFORMATION". 
    */
  var Type: js.UndefOr[EntityType] = js.native
}

object UnmappedAttribute {
  @scala.inline
  def apply(Attribute: Attribute = null, Type: EntityType = null): UnmappedAttribute = {
    val __obj = js.Dynamic.literal()
    if (Attribute != null) __obj.updateDynamic("Attribute")(Attribute.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmappedAttribute]
  }
}

