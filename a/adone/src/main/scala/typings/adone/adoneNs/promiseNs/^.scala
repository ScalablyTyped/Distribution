package typings.adone.adoneNs.promiseNs

import typings.adone.Anon_Current
import typings.adone.adoneNs.promiseNs.INs.Deferred
import typings.adone.adoneNs.promiseNs.INs.PromisifyAllOptions
import typings.adone.adoneNs.promiseNs.INs.PromisifyOptions
import typings.adone.adoneNs.promiseNs.INs.ResolvableProps
import typings.adone.adoneNs.promiseNs.INs.RetryOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.promise")
@js.native
object ^ extends js.Object {
  /**
    * Executes a function after promise fulfillment
    *
    * @returns the original promise
    */
  def _finally[T](promise: js.Promise[T]): js.Promise[T] = js.native
  def _finally[T](promise: js.Promise[T], onFinally: js.Function1[/* repeated */ js.Any, Unit]): js.Promise[T] = js.native
  def callbackify[R](fn: js.Function0[js.Promise[R]]): js.Function1[
    /* callback */ js.Function2[/* err */ js.UndefOr[js.Any], /* result */ js.UndefOr[R], Unit], 
    js.Promise[R]
  ] = js.native
  def callbackify[R](fn: js.Function1[/* repeated */ js.Any, js.Promise[R]]): js.Function1[/* repeated */ js.Any, js.Promise[R]] = js.native
  def callbackify[T1, T2, R](fn: js.Function2[/* a */ T1, /* b */ T2, js.Promise[R]]): js.Function3[
    /* a */ T1, 
    /* b */ T2, 
    /* callback */ js.Function2[/* err */ js.UndefOr[js.Any], /* result */ js.UndefOr[R], Unit], 
    js.Promise[R]
  ] = js.native
  def callbackify[T1, T2, T3, R](fn: js.Function3[/* a */ T1, /* b */ T2, /* c */ T3, js.Promise[R]]): js.Function4[
    /* a */ T1, 
    /* b */ T2, 
    /* c */ T3, 
    /* callback */ js.Function2[/* err */ js.UndefOr[js.Any], /* result */ js.UndefOr[R], Unit], 
    js.Promise[R]
  ] = js.native
  def callbackify[T1, T2, T3, T4, R](fn: js.Function4[/* a */ T1, /* b */ T2, /* c */ T3, /* d */ T4, js.Promise[R]]): js.Function5[
    /* a */ T1, 
    /* b */ T2, 
    /* c */ T3, 
    /* d */ T4, 
    /* callback */ js.Function2[/* err */ js.UndefOr[js.Any], /* result */ js.UndefOr[R], Unit], 
    js.Promise[R]
  ] = js.native
  @JSName("callbackify")
  def callbackify_TR_Function2[T, R](fn: js.Function1[/* a */ T, js.Promise[R]]): js.Function2[
    /* a */ T, 
    /* callback */ js.Function2[/* err */ js.UndefOr[js.Any], /* result */ js.UndefOr[R], Unit], 
    js.Promise[R]
  ] = js.native
  def defer(): Deferred[_] = js.native
  def delay[T](ms: Double): js.Promise[T] = js.native
  def delay[T](ms: Double, value: T): js.Promise[T] = js.native
  def nodeify[T](
    promise: js.Promise[T],
    callback: js.Function2[/* err */ js.UndefOr[js.Any], /* value */ js.UndefOr[T], Unit]
  ): js.Promise[T] = js.native
  def promisify(fn: js.Function1[/* repeated */ js.Any, Unit]): js.Function1[/* repeated */ js.Any, js.Promise[_]] = js.native
  def promisify(fn: js.Function1[/* repeated */ js.Any, Unit], options: PromisifyOptions): js.Function1[/* repeated */ js.Any, js.Promise[_]] = js.native
  def promisify[T](fn: js.Function2[/* a */ T, /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], Unit]): js.Function1[/* a */ T, js.Promise[Unit]] = js.native
  def promisify[T](
    fn: js.Function2[/* a */ T, /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], Unit],
    options: PromisifyOptions
  ): js.Function1[/* a */ T, js.Promise[Unit]] = js.native
  def promisify[T1, T2](
    fn: js.Function3[
      /* a */ T1, 
      /* b */ T2, 
      /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ): js.Function2[/* a */ T1, /* b */ T2, js.Promise[Unit]] = js.native
  def promisify[T1, T2](
    fn: js.Function3[
      /* a */ T1, 
      /* b */ T2, 
      /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
      Unit
    ],
    options: PromisifyOptions
  ): js.Function2[/* a */ T1, /* b */ T2, js.Promise[Unit]] = js.native
  def promisify[T1, T2, T3](
    fn: js.Function4[
      /* a */ T1, 
      /* b */ T2, 
      /* c */ T3, 
      /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ): js.Function3[/* a */ T1, /* b */ T2, /* c */ T3, js.Promise[Unit]] = js.native
  def promisify[T1, T2, T3](
    fn: js.Function4[
      /* a */ T1, 
      /* b */ T2, 
      /* c */ T3, 
      /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
      Unit
    ],
    options: PromisifyOptions
  ): js.Function3[/* a */ T1, /* b */ T2, /* c */ T3, js.Promise[Unit]] = js.native
  def promisify[T1, T2, T3, T4](
    fn: js.Function5[
      /* a */ T1, 
      /* b */ T2, 
      /* c */ T3, 
      /* d */ T4, 
      /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ): js.Function4[/* a */ T1, /* b */ T2, /* c */ T3, /* d */ T4, js.Promise[Unit]] = js.native
  def promisify[T1, T2, T3, T4](
    fn: js.Function5[
      /* a */ T1, 
      /* b */ T2, 
      /* c */ T3, 
      /* d */ T4, 
      /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
      Unit
    ],
    options: PromisifyOptions
  ): js.Function4[/* a */ T1, /* b */ T2, /* c */ T3, /* d */ T4, js.Promise[Unit]] = js.native
  def promisify[T1, T2, T3, T4, T5](
    fn: js.Function6[
      /* a */ T1, 
      /* b */ T2, 
      /* c */ T3, 
      /* d */ T4, 
      /* e */ T5, 
      /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ): js.Function5[/* a */ T1, /* b */ T2, /* c */ T3, /* d */ T4, /* e */ T5, js.Promise[Unit]] = js.native
  def promisify[T1, T2, T3, T4, T5](
    fn: js.Function6[
      /* a */ T1, 
      /* b */ T2, 
      /* c */ T3, 
      /* d */ T4, 
      /* e */ T5, 
      /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
      Unit
    ],
    options: PromisifyOptions
  ): js.Function5[/* a */ T1, /* b */ T2, /* c */ T3, /* d */ T4, /* e */ T5, js.Promise[Unit]] = js.native
  def promisifyAll(source: js.Object): js.Object = js.native
  def promisifyAll(source: js.Object, options: PromisifyAllOptions): js.Object = js.native
  @JSName("promisify")
  def promisify_R_Function0[R](
    fn: js.Function1[
      /* callback */ js.Function2[/* err */ js.UndefOr[js.Any], /* result */ js.UndefOr[R], Unit], 
      Unit
    ]
  ): js.Function0[js.Promise[R]] = js.native
  @JSName("promisify")
  def promisify_R_Function0[R](
    fn: js.Function1[
      /* callback */ js.Function2[/* err */ js.UndefOr[js.Any], /* result */ js.UndefOr[R], Unit], 
      Unit
    ],
    options: PromisifyOptions
  ): js.Function0[js.Promise[R]] = js.native
  @JSName("promisify")
  def promisify_T1T2R[T1, T2, R](
    fn: js.Function3[
      /* a */ T1, 
      /* b */ T2, 
      /* callback */ js.Function2[/* err */ js.UndefOr[js.Any], /* result */ js.UndefOr[R], Unit], 
      Unit
    ]
  ): js.Function2[/* a */ T1, /* b */ T2, js.Promise[R]] = js.native
  @JSName("promisify")
  def promisify_T1T2R[T1, T2, R](
    fn: js.Function3[
      /* a */ T1, 
      /* b */ T2, 
      /* callback */ js.Function2[/* err */ js.UndefOr[js.Any], /* result */ js.UndefOr[R], Unit], 
      Unit
    ],
    options: PromisifyOptions
  ): js.Function2[/* a */ T1, /* b */ T2, js.Promise[R]] = js.native
  @JSName("promisify")
  def promisify_T1T2T3R[T1, T2, T3, R](
    fn: js.Function4[
      /* a */ T1, 
      /* b */ T2, 
      /* c */ T3, 
      /* callback */ js.Function2[/* err */ js.UndefOr[js.Any], /* result */ js.UndefOr[R], Unit], 
      Unit
    ]
  ): js.Function3[/* a */ T1, /* b */ T2, /* c */ T3, js.Promise[R]] = js.native
  @JSName("promisify")
  def promisify_T1T2T3R[T1, T2, T3, R](
    fn: js.Function4[
      /* a */ T1, 
      /* b */ T2, 
      /* c */ T3, 
      /* callback */ js.Function2[/* err */ js.UndefOr[js.Any], /* result */ js.UndefOr[R], Unit], 
      Unit
    ],
    options: PromisifyOptions
  ): js.Function3[/* a */ T1, /* b */ T2, /* c */ T3, js.Promise[R]] = js.native
  @JSName("promisify")
  def promisify_T1T2T3T4R[T1, T2, T3, T4, R](
    fn: js.Function5[
      /* a */ T1, 
      /* b */ T2, 
      /* c */ T3, 
      /* d */ T4, 
      /* callback */ js.Function2[/* err */ js.UndefOr[js.Any], /* result */ js.UndefOr[R], Unit], 
      Unit
    ]
  ): js.Function4[/* a */ T1, /* b */ T2, /* c */ T3, /* d */ T4, js.Promise[R]] = js.native
  @JSName("promisify")
  def promisify_T1T2T3T4R[T1, T2, T3, T4, R](
    fn: js.Function5[
      /* a */ T1, 
      /* b */ T2, 
      /* c */ T3, 
      /* d */ T4, 
      /* callback */ js.Function2[/* err */ js.UndefOr[js.Any], /* result */ js.UndefOr[R], Unit], 
      Unit
    ],
    options: PromisifyOptions
  ): js.Function4[/* a */ T1, /* b */ T2, /* c */ T3, /* d */ T4, js.Promise[R]] = js.native
  @JSName("promisify")
  def promisify_T1T2T3T4T5R[T1, T2, T3, T4, T5, R](
    fn: js.Function6[
      /* a */ T1, 
      /* b */ T2, 
      /* c */ T3, 
      /* d */ T4, 
      /* e */ T5, 
      /* callback */ js.Function2[/* err */ js.UndefOr[js.Any], /* result */ js.UndefOr[R], Unit], 
      Unit
    ]
  ): js.Function5[/* a */ T1, /* b */ T2, /* c */ T3, /* d */ T4, /* e */ T5, js.Promise[R]] = js.native
  @JSName("promisify")
  def promisify_T1T2T3T4T5R[T1, T2, T3, T4, T5, R](
    fn: js.Function6[
      /* a */ T1, 
      /* b */ T2, 
      /* c */ T3, 
      /* d */ T4, 
      /* e */ T5, 
      /* callback */ js.Function2[/* err */ js.UndefOr[js.Any], /* result */ js.UndefOr[R], Unit], 
      Unit
    ],
    options: PromisifyOptions
  ): js.Function5[/* a */ T1, /* b */ T2, /* c */ T3, /* d */ T4, /* e */ T5, js.Promise[R]] = js.native
  @JSName("promisify")
  def promisify_TR[T, R](
    fn: js.Function2[
      /* a */ T, 
      /* callback */ js.Function2[/* err */ js.UndefOr[js.Any], /* result */ js.UndefOr[R], Unit], 
      Unit
    ]
  ): js.Function1[/* a */ T, js.Promise[R]] = js.native
  @JSName("promisify")
  def promisify_TR[T, R](
    fn: js.Function2[
      /* a */ T, 
      /* callback */ js.Function2[/* err */ js.UndefOr[js.Any], /* result */ js.UndefOr[R], Unit], 
      Unit
    ],
    options: PromisifyOptions
  ): js.Function1[/* a */ T, js.Promise[R]] = js.native
  def props[T](obj: ResolvableProps[T]): js.Promise[T] = js.native
  def retry[T](fn: js.Function1[/* info */ Anon_Current, T | js.Thenable[T]]): js.Promise[T] = js.native
  def retry[T](fn: js.Function1[/* info */ Anon_Current, js.Thenable[T] | T], options: Double): js.Promise[T] = js.native
  def retry[T](fn: js.Function1[/* info */ Anon_Current, js.Thenable[T] | T], options: RetryOptions): js.Promise[T] = js.native
  def timeout[T](promise: js.Promise[T], ms: Double): js.Promise[T] = js.native
}

