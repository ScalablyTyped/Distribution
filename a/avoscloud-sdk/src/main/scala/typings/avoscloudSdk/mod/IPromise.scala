package typings.avoscloudSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Promise is returned by async methods as a hook to provide callbacks to be
  * called when the async task is fulfilled.
  *
  * <p>Typical usage would be like:<pre>
  *    query.find().then(function(results) {
  *      results[0].set("foo", "bar");
  *      return results[0].saveAsync();
  *    }).then(function(result) {
  *      console.log("Updated " + result.id);
  *    });
  * </pre></p>
  *
  * @see AV.Promise.prototype.then
  * @class
  */
@js.native
trait IPromise[T] extends js.Object {
  def `then`[U](resolvedCallback: js.Function1[/* value */ T, IPromise[U] | U]): IPromise[T] = js.native
  def `then`[U](
    resolvedCallback: js.Function1[/* value */ T, IPromise[U] | U],
    rejectedCallback: js.Function1[/* reason */ js.Any, IPromise[U] | U]
  ): IPromise[T] = js.native
}

