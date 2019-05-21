package typings
package awsDashSdkLib.clientsMediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PackagingGroup extends js.Object {
  /**
    * The ARN of the PackagingGroup.
    */
  var Arn: js.UndefOr[__string] = js.undefined
  /**
    * The ID of the PackagingGroup.
    */
  var Id: js.UndefOr[__string] = js.undefined
}

object PackagingGroup {
  @scala.inline
  def apply(Arn: __string = null, Id: __string = null): PackagingGroup = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    __obj.asInstanceOf[PackagingGroup]
  }
}

