package typings.antvG2plot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsNumberMod {
  
  @JSImport("@antv/g2plot/lib/utils/number", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isBetween(value: Double, start: Double, end: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBetween")(value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isRealNumber(v: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRealNumber")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
