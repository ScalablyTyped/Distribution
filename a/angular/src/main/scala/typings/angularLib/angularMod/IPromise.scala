package typings
package angularLib.angularMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPromise[T] extends js.Object {
  /**
    * Shorthand for promise.then(null, errorCallback)
    */
  def `catch`[TResult](): IPromise[T | TResult] = js.native
  def `catch`[TResult](
    onRejected: js.Function1[
      /* reason */ js.Any, 
      (IPromise[scala.Nothing | TResult]) | TResult | (js.Thenable[scala.Nothing | TResult])
    ]
  ): IPromise[T | TResult] = js.native
  /**
    * Allows you to observe either the fulfillment or rejection of a promise, but to do so without modifying the final value. This is useful to release resources or do some clean-up that needs to be done whether the promise was rejected or resolved. See the full specification for more information.
    *
    * Because finally is a reserved word in JavaScript and reserved keywords are not supported as property names by ES3, you'll need to invoke the method like promise['finally'](callback) to make your code IE8 and Android 2.x compatible.
    */
  def `finally`(finallyCallback: js.Function0[scala.Unit]): IPromise[T] = js.native
  /**
    * Regardless of when the promise was or will be resolved or rejected, then calls one of
    * the success or error callbacks asynchronously as soon as the result is available. The
    * callbacks are called with a single argument: the result or rejection reason.
    * Additionally, the notify callback may be called zero or more times to provide a
    * progress indication, before the promise is resolved or rejected.
    * The `successCallBack` may return `IPromise<never>` for when a `$q.reject()` needs to
    * be returned.
    * This method returns a new promise which is resolved or rejected via the return value
    * of the `successCallback`, `errorCallback`. It also notifies via the return value of
    * the `notifyCallback` method. The promise can not be resolved or rejected from the
    * `notifyCallback` method.
    */
  def `then`[TResult1, TResult2](): IPromise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](
    successCallback: js.Function1[
      /* value */ T, 
      (IPromise[scala.Nothing | TResult1]) | TResult1 | (js.Thenable[scala.Nothing | TResult1])
    ]
  ): IPromise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](
    successCallback: js.Function1[
      /* value */ T, 
      (IPromise[scala.Nothing | TResult1]) | TResult1 | (js.Thenable[scala.Nothing | TResult1])
    ],
    errorCallback: js.Function1[
      /* reason */ js.Any, 
      (IPromise[scala.Nothing | TResult2]) | TResult2 | (js.Thenable[scala.Nothing | TResult2])
    ]
  ): IPromise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](
    successCallback: js.Function1[
      /* value */ T, 
      (IPromise[scala.Nothing | TResult1]) | TResult1 | (js.Thenable[scala.Nothing | TResult1])
    ],
    errorCallback: js.Function1[
      /* reason */ js.Any, 
      (IPromise[scala.Nothing | TResult2]) | TResult2 | (js.Thenable[scala.Nothing | TResult2])
    ],
    notifyCallback: js.Function1[/* state */ js.Any, _]
  ): IPromise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](
    successCallback: js.Function1[
      /* value */ T, 
      (IPromise[scala.Nothing | TResult1]) | TResult1 | (js.Thenable[scala.Nothing | TResult1])
    ],
    errorCallback: scala.Null,
    notifyCallback: js.Function1[/* state */ js.Any, _]
  ): IPromise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](
    successCallback: scala.Null,
    errorCallback: js.Function1[
      /* reason */ js.Any, 
      (IPromise[scala.Nothing | TResult2]) | TResult2 | (js.Thenable[scala.Nothing | TResult2])
    ]
  ): IPromise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](
    successCallback: scala.Null,
    errorCallback: js.Function1[
      /* reason */ js.Any, 
      (IPromise[scala.Nothing | TResult2]) | TResult2 | (js.Thenable[scala.Nothing | TResult2])
    ],
    notifyCallback: js.Function1[/* state */ js.Any, _]
  ): IPromise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](
    successCallback: scala.Null,
    errorCallback: scala.Null,
    notifyCallback: js.Function1[/* state */ js.Any, _]
  ): IPromise[TResult1 | TResult2] = js.native
}

