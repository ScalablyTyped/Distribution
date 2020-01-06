package typings.awsDashSdk.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DependencyRevision extends js.Object {
  /**
    * The ID of the workflow or system.
    */
  var id: js.UndefOr[Urn] = js.native
  /**
    * The revision number of the workflow or system.
    */
  var revisionNumber: js.UndefOr[Version] = js.native
}

object DependencyRevision {
  @scala.inline
  def apply(id: Urn = null, revisionNumber: Int | Double = null): DependencyRevision = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (revisionNumber != null) __obj.updateDynamic("revisionNumber")(revisionNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[DependencyRevision]
  }
}

