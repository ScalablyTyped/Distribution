package typings.awsSdk

import typings.awsSdk.opsworksMod.String
import typings.awsSdk.opsworksMod.Strings
import typings.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/opsworks.DescribeInstancesRequest & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait DescribeInstancesRequestwInstanceIds extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * An array of instance IDs to be described. If you use this parameter, DescribeInstances returns a description of the specified instances. Otherwise, it returns a description of every instance.
    */
  var InstanceIds: js.UndefOr[Strings] = js.native
  /**
    * A layer ID. If you use this parameter, DescribeInstances returns descriptions of the instances associated with the specified layer.
    */
  var LayerId: js.UndefOr[String] = js.native
  /**
    * A stack ID. If you use this parameter, DescribeInstances returns descriptions of the instances associated with the specified stack.
    */
  var StackId: js.UndefOr[String] = js.native
}

