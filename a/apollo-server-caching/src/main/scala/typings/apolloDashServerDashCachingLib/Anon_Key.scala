package typings
package apolloDashServerDashCachingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key[V] extends js.Object {
  var maxSize: js.UndefOr[scala.Double] = js.undefined
  var onDispose: js.UndefOr[js.Function2[/* key */ java.lang.String, /* value */ V, scala.Unit]] = js.undefined
  var sizeCalculator: js.UndefOr[js.Function2[/* value */ V, /* key */ java.lang.String, scala.Double]] = js.undefined
}

