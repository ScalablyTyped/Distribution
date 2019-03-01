package typings
package adoneLib.adoneNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LazifyOptions extends js.Object {
  /**
    * Whether the new properties are configurable, false by default
    */
  var configurable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A custom mapper for values, by default returns the exported object (module.exports),
    * but if the object is a transpiled es module and the default export is defined,
    * it returns the default export
    *
    * @param key property
    * @param mod module.exports
    */
  var mapper: js.UndefOr[js.Function2[/* key */ java.lang.String, /* mod */ js.Any, _]] = js.undefined
  /**
    * Whether the new properties are writable, false by default
    */
  var writable: js.UndefOr[scala.Boolean] = js.undefined
}

object LazifyOptions {
  @scala.inline
  def apply(
    configurable: js.UndefOr[scala.Boolean] = js.undefined,
    mapper: js.Function2[/* key */ java.lang.String, /* mod */ js.Any, _] = null,
    writable: js.UndefOr[scala.Boolean] = js.undefined
  ): LazifyOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(configurable)) __obj.updateDynamic("configurable")(configurable)
    if (mapper != null) __obj.updateDynamic("mapper")(mapper)
    if (!js.isUndefined(writable)) __obj.updateDynamic("writable")(writable)
    __obj.asInstanceOf[LazifyOptions]
  }
}

