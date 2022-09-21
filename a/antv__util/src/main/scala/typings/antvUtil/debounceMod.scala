package typings.antvUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object debounceMod {
  
  @JSImport("@antv/util/lib/lodash/debounce", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(func: js.Function): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(func.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  inline def default(func: js.Function, wait: Double): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def default(func: js.Function, wait: Double, immediate: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any], immediate.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def default(func: js.Function, wait: Unit, immediate: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any], immediate.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
}
