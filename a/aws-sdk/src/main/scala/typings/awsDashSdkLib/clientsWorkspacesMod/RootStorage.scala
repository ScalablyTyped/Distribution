package typings
package awsDashSdkLib.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RootStorage extends js.Object {
  /**
    * The size of the root volume.
    */
  var Capacity: js.UndefOr[NonEmptyString] = js.undefined
}

object RootStorage {
  @scala.inline
  def apply(Capacity: NonEmptyString = null): RootStorage = {
    val __obj = js.Dynamic.literal()
    if (Capacity != null) __obj.updateDynamic("Capacity")(Capacity)
    __obj.asInstanceOf[RootStorage]
  }
}

