package typings.auth0.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateConnection extends js.Object {
  /**
    * The identifiers of the clients for which the connection is to
    * be enabled. If the array is empty or the property is not
    * specified, no clients are enabled.
    */
  var enabled_clients: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * True if the connection is domain level.
    */
  var is_domain_connection: js.UndefOr[Boolean] = js.undefined
  var metadata: js.UndefOr[js.Any] = js.undefined
  var options: js.UndefOr[js.Any] = js.undefined
  /**
    * Defines the realms for which the connection will be used
    * (ie: email domains). If the array is empty or the property is
    * not specified, the connection name will be added as realm.
    */
  var realms: js.UndefOr[js.Array[String]] = js.undefined
}

object UpdateConnection {
  @scala.inline
  def apply(
    enabled_clients: js.Array[String] = null,
    is_domain_connection: js.UndefOr[Boolean] = js.undefined,
    metadata: js.Any = null,
    options: js.Any = null,
    realms: js.Array[String] = null
  ): UpdateConnection = {
    val __obj = js.Dynamic.literal()
    if (enabled_clients != null) __obj.updateDynamic("enabled_clients")(enabled_clients)
    if (!js.isUndefined(is_domain_connection)) __obj.updateDynamic("is_domain_connection")(is_domain_connection)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (options != null) __obj.updateDynamic("options")(options)
    if (realms != null) __obj.updateDynamic("realms")(realms)
    __obj.asInstanceOf[UpdateConnection]
  }
}

