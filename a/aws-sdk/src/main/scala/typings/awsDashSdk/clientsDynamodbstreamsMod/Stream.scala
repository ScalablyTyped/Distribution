package typings.awsDashSdk.clientsDynamodbstreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stream extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the stream.
    */
  var StreamArn: js.UndefOr[typings.awsDashSdk.clientsDynamodbstreamsMod.StreamArn] = js.undefined
  /**
    * A timestamp, in ISO 8601 format, for this stream. Note that LatestStreamLabel is not a unique identifier for the stream, because it is possible that a stream from another table might have the same timestamp. However, the combination of the following three elements is guaranteed to be unique:   the AWS customer ID.   the table name   the StreamLabel   
    */
  var StreamLabel: js.UndefOr[String] = js.undefined
  /**
    * The DynamoDB table with which the stream is associated.
    */
  var TableName: js.UndefOr[typings.awsDashSdk.clientsDynamodbstreamsMod.TableName] = js.undefined
}

object Stream {
  @scala.inline
  def apply(StreamArn: StreamArn = null, StreamLabel: String = null, TableName: TableName = null): Stream = {
    val __obj = js.Dynamic.literal()
    if (StreamArn != null) __obj.updateDynamic("StreamArn")(StreamArn)
    if (StreamLabel != null) __obj.updateDynamic("StreamLabel")(StreamLabel)
    if (TableName != null) __obj.updateDynamic("TableName")(TableName)
    __obj.asInstanceOf[Stream]
  }
}

