package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceActionSummary extends js.Object {
  /**
    * The self-service action definition type. For example, SSM_AUTOMATION.
    */
  var DefinitionType: js.UndefOr[ServiceActionDefinitionType] = js.native
  /**
    * The self-service action description.
    */
  var Description: js.UndefOr[ServiceActionDescription] = js.native
  /**
    * The self-service action identifier.
    */
  var Id: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.Id] = js.native
  /**
    * The self-service action name.
    */
  var Name: js.UndefOr[ServiceActionName] = js.native
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
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceActionSummary]
  }
}

