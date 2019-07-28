package typings.adone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DisposeKey extends js.Object {
  /**
    * Function that is called when a value is deleted
    */
  var dispose: js.UndefOr[
    js.Function2[
      /* import warning: RewrittenClass.unapply cls $anonfun was tparam K */ /* key */ js.Any, 
      /* import warning: RewrittenClass.unapply cls $anonfun was tparam V */ /* value */ js.Any, 
      Unit
    ]
  ] = js.undefined
  /**
    * Cache size, unlimited by default
    */
  var maxSize: js.UndefOr[Double] = js.undefined
}

object Anon_DisposeKey {
  @scala.inline
  def apply(
    dispose: (/* import warning: RewrittenClass.unapply cls $anonfun was tparam K */ /* key */ js.Any, /* import warning: RewrittenClass.unapply cls $anonfun was tparam V */ /* value */ js.Any) => Unit = null,
    maxSize: Int | Double = null
  ): Anon_DisposeKey = {
    val __obj = js.Dynamic.literal()
    if (dispose != null) __obj.updateDynamic("dispose")(js.Any.fromFunction2(dispose))
    if (maxSize != null) __obj.updateDynamic("maxSize")(maxSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DisposeKey]
  }
}

