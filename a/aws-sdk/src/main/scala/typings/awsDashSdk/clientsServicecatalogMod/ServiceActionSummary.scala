package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceActionSummary extends js.Object {
  /**
    * The self-service action definition type. For example, SSM_AUTOMATION.
    */
  var DefinitionType: js.UndefOr[ServiceActionDefinitionType] = js.undefined
  /**
    * The self-service action description.
    */
  var Description: js.UndefOr[ServiceActionDescription] = js.undefined
  /**
    * The self-service action identifier.
    */
  var Id: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.Id] = js.undefined
  /**
    * The self-service action name.
    */
  var Name: js.UndefOr[ServiceActionName] = js.undefined
}

object ServiceActionSummary {
  @scala.inline
  def apply(
    DefinitionType: ServiceActionDefinitionType = null,
    Description: ServiceActionDescription = null,
    Id: Id = null,
    Name: ServiceActionName = null
  ): ServiceActionSummary = {
    val __obj = js.Dynamic.literal()
    if (DefinitionType != null) __obj.updateDynamic("DefinitionType")(DefinitionType.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[ServiceActionSummary]
  }
}

