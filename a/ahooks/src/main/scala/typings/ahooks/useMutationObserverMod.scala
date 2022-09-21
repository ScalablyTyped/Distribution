package typings.ahooks

import typings.ahooks.domTargetMod.BasicTarget
import typings.std.Element
import typings.std.MutationCallback
import typings.std.MutationObserverInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useMutationObserverMod {
  
  @JSImport("ahooks/lib/useMutationObserver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(callback: MutationCallback, target: BasicTarget[Element]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(callback.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default(callback: MutationCallback, target: BasicTarget[Element], options: MutationObserverInit): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(callback.asInstanceOf[js.Any], target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
