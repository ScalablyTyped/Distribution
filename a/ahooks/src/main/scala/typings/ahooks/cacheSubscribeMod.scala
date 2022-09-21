package typings.ahooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cacheSubscribeMod {
  
  @JSImport("ahooks/lib/useRequest/src/utils/cacheSubscribe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def subscribe(key: String, listener: Listener): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("subscribe")(key.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def trigger(key: String, data: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(key.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type Listener = js.Function1[/* data */ Any, Unit]
}
