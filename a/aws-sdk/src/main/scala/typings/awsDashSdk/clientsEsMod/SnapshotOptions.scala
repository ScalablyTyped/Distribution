package typings.awsDashSdk.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotOptions extends js.Object {
  /**
    * Specifies the time, in UTC format, when the service takes a daily automated snapshot of the specified Elasticsearch domain. Default value is 0 hours.
    */
  var AutomatedSnapshotStartHour: js.UndefOr[IntegerClass] = js.undefined
}

object SnapshotOptions {
  @scala.inline
  def apply(AutomatedSnapshotStartHour: Int | scala.Double = null): SnapshotOptions = {
    val __obj = js.Dynamic.literal()
    if (AutomatedSnapshotStartHour != null) __obj.updateDynamic("AutomatedSnapshotStartHour")(AutomatedSnapshotStartHour.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotOptions]
  }
}

