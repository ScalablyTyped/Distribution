package typings.adone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dispose[K, V] extends js.Object {
  /**
    * Function that is called when a value is deleted
    */
  var dispose: js.UndefOr[js.Function2[/* key */ K, /* value */ V, Unit]] = js.undefined
  /**
    * Cache size, unlimited by default
    */
  var maxSize: js.UndefOr[Double] = js.undefined
}

object Anon_Dispose {
  @scala.inline
  def apply[K, V](dispose: (/* key */ K, /* value */ V) => Unit = null, maxSize: Int | Double = null): Anon_Dispose[K, V] = {
    val __obj = js.Dynamic.literal()
    if (dispose != null) __obj.updateDynamic("dispose")(js.Any.fromFunction2(dispose))
    if (maxSize != null) __obj.updateDynamic("maxSize")(maxSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Dispose[K, V]]
  }
}

