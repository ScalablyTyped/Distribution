package typings.awsDashSdk.clientsKinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateStreamInput extends js.Object {
  /**
    * The number of shards that the stream will use. The throughput of the stream is a function of the number of shards; more shards are required for greater provisioned throughput. DefaultShardLimit;
    */
  var ShardCount: PositiveIntegerObject
  /**
    * A name to identify the stream. The stream name is scoped to the AWS account used by the application that creates the stream. It is also scoped by AWS Region. That is, two streams in two different AWS accounts can have the same name. Two streams in the same AWS account but in two different Regions can also have the same name.
    */
  var StreamName: typings.awsDashSdk.clientsKinesisMod.StreamName
}

object CreateStreamInput {
  @scala.inline
  def apply(ShardCount: PositiveIntegerObject, StreamName: StreamName): CreateStreamInput = {
    val __obj = js.Dynamic.literal(ShardCount = ShardCount, StreamName = StreamName)
  
    __obj.asInstanceOf[CreateStreamInput]
  }
}

