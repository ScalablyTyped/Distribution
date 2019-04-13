package typings
package awsDashSdkLib.clientsEsMod

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
  def apply(AutomatedSnapshotStartHour: js.UndefOr[IntegerClass] = js.undefined): SnapshotOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AutomatedSnapshotStartHour)) __obj.updateDynamic("AutomatedSnapshotStartHour")(AutomatedSnapshotStartHour)
    __obj.asInstanceOf[SnapshotOptions]
  }
}

