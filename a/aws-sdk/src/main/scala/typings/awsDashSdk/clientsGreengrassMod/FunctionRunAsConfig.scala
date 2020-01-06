package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionRunAsConfig extends js.Object {
  /**
    * The group ID whose permissions are used to run a Lambda function.
    */
  var Gid: js.UndefOr[__integer] = js.native
  /**
    * The user ID whose permissions are used to run a Lambda function.
    */
  var Uid: js.UndefOr[__integer] = js.native
}

object FunctionRunAsConfig {
  @scala.inline
  def apply(Gid: Int | Double = null, Uid: Int | Double = null): FunctionRunAsConfig = {
    val __obj = js.Dynamic.literal()
    if (Gid != null) __obj.updateDynamic("Gid")(Gid.asInstanceOf[js.Any])
    if (Uid != null) __obj.updateDynamic("Uid")(Uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionRunAsConfig]
  }
}

