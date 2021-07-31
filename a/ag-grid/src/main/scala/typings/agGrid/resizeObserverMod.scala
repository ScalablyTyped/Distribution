package typings.agGrid

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resizeObserverMod {
  
  @JSImport("ag-grid/dist/lib/resizeObserver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def observeResize(element: HTMLElement, callback: js.Function1[/* entry */ js.Any, Unit]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("observeResize")(element.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
}
