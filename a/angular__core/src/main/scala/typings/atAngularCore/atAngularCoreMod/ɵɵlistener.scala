package typings.atAngularCore.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core", "ɵɵlistener")
@js.native
object ɵɵlistener extends js.Object {
  def apply(eventName: String, listenerFn: js.Function1[/* e */ js.UndefOr[js.Any], _]): Unit = js.native
  def apply(eventName: String, listenerFn: js.Function1[/* e */ js.UndefOr[js.Any], _], useCapture: Boolean): Unit = js.native
  def apply(
    eventName: String,
    listenerFn: js.Function1[/* e */ js.UndefOr[js.Any], _],
    useCapture: Boolean,
    eventTargetResolver: GlobalTargetResolver
  ): Unit = js.native
}

