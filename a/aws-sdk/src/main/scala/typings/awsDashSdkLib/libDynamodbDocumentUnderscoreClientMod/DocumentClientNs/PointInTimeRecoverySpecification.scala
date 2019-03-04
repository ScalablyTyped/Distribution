package typings
package awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointInTimeRecoverySpecification extends js.Object {
  /**
    * Indicates whether point in time recovery is enabled (true) or disabled (false) on the table.
    */
  var PointInTimeRecoveryEnabled: BooleanObject
}

object PointInTimeRecoverySpecification {
  @scala.inline
  def apply(PointInTimeRecoveryEnabled: BooleanObject): PointInTimeRecoverySpecification = {
    val __obj = js.Dynamic.literal(PointInTimeRecoveryEnabled = PointInTimeRecoveryEnabled)
  
    __obj.asInstanceOf[PointInTimeRecoverySpecification]
  }
}

