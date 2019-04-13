package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchRecord extends js.Object {
  /**
    * A TrainingJob object that is returned as part of a Search request.
    */
  var TrainingJob: js.UndefOr[TrainingJob] = js.undefined
}

object SearchRecord {
  @scala.inline
  def apply(TrainingJob: TrainingJob = null): SearchRecord = {
    val __obj = js.Dynamic.literal()
    if (TrainingJob != null) __obj.updateDynamic("TrainingJob")(TrainingJob)
    __obj.asInstanceOf[SearchRecord]
  }
}

