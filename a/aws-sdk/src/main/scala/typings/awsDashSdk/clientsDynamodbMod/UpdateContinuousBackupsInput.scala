package typings.awsDashSdk.clientsDynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateContinuousBackupsInput extends js.Object {
  /**
    * Represents the settings used to enable point in time recovery.
    */
  var PointInTimeRecoverySpecification: typings.awsDashSdk.clientsDynamodbMod.PointInTimeRecoverySpecification
  /**
    * The name of the table.
    */
  var TableName: typings.awsDashSdk.clientsDynamodbMod.TableName
}

object UpdateContinuousBackupsInput {
  @scala.inline
  def apply(PointInTimeRecoverySpecification: PointInTimeRecoverySpecification, TableName: TableName): UpdateContinuousBackupsInput = {
    val __obj = js.Dynamic.literal(PointInTimeRecoverySpecification = PointInTimeRecoverySpecification, TableName = TableName)
  
    __obj.asInstanceOf[UpdateContinuousBackupsInput]
  }
}

