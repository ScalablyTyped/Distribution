package typings.awsDashSdk.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotOptionsStatus extends js.Object {
  /**
    * Specifies the daily snapshot options specified for the Elasticsearch domain.
    */
  var Options: SnapshotOptions
  /**
    * Specifies the status of a daily automated snapshot.
    */
  var Status: OptionStatus
}

object SnapshotOptionsStatus {
  @scala.inline
  def apply(Options: SnapshotOptions, Status: OptionStatus): SnapshotOptionsStatus = {
    val __obj = js.Dynamic.literal(Options = Options, Status = Status)
  
    __obj.asInstanceOf[SnapshotOptionsStatus]
  }
}

