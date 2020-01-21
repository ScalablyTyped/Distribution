package typings.amqpRpc.mod

import typings.amqpRpc.AnonAutoDelete
import typings.amqpRpc.AnonDefaultExchangeName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var conn_options: js.UndefOr[js.Any] = js.undefined
  var connection: js.UndefOr[js.Any] = js.undefined
  var exchange: js.UndefOr[String] = js.undefined
  var exchangeInstance: js.UndefOr[js.Any] = js.undefined
  var exchange_options: js.UndefOr[AnonAutoDelete] = js.undefined
  var ipml_options: js.UndefOr[AnonDefaultExchangeName] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    conn_options: js.Any = null,
    connection: js.Any = null,
    exchange: String = null,
    exchangeInstance: js.Any = null,
    exchange_options: AnonAutoDelete = null,
    ipml_options: AnonDefaultExchangeName = null,
    url: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (conn_options != null) __obj.updateDynamic("conn_options")(conn_options.asInstanceOf[js.Any])
    if (connection != null) __obj.updateDynamic("connection")(connection.asInstanceOf[js.Any])
    if (exchange != null) __obj.updateDynamic("exchange")(exchange.asInstanceOf[js.Any])
    if (exchangeInstance != null) __obj.updateDynamic("exchangeInstance")(exchangeInstance.asInstanceOf[js.Any])
    if (exchange_options != null) __obj.updateDynamic("exchange_options")(exchange_options.asInstanceOf[js.Any])
    if (ipml_options != null) __obj.updateDynamic("ipml_options")(ipml_options.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

