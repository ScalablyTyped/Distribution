package typings.awsSdk

import typings.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/cloudformation.DescribeStacksInput & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait DescribeStacksInputwaiter extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * A string that identifies the next page of stacks that you want to retrieve.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudformationMod.NextToken] = js.native
  /**
    * The name or the unique stack ID that is associated with the stack, which are not always interchangeable:   Running stacks: You can specify either the stack's name or its unique stack ID.   Deleted stacks: You must specify the unique stack ID.   Default: There is no default value.
    */
  var StackName: js.UndefOr[typings.awsSdk.cloudformationMod.StackName] = js.native
}

