package typings
package awsDashSdkLib.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchGetApplicationsOutput extends js.Object {
  /**
    * Information about the applications.
    */
  var applicationsInfo: js.UndefOr[ApplicationsInfoList] = js.undefined
}

object BatchGetApplicationsOutput {
  @scala.inline
  def apply(applicationsInfo: ApplicationsInfoList = null): BatchGetApplicationsOutput = {
    val __obj = js.Dynamic.literal()
    if (applicationsInfo != null) __obj.updateDynamic("applicationsInfo")(applicationsInfo)
    __obj.asInstanceOf[BatchGetApplicationsOutput]
  }
}

