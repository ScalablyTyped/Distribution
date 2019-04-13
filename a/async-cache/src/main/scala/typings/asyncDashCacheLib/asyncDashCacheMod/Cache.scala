package typings
package asyncDashCacheLib.asyncDashCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cache[T] extends js.Object {
  val itemCount: scala.Double = js.native
  def del(key: java.lang.String): scala.Unit = js.native
  def get(key: java.lang.String, cb: js.Function2[/* error */ js.Any, /* value */ T, scala.Unit]): scala.Unit = js.native
  def has(key: java.lang.String): scala.Boolean = js.native
  def keys(): js.Array[java.lang.String] = js.native
  def peek(key: java.lang.String): js.UndefOr[T] = js.native
  def reset(): scala.Unit = js.native
  def set(key: java.lang.String, value: T): scala.Boolean = js.native
  def set(key: java.lang.String, value: T, maxAge: scala.Double): scala.Boolean = js.native
}

