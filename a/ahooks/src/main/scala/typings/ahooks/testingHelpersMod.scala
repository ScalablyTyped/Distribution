package typings.ahooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testingHelpersMod {
  
  @JSImport("ahooks/lib/utils/testingHelpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def request(req: Any): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(req.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def sleep(time: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("sleep")(time.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
