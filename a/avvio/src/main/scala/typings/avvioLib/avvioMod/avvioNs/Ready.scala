package typings
package avvioLib.avvioMod.avvioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ready[I, C] extends js.Object {
  def apply(): js.Promise[C] = js.native
  def apply(callback: js.Function1[/* err */ js.UndefOr[nodeLib.Error], scala.Unit]): scala.Unit = js.native
  def apply(callback: js.Function2[/* err */ nodeLib.Error, /* done */ js.Function, scala.Unit]): scala.Unit = js.native
  def apply(
    callback: js.Function3[/* err */ nodeLib.Error, /* context */ C, /* done */ js.Function, scala.Unit]
  ): scala.Unit = js.native
}

