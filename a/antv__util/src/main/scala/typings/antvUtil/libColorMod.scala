package typings.antvUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libColorMod {
  
  @JSImport("@antv/util/lib/color", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def gradient(colors: String): js.Function1[/* percent */ Double, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("gradient")(colors.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* percent */ Double, String]]
  inline def gradient(colors: js.Array[String]): js.Function1[/* percent */ Double, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("gradient")(colors.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* percent */ Double, String]]
  
  inline def rgb2arr(str: String): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("rgb2arr")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def toCSSGradient(gradientColor: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toCSSGradient")(gradientColor.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def toRGB(color: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toRGB")(color.asInstanceOf[js.Any]).asInstanceOf[String]
}
