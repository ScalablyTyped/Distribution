package typings
package altLib.AltJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AltStore[S] extends js.Object {
  def emitChange(): scala.Unit
  def getState(): S
  def listen(handler: js.Function1[/* state */ S, _]): js.Function0[scala.Unit]
  def unlisten(handler: js.Function1[/* state */ S, _]): scala.Unit
}

