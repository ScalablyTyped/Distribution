package typings
package amqpDashRpcLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultExchangeName extends js.Object {
  var defaultExchangeName: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_DefaultExchangeName {
  @scala.inline
  def apply(defaultExchangeName: java.lang.String = null): Anon_DefaultExchangeName = {
    val __obj = js.Dynamic.literal()
    if (defaultExchangeName != null) __obj.updateDynamic("defaultExchangeName")(defaultExchangeName)
    __obj.asInstanceOf[Anon_DefaultExchangeName]
  }
}

