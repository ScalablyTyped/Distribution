package typings
package arangodbLib.FoxxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionsMiddleware extends DelegateMiddleware {
  var storage: SessionStorage
  var transport: js.Array[SessionTransport]
}

