package typings.antvUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object removeMod {
  
  @JSImport("@antv/util/lib/lodash/remove", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](
    arr: js.Array[T],
    predicate: js.Function3[/* value */ T, /* idx */ Double, /* arr */ js.UndefOr[js.Array[T]], Boolean]
  ): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(arr.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
}
