package typings.adone.adoneNs.promiseNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Deferred[T] extends js.Object {
  var promise: js.Promise[T] = js.native
  /**
    * Rejects the promise
    */
  def reject(): Unit = js.native
  def reject(value: js.Any): Unit = js.native
  /**
    * Resolves the promise
    */
  def resolve(): Unit = js.native
  def resolve(value: T): Unit = js.native
}

