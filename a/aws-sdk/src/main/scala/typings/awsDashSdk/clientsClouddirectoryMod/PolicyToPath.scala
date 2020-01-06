package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyToPath extends js.Object {
  /**
    * The path that is referenced from the root.
    */
  var Path: js.UndefOr[PathString] = js.native
  /**
    * List of policy objects.
    */
  var Policies: js.UndefOr[PolicyAttachmentList] = js.native
}

object PolicyToPath {
  @scala.inline
  def apply(Path: PathString = null, Policies: PolicyAttachmentList = null): PolicyToPath = {
    val __obj = js.Dynamic.literal()
    if (Path != null) __obj.updateDynamic("Path")(Path.asInstanceOf[js.Any])
    if (Policies != null) __obj.updateDynamic("Policies")(Policies.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyToPath]
  }
}

