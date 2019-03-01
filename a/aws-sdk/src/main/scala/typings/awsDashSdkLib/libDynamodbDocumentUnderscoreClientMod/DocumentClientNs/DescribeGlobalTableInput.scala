package typings
package awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("GlobalTableName")(GlobalTableName)
    __obj.asInstanceOf[DescribeGlobalTableInput]
  }
}

