package typings
package arangodbLib.sessionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SessionsOptions extends js.Object {
  var autoCreate: js.UndefOr[scala.Boolean] = js.undefined
  var storage: arangodbLib.FoxxNs.SessionStorage | java.lang.String | arangodbLib.ArangoDBNs.Collection[_]
  var transport: arangodbLib.FoxxNs.SessionTransport | js.Array[arangodbLib.FoxxNs.SessionTransport] | arangodbLib.arangodbLibStrings.cookie | arangodbLib.arangodbLibStrings.header
}

