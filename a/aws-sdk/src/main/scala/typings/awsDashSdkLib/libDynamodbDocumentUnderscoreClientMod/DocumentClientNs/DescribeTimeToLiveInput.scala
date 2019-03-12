package typings
package awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeTimeToLiveInput extends js.Object {
  /**
    * The name of the table to be described.
    */
  var TableName: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TableName
}

object DescribeTimeToLiveInput {
  @scala.inline
  def apply(TableName: TableName): DescribeTimeToLiveInput = {
    val __obj = js.Dynamic.literal(TableName = TableName)
  
    __obj.asInstanceOf[DescribeTimeToLiveInput]
  }
}

