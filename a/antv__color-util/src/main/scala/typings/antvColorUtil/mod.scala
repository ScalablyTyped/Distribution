package typings.antvColorUtil

import typings.antvColorUtil.anon.Call
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/color-util", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    def gradient(colors: String): js.Function1[/* percent */ Double, String] = js.native
    def gradient(colors: js.Array[String]): js.Function1[/* percent */ Double, String] = js.native
    
    def rgb2arr(str: String): js.Array[Double] = js.native
    
    def toCSSGradient(gradientColor: js.Any): js.Any = js.native
    
    def toRGB(args: js.Any*): js.Any = js.native
    @JSName("toRGB")
    var toRGB_Original: Call = js.native
  }
}
