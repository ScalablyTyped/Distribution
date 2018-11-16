package typings
package awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TimeToLiveSpecification extends js.Object {
  /**
       * The name of the Time to Live attribute used to store the expiration time for items in the table.
       */
  var AttributeName: TimeToLiveAttributeName
  /**
       * Indicates whether Time To Live is to be enabled (true) or disabled (false) on the table.
       */
  var Enabled: TimeToLiveEnabled
}

