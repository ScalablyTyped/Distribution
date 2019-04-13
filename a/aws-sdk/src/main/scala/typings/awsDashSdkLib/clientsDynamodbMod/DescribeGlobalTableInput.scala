package typings
package awsDashSdkLib.clientsDynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeGlobalTableInput extends js.Object {
  /**
    * The name of the global table.
    */
  var GlobalTableName: TableName
}

object DescribeGlobalTableInput {
  @scala.inline
  def apply(GlobalTableName: TableName): DescribeGlobalTableInput = {
    val __obj = js.Dynamic.literal(GlobalTableName = GlobalTableName)
  
    __obj.asInstanceOf[DescribeGlobalTableInput]
  }
}

