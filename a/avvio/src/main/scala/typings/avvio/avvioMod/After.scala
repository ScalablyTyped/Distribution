package typings.avvio.avvioMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Avvio methods
@js.native
trait After[I, C] extends js.Object {
  def apply(fn: js.Function1[/* err */ Error, Unit]): C = js.native
  def apply(fn: js.Function2[/* err */ Error, /* done */ js.Function, Unit]): C = js.native
  def apply(fn: js.Function3[/* err */ Error, /* context */ C, /* done */ js.Function, Unit]): C = js.native
}

