package typings
package avvioLib.avvioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Avvio methods
@js.native
trait After[I, C] extends js.Object {
  def apply(fn: js.Function1[/* err */ stdLib.Error, scala.Unit]): C = js.native
  def apply(fn: js.Function2[/* err */ stdLib.Error, /* done */ js.Function, scala.Unit]): C = js.native
  def apply(fn: js.Function3[/* err */ stdLib.Error, /* context */ C, /* done */ js.Function, scala.Unit]): C = js.native
}

