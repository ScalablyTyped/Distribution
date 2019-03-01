package typings
package avvioLib.avvioMod.avvioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Close[I, C] extends js.Object {
  def apply(fn: js.Function1[/* err */ nodeLib.Error, scala.Unit]): scala.Unit = js.native
  def apply(fn: js.Function2[/* err */ nodeLib.Error, /* done */ js.Function, scala.Unit]): scala.Unit = js.native
  def apply(fn: js.Function3[/* err */ nodeLib.Error, /* context */ C, /* done */ js.Function, scala.Unit]): scala.Unit = js.native
}

