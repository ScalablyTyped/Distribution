package typings
package apolloDashServerDashCachingLib.distKeyValueCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyValueCache extends js.Object {
  def delete(key: java.lang.String): js.Promise[scala.Boolean | scala.Unit] = js.native
  def get(key: java.lang.String): js.Promise[js.UndefOr[java.lang.String]] = js.native
  def set(key: java.lang.String, value: java.lang.String): js.Promise[scala.Unit] = js.native
  def set(key: java.lang.String, value: java.lang.String, options: apolloDashServerDashCachingLib.Anon_Ttl): js.Promise[scala.Unit] = js.native
}

