package typings.antvUtil

import typings.antvUtil.anon.Call
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object memoizeMod {
  
  @JSImport("@antv/util/lib/memoize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(f: js.Function): Call = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(f.asInstanceOf[js.Any]).asInstanceOf[Call]
  inline def default(f: js.Function, resolver: js.Function1[/* repeated */ js.Any, String]): Call = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(f.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any])).asInstanceOf[Call]
}
