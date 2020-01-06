package typings.awsDashSdk.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTypeInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the type. Conditional: You must specify TypeName or Arn.
    */
  var Arn: js.UndefOr[TypeArn] = js.native
  /**
    * The kind of type.  Currently the only valid value is RESOURCE.
    */
  var Type: js.UndefOr[RegistryType] = js.native
  /**
    * The name of the type. Conditional: You must specify TypeName or Arn.
    */
  var TypeName: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.TypeName] = js.native
  /**
    * The ID of a specific version of the type. The version ID is the value at the end of the Amazon Resource Name (ARN) assigned to the type version when it is registered. If you specify a VersionId, DescribeType returns information about that specific type version. Otherwise, it returns information about the default type version.
    */
  var VersionId: js.UndefOr[TypeVersionId] = js.native
}

object DescribeTypeInput {
  @scala.inline
  def apply(
    Arn: TypeArn = null,
    Type: RegistryType = null,
    TypeName: TypeName = null,
    VersionId: TypeVersionId = null
  ): DescribeTypeInput = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (TypeName != null) __obj.updateDynamic("TypeName")(TypeName.asInstanceOf[js.Any])
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTypeInput]
  }
}

