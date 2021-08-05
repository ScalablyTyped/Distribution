package typings.antvColorUtil

import typings.antvColorUtil.anon.Call
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("@antv/color-util", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def gradient(colors: String): js.Function1[/* percent */ Double, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("gradient")(colors.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* percent */ Double, String]]
    inline def gradient(colors: js.Array[String]): js.Function1[/* percent */ Double, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("gradient")(colors.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* percent */ Double, String]]
    
    inline def rgb2arr(str: String): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("rgb2arr")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
    
    inline def toCSSGradient(gradientColor: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toCSSGradient")(gradientColor.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @JSImport("@antv/color-util", "default.toRGB")
    @js.native
    def toRGB: Call = js.native
    inline def toRGB(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toRGB")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    inline def toRGB_=(x: Call): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toRGB")(x.asInstanceOf[js.Any])
  }
}
