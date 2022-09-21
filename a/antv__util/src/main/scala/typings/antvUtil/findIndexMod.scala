package typings.antvUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object findIndexMod {
  
  @JSImport("@antv/util/lib/lodash/find-index", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](arr: js.Array[T], predicate: js.Function2[/* item */ T, /* idx */ js.UndefOr[Double], Boolean]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(arr.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def default[T](
    arr: js.Array[T],
    predicate: js.Function2[/* item */ T, /* idx */ js.UndefOr[Double], Boolean],
    fromIndex: Double
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(arr.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
}
