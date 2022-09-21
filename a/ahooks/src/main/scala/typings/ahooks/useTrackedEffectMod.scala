package typings.ahooks

import typings.react.mod.DependencyList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useTrackedEffectMod {
  
  @JSImport("ahooks/lib/useTrackedEffect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(effect: Effect): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def default(effect: Effect, deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type Effect = js.Function3[
    /* changes */ js.UndefOr[js.Array[Double]], 
    /* previousDeps */ js.UndefOr[DependencyList], 
    /* currentDeps */ js.UndefOr[DependencyList], 
    Unit | js.Function0[Unit]
  ]
}
