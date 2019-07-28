package typings.adone.adoneNs.utilNs.throttleNs

import typings.adone.adoneNs.utilNs.throttleNs.INs.CreateFunction
import typings.adone.adoneNs.utilNs.throttleNs.INs.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.util.throttle")
@js.native
object ^ extends js.Object {
  val DROPPED: js.Symbol = js.native
  def create(): CreateFunction = js.native
  def create(options: Options): CreateFunction = js.native
  def create[R](fn: js.Function0[R]): js.Function0[js.Promise[R]] = js.native
  def create[R](fn: js.Function0[R], options: Options): js.Function0[js.Promise[R]] = js.native
  def create[R](fn: js.Function1[/* repeated */ js.Any, R]): js.Function1[/* repeated */ js.Any, js.Promise[R]] = js.native
  def create[R](fn: js.Function1[/* repeated */ js.Any, R], options: Options): js.Function1[/* repeated */ js.Any, js.Promise[R]] = js.native
  def create[T1, T2, R](fn: js.Function2[/* a */ T1, /* b */ T2, R]): js.Function2[/* a */ T1, /* b */ T2, js.Promise[R]] = js.native
  def create[T1, T2, R](fn: js.Function2[/* a */ T1, /* b */ T2, R], options: Options): js.Function2[/* a */ T1, /* b */ T2, js.Promise[R]] = js.native
  def create[T1, T2, T3, R](fn: js.Function3[/* a */ T1, /* b */ T2, /* c */ T3, R]): js.Function3[/* a */ T1, /* b */ T2, /* c */ T3, js.Promise[R]] = js.native
  def create[T1, T2, T3, R](fn: js.Function3[/* a */ T1, /* b */ T2, /* c */ T3, R], options: Options): js.Function3[/* a */ T1, /* b */ T2, /* c */ T3, js.Promise[R]] = js.native
  def create[T1, T2, T3, T4, R](fn: js.Function4[/* a */ T1, /* b */ T2, /* c */ T3, /* d */ T4, R]): js.Function4[/* a */ T1, /* b */ T2, /* c */ T3, /* d */ T4, js.Promise[R]] = js.native
  def create[T1, T2, T3, T4, R](fn: js.Function4[/* a */ T1, /* b */ T2, /* c */ T3, /* d */ T4, R], options: Options): js.Function4[/* a */ T1, /* b */ T2, /* c */ T3, /* d */ T4, js.Promise[R]] = js.native
  def create[T1, T2, T3, T4, T5, R](fn: js.Function5[/* a */ T1, /* b */ T2, /* c */ T3, /* d */ T4, /* e */ T5, R]): js.Function5[/* a */ T1, /* b */ T2, /* c */ T3, /* d */ T4, /* e */ T5, js.Promise[R]] = js.native
  def create[T1, T2, T3, T4, T5, R](fn: js.Function5[/* a */ T1, /* b */ T2, /* c */ T3, /* d */ T4, /* e */ T5, R], options: Options): js.Function5[/* a */ T1, /* b */ T2, /* c */ T3, /* d */ T4, /* e */ T5, js.Promise[R]] = js.native
  @JSName("create")
  def create_T1R[T1, R](fn: js.Function1[/* a */ T1, R]): js.Function1[/* a */ T1, js.Promise[R]] = js.native
  @JSName("create")
  def create_T1R[T1, R](fn: js.Function1[/* a */ T1, R], options: Options): js.Function1[/* a */ T1, js.Promise[R]] = js.native
}

