package typings.awsSdk

import typings.awsSdk.cloudformationMod.ChangeSetNameOrId
import typings.awsSdk.cloudformationMod.StackNameOrId
import typings.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/cloudformation.DescribeChangeSetInput & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait DescribeChangeSetInputwai extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * The name or Amazon Resource Name (ARN) of the change set that you want to describe.
    */
  var ChangeSetName: ChangeSetNameOrId = js.native
  /**
    * A string (provided by the DescribeChangeSet response output) that identifies the next page of information that you want to retrieve.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudformationMod.NextToken] = js.native
  /**
    * If you specified the name of a change set, specify the stack name or ID (ARN) of the change set you want to describe.
    */
  var StackName: js.UndefOr[StackNameOrId] = js.native
}

