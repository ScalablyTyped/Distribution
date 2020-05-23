package typings.awsSdk.anon

import typings.awsSdk.schemasMod.string
import typings.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/schemas.DescribeCodeBindingRequest & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait DescribeCodeBindingReques extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * The language of the code binding.
    */
  var Language: string = js.native
  /**
    * The name of the registry.
    */
  var RegistryName: string = js.native
  /**
    * The name of the schema.
    */
  var SchemaName: string = js.native
  /**
    * Specifying this limits the results to only this schema version.
    */
  var SchemaVersion: js.UndefOr[string] = js.native
}

object DescribeCodeBindingReques {
  @scala.inline
  def apply(
    Language: string,
    RegistryName: string,
    SchemaName: string,
    $waiter: WaiterConfiguration = null,
    SchemaVersion: string = null
  ): DescribeCodeBindingReques = {
    val __obj = js.Dynamic.literal(Language = Language.asInstanceOf[js.Any], RegistryName = RegistryName.asInstanceOf[js.Any], SchemaName = SchemaName.asInstanceOf[js.Any])
    if ($waiter != null) __obj.updateDynamic("$waiter")($waiter.asInstanceOf[js.Any])
    if (SchemaVersion != null) __obj.updateDynamic("SchemaVersion")(SchemaVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCodeBindingReques]
  }
}

