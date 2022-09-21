package typings.antvGLite.cssMod

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseColor {
  
  inline def apply(args: Any*): Any = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  
  @JSImport("@antv/g-lite/dist/css", "parseColor")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@antv/g-lite/dist/css", "parseColor.cache")
  @js.native
  def cache: Map[Any, Any] = js.native
  inline def cache_=(x: Map[Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cache")(x.asInstanceOf[js.Any])
}
