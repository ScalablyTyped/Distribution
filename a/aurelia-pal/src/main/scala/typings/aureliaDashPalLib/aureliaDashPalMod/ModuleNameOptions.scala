package typings
package aureliaDashPalLib.aureliaDashPalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleNameOptions extends js.Object {
  /**
    * Add the module to a chunk by name
    */
  var chunk: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Optionally declare which exports are used. This enables tree-shaking when only few out of many exports are used.
    */
  var exports: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object ModuleNameOptions {
  @scala.inline
  def apply(chunk: java.lang.String = null, exports: js.Array[java.lang.String] = null): ModuleNameOptions = {
    val __obj = js.Dynamic.literal()
    if (chunk != null) __obj.updateDynamic("chunk")(chunk)
    if (exports != null) __obj.updateDynamic("exports")(exports)
    __obj.asInstanceOf[ModuleNameOptions]
  }
}

