package typings.awsDashSdk.clientsDynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeTimeToLiveInput extends js.Object {
  /**
    * The name of the table to be described.
    */
  var TableName: typings.awsDashSdk.clientsDynamodbMod.TableName
}

object DescribeTimeToLiveInput {
  @scala.inline
  def apply(TableName: TableName): DescribeTimeToLiveInput = {
    val __obj = js.Dynamic.literal(TableName = TableName)
  
    __obj.asInstanceOf[DescribeTimeToLiveInput]
  }
}

