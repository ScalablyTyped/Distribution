package typings.auth0.auth0Mod

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
    val __obj = js.Dynamic.literal(name = name, strategy = strategy)
    if (enabled_clients != null) __obj.updateDynamic("enabled_clients")(enabled_clients)
    if (!js.isUndefined(is_domain_connection)) __obj.updateDynamic("is_domain_connection")(is_domain_connection)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (options != null) __obj.updateDynamic("options")(options)
    if (realms != null) __obj.updateDynamic("realms")(realms)
    __obj.asInstanceOf[CreateConnection]
  }
}

