package typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateTimeToLiveInput extends js.Object {
  /**
    * The name of the table to be configured.
    */
  var TableName: typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TableName
  /**
    * Represents the settings used to enable or disable Time to Live for the specified table.
    */
  var TimeToLiveSpecification: typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TimeToLiveSpecification
}

object UpdateTimeToLiveInput {
  @scala.inline
  def apply(TableName: TableName, TimeToLiveSpecification: TimeToLiveSpecification): UpdateTimeToLiveInput = {
    val __obj = js.Dynamic.literal(TableName = TableName, TimeToLiveSpecification = TimeToLiveSpecification)
  
    __obj.asInstanceOf[UpdateTimeToLiveInput]
  }
}

