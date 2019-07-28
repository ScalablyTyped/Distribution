package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyToPath extends js.Object {
  /**
    * The path that is referenced from the root.
    */
  var Path: js.UndefOr[PathString] = js.undefined
  /**
    * List of policy objects.
    */
  var Policies: js.UndefOr[PolicyAttachmentList] = js.undefined
}

object PolicyToPath {
  @scala.inline
  def apply(Path: PathString = null, Policies: PolicyAttachmentList = null): PolicyToPath = {
    val __obj = js.Dynamic.literal()
    if (Path != null) __obj.updateDynamic("Path")(Path)
    if (Policies != null) __obj.updateDynamic("Policies")(Policies)
    __obj.asInstanceOf[PolicyToPath]
  }
}

