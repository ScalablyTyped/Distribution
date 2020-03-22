package typings.awsSdk

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
  var Language: string = js.native
  var RegistryName: string = js.native
  var SchemaName: string = js.native
  var SchemaVersion: js.UndefOr[string] = js.native
}

