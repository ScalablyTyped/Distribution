package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Predecessor extends js.Object {
  /**
    * The name of the job definition used by the predecessor job run.
    */
  var JobName: js.UndefOr[NameString] = js.undefined
  /**
    * The job-run ID of the predecessor job run.
    */
  var RunId: js.UndefOr[IdString] = js.undefined
}

object Predecessor {
  @scala.inline
  def apply(JobName: NameString = null, RunId: IdString = null): Predecessor = {
    val __obj = js.Dynamic.literal()
    if (JobName != null) __obj.updateDynamic("JobName")(JobName)
    if (RunId != null) __obj.updateDynamic("RunId")(RunId)
    __obj.asInstanceOf[Predecessor]
  }
}

