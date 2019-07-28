package typings.awsDashSdk.clientsComprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmappedAttribute extends js.Object {
  /**
    *  The specific attribute that has been extracted but not mapped to an entity. 
    */
  var Attribute: js.UndefOr[typings.awsDashSdk.clientsComprehendmedicalMod.Attribute] = js.undefined
  /**
    *  The type of the attribute, could be one of the following values: "MEDICATION", "MEDICAL_CONDITION", "ANATOMY", "TEST_AND_TREATMENT_PROCEDURE" or "PERSONAL_HEALTH_INFORMATION". 
    */
  var Type: js.UndefOr[EntityType] = js.undefined
}

object UnmappedAttribute {
  @scala.inline
  def apply(Attribute: Attribute = null, Type: EntityType = null): UnmappedAttribute = {
    val __obj = js.Dynamic.literal()
    if (Attribute != null) __obj.updateDynamic("Attribute")(Attribute)
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmappedAttribute]
  }
}

