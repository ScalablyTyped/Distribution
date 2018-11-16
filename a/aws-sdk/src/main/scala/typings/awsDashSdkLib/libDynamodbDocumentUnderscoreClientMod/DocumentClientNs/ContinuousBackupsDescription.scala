package typings
package awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ContinuousBackupsDescription extends js.Object {
  /**
       *  ContinuousBackupsStatus can be one of the following states: ENABLED, DISABLED
       */
  var ContinuousBackupsStatus: ContinuousBackupsStatus
  /**
       * The description of the point in time recovery settings applied to the table.
       */
  var PointInTimeRecoveryDescription: js.UndefOr[PointInTimeRecoveryDescription] = js.undefined
}

