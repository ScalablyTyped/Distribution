package typings.artillery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type EventEmitter = typings.node.eventsMod.EventEmitter
  type Next = js.Function1[/* err */ js.UndefOr[typings.std.Error], scala.Unit]
  type RequestResponse = typings.request.mod.RequestResponse
  type ResponseRequest = typings.request.mod.ResponseRequest
}
