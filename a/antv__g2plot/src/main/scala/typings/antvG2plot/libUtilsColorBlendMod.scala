package typings.antvG2plot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsColorBlendMod {
  
  @JSImport("@antv/g2plot/lib/utils/color/blend", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def blend(c0: String, c1: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("blend")(c0.asInstanceOf[js.Any], c1.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def blend(c0: String, c1: String, mode: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("blend")(c0.asInstanceOf[js.Any], c1.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def colorToArr(c: String): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("colorToArr")(c.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def innerBlend(mode: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("innerBlend")(mode.asInstanceOf[js.Any]).asInstanceOf[Any]
}
