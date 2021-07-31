package typings.arrayTreeFilter

import typings.arrayTreeFilter.anon.ChildrenKeyName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("array-tree-filter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[T](data: js.Array[T], filterFn: js.Function2[/* item */ T, /* level */ Double, Boolean]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(data.asInstanceOf[js.Any], filterFn.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  @scala.inline
  def default[T](
    data: js.Array[T],
    filterFn: js.Function2[/* item */ T, /* level */ Double, Boolean],
    options: ChildrenKeyName
  ): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(data.asInstanceOf[js.Any], filterFn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
}
