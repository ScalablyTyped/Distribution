package typings
package awsDashSdkLib.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserStorage extends js.Object {
  /**
    * The size of the user storage.
    */
  var Capacity: js.UndefOr[NonEmptyString] = js.undefined
}

object UserStorage {
  @scala.inline
  def apply(Capacity: NonEmptyString = null): UserStorage = {
    val __obj = js.Dynamic.literal()
    if (Capacity != null) __obj.updateDynamic("Capacity")(Capacity)
    __obj.asInstanceOf[UserStorage]
  }
}

