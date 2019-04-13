package typings
package avvioLib.avvioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ready[I, C] extends js.Object {
  def apply(): js.Promise[C] = js.native
  def apply(callback: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]): scala.Unit = js.native
  def apply(callback: js.Function2[/* err */ stdLib.Error, /* done */ js.Function, scala.Unit]): scala.Unit = js.native
  def apply(
    callback: js.Function3[/* err */ stdLib.Error, /* context */ C, /* done */ js.Function, scala.Unit]
  ): scala.Unit = js.native
}

