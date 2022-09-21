package typings.ahooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subscribeFocusMod {
  
  @JSImport("ahooks/lib/useRequest/src/utils/subscribeFocus", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(listener: Listener): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(listener.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  
  type Listener = js.Function0[Unit]
}
