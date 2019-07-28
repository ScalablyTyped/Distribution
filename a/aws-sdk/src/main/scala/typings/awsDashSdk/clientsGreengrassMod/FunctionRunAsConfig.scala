package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionRunAsConfig extends js.Object {
  /**
    * The group ID whose permissions are used to run a Lambda function.
    */
  var Gid: js.UndefOr[__integer] = js.undefined
  /**
    * The user ID whose permissions are used to run a Lambda function.
    */
  var Uid: js.UndefOr[__integer] = js.undefined
}

object FunctionRunAsConfig {
  @scala.inline
  def apply(Gid: js.UndefOr[__integer] = js.undefined, Uid: js.UndefOr[__integer] = js.undefined): FunctionRunAsConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Gid)) __obj.updateDynamic("Gid")(Gid)
    if (!js.isUndefined(Uid)) __obj.updateDynamic("Uid")(Uid)
    __obj.asInstanceOf[FunctionRunAsConfig]
  }
}

