package typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeGlobalTableSettingsInput extends js.Object {
  /**
    * The name of the global table to describe.
    */
  var GlobalTableName: TableName
}

object DescribeGlobalTableSettingsInput {
  @scala.inline
  def apply(GlobalTableName: TableName): DescribeGlobalTableSettingsInput = {
    val __obj = js.Dynamic.literal(GlobalTableName = GlobalTableName)
  
    __obj.asInstanceOf[DescribeGlobalTableSettingsInput]
  }
}

