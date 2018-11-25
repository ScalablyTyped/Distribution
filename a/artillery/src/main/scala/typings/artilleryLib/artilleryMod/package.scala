package typings
package artilleryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object artilleryMod {
  type EventEmitter = eventsLib.eventsMod.EventEmitter
  type Next = js.Function1[/* err */ js.UndefOr[nodeLib.Error], scala.Unit]
  type RequestResponse = requestLib.requestMod.requestNs.RequestResponse
  type ResponseRequest = requestLib.requestMod.requestNs.ResponseRequest
}
