package typings.antvUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arr2rgbMod {
  
  @JSImport("@antv/util/lib/color/arr2rgb", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def arr2rgb(arr: js.Array[Double]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("arr2rgb")(arr.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toHex(value: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toHex")(value.asInstanceOf[js.Any]).asInstanceOf[String]
}
