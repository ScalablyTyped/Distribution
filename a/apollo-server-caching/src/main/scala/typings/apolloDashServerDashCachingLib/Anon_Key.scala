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

object Anon_Key {
  @scala.inline
  def apply[V](
    maxSize: scala.Int | scala.Double = null,
    onDispose: js.Function2[/* key */ java.lang.String, /* value */ V, scala.Unit] = null,
    sizeCalculator: js.Function2[/* value */ V, /* key */ java.lang.String, scala.Double] = null
  ): Anon_Key[V] = {
    val __obj = js.Dynamic.literal()
    if (maxSize != null) __obj.updateDynamic("maxSize")(maxSize.asInstanceOf[js.Any])
    if (onDispose != null) __obj.updateDynamic("onDispose")(onDispose)
    if (sizeCalculator != null) __obj.updateDynamic("sizeCalculator")(sizeCalculator)
    __obj.asInstanceOf[Anon_Key[V]]
  }
}

