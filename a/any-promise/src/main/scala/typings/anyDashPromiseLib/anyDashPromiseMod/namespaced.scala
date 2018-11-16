package typings
package anyDashPromiseLib.anyDashPromiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("any-promise", JSImport.Namespace)
@js.native
class namespaced[R] protected () extends Promise[R] {
  /**
     * If you call resolve in the body of the callback passed to the constructor,
     * your promise is fulfilled with result object passed to resolve.
     * If you call reject your promise is rejected with the object passed to resolve.
     * For consistency and debugging (eg stack traces), obj should be an instanceof Error.
     * Any errors thrown in the constructor callback will be implicitly passed to reject().
     */
  def this(callback: js.Function2[
      /* resolve */ js.Function1[
        /* value */ js.UndefOr[R | anyDashPromiseLib.anyDashPromiseMod.PromiseNs.Thenable[R]], 
        scala.Unit
      ], 
      /* reject */ js.Function1[/* error */ js.UndefOr[js.Any], scala.Unit], 
      scala.Unit
    ]) = this()
}

@JSImport("any-promise", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  def all[T1](values: js.Array[T1 | anyDashPromiseLib.anyDashPromiseMod.PromiseNs.Thenable[T1]]): anyDashPromiseLib.anyDashPromiseMod.Promise[js.Array[T1]] = js.native
  def all[T1, T2](
    values: js.Tuple2[
      T1 | anyDashPromiseLib.anyDashPromiseMod.PromiseNs.Thenable[T1], 
      T2 | anyDashPromiseLib.anyDashPromiseMod.PromiseNs.Thenable[T2]
    ]
  ): anyDashPromiseLib.anyDashPromiseMod.Promise[js.Tuple2[T1, T2]] = js.native
  def all[T1, T2, T3](
    values: js.Tuple3[
      T1 | anyDashPromiseLib.anyDashPromiseMod.PromiseNs.Thenable[T1], 
      T2 | anyDashPromiseLib.anyDashPromiseMod.PromiseNs.Thenable[T2], 
      T3 | anyDashPromiseLib.anyDashPromiseMod.PromiseNs.Thenable[T3]
    ]
  ): anyDashPromiseLib.anyDashPromiseMod.Promise[js.Tuple3[T1, T2, T3]] = js.native
  def all[T1, T2, T3, T4](
    values: js.Tuple4[
      T1 | anyDashPromiseLib.anyDashPromiseMod.PromiseNs.Thenable[T1], 
      T2 | anyDashPromiseLib.anyDashPromiseMod.PromiseNs.Thenable[T2], 
      T3 | anyDashPromiseLib.anyDashPromiseMod.PromiseNs.Thenable[T3], 
      T4 | anyDashPromiseLib.anyDashPromiseMod.PromiseNs.Thenable[T4]
    ]
  ): anyDashPromiseLib.anyDashPromiseMod.Promise[js.Tuple4[T1, T2, T3, T4]] = js.native
  def all[T1, T2, T3, T4, T5](
    values: js.Tuple5[
      T1 | anyDashPromiseLib.anyDashPromiseMod.PromiseNs.Thenable[T1], 
      T2 | anyDashPromiseLib.anyDashPromiseMod.PromiseNs.Thenable[T2], 
      T3 | anyDashPromiseLib.anyDashPromiseMod.PromiseNs.Thenable[T3], 
      T4 | anyDashPromiseLib.anyDashPromiseMod.PromiseNs.Thenable[T4], 
      T5 | anyDashPromiseLib.anyDashPromiseMod.PromiseNs.Thenable[T5]
    ]
  ): anyDashPromiseLib.anyDashPromiseMod.Promise[js.Tuple5[T1, T2, T3, T4, T5]] = js.native
  def all[T1, T2, T3, T4, T5, T6](
    values: js.Tuple6[
      T1 | anyDashPromiseLib.anyDashPromiseMod.PromiseNs.Thenable[T1], 
      T2 | anyDashPromiseLib.anyDashPromiseMod.PromiseNs.Thenable[T2], 
      T3 | anyDashPromiseLib.anyDashPromiseMod.PromiseNs.Thenable[T3], 
      T4 | anyDashPromiseLib.anyDashPromiseMod.PromiseNs.Thenable[T4], 
      T5 | anyDashPromiseLib.anyDashPromiseMod.PromiseNs.Thenable[T5], 
      T6 | anyDashPromiseLib.anyDashPromiseMod.PromiseNs.Thenable[T6]
    ]
  ): anyDashPromiseLib.anyDashPromiseMod.Promise[js.Tuple6[T1, T2, T3, T4, T5, T6]] = js.native
  def all[T1, T2, T3, T4, T5, T6, T7](
    values: js.Tuple7[
      T1 | anyDashPromiseLib.anyDashPromiseMod.PromiseNs.Thenable[T1], 
      T2 | anyDashPromiseLib.anyDashPromiseMod.PromiseNs.Thenable[T2], 
      T3 | anyDashPromiseLib.anyDashPromiseMod.PromiseNs.Thenable[T3], 
      T4 | anyDashPromiseLib.anyDashPromiseMod.PromiseNs.Thenable[T4], 
      T5 | anyDashPromiseLib.anyDashPromiseMod.PromiseNs.Thenable[T5], 
      T6 | anyDashPromiseLib.anyDashPromiseMod.PromiseNs.Thenable[T6], 
      T7 | anyDashPromiseLib.anyDashPromiseMod.PromiseNs.Thenable[T7]
    ]
  ): anyDashPromiseLib.anyDashPromiseMod.Promise[js.Tuple7[T1, T2, T3, T4, T5, T6, T7]] = js.native
  def all[T1, T2, T3, T4, T5, T6, T7, T8](
    values: js.Tuple8[
      T1 | anyDashPromiseLib.anyDashPromiseMod.PromiseNs.Thenable[T1], 
      T2 | anyDashPromiseLib.anyDashPromiseMod.PromiseNs.Thenable[T2], 
      T3 | anyDashPromiseLib.anyDashPromiseMod.PromiseNs.Thenable[T3], 
      T4 | anyDashPromiseLib.anyDashPromiseMod.PromiseNs.Thenable[T4], 
      T5 | anyDashPromiseLib.anyDashPromiseMod.PromiseNs.Thenable[T5], 
      T6 | anyDashPromiseLib.anyDashPromiseMod.PromiseNs.Thenable[T6], 
      T7 | anyDashPromiseLib.anyDashPromiseMod.PromiseNs.Thenable[T7], 
      T8 | anyDashPromiseLib.anyDashPromiseMod.PromiseNs.Thenable[T8]
    ]
  ): anyDashPromiseLib.anyDashPromiseMod.Promise[js.Tuple8[T1, T2, T3, T4, T5, T6, T7, T8]] = js.native
  def all[T1, T2, T3, T4, T5, T6, T7, T8, T9](
    values: js.Tuple9[
      T1 | anyDashPromiseLib.anyDashPromiseMod.PromiseNs.Thenable[T1], 
      T2 | anyDashPromiseLib.anyDashPromiseMod.PromiseNs.Thenable[T2], 
      T3 | anyDashPromiseLib.anyDashPromiseMod.PromiseNs.Thenable[T3], 
      T4 | anyDashPromiseLib.anyDashPromiseMod.PromiseNs.Thenable[T4], 
      T5 | anyDashPromiseLib.anyDashPromiseMod.PromiseNs.Thenable[T5], 
      T6 | anyDashPromiseLib.anyDashPromiseMod.PromiseNs.Thenable[T6], 
      T7 | anyDashPromiseLib.anyDashPromiseMod.PromiseNs.Thenable[T7], 
      T8 | anyDashPromiseLib.anyDashPromiseMod.PromiseNs.Thenable[T8], 
      T9 | anyDashPromiseLib.anyDashPromiseMod.PromiseNs.Thenable[T9]
    ]
  ): anyDashPromiseLib.anyDashPromiseMod.Promise[js.Tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] = js.native
  /**
     * Make a promise that fulfills when every item in the array fulfills, and rejects if (and when) any item rejects.
     * the array passed to all can be a mixture of promise-like objects and other objects.
     * The fulfillment value is an array (in order) of fulfillment values. The rejection value is the first rejection value.
     */
  def all[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
    values: js.Tuple10[
      T1 | anyDashPromiseLib.anyDashPromiseMod.PromiseNs.Thenable[T1], 
      T2 | anyDashPromiseLib.anyDashPromiseMod.PromiseNs.Thenable[T2], 
      T3 | anyDashPromiseLib.anyDashPromiseMod.PromiseNs.Thenable[T3], 
      T4 | anyDashPromiseLib.anyDashPromiseMod.PromiseNs.Thenable[T4], 
      T5 | anyDashPromiseLib.anyDashPromiseMod.PromiseNs.Thenable[T5], 
      T6 | anyDashPromiseLib.anyDashPromiseMod.PromiseNs.Thenable[T6], 
      T7 | anyDashPromiseLib.anyDashPromiseMod.PromiseNs.Thenable[T7], 
      T8 | anyDashPromiseLib.anyDashPromiseMod.PromiseNs.Thenable[T8], 
      T9 | anyDashPromiseLib.anyDashPromiseMod.PromiseNs.Thenable[T9], 
      T10 | anyDashPromiseLib.anyDashPromiseMod.PromiseNs.Thenable[T10]
    ]
  ): anyDashPromiseLib.anyDashPromiseMod.Promise[js.Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] = js.native
  @JSName("all")
  def all_TAll[TAll](values: js.Array[TAll | anyDashPromiseLib.anyDashPromiseMod.PromiseNs.Thenable[TAll]]): anyDashPromiseLib.anyDashPromiseMod.Promise[js.Array[TAll]] = js.native
  /**
     * Make a Promise that fulfills when any item fulfills, and rejects if any item rejects.
     */
  def race[R](promises: js.Array[R | anyDashPromiseLib.anyDashPromiseMod.PromiseNs.Thenable[R]]): anyDashPromiseLib.anyDashPromiseMod.Promise[R] = js.native
  /**
     * Make a promise that rejects to obj. For consistency and debugging (eg stack traces), obj should be an instanceof Error
     */
  def reject[R](error: js.Any): anyDashPromiseLib.anyDashPromiseMod.Promise[R] = js.native
  /**
     * Make a new promise from the thenable.
     * A thenable is promise-like in as far as it has a "then" method.
     */
  def resolve(): anyDashPromiseLib.anyDashPromiseMod.Promise[scala.Unit] = js.native
  def resolve[R](value: R): anyDashPromiseLib.anyDashPromiseMod.Promise[R] = js.native
  def resolve[R](value: anyDashPromiseLib.anyDashPromiseMod.PromiseNs.Thenable[R]): anyDashPromiseLib.anyDashPromiseMod.Promise[R] = js.native
}

