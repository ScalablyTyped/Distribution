package typings.awsSdk

import typings.awsSdk.kinesisMod.DescribeStreamInputLimit
import typings.awsSdk.kinesisMod.ShardId
import typings.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/kinesis.DescribeStreamInput & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait DescribeStreamInputwaiter extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * The shard ID of the shard to start with.
    */
  var ExclusiveStartShardId: js.UndefOr[ShardId] = js.native
  /**
    * The maximum number of shards to return in a single call. The default value is 100. If you specify a value greater than 100, at most 100 shards are returned.
    */
  var Limit: js.UndefOr[DescribeStreamInputLimit] = js.native
  /**
    * The name of the stream to describe.
    */
  var StreamName: typings.awsSdk.kinesisMod.StreamName = js.native
}

