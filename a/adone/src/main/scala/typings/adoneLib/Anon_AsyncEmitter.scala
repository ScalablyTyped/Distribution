package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AsyncEmitter extends js.Object {
  var AsyncEmitter: org.scalablytyped.runtime.Instantiable1[
    /* concurrency */ js.UndefOr[/* concurrency */ scala.Double], 
    adoneLib.adoneNs.eventNs.AsyncEmitter
  ]
  var Emitter: Anon_DefaultMaxListenersDest
  val INs: js.Any
}

object Anon_AsyncEmitter {
  @scala.inline
  def apply(
    AsyncEmitter: org.scalablytyped.runtime.Instantiable1[
      /* concurrency */ js.UndefOr[/* concurrency */ scala.Double], 
      adoneLib.adoneNs.eventNs.AsyncEmitter
    ],
    Emitter: Anon_DefaultMaxListenersDest,
    INs: js.Any
  ): Anon_AsyncEmitter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AsyncEmitter")(AsyncEmitter)
    __obj.updateDynamic("Emitter")(Emitter)
    __obj.updateDynamic("INs")(INs)
    __obj.asInstanceOf[Anon_AsyncEmitter]
  }
}

