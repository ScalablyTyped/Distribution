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

