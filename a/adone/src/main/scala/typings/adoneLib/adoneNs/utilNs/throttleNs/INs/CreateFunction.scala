package typings
package adoneLib.adoneNs.utilNs.throttleNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateFunction extends js.Object {
  def apply[R](fn: js.Function0[R | js.Promise[R]]): js.Promise[R] = js.native
  def apply[R](fn: js.Function1[/* repeated */js.Any, R | js.Promise[R]], args: js.Any*): js.Promise[R] = js.native
  def apply[T1, R](fn: js.Function1[/* a */ T1, R | js.Promise[R]], a: T1): js.Promise[R] = js.native
  def apply[T1, T2, R](fn: js.Function2[/* a */ T1, /* b */ T2, R | js.Promise[R]], a: T1, b: T2): js.Promise[R] = js.native
  def apply[T1, T2, T3, R](fn: js.Function3[/* a */ T1, /* b */ T2, /* c */ T3, R | js.Promise[R]], a: T1, b: T2, c: T3): js.Promise[R] = js.native
  def apply[T1, T2, T3, T4, R](
    fn: js.Function4[/* a */ T1, /* b */ T2, /* c */ T3, /* d */ T4, R | js.Promise[R]],
    a: T1,
    b: T2,
    c: T3,
    d: T4
  ): js.Promise[R] = js.native
  def apply[T1, T2, T3, T4, T5, R](
    fn: js.Function5[/* a */ T1, /* b */ T2, /* c */ T3, /* d */ T4, /* e */ T5, R | js.Promise[R]],
    a: T1,
    b: T2,
    c: T3,
    d: T4,
    e: T5
  ): js.Promise[R] = js.native
}

