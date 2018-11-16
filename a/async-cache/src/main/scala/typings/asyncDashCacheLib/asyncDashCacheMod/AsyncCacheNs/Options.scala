package typings
package asyncDashCacheLib.asyncDashCacheMod.AsyncCacheNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options[T]
  extends lruDashCacheLib.lruDashCacheMod.LRUNs.Options[java.lang.String, T] {
  def load(
    key: java.lang.String,
    callback: js.Function3[
      /* error */ js.Any, 
      /* asyncValue */ T, 
      /* maxAge */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ): scala.Unit
}

