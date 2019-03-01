package typings
package amqpDashRpcLib.amqpDashRpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var conn_options: js.UndefOr[js.Any] = js.undefined
  var connection: js.UndefOr[js.Any] = js.undefined
  var exchange: js.UndefOr[java.lang.String] = js.undefined
  var exchangeInstance: js.UndefOr[js.Any] = js.undefined
  var exchange_options: js.UndefOr[amqpDashRpcLib.Anon_AutoDelete] = js.undefined
  var ipml_options: js.UndefOr[amqpDashRpcLib.Anon_DefaultExchangeName] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    conn_options: js.Any = null,
    connection: js.Any = null,
    exchange: java.lang.String = null,
    exchangeInstance: js.Any = null,
    exchange_options: amqpDashRpcLib.Anon_AutoDelete = null,
    ipml_options: amqpDashRpcLib.Anon_DefaultExchangeName = null,
    url: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (conn_options != null) __obj.updateDynamic("conn_options")(conn_options)
    if (connection != null) __obj.updateDynamic("connection")(connection)
    if (exchange != null) __obj.updateDynamic("exchange")(exchange)
    if (exchangeInstance != null) __obj.updateDynamic("exchangeInstance")(exchangeInstance)
    if (exchange_options != null) __obj.updateDynamic("exchange_options")(exchange_options)
    if (ipml_options != null) __obj.updateDynamic("ipml_options")(ipml_options)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Options]
  }
}

