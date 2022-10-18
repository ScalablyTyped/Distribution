package typings.ahooks

import typings.ahooks.libUtilsDomTargetMod.BasicTarget
import typings.react.mod.DependencyList
import typings.react.mod.EffectCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsUseDeepCompareWithTargetMod {
  
  @JSImport("ahooks/lib/utils/useDeepCompareWithTarget", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(effect: EffectCallback, deps: DependencyList, target: js.Array[BasicTarget[Any]]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default(effect: EffectCallback, deps: DependencyList, target: BasicTarget[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
