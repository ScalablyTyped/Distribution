package typings
package adoneLib.adoneNs.shaniNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EngineOptions extends js.Object {
   // TODO: possible options to adone.js.compiler
  /**
    * Forca calling gc function after each processed file
    */
  var callGc: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Default timeout for hooks
    */
  var defaultHookTimeout: js.UndefOr[scala.Double] = js.undefined
  /**
    * Default timeout for tests and block
    */
  var defaultTimeout: js.UndefOr[scala.Double] = js.undefined
  /**
    * Options that transplirer uses when loads tests from files
    */
  var transpilerOptions: js.UndefOr[js.Object] = js.undefined
}

object EngineOptions {
  @scala.inline
  def apply(
    callGc: js.UndefOr[scala.Boolean] = js.undefined,
    defaultHookTimeout: scala.Int | scala.Double = null,
    defaultTimeout: scala.Int | scala.Double = null,
    transpilerOptions: js.Object = null
  ): EngineOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(callGc)) __obj.updateDynamic("callGc")(callGc)
    if (defaultHookTimeout != null) __obj.updateDynamic("defaultHookTimeout")(defaultHookTimeout.asInstanceOf[js.Any])
    if (defaultTimeout != null) __obj.updateDynamic("defaultTimeout")(defaultTimeout.asInstanceOf[js.Any])
    if (transpilerOptions != null) __obj.updateDynamic("transpilerOptions")(transpilerOptions)
    __obj.asInstanceOf[EngineOptions]
  }
}

