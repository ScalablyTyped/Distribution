package typings
package avvioLib.avvioMod.avvioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Server[I] extends js.Object {
  @JSName("after")
  var after_Original: After[I, context[I]] = js.native
  @JSName("close")
  var close_Original: Close[I, context[I]] = js.native
  @JSName("onClose")
  var onClose_Original: OnClose[I, context[I]] = js.native
  @JSName("ready")
  var ready_Original: Ready[I, context[I]] = js.native
  @JSName("use")
  var use_Original: Use[I, context[I]] = js.native
  def after(fn: js.Function1[/* err */ stdLib.Error, scala.Unit]): context[I] = js.native
  def after(fn: js.Function2[/* err */ stdLib.Error, /* done */ js.Function, scala.Unit]): context[I] = js.native
  def after(
    fn: js.Function3[/* err */ stdLib.Error, /* context */ context[I], /* done */ js.Function, scala.Unit]
  ): context[I] = js.native
  def close(fn: js.Function1[/* err */ stdLib.Error, scala.Unit]): scala.Unit = js.native
  def close(fn: js.Function2[/* err */ stdLib.Error, /* done */ js.Function, scala.Unit]): scala.Unit = js.native
  def close(
    fn: js.Function3[/* err */ stdLib.Error, /* context */ context[I], /* done */ js.Function, scala.Unit]
  ): scala.Unit = js.native
  def onClose(fn: js.Function2[/* context */ context[I], /* done */ js.Function, scala.Unit]): context[I] = js.native
  def ready(): js.Promise[context[I]] = js.native
  def ready(callback: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]): scala.Unit = js.native
  def ready(callback: js.Function2[/* err */ stdLib.Error, /* done */ js.Function, scala.Unit]): scala.Unit = js.native
  def ready(
    callback: js.Function3[/* err */ stdLib.Error, /* context */ context[I], /* done */ js.Function, scala.Unit]
  ): scala.Unit = js.native
  def use[O](fn: Plugin[O, I]): context[I] = js.native
  def use[O](fn: Plugin[O, I], options: O): context[I] = js.native
}

