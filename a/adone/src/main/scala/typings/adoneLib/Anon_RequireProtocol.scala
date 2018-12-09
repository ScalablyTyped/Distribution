package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_RequireProtocol extends js.Object {
  /**
               * Whether to allow urls like "//example.com", default `false`
               */
  var allowProtocolRelativeUrls: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * List of valid protocols.
               * Used when requireValidProtocol is `true`.
               * Default ["http", "https", "ftp"]
               */
  var protocols: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
               * Whether to require host, default `true`
               */
  var requireHost: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * Whether to require protocol, default `true`
               */
  var requireProtocol: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * Whether to require valid protocol defined in `protocols` options, default `true`
               */
  var requireValidProtocol: js.UndefOr[scala.Boolean] = js.undefined
}

