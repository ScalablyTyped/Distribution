package typings
package apolloDashServerDashCachingLib.distKeyValueCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyValueCache[V] extends js.Object {
  def delete(key: java.lang.String): js.Promise[scala.Boolean | scala.Unit] = js.native
  def get(key: java.lang.String): js.Promise[js.UndefOr[V]] = js.native
  def set(key: java.lang.String, value: V): js.Promise[scala.Unit] = js.native
  def set(key: java.lang.String, value: V, options: apolloDashServerDashCachingLib.Anon_Ttl): js.Promise[scala.Unit] = js.native
}

