package typings.antvColorUtil

import typings.antvColorUtil.anon.Call
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("@antv/color-util", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@antv/color-util", "default.gradient")
    @js.native
    def gradient(colors: String): js.Function1[/* percent */ Double, String] = js.native
    @JSImport("@antv/color-util", "default.gradient")
    @js.native
    def gradient(colors: js.Array[String]): js.Function1[/* percent */ Double, String] = js.native
    
    @JSImport("@antv/color-util", "default.rgb2arr")
    @js.native
    def rgb2arr(str: String): js.Array[Double] = js.native
    
    @JSImport("@antv/color-util", "default.toCSSGradient")
    @js.native
    def toCSSGradient(gradientColor: js.Any): js.Any = js.native
    
    @JSImport("@antv/color-util", "default.toRGB")
    @js.native
    def toRGB: Call = js.native
    @JSImport("@antv/color-util", "default.toRGB")
    @js.native
    def toRGB(args: js.Any*): js.Any = js.native
    @scala.inline
    def toRGB_=(x: Call): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toRGB")(x.asInstanceOf[js.Any])
  }
}
