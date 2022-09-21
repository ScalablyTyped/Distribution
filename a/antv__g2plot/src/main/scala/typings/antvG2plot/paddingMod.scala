package typings.antvG2plot

import typings.antvG2.libInterfaceMod.ViewAppendPadding
import typings.antvG2.libInterfaceMod.ViewPadding
import typings.antvG2plot.antvG2plotStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paddingMod {
  
  @JSImport("@antv/g2plot/lib/utils/padding", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAdjustAppendPadding(padding: ViewAppendPadding): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAdjustAppendPadding")(padding.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  inline def getAdjustAppendPadding(padding: ViewAppendPadding, position: String): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAdjustAppendPadding")(padding.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def getAdjustAppendPadding(padding: ViewAppendPadding, position: String, append: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAdjustAppendPadding")(padding.asInstanceOf[js.Any], position.asInstanceOf[js.Any], append.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def getAdjustAppendPadding(padding: ViewAppendPadding, position: Unit, append: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAdjustAppendPadding")(padding.asInstanceOf[js.Any], position.asInstanceOf[js.Any], append.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def normalPadding(padding: js.Array[Double]): js.Tuple4[Double, Double, Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalPadding")(padding.asInstanceOf[js.Any]).asInstanceOf[js.Tuple4[Double, Double, Double, Double]]
  inline def normalPadding(padding: Double): js.Tuple4[Double, Double, Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalPadding")(padding.asInstanceOf[js.Any]).asInstanceOf[js.Tuple4[Double, Double, Double, Double]]
  
  inline def normalPadding_auto(padding: auto): js.Tuple4[Double, Double, Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalPadding")(padding.asInstanceOf[js.Any]).asInstanceOf[js.Tuple4[Double, Double, Double, Double]]
  
  inline def resolveAllPadding(paddings: js.Array[ViewPadding]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveAllPadding")(paddings.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
}
