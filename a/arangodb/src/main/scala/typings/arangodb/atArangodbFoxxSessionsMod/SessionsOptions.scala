package typings.arangodb.atArangodbFoxxSessionsMod

import typings.arangodb.ArangoDBNs.Collection
import typings.arangodb.FoxxNs.SessionStorage
import typings.arangodb.FoxxNs.SessionTransport
import typings.arangodb.arangodbStrings.cookie
import typings.arangodb.arangodbStrings.header
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionsOptions extends js.Object {
  var autoCreate: js.UndefOr[Boolean] = js.undefined
  var storage: SessionStorage | String | Collection[_]
  var transport: SessionTransport | js.Array[SessionTransport] | cookie | header
}

object SessionsOptions {
  @scala.inline
  def apply(
    storage: SessionStorage | String | Collection[_],
    transport: SessionTransport | js.Array[SessionTransport] | cookie | header,
    autoCreate: js.UndefOr[Boolean] = js.undefined
  ): SessionsOptions = {
    val __obj = js.Dynamic.literal(storage = storage.asInstanceOf[js.Any], transport = transport.asInstanceOf[js.Any])
    if (!js.isUndefined(autoCreate)) __obj.updateDynamic("autoCreate")(autoCreate)
    __obj.asInstanceOf[SessionsOptions]
  }
}

