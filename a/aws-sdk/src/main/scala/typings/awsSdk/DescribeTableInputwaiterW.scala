package typings.awsSdk

import typings.awsSdk.dynamodbMod.TableName
import typings.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/dynamodb.DescribeTableInput & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait DescribeTableInputwaiterW extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * The name of the table to describe.
    */
  var TableName: typings.awsSdk.dynamodbMod.TableName = js.native
}

object DescribeTableInputwaiterW {
  @scala.inline
  def apply(TableName: TableName, $waiter: WaiterConfiguration = null): DescribeTableInputwaiterW = {
    val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
    if ($waiter != null) __obj.updateDynamic("$waiter")($waiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTableInputwaiterW]
  }
}

