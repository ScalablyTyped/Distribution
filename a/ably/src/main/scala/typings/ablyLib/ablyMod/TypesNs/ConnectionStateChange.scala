package typings
package ablyLib.ablyMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ConnectionStateChange extends js.Object {
  var current: ConnectionState
  var previous: ConnectionState
  var reason: js.UndefOr[ErrorInfo] = js.undefined
  var retryIn: js.UndefOr[scala.Double] = js.undefined
}

