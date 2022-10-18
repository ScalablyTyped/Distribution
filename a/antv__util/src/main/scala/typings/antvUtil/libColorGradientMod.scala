package typings.antvUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libColorGradientMod {
  
  @JSImport("@antv/util/lib/color/gradient", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def gradient(colors: String): js.Function1[/* percent */ Double, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("gradient")(colors.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* percent */ Double, String]]
  inline def gradient(colors: js.Array[String]): js.Function1[/* percent */ Double, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("gradient")(colors.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* percent */ Double, String]]
}
