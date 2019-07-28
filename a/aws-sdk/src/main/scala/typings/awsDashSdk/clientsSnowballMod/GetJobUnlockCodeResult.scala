package typings.awsDashSdk.clientsSnowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetJobUnlockCodeResult extends js.Object {
  /**
    * The UnlockCode value for the specified job. The UnlockCode value can be accessed for up to 90 days after the job has been created.
    */
  var UnlockCode: js.UndefOr[String] = js.undefined
}

object GetJobUnlockCodeResult {
  @scala.inline
  def apply(UnlockCode: String = null): GetJobUnlockCodeResult = {
    val __obj = js.Dynamic.literal()
    if (UnlockCode != null) __obj.updateDynamic("UnlockCode")(UnlockCode)
    __obj.asInstanceOf[GetJobUnlockCodeResult]
  }
}

