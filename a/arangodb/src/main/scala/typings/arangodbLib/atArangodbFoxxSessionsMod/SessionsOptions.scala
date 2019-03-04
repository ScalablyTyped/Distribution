package typings
package arangodbLib.atArangodbFoxxSessionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionsOptions extends js.Object {
  var autoCreate: js.UndefOr[scala.Boolean] = js.undefined
  var storage: arangodbLib.FoxxNs.SessionStorage | java.lang.String | arangodbLib.ArangoDBNs.Collection[_]
  var transport: arangodbLib.FoxxNs.SessionTransport | js.Array[arangodbLib.FoxxNs.SessionTransport] | arangodbLib.arangodbLibStrings.cookie | arangodbLib.arangodbLibStrings.header
}

object SessionsOptions {
  @scala.inline
  def apply(
    storage: arangodbLib.FoxxNs.SessionStorage | java.lang.String | arangodbLib.ArangoDBNs.Collection[_],
    transport: arangodbLib.FoxxNs.SessionTransport | js.Array[arangodbLib.FoxxNs.SessionTransport] | arangodbLib.arangodbLibStrings.cookie | arangodbLib.arangodbLibStrings.header,
    autoCreate: js.UndefOr[scala.Boolean] = js.undefined
  ): SessionsOptions = {
    val __obj = js.Dynamic.literal(storage = storage.asInstanceOf[js.Any], transport = transport.asInstanceOf[js.Any])
    if (!js.isUndefined(autoCreate)) __obj.updateDynamic("autoCreate")(autoCreate)
    __obj.asInstanceOf[SessionsOptions]
  }
}

