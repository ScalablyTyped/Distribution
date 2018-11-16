package typings
package apolloDashServerDashCachingLib.distKeyValueCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyValueCache extends js.Object {
  def get(key: java.lang.String): stdLib.Promise[js.UndefOr[java.lang.String]] = js.native
  def set(key: java.lang.String, value: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def set(key: java.lang.String, value: java.lang.String, options: apolloDashServerDashCachingLib.Anon_Ttl): stdLib.Promise[scala.Unit] = js.native
}

