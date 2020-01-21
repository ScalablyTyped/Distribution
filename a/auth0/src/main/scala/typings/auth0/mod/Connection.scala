package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Connection extends UpdateConnection {
  /**
    * The connection's identifier.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * The name of the connection.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The type of the connection, related to the identity provider.
    */
  var strategy: js.UndefOr[Strategy] = js.undefined
}

object Connection {
  @scala.inline
  def apply(
    enabled_clients: js.Array[String] = null,
    id: String = null,
    is_domain_connection: js.UndefOr[Boolean] = js.undefined,
    metadata: js.Any = null,
    name: String = null,
    options: js.Any = null,
    realms: js.Array[String] = null,
    strategy: Strategy = null
  ): Connection = {
    val __obj = js.Dynamic.literal()
    if (enabled_clients != null) __obj.updateDynamic("enabled_clients")(enabled_clients.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(is_domain_connection)) __obj.updateDynamic("is_domain_connection")(is_domain_connection.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (realms != null) __obj.updateDynamic("realms")(realms.asInstanceOf[js.Any])
    if (strategy != null) __obj.updateDynamic("strategy")(strategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Connection]
  }
}

