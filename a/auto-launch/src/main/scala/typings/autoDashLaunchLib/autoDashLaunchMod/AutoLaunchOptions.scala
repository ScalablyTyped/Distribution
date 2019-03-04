package typings
package autoDashLaunchLib.autoDashLaunchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoLaunchOptions extends js.Object {
  /**
    * Hidden on launch. Default is `false`.
    */
  var isHidden: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * For Mac-only options.
    */
  var mac: js.UndefOr[autoDashLaunchLib.Anon_UseLaunchAgent] = js.undefined
  /**
    * Application name.
    */
  var name: java.lang.String
  /**
    * Path to application. Default is `process.execPath`.
    */
  var path: js.UndefOr[java.lang.String] = js.undefined
}

object AutoLaunchOptions {
  @scala.inline
  def apply(
    name: java.lang.String,
    isHidden: js.UndefOr[scala.Boolean] = js.undefined,
    mac: autoDashLaunchLib.Anon_UseLaunchAgent = null,
    path: java.lang.String = null
  ): AutoLaunchOptions = {
    val __obj = js.Dynamic.literal(name = name)
    if (!js.isUndefined(isHidden)) __obj.updateDynamic("isHidden")(isHidden)
    if (mac != null) __obj.updateDynamic("mac")(mac)
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[AutoLaunchOptions]
  }
}

