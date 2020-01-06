package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RevisionInfo extends js.Object {
  /**
    * Information about an application revision, including usage details and associated deployment groups.
    */
  var genericRevisionInfo: js.UndefOr[GenericRevisionInfo] = js.native
  /**
    * Information about the location and type of an application revision.
    */
  var revisionLocation: js.UndefOr[RevisionLocation] = js.native
}

object RevisionInfo {
  @scala.inline
  def apply(genericRevisionInfo: GenericRevisionInfo = null, revisionLocation: RevisionLocation = null): RevisionInfo = {
    val __obj = js.Dynamic.literal()
    if (genericRevisionInfo != null) __obj.updateDynamic("genericRevisionInfo")(genericRevisionInfo.asInstanceOf[js.Any])
    if (revisionLocation != null) __obj.updateDynamic("revisionLocation")(revisionLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevisionInfo]
  }
}

