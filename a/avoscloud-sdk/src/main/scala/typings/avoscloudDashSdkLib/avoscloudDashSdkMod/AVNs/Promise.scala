package typings
package avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Promise[T] extends js.Object {
  def always(callback: js.Function): Promise[T] = js.native
  def done(callback: js.Function): Promise[T] = js.native
  def fail(callback: js.Function): Promise[T] = js.native
  def reject(error: js.Any): scala.Unit = js.native
  def resolve(result: js.Any): scala.Unit = js.native
  def `then`[U](resolvedCallback: js.Function1[/* value */ T, Promise[U] | U]): IPromise[T] = js.native
  def `then`[U](
    resolvedCallback: js.Function1[/* value */ T, Promise[U] | U],
    rejectedCallback: js.Function1[/* reason */ js.Any, IPromise[U] | Promise[U] | U]
  ): IPromise[T] = js.native
}

