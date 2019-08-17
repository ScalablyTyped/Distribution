package typings.artillery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object artilleryMod {
  import typings.std.Error

  type EventEmitter = typings.node.eventsMod.EventEmitter
  type Next = js.Function1[/* err */ js.UndefOr[Error], Unit]
  type RequestResponse = typings.request.requestMod.RequestResponse
  type ResponseRequest = typings.request.requestMod.ResponseRequest
}
