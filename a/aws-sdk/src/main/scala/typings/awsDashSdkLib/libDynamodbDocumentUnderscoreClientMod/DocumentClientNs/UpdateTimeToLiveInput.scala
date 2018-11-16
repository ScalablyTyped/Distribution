package typings
package awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait UpdateTimeToLiveInput extends js.Object {
  /**
       * The name of the table to be configured.
       */
  var TableName: TableName
  /**
       * Represents the settings used to enable or disable Time to Live for the specified table.
       */
  var TimeToLiveSpecification: TimeToLiveSpecification
}

