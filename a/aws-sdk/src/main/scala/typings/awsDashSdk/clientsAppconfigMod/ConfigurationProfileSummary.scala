package typings.awsDashSdk.clientsAppconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationProfileSummary extends js.Object {
  /**
    * The application ID.
    */
  var ApplicationId: js.UndefOr[Id] = js.native
  /**
    * The ID of the configuration profile.
    */
  var Id: js.UndefOr[typings.awsDashSdk.clientsAppconfigMod.Id] = js.native
  /**
    * The URI location of the configuration.
    */
  var LocationUri: js.UndefOr[Uri] = js.native
  /**
    * The name of the configuration profile.
    */
  var Name: js.UndefOr[typings.awsDashSdk.clientsAppconfigMod.Name] = js.native
  /**
    * The types of validators in the configuration profile.
    */
  var ValidatorTypes: js.UndefOr[ValidatorTypeList] = js.native
}

object ConfigurationProfileSummary {
  @scala.inline
  def apply(
    ApplicationId: Id = null,
    Id: Id = null,
    LocationUri: Uri = null,
    Name: Name = null,
    ValidatorTypes: ValidatorTypeList = null
  ): ConfigurationProfileSummary = {
    val __obj = js.Dynamic.literal()
    if (ApplicationId != null) __obj.updateDynamic("ApplicationId")(ApplicationId.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (LocationUri != null) __obj.updateDynamic("LocationUri")(LocationUri.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (ValidatorTypes != null) __obj.updateDynamic("ValidatorTypes")(ValidatorTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationProfileSummary]
  }
}

