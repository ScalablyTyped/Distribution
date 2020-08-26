package typings.awsSdk.anon

import typings.awsSdk.kinesisMod.DescribeStreamInputLimit
import typings.awsSdk.kinesisMod.ShardId
import typings.awsSdk.kinesisMod.StreamName
import typings.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/kinesis.DescribeStreamInput & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
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

object DescribeStreamInputwaiter {
  @scala.inline
  def apply(StreamName: StreamName): DescribeStreamInputwaiter = {
    val __obj = js.Dynamic.literal(StreamName = StreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStreamInputwaiter]
  }
  @scala.inline
  implicit class DescribeStreamInputwaiterOps[Self <: DescribeStreamInputwaiter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setStreamName(value: StreamName): Self = this.set("StreamName", value.asInstanceOf[js.Any])
    @scala.inline
    def set$waiter(value: WaiterConfiguration): Self = this.set("$waiter", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$waiter: Self = this.set("$waiter", js.undefined)
    @scala.inline
    def setExclusiveStartShardId(value: ShardId): Self = this.set("ExclusiveStartShardId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclusiveStartShardId: Self = this.set("ExclusiveStartShardId", js.undefined)
    @scala.inline
    def setLimit(value: DescribeStreamInputLimit): Self = this.set("Limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("Limit", js.undefined)
  }
  
}

