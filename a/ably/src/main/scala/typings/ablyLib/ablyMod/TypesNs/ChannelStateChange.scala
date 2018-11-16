package typings
package ablyLib.ablyMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ChannelStateChange extends js.Object {
  var current: ChannelState
  var previous: ChannelState
  var reason: js.UndefOr[ErrorInfo] = js.undefined
  var resumed: scala.Boolean
}

