package typings
package awsDashSdkLib.clientsDynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeGlobalTableSettingsOutput extends js.Object {
  /**
    * The name of the global table.
    */
  var GlobalTableName: js.UndefOr[TableName] = js.undefined
  /**
    * The Region-specific settings for the global table.
    */
  var ReplicaSettings: js.UndefOr[ReplicaSettingsDescriptionList] = js.undefined
}

object DescribeGlobalTableSettingsOutput {
  @scala.inline
  def apply(GlobalTableName: TableName = null, ReplicaSettings: ReplicaSettingsDescriptionList = null): DescribeGlobalTableSettingsOutput = {
    val __obj = js.Dynamic.literal()
    if (GlobalTableName != null) __obj.updateDynamic("GlobalTableName")(GlobalTableName)
    if (ReplicaSettings != null) __obj.updateDynamic("ReplicaSettings")(ReplicaSettings)
    __obj.asInstanceOf[DescribeGlobalTableSettingsOutput]
  }
}

