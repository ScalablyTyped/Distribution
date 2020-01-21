package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateConnection extends UpdateConnection {
  /**
    * The name of the connection. Must start and end with an
    * alphanumeric character and can only contain alphanumeric
    * characters and '-'. Max length 128.
    */
  var name: String
  /**
    * The identity provider identifier for the connection.
    */
  var strategy: Strategy
}

object CreateConnection {
  @scala.inline
  def apply(
    name: String,
    strategy: Strategy,
    enabled_clients: js.Array[String] = null,
    is_domain_connection: js.UndefOr[Boolean] = js.undefined,
    metadata: js.Any = null,
    options: js.Any = null,
    realms: js.Array[String] = null
  ): CreateConnection = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any])
    if (enabled_clients != null) __obj.updateDynamic("enabled_clients")(enabled_clients.asInstanceOf[js.Any])
    if (!js.isUndefined(is_domain_connection)) __obj.updateDynamic("is_domain_connection")(is_domain_connection.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (realms != null) __obj.updateDynamic("realms")(realms.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConnection]
  }
}

