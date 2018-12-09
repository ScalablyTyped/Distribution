package typings
package adoneLib.adoneNs.promiseNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Deferred[T] extends js.Object {
  var promise: js.Promise[T] = js.native
  /**
                   * Rejects the promise
                   */
  def reject(): scala.Unit = js.native
  /**
                   * Rejects the promise
                   */
  def reject(value: js.Any): scala.Unit = js.native
  /**
                   * Resolves the promise
                   */
  def resolve(): scala.Unit = js.native
  /**
                   * Resolves the promise
                   */
  def resolve(value: T): scala.Unit = js.native
}

