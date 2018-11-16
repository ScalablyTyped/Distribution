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

