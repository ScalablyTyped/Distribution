package typings
package adoneLib.adoneNs.promiseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.promise")
@js.native
object promiseNsMembers extends js.Object {
  /**
    * Executes a function after promise fulfillment
    *
    * @returns the original promise
    */
  def _finally[T](promise: js.Promise[T]): js.Promise[T] = js.native
  def _finally[T](promise: js.Promise[T], onFinally: js.Function1[/* repeated */ js.Any, scala.Unit]): js.Promise[T] = js.native
  def callbackify[R](fn: js.Function0[js.Promise[R]]): js.Function1[
    /* callback */ js.Function2[/* err */ js.UndefOr[js.Any], /* result */ js.UndefOr[R], scala.Unit], 
    js.Promise[R]
  ] = js.native
  def callbackify[R](fn: js.Function1[/* repeated */ js.Any, js.Promise[R]]): js.Function1[/* repeated */ js.Any, js.Promise[R]] = js.native
  def callbackify[T1, T2, R](fn: js.Function2[/* a */ T1, /* b */ T2, js.Promise[R]]): js.Function3[
    /* a */ T1, 
    /* b */ T2, 
    /* callback */ js.Function2[/* err */ js.UndefOr[js.Any], /* result */ js.UndefOr[R], scala.Unit], 
    js.Promise[R]
  ] = js.native
  def callbackify[T1, T2, T3, R](fn: js.Function3[/* a */ T1, /* b */ T2, /* c */ T3, js.Promise[R]]): js.Function4[
    /* a */ T1, 
    /* b */ T2, 
    /* c */ T3, 
    /* callback */ js.Function2[/* err */ js.UndefOr[js.Any], /* result */ js.UndefOr[R], scala.Unit], 
    js.Promise[R]
  ] = js.native
  def callbackify[T1, T2, T3, T4, R](fn: js.Function4[/* a */ T1, /* b */ T2, /* c */ T3, /* d */ T4, js.Promise[R]]): js.Function5[
    /* a */ T1, 
    /* b */ T2, 
    /* c */ T3, 
    /* d */ T4, 
    /* callback */ js.Function2[/* err */ js.UndefOr[js.Any], /* result */ js.UndefOr[R], scala.Unit], 
    js.Promise[R]
  ] = js.native
  @JSName("callbackify")
  def callbackify_TRFunction2[T, R](fn: js.Function1[/* a */ T, js.Promise[R]]): js.Function2[
    /* a */ T, 
    /* callback */ js.Function2[/* err */ js.UndefOr[js.Any], /* result */ js.UndefOr[R], scala.Unit], 
    js.Promise[R]
  ] = js.native
  def defer(): adoneLib.adoneNs.promiseNs.INs.Deferred[_] = js.native
  def delay[T](ms: scala.Double): js.Promise[T] = js.native
  def delay[T](ms: scala.Double, value: T): js.Promise[T] = js.native
  def nodeify[T](
    promise: js.Promise[T],
    callback: js.Function2[/* err */ js.UndefOr[js.Any], /* value */ js.UndefOr[T], scala.Unit]
  ): js.Promise[T] = js.native
  def promisify(fn: js.Function1[/* repeated */ js.Any, scala.Unit]): js.Function1[/* repeated */ js.Any, js.Promise[_]] = js.native
  def promisify(
    fn: js.Function1[/* repeated */ js.Any, scala.Unit],
    options: adoneLib.adoneNs.promiseNs.INs.PromisifyOptions
  ): js.Function1[/* repeated */ js.Any, js.Promise[_]] = js.native
  def promisify[T](
    fn: js.Function2[
      /* a */ T, 
      /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit], 
      scala.Unit
    ]
  ): js.Function1[/* a */ T, js.Promise[scala.Unit]] = js.native
  def promisify[T](
    fn: js.Function2[
      /* a */ T, 
      /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit], 
      scala.Unit
    ],
    options: adoneLib.adoneNs.promiseNs.INs.PromisifyOptions
  ): js.Function1[/* a */ T, js.Promise[scala.Unit]] = js.native
  def promisify[T1, T2](
    fn: js.Function3[
      /* a */ T1, 
      /* b */ T2, 
      /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit], 
      scala.Unit
    ]
  ): js.Function2[/* a */ T1, /* b */ T2, js.Promise[scala.Unit]] = js.native
  def promisify[T1, T2](
    fn: js.Function3[
      /* a */ T1, 
      /* b */ T2, 
      /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit], 
      scala.Unit
    ],
    options: adoneLib.adoneNs.promiseNs.INs.PromisifyOptions
  ): js.Function2[/* a */ T1, /* b */ T2, js.Promise[scala.Unit]] = js.native
  def promisify[T1, T2, T3](
    fn: js.Function4[
      /* a */ T1, 
      /* b */ T2, 
      /* c */ T3, 
      /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit], 
      scala.Unit
    ]
  ): js.Function3[/* a */ T1, /* b */ T2, /* c */ T3, js.Promise[scala.Unit]] = js.native
  def promisify[T1, T2, T3](
    fn: js.Function4[
      /* a */ T1, 
      /* b */ T2, 
      /* c */ T3, 
      /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit], 
      scala.Unit
    ],
    options: adoneLib.adoneNs.promiseNs.INs.PromisifyOptions
  ): js.Function3[/* a */ T1, /* b */ T2, /* c */ T3, js.Promise[scala.Unit]] = js.native
  def promisify[T1, T2, T3, T4](
    fn: js.Function5[
      /* a */ T1, 
      /* b */ T2, 
      /* c */ T3, 
      /* d */ T4, 
      /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit], 
      scala.Unit
    ]
  ): js.Function4[/* a */ T1, /* b */ T2, /* c */ T3, /* d */ T4, js.Promise[scala.Unit]] = js.native
  def promisify[T1, T2, T3, T4](
    fn: js.Function5[
      /* a */ T1, 
      /* b */ T2, 
      /* c */ T3, 
      /* d */ T4, 
      /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit], 
      scala.Unit
    ],
    options: adoneLib.adoneNs.promiseNs.INs.PromisifyOptions
  ): js.Function4[/* a */ T1, /* b */ T2, /* c */ T3, /* d */ T4, js.Promise[scala.Unit]] = js.native
  def promisify[T1, T2, T3, T4, T5](
    fn: js.Function6[
      /* a */ T1, 
      /* b */ T2, 
      /* c */ T3, 
      /* d */ T4, 
      /* e */ T5, 
      /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit], 
      scala.Unit
    ]
  ): js.Function5[/* a */ T1, /* b */ T2, /* c */ T3, /* d */ T4, /* e */ T5, js.Promise[scala.Unit]] = js.native
  def promisify[T1, T2, T3, T4, T5](
    fn: js.Function6[
      /* a */ T1, 
      /* b */ T2, 
      /* c */ T3, 
      /* d */ T4, 
      /* e */ T5, 
      /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit], 
      scala.Unit
    ],
    options: adoneLib.adoneNs.promiseNs.INs.PromisifyOptions
  ): js.Function5[/* a */ T1, /* b */ T2, /* c */ T3, /* d */ T4, /* e */ T5, js.Promise[scala.Unit]] = js.native
  def promisifyAll(source: js.Object): js.Object = js.native
  def promisifyAll(source: js.Object, options: adoneLib.adoneNs.promiseNs.INs.PromisifyAllOptions): js.Object = js.native
  @JSName("promisify")
  def promisify_RFunction0[R](
    fn: js.Function1[
      /* callback */ js.Function2[/* err */ js.UndefOr[js.Any], /* result */ js.UndefOr[R], scala.Unit], 
      scala.Unit
    ]
  ): js.Function0[js.Promise[R]] = js.native
  @JSName("promisify")
  def promisify_RFunction0[R](
    fn: js.Function1[
      /* callback */ js.Function2[/* err */ js.UndefOr[js.Any], /* result */ js.UndefOr[R], scala.Unit], 
      scala.Unit
    ],
    options: adoneLib.adoneNs.promiseNs.INs.PromisifyOptions
  ): js.Function0[js.Promise[R]] = js.native
  @JSName("promisify")
  def promisify_T1T2R[T1, T2, R](
    fn: js.Function3[
      /* a */ T1, 
      /* b */ T2, 
      /* callback */ js.Function2[/* err */ js.UndefOr[js.Any], /* result */ js.UndefOr[R], scala.Unit], 
      scala.Unit
    ]
  ): js.Function2[/* a */ T1, /* b */ T2, js.Promise[R]] = js.native
  @JSName("promisify")
  def promisify_T1T2R[T1, T2, R](
    fn: js.Function3[
      /* a */ T1, 
      /* b */ T2, 
      /* callback */ js.Function2[/* err */ js.UndefOr[js.Any], /* result */ js.UndefOr[R], scala.Unit], 
      scala.Unit
    ],
    options: adoneLib.adoneNs.promiseNs.INs.PromisifyOptions
  ): js.Function2[/* a */ T1, /* b */ T2, js.Promise[R]] = js.native
  @JSName("promisify")
  def promisify_T1T2T3R[T1, T2, T3, R](
    fn: js.Function4[
      /* a */ T1, 
      /* b */ T2, 
      /* c */ T3, 
      /* callback */ js.Function2[/* err */ js.UndefOr[js.Any], /* result */ js.UndefOr[R], scala.Unit], 
      scala.Unit
    ]
  ): js.Function3[/* a */ T1, /* b */ T2, /* c */ T3, js.Promise[R]] = js.native
  @JSName("promisify")
  def promisify_T1T2T3R[T1, T2, T3, R](
    fn: js.Function4[
      /* a */ T1, 
      /* b */ T2, 
      /* c */ T3, 
      /* callback */ js.Function2[/* err */ js.UndefOr[js.Any], /* result */ js.UndefOr[R], scala.Unit], 
      scala.Unit
    ],
    options: adoneLib.adoneNs.promiseNs.INs.PromisifyOptions
  ): js.Function3[/* a */ T1, /* b */ T2, /* c */ T3, js.Promise[R]] = js.native
  @JSName("promisify")
  def promisify_T1T2T3T4R[T1, T2, T3, T4, R](
    fn: js.Function5[
      /* a */ T1, 
      /* b */ T2, 
      /* c */ T3, 
      /* d */ T4, 
      /* callback */ js.Function2[/* err */ js.UndefOr[js.Any], /* result */ js.UndefOr[R], scala.Unit], 
      scala.Unit
    ]
  ): js.Function4[/* a */ T1, /* b */ T2, /* c */ T3, /* d */ T4, js.Promise[R]] = js.native
  @JSName("promisify")
  def promisify_T1T2T3T4R[T1, T2, T3, T4, R](
    fn: js.Function5[
      /* a */ T1, 
      /* b */ T2, 
      /* c */ T3, 
      /* d */ T4, 
      /* callback */ js.Function2[/* err */ js.UndefOr[js.Any], /* result */ js.UndefOr[R], scala.Unit], 
      scala.Unit
    ],
    options: adoneLib.adoneNs.promiseNs.INs.PromisifyOptions
  ): js.Function4[/* a */ T1, /* b */ T2, /* c */ T3, /* d */ T4, js.Promise[R]] = js.native
  @JSName("promisify")
  def promisify_T1T2T3T4T5R[T1, T2, T3, T4, T5, R](
    fn: js.Function6[
      /* a */ T1, 
      /* b */ T2, 
      /* c */ T3, 
      /* d */ T4, 
      /* e */ T5, 
      /* callback */ js.Function2[/* err */ js.UndefOr[js.Any], /* result */ js.UndefOr[R], scala.Unit], 
      scala.Unit
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
      /* callback */ js.Function2[/* err */ js.UndefOr[js.Any], /* result */ js.UndefOr[R], scala.Unit], 
      scala.Unit
    ],
    options: adoneLib.adoneNs.promiseNs.INs.PromisifyOptions
  ): js.Function5[/* a */ T1, /* b */ T2, /* c */ T3, /* d */ T4, /* e */ T5, js.Promise[R]] = js.native
  @JSName("promisify")
  def promisify_TR[T, R](
    fn: js.Function2[
      /* a */ T, 
      /* callback */ js.Function2[/* err */ js.UndefOr[js.Any], /* result */ js.UndefOr[R], scala.Unit], 
      scala.Unit
    ]
  ): js.Function1[/* a */ T, js.Promise[R]] = js.native
  @JSName("promisify")
  def promisify_TR[T, R](
    fn: js.Function2[
      /* a */ T, 
      /* callback */ js.Function2[/* err */ js.UndefOr[js.Any], /* result */ js.UndefOr[R], scala.Unit], 
      scala.Unit
    ],
    options: adoneLib.adoneNs.promiseNs.INs.PromisifyOptions
  ): js.Function1[/* a */ T, js.Promise[R]] = js.native
  def props[T](obj: adoneLib.adoneNs.promiseNs.INs.ResolvableProps[T]): js.Promise[T] = js.native
  def retry[T](fn: js.Function1[/* info */ adoneLib.Anon_Current, T | js.Thenable[T]]): js.Promise[T] = js.native
  def retry[T](
    fn: js.Function1[/* info */ adoneLib.Anon_Current, js.Thenable[T] | T],
    options: adoneLib.adoneNs.promiseNs.INs.RetryOptions
  ): js.Promise[T] = js.native
  def retry[T](fn: js.Function1[/* info */ adoneLib.Anon_Current, js.Thenable[T] | T], options: scala.Double): js.Promise[T] = js.native
  def timeout[T](promise: js.Promise[T], ms: scala.Double): js.Promise[T] = js.native
}

