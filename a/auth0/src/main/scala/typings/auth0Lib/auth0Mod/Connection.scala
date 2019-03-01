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

object Connection {
  @scala.inline
  def apply(
    enabled_clients: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    is_domain_connection: js.UndefOr[scala.Boolean] = js.undefined,
    metadata: js.Any = null,
    name: java.lang.String = null,
    options: js.Any = null,
    realms: js.Array[java.lang.String] = null,
    strategy: Strategy = null
  ): Connection = {
    val __obj = js.Dynamic.literal()
    if (enabled_clients != null) __obj.updateDynamic("enabled_clients")(enabled_clients)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(is_domain_connection)) __obj.updateDynamic("is_domain_connection")(is_domain_connection)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (name != null) __obj.updateDynamic("name")(name)
    if (options != null) __obj.updateDynamic("options")(options)
    if (realms != null) __obj.updateDynamic("realms")(realms)
    if (strategy != null) __obj.updateDynamic("strategy")(strategy)
    __obj.asInstanceOf[Connection]
  }
}

