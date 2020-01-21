package typings.avvio.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ready[I, C] extends js.Object {
  def apply(): js.Promise[C] = js.native
  def apply(callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  def apply(callback: js.Function2[/* err */ Error, /* done */ js.Function, Unit]): Unit = js.native
  def apply(callback: js.Function3[/* err */ Error, /* context */ C, /* done */ js.Function, Unit]): Unit = js.native
}

