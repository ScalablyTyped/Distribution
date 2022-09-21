package typings.ahooks

import typings.ahooks.anon.FnCall
import typings.ahooks.domTargetMod.BasicTarget
import typings.react.mod.DependencyList
import typings.react.mod.EffectCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createEffectWithTargetMod {
  
  @JSImport("ahooks/lib/utils/createEffectWithTarget", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(useEffectType: FnCall): js.Function3[
    /* effect */ EffectCallback, 
    /* deps */ DependencyList, 
    /* target */ BasicTarget[Any] | js.Array[BasicTarget[Any]], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(useEffectType.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* effect */ EffectCallback, 
    /* deps */ DependencyList, 
    /* target */ BasicTarget[Any] | js.Array[BasicTarget[Any]], 
    Unit
  ]]
}
