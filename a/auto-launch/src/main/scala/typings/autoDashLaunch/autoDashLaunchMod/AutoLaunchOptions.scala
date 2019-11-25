package typings.autoDashLaunch.autoDashLaunchMod

import typings.autoDashLaunch.Anon_UseLaunchAgent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoLaunchOptions extends js.Object {
  /**
    * Hidden on launch. Default is `false`.
    */
  var isHidden: js.UndefOr[Boolean] = js.undefined
  /**
    * For Mac-only options.
    */
  var mac: js.UndefOr[Anon_UseLaunchAgent] = js.undefined
  /**
    * Application name.
    */
  var name: String
  /**
    * Path to application. Default is `process.execPath`.
    */
  var path: js.UndefOr[String] = js.undefined
}

object AutoLaunchOptions {
  @scala.inline
  def apply(
    name: String,
    isHidden: js.UndefOr[Boolean] = js.undefined,
    mac: Anon_UseLaunchAgent = null,
    path: String = null
  ): AutoLaunchOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(isHidden)) __obj.updateDynamic("isHidden")(isHidden.asInstanceOf[js.Any])
    if (mac != null) __obj.updateDynamic("mac")(mac.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoLaunchOptions]
  }
}

