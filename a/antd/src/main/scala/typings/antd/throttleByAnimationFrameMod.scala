package typings.antd

import typings.antd.anon.Call
import typings.antd.anon.Configurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object throttleByAnimationFrameMod {
  
  @JSImport("antd/lib/_util/throttleByAnimationFrame", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def throttleByAnimationFrame[T /* <: js.Array[Any] */](fn: js.Function1[/* args */ T, Unit]): Call[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("throttleByAnimationFrame")(fn.asInstanceOf[js.Any]).asInstanceOf[Call[T]]
  
  inline def throttleByAnimationFrameDecorator(): js.Function3[/* target */ Any, /* key */ String, /* descriptor */ Any, Configurable] = ^.asInstanceOf[js.Dynamic].applyDynamic("throttleByAnimationFrameDecorator")().asInstanceOf[js.Function3[/* target */ Any, /* key */ String, /* descriptor */ Any, Configurable]]
}
