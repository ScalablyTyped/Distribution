package typings
package awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeTableInput extends js.Object {
  /**
    * The name of the table to describe.
    */
  var TableName: TableName
}

object DescribeTableInput {
  @scala.inline
  def apply(TableName: TableName): DescribeTableInput = {
    val __obj = js.Dynamic.literal(TableName = TableName)
  
    __obj.asInstanceOf[DescribeTableInput]
  }
}

