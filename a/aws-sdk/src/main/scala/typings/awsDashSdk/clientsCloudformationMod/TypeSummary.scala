package typings.awsDashSdk.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeSummary extends js.Object {
  /**
    * The ID of the default version of the type. The default version is used when the type version is not specified. To set the default version of a type, use  SetTypeDefaultVersion . 
    */
  var DefaultVersionId: js.UndefOr[TypeVersionId] = js.native
  /**
    * The description of the type.
    */
  var Description: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.Description] = js.native
  /**
    * When the current default version of the type was registered.
    */
  var LastUpdated: js.UndefOr[Timestamp] = js.native
  /**
    * The kind of type.
    */
  var Type: js.UndefOr[RegistryType] = js.native
  /**
    * The Amazon Resource Name (ARN) of the type.
    */
  var TypeArn: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.TypeArn] = js.native
  /**
    * The name of the type.
    */
  var TypeName: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.TypeName] = js.native
}

object TypeSummary {
  @scala.inline
  def apply(
    DefaultVersionId: TypeVersionId = null,
    Description: Description = null,
    LastUpdated: Timestamp = null,
    Type: RegistryType = null,
    TypeArn: TypeArn = null,
    TypeName: TypeName = null
  ): TypeSummary = {
    val __obj = js.Dynamic.literal()
    if (DefaultVersionId != null) __obj.updateDynamic("DefaultVersionId")(DefaultVersionId.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (LastUpdated != null) __obj.updateDynamic("LastUpdated")(LastUpdated.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (TypeArn != null) __obj.updateDynamic("TypeArn")(TypeArn.asInstanceOf[js.Any])
    if (TypeName != null) __obj.updateDynamic("TypeName")(TypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeSummary]
  }
}

