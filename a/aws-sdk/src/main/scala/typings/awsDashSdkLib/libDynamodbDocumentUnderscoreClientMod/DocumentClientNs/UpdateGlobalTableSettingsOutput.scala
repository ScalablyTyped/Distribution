package typings
package awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait UpdateGlobalTableSettingsOutput extends js.Object {
  /**
       * The name of the global table.
       */
  var GlobalTableName: js.UndefOr[TableName] = js.undefined
  /**
       * The region specific settings for the global table.
       */
  var ReplicaSettings: js.UndefOr[ReplicaSettingsDescriptionList] = js.undefined
}

