package typings
package auth0Lib.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Connection extends UpdateConnection {
  /**
     * The connection's identifier.
     */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
     * The name of the connection.
     */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
     * The type of the connection, related to the identity provider.
     */
  var strategy: js.UndefOr[Strategy] = js.undefined
}

