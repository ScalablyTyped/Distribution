package typings.arrayFindIndex

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply[T](
    arr: js.Array[T],
    predicate: js.Function3[/* element */ T, /* index */ Double, /* array */ js.Array[T], Boolean]
  ): Double = (^.asInstanceOf[js.Dynamic].apply(arr.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def apply[T, U](
    arr: js.Array[T],
    predicate: js.ThisFunction3[/* this */ U, /* element */ T, /* index */ Double, /* array */ js.Array[T], Boolean],
    ctx: U
  ): Double = (^.asInstanceOf[js.Dynamic].apply(arr.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("array-find-index", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
