package typings.antd

import typings.react.mod.DependencyList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypographyHooksUseUpdatedEffectMod {
  
  @JSImport("antd/lib/typography/hooks/useUpdatedEffect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /** Similar with `useEffect` but only trigger after mounted */
  inline def default(callback: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def default(callback: js.Function0[Unit], conditions: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(callback.asInstanceOf[js.Any], conditions.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
