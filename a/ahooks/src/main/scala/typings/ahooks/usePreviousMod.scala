package typings.ahooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object usePreviousMod {
  
  @JSImport("ahooks/lib/usePrevious", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](state: T): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(state.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
  inline def default[T](state: T, shouldUpdate: ShouldUpdateFunc[T]): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(state.asInstanceOf[js.Any], shouldUpdate.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  
  type ShouldUpdateFunc[T] = js.Function2[/* prev */ js.UndefOr[T], /* next */ T, Boolean]
}
