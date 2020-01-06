package typings.awsDashSdk.clientsSchemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeCodeBindingRequest extends js.Object {
  var Language: __string = js.native
  var RegistryName: __string = js.native
  var SchemaName: __string = js.native
  var SchemaVersion: js.UndefOr[__string] = js.native
}

object DescribeCodeBindingRequest {
  @scala.inline
  def apply(Language: __string, RegistryName: __string, SchemaName: __string, SchemaVersion: __string = null): DescribeCodeBindingRequest = {
    val __obj = js.Dynamic.literal(Language = Language.asInstanceOf[js.Any], RegistryName = RegistryName.asInstanceOf[js.Any], SchemaName = SchemaName.asInstanceOf[js.Any])
    if (SchemaVersion != null) __obj.updateDynamic("SchemaVersion")(SchemaVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCodeBindingRequest]
  }
}

