package typings
package angularLib.angularMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDeferred[T] extends js.Object {
  var promise: IPromise[T] = js.native
  def notify(state: js.Any): scala.Unit = js.native
  def reject(): scala.Unit = js.native
  def reject(reason: js.Any): scala.Unit = js.native
  def resolve(): scala.Unit = js.native
  def resolve(value: T): scala.Unit = js.native
  def resolve(value: IPromise[T]): scala.Unit = js.native
}

