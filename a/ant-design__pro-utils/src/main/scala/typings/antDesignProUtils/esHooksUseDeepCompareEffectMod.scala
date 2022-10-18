package typings.antDesignProUtils

import typings.react.mod.DependencyList
import typings.react.mod.EffectCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esHooksUseDeepCompareEffectMod {
  
  @JSImport("@ant-design/pro-utils/es/hooks/useDeepCompareEffect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isDeepEqual(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDeepEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isDeepEqual(a: Any, b: Any, ignoreKeys: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDeepEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], ignoreKeys.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def useDeepCompareEffect(effect: EffectCallback, dependencies: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useDeepCompareEffect")(effect.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useDeepCompareEffect(effect: EffectCallback, dependencies: DependencyList, ignoreKeys: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useDeepCompareEffect")(effect.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any], ignoreKeys.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useDeepCompareEffectDebounce(effect: EffectCallback, dependencies: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useDeepCompareEffectDebounce")(effect.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useDeepCompareEffectDebounce(effect: EffectCallback, dependencies: DependencyList, ignoreKeys: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useDeepCompareEffectDebounce")(effect.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any], ignoreKeys.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useDeepCompareEffectDebounce(
    effect: EffectCallback,
    dependencies: DependencyList,
    ignoreKeys: js.Array[String],
    waitTime: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useDeepCompareEffectDebounce")(effect.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any], ignoreKeys.asInstanceOf[js.Any], waitTime.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useDeepCompareEffectDebounce(effect: EffectCallback, dependencies: DependencyList, ignoreKeys: Unit, waitTime: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useDeepCompareEffectDebounce")(effect.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any], ignoreKeys.asInstanceOf[js.Any], waitTime.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
