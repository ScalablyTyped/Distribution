package typings.asyncDashCache.asyncDashCacheMod

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsyncCacheFactory
  extends Instantiable1[/* options */ Options[js.Object], Cache[js.Object]] {
  def apply[T](options: Options[T]): Cache[T] = js.native
}

