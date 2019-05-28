package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofevents extends js.Object {
  var EventEmitter: TypeofClassEventEmitter = js.native
  def once(emitter: nodeLib.eventsMod.EventEmitter, event: java.lang.String): js.Promise[js.Array[_]] = js.native
  def once(emitter: nodeLib.eventsMod.EventEmitter, event: js.Symbol): js.Promise[js.Array[_]] = js.native
}

