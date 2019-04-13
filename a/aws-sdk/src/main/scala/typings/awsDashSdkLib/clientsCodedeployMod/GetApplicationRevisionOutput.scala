package typings
package awsDashSdkLib.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetApplicationRevisionOutput extends js.Object {
  /**
    * The name of the application that corresponds to the revision.
    */
  var applicationName: js.UndefOr[ApplicationName] = js.undefined
  /**
    * Additional information about the revision, including type and location.
    */
  var revision: js.UndefOr[RevisionLocation] = js.undefined
  /**
    * General information about the revision.
    */
  var revisionInfo: js.UndefOr[GenericRevisionInfo] = js.undefined
}

object GetApplicationRevisionOutput {
  @scala.inline
  def apply(
    applicationName: ApplicationName = null,
    revision: RevisionLocation = null,
    revisionInfo: GenericRevisionInfo = null
  ): GetApplicationRevisionOutput = {
    val __obj = js.Dynamic.literal()
    if (applicationName != null) __obj.updateDynamic("applicationName")(applicationName)
    if (revision != null) __obj.updateDynamic("revision")(revision)
    if (revisionInfo != null) __obj.updateDynamic("revisionInfo")(revisionInfo)
    __obj.asInstanceOf[GetApplicationRevisionOutput]
  }
}

