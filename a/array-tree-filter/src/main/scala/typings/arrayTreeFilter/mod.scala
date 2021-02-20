package typings.arrayTreeFilter

import typings.arrayTreeFilter.anon.ChildrenKeyName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("array-tree-filter", JSImport.Default)
  @js.native
  def default[T](data: js.Array[T], filterFn: js.Function2[/* item */ T, /* level */ Double, Boolean]): js.Array[T] = js.native
  @JSImport("array-tree-filter", JSImport.Default)
  @js.native
  def default[T](
    data: js.Array[T],
    filterFn: js.Function2[/* item */ T, /* level */ Double, Boolean],
    options: ChildrenKeyName
  ): js.Array[T] = js.native
}
