package typings
package awsDashSdkLib.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RevisionInfo extends js.Object {
  /**
    * Information about an application revision, including usage details and associated deployment groups.
    */
  var genericRevisionInfo: js.UndefOr[GenericRevisionInfo] = js.undefined
  /**
    * Information about the location and type of an application revision.
    */
  var revisionLocation: js.UndefOr[RevisionLocation] = js.undefined
}

object RevisionInfo {
  @scala.inline
  def apply(genericRevisionInfo: GenericRevisionInfo = null, revisionLocation: RevisionLocation = null): RevisionInfo = {
    val __obj = js.Dynamic.literal()
    if (genericRevisionInfo != null) __obj.updateDynamic("genericRevisionInfo")(genericRevisionInfo)
    if (revisionLocation != null) __obj.updateDynamic("revisionLocation")(revisionLocation)
    __obj.asInstanceOf[RevisionInfo]
  }
}

