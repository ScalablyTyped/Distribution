package typings
package auth0Lib.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait UpdateConnection extends js.Object {
  /**
     * The identifiers of the clients for which the connection is to
     * be enabled. If the array is empty or the property is not
     * specified, no clients are enabled.
     */
  var enabled_clients: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
   * True if the connection is domain level.
   */
  var is_domain_connection: js.UndefOr[scala.Boolean] = js.undefined
  var metadata: js.UndefOr[js.Any] = js.undefined
  var options: js.UndefOr[js.Any] = js.undefined
  /**
     * Defines the realms for which the connection will be used
     * (ie: email domains). If the array is empty or the property is
     * not specified, the connection name will be added as realm.
     */
  var realms: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

