package typings
package androiduixLib.androidNs.utilNs.PoolsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Pool[T] extends js.Object {
  def acquire(): T
  def release(instance: T): scala.Boolean
}

