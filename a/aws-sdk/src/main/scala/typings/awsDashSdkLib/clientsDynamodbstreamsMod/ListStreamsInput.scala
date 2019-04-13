package typings
package awsDashSdkLib.clientsDynamodbstreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListStreamsInput extends js.Object {
  /**
    * The ARN (Amazon Resource Name) of the first item that this operation will evaluate. Use the value that was returned for LastEvaluatedStreamArn in the previous operation. 
    */
  var ExclusiveStartStreamArn: js.UndefOr[StreamArn] = js.undefined
  /**
    * The maximum number of streams to return. The upper limit is 100.
    */
  var Limit: js.UndefOr[PositiveIntegerObject] = js.undefined
  /**
    * If this parameter is provided, then only the streams associated with this table name are returned.
    */
  var TableName: js.UndefOr[TableName] = js.undefined
}

object ListStreamsInput {
  @scala.inline
  def apply(
    ExclusiveStartStreamArn: StreamArn = null,
    Limit: js.UndefOr[PositiveIntegerObject] = js.undefined,
    TableName: TableName = null
  ): ListStreamsInput = {
    val __obj = js.Dynamic.literal()
    if (ExclusiveStartStreamArn != null) __obj.updateDynamic("ExclusiveStartStreamArn")(ExclusiveStartStreamArn)
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit)
    if (TableName != null) __obj.updateDynamic("TableName")(TableName)
    __obj.asInstanceOf[ListStreamsInput]
  }
}

