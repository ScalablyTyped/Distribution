package typings.antd

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormHooksUseFrameStateMod {
  
  @JSImport("antd/lib/form/hooks/useFrameState", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[ValueType](defaultValue: ValueType): js.Tuple2[ValueType, js.Function1[/* updater */ Updater[ValueType], Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[ValueType, js.Function1[/* updater */ Updater[ValueType], Unit]]]
  
  type Updater[ValueType] = js.Function1[/* prev */ js.UndefOr[ValueType], ValueType]
}
