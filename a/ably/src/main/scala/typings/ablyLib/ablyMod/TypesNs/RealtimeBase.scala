package typings
package ablyLib.ablyMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RealtimeBase extends RestBase {
  var clientId: java.lang.String
  def close(): scala.Unit
  def connect(): scala.Unit
}

object RealtimeBase {
  @scala.inline
  def apply(clientId: java.lang.String, close: () => scala.Unit, connect: () => scala.Unit): RealtimeBase = {
    val __obj = js.Dynamic.literal(clientId = clientId, close = js.Any.fromFunction0(close), connect = js.Any.fromFunction0(connect))
  
    __obj.asInstanceOf[RealtimeBase]
  }
}

