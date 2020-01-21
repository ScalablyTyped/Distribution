package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SigninDelegateGroup extends js.Object {
  /**
    * The group name.
    */
  var GroupName: js.UndefOr[NonEmptyString] = js.native
}

object SigninDelegateGroup {
  @scala.inline
  def apply(GroupName: NonEmptyString = null): SigninDelegateGroup = {
    val __obj = js.Dynamic.literal()
    if (GroupName != null) __obj.updateDynamic("GroupName")(GroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SigninDelegateGroup]
  }
}

