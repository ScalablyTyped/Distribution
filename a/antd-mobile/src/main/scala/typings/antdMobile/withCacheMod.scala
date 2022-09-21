package typings.antdMobile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withCacheMod {
  
  @JSImport("antd-mobile/es/utils/with-cache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def withCache[T](generate: js.Function0[T]): js.Function0[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("withCache")(generate.asInstanceOf[js.Any]).asInstanceOf[js.Function0[T]]
}
