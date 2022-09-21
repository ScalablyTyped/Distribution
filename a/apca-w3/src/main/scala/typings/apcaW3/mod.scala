package typings.apcaW3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("apca-w3", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def APCAcontrast(txtY: Double, bgY: Double): Double | String = (^.asInstanceOf[js.Dynamic].applyDynamic("APCAcontrast")(txtY.asInstanceOf[js.Any], bgY.asInstanceOf[js.Any])).asInstanceOf[Double | String]
  inline def APCAcontrast(txtY: Double, bgY: Double, places: Double): Double | String = (^.asInstanceOf[js.Dynamic].applyDynamic("APCAcontrast")(txtY.asInstanceOf[js.Any], bgY.asInstanceOf[js.Any], places.asInstanceOf[js.Any])).asInstanceOf[Double | String]
  
  inline def adobeRGBtoY(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("adobeRGBtoY")().asInstanceOf[Double]
  inline def adobeRGBtoY(rgb: js.Tuple3[/* r */ Double, /* g */ Double, /* b */ Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("adobeRGBtoY")(rgb.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def alphaBlend(): js.Tuple3[/* r */ Double, /* g */ Double, /* b */ Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("alphaBlend")().asInstanceOf[js.Tuple3[/* r */ Double, /* g */ Double, /* b */ Double]]
  inline def alphaBlend(rgbaFG: js.Tuple4[/* r */ Double, /* g */ Double, /* b */ Double, /* a */ Double]): js.Tuple3[/* r */ Double, /* g */ Double, /* b */ Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("alphaBlend")(rgbaFG.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[/* r */ Double, /* g */ Double, /* b */ Double]]
  inline def alphaBlend(
    rgbaFG: js.Tuple4[/* r */ Double, /* g */ Double, /* b */ Double, /* a */ Double],
    rgbBG: js.Tuple3[/* r */ Double, /* g */ Double, /* b */ Double]
  ): js.Tuple3[/* r */ Double, /* g */ Double, /* b */ Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("alphaBlend")(rgbaFG.asInstanceOf[js.Any], rgbBG.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[/* r */ Double, /* g */ Double, /* b */ Double]]
  inline def alphaBlend(
    rgbaFG: js.Tuple4[/* r */ Double, /* g */ Double, /* b */ Double, /* a */ Double],
    rgbBG: js.Tuple3[/* r */ Double, /* g */ Double, /* b */ Double],
    isInt: Boolean
  ): js.Tuple3[/* r */ Double, /* g */ Double, /* b */ Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("alphaBlend")(rgbaFG.asInstanceOf[js.Any], rgbBG.asInstanceOf[js.Any], isInt.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[/* r */ Double, /* g */ Double, /* b */ Double]]
  inline def alphaBlend(
    rgbaFG: js.Tuple4[/* r */ Double, /* g */ Double, /* b */ Double, /* a */ Double],
    rgbBG: Unit,
    isInt: Boolean
  ): js.Tuple3[/* r */ Double, /* g */ Double, /* b */ Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("alphaBlend")(rgbaFG.asInstanceOf[js.Any], rgbBG.asInstanceOf[js.Any], isInt.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[/* r */ Double, /* g */ Double, /* b */ Double]]
  inline def alphaBlend(rgbaFG: Unit, rgbBG: js.Tuple3[/* r */ Double, /* g */ Double, /* b */ Double]): js.Tuple3[/* r */ Double, /* g */ Double, /* b */ Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("alphaBlend")(rgbaFG.asInstanceOf[js.Any], rgbBG.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[/* r */ Double, /* g */ Double, /* b */ Double]]
  inline def alphaBlend(rgbaFG: Unit, rgbBG: js.Tuple3[/* r */ Double, /* g */ Double, /* b */ Double], isInt: Boolean): js.Tuple3[/* r */ Double, /* g */ Double, /* b */ Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("alphaBlend")(rgbaFG.asInstanceOf[js.Any], rgbBG.asInstanceOf[js.Any], isInt.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[/* r */ Double, /* g */ Double, /* b */ Double]]
  inline def alphaBlend(rgbaFG: Unit, rgbBG: Unit, isInt: Boolean): js.Tuple3[/* r */ Double, /* g */ Double, /* b */ Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("alphaBlend")(rgbaFG.asInstanceOf[js.Any], rgbBG.asInstanceOf[js.Any], isInt.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[/* r */ Double, /* g */ Double, /* b */ Double]]
  
  inline def calcAPCA(textColor: String, bgColor: String): Double | String = (^.asInstanceOf[js.Dynamic].applyDynamic("calcAPCA")(textColor.asInstanceOf[js.Any], bgColor.asInstanceOf[js.Any])).asInstanceOf[Double | String]
  inline def calcAPCA(textColor: String, bgColor: String, places: Double): Double | String = (^.asInstanceOf[js.Dynamic].applyDynamic("calcAPCA")(textColor.asInstanceOf[js.Any], bgColor.asInstanceOf[js.Any], places.asInstanceOf[js.Any])).asInstanceOf[Double | String]
  inline def calcAPCA(textColor: String, bgColor: String, places: Double, isInt: Boolean): Double | String = (^.asInstanceOf[js.Dynamic].applyDynamic("calcAPCA")(textColor.asInstanceOf[js.Any], bgColor.asInstanceOf[js.Any], places.asInstanceOf[js.Any], isInt.asInstanceOf[js.Any])).asInstanceOf[Double | String]
  inline def calcAPCA(textColor: String, bgColor: String, places: Unit, isInt: Boolean): Double | String = (^.asInstanceOf[js.Dynamic].applyDynamic("calcAPCA")(textColor.asInstanceOf[js.Any], bgColor.asInstanceOf[js.Any], places.asInstanceOf[js.Any], isInt.asInstanceOf[js.Any])).asInstanceOf[Double | String]
  inline def calcAPCA(textColor: String, bgColor: js.Tuple3[/* r */ Double, /* g */ Double, /* b */ Double]): Double | String = (^.asInstanceOf[js.Dynamic].applyDynamic("calcAPCA")(textColor.asInstanceOf[js.Any], bgColor.asInstanceOf[js.Any])).asInstanceOf[Double | String]
  inline def calcAPCA(
    textColor: String,
    bgColor: js.Tuple3[/* r */ Double, /* g */ Double, /* b */ Double],
    places: Double
  ): Double | String = (^.asInstanceOf[js.Dynamic].applyDynamic("calcAPCA")(textColor.asInstanceOf[js.Any], bgColor.asInstanceOf[js.Any], places.asInstanceOf[js.Any])).asInstanceOf[Double | String]
  inline def calcAPCA(
    textColor: String,
    bgColor: js.Tuple3[/* r */ Double, /* g */ Double, /* b */ Double],
    places: Double,
    isInt: Boolean
  ): Double | String = (^.asInstanceOf[js.Dynamic].applyDynamic("calcAPCA")(textColor.asInstanceOf[js.Any], bgColor.asInstanceOf[js.Any], places.asInstanceOf[js.Any], isInt.asInstanceOf[js.Any])).asInstanceOf[Double | String]
  inline def calcAPCA(
    textColor: String,
    bgColor: js.Tuple3[/* r */ Double, /* g */ Double, /* b */ Double],
    places: Unit,
    isInt: Boolean
  ): Double | String = (^.asInstanceOf[js.Dynamic].applyDynamic("calcAPCA")(textColor.asInstanceOf[js.Any], bgColor.asInstanceOf[js.Any], places.asInstanceOf[js.Any], isInt.asInstanceOf[js.Any])).asInstanceOf[Double | String]
  inline def calcAPCA(textColor: String, bgColor: Double): Double | String = (^.asInstanceOf[js.Dynamic].applyDynamic("calcAPCA")(textColor.asInstanceOf[js.Any], bgColor.asInstanceOf[js.Any])).asInstanceOf[Double | String]
  inline def calcAPCA(textColor: String, bgColor: Double, places: Double): Double | String = (^.asInstanceOf[js.Dynamic].applyDynamic("calcAPCA")(textColor.asInstanceOf[js.Any], bgColor.asInstanceOf[js.Any], places.asInstanceOf[js.Any])).asInstanceOf[Double | String]
  inline def calcAPCA(textColor: String, bgColor: Double, places: Double, isInt: Boolean): Double | String = (^.asInstanceOf[js.Dynamic].applyDynamic("calcAPCA")(textColor.asInstanceOf[js.Any], bgColor.asInstanceOf[js.Any], places.asInstanceOf[js.Any], isInt.asInstanceOf[js.Any])).asInstanceOf[Double | String]
  inline def calcAPCA(textColor: String, bgColor: Double, places: Unit, isInt: Boolean): Double | String = (^.asInstanceOf[js.Dynamic].applyDynamic("calcAPCA")(textColor.asInstanceOf[js.Any], bgColor.asInstanceOf[js.Any], places.asInstanceOf[js.Any], isInt.asInstanceOf[js.Any])).asInstanceOf[Double | String]
  inline def calcAPCA(
    textColor: js.Tuple4[/* r */ Double, /* g */ Double, /* b */ Double, /* a */ js.UndefOr[Double]],
    bgColor: String
  ): Double | String = (^.asInstanceOf[js.Dynamic].applyDynamic("calcAPCA")(textColor.asInstanceOf[js.Any], bgColor.asInstanceOf[js.Any])).asInstanceOf[Double | String]
  inline def calcAPCA(
    textColor: js.Tuple4[/* r */ Double, /* g */ Double, /* b */ Double, /* a */ js.UndefOr[Double]],
    bgColor: String,
    places: Double
  ): Double | String = (^.asInstanceOf[js.Dynamic].applyDynamic("calcAPCA")(textColor.asInstanceOf[js.Any], bgColor.asInstanceOf[js.Any], places.asInstanceOf[js.Any])).asInstanceOf[Double | String]
  inline def calcAPCA(
    textColor: js.Tuple4[/* r */ Double, /* g */ Double, /* b */ Double, /* a */ js.UndefOr[Double]],
    bgColor: String,
    places: Double,
    isInt: Boolean
  ): Double | String = (^.asInstanceOf[js.Dynamic].applyDynamic("calcAPCA")(textColor.asInstanceOf[js.Any], bgColor.asInstanceOf[js.Any], places.asInstanceOf[js.Any], isInt.asInstanceOf[js.Any])).asInstanceOf[Double | String]
  inline def calcAPCA(
    textColor: js.Tuple4[/* r */ Double, /* g */ Double, /* b */ Double, /* a */ js.UndefOr[Double]],
    bgColor: String,
    places: Unit,
    isInt: Boolean
  ): Double | String = (^.asInstanceOf[js.Dynamic].applyDynamic("calcAPCA")(textColor.asInstanceOf[js.Any], bgColor.asInstanceOf[js.Any], places.asInstanceOf[js.Any], isInt.asInstanceOf[js.Any])).asInstanceOf[Double | String]
  inline def calcAPCA(
    textColor: js.Tuple4[/* r */ Double, /* g */ Double, /* b */ Double, /* a */ js.UndefOr[Double]],
    bgColor: js.Tuple3[/* r */ Double, /* g */ Double, /* b */ Double]
  ): Double | String = (^.asInstanceOf[js.Dynamic].applyDynamic("calcAPCA")(textColor.asInstanceOf[js.Any], bgColor.asInstanceOf[js.Any])).asInstanceOf[Double | String]
  inline def calcAPCA(
    textColor: js.Tuple4[/* r */ Double, /* g */ Double, /* b */ Double, /* a */ js.UndefOr[Double]],
    bgColor: js.Tuple3[/* r */ Double, /* g */ Double, /* b */ Double],
    places: Double
  ): Double | String = (^.asInstanceOf[js.Dynamic].applyDynamic("calcAPCA")(textColor.asInstanceOf[js.Any], bgColor.asInstanceOf[js.Any], places.asInstanceOf[js.Any])).asInstanceOf[Double | String]
  inline def calcAPCA(
    textColor: js.Tuple4[/* r */ Double, /* g */ Double, /* b */ Double, /* a */ js.UndefOr[Double]],
    bgColor: js.Tuple3[/* r */ Double, /* g */ Double, /* b */ Double],
    places: Double,
    isInt: Boolean
  ): Double | String = (^.asInstanceOf[js.Dynamic].applyDynamic("calcAPCA")(textColor.asInstanceOf[js.Any], bgColor.asInstanceOf[js.Any], places.asInstanceOf[js.Any], isInt.asInstanceOf[js.Any])).asInstanceOf[Double | String]
  inline def calcAPCA(
    textColor: js.Tuple4[/* r */ Double, /* g */ Double, /* b */ Double, /* a */ js.UndefOr[Double]],
    bgColor: js.Tuple3[/* r */ Double, /* g */ Double, /* b */ Double],
    places: Unit,
    isInt: Boolean
  ): Double | String = (^.asInstanceOf[js.Dynamic].applyDynamic("calcAPCA")(textColor.asInstanceOf[js.Any], bgColor.asInstanceOf[js.Any], places.asInstanceOf[js.Any], isInt.asInstanceOf[js.Any])).asInstanceOf[Double | String]
  inline def calcAPCA(
    textColor: js.Tuple4[/* r */ Double, /* g */ Double, /* b */ Double, /* a */ js.UndefOr[Double]],
    bgColor: Double
  ): Double | String = (^.asInstanceOf[js.Dynamic].applyDynamic("calcAPCA")(textColor.asInstanceOf[js.Any], bgColor.asInstanceOf[js.Any])).asInstanceOf[Double | String]
  inline def calcAPCA(
    textColor: js.Tuple4[/* r */ Double, /* g */ Double, /* b */ Double, /* a */ js.UndefOr[Double]],
    bgColor: Double,
    places: Double
  ): Double | String = (^.asInstanceOf[js.Dynamic].applyDynamic("calcAPCA")(textColor.asInstanceOf[js.Any], bgColor.asInstanceOf[js.Any], places.asInstanceOf[js.Any])).asInstanceOf[Double | String]
  inline def calcAPCA(
    textColor: js.Tuple4[/* r */ Double, /* g */ Double, /* b */ Double, /* a */ js.UndefOr[Double]],
    bgColor: Double,
    places: Double,
    isInt: Boolean
  ): Double | String = (^.asInstanceOf[js.Dynamic].applyDynamic("calcAPCA")(textColor.asInstanceOf[js.Any], bgColor.asInstanceOf[js.Any], places.asInstanceOf[js.Any], isInt.asInstanceOf[js.Any])).asInstanceOf[Double | String]
  inline def calcAPCA(
    textColor: js.Tuple4[/* r */ Double, /* g */ Double, /* b */ Double, /* a */ js.UndefOr[Double]],
    bgColor: Double,
    places: Unit,
    isInt: Boolean
  ): Double | String = (^.asInstanceOf[js.Dynamic].applyDynamic("calcAPCA")(textColor.asInstanceOf[js.Any], bgColor.asInstanceOf[js.Any], places.asInstanceOf[js.Any], isInt.asInstanceOf[js.Any])).asInstanceOf[Double | String]
  inline def calcAPCA(textColor: Double, bgColor: String): Double | String = (^.asInstanceOf[js.Dynamic].applyDynamic("calcAPCA")(textColor.asInstanceOf[js.Any], bgColor.asInstanceOf[js.Any])).asInstanceOf[Double | String]
  inline def calcAPCA(textColor: Double, bgColor: String, places: Double): Double | String = (^.asInstanceOf[js.Dynamic].applyDynamic("calcAPCA")(textColor.asInstanceOf[js.Any], bgColor.asInstanceOf[js.Any], places.asInstanceOf[js.Any])).asInstanceOf[Double | String]
  inline def calcAPCA(textColor: Double, bgColor: String, places: Double, isInt: Boolean): Double | String = (^.asInstanceOf[js.Dynamic].applyDynamic("calcAPCA")(textColor.asInstanceOf[js.Any], bgColor.asInstanceOf[js.Any], places.asInstanceOf[js.Any], isInt.asInstanceOf[js.Any])).asInstanceOf[Double | String]
  inline def calcAPCA(textColor: Double, bgColor: String, places: Unit, isInt: Boolean): Double | String = (^.asInstanceOf[js.Dynamic].applyDynamic("calcAPCA")(textColor.asInstanceOf[js.Any], bgColor.asInstanceOf[js.Any], places.asInstanceOf[js.Any], isInt.asInstanceOf[js.Any])).asInstanceOf[Double | String]
  inline def calcAPCA(textColor: Double, bgColor: js.Tuple3[/* r */ Double, /* g */ Double, /* b */ Double]): Double | String = (^.asInstanceOf[js.Dynamic].applyDynamic("calcAPCA")(textColor.asInstanceOf[js.Any], bgColor.asInstanceOf[js.Any])).asInstanceOf[Double | String]
  inline def calcAPCA(
    textColor: Double,
    bgColor: js.Tuple3[/* r */ Double, /* g */ Double, /* b */ Double],
    places: Double
  ): Double | String = (^.asInstanceOf[js.Dynamic].applyDynamic("calcAPCA")(textColor.asInstanceOf[js.Any], bgColor.asInstanceOf[js.Any], places.asInstanceOf[js.Any])).asInstanceOf[Double | String]
  inline def calcAPCA(
    textColor: Double,
    bgColor: js.Tuple3[/* r */ Double, /* g */ Double, /* b */ Double],
    places: Double,
    isInt: Boolean
  ): Double | String = (^.asInstanceOf[js.Dynamic].applyDynamic("calcAPCA")(textColor.asInstanceOf[js.Any], bgColor.asInstanceOf[js.Any], places.asInstanceOf[js.Any], isInt.asInstanceOf[js.Any])).asInstanceOf[Double | String]
  inline def calcAPCA(
    textColor: Double,
    bgColor: js.Tuple3[/* r */ Double, /* g */ Double, /* b */ Double],
    places: Unit,
    isInt: Boolean
  ): Double | String = (^.asInstanceOf[js.Dynamic].applyDynamic("calcAPCA")(textColor.asInstanceOf[js.Any], bgColor.asInstanceOf[js.Any], places.asInstanceOf[js.Any], isInt.asInstanceOf[js.Any])).asInstanceOf[Double | String]
  inline def calcAPCA(textColor: Double, bgColor: Double): Double | String = (^.asInstanceOf[js.Dynamic].applyDynamic("calcAPCA")(textColor.asInstanceOf[js.Any], bgColor.asInstanceOf[js.Any])).asInstanceOf[Double | String]
  inline def calcAPCA(textColor: Double, bgColor: Double, places: Double): Double | String = (^.asInstanceOf[js.Dynamic].applyDynamic("calcAPCA")(textColor.asInstanceOf[js.Any], bgColor.asInstanceOf[js.Any], places.asInstanceOf[js.Any])).asInstanceOf[Double | String]
  inline def calcAPCA(textColor: Double, bgColor: Double, places: Double, isInt: Boolean): Double | String = (^.asInstanceOf[js.Dynamic].applyDynamic("calcAPCA")(textColor.asInstanceOf[js.Any], bgColor.asInstanceOf[js.Any], places.asInstanceOf[js.Any], isInt.asInstanceOf[js.Any])).asInstanceOf[Double | String]
  inline def calcAPCA(textColor: Double, bgColor: Double, places: Unit, isInt: Boolean): Double | String = (^.asInstanceOf[js.Dynamic].applyDynamic("calcAPCA")(textColor.asInstanceOf[js.Any], bgColor.asInstanceOf[js.Any], places.asInstanceOf[js.Any], isInt.asInstanceOf[js.Any])).asInstanceOf[Double | String]
  
  inline def displayP3toY(rgb: js.Tuple3[/* r */ Double, /* g */ Double, /* b */ Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("displayP3toY")(rgb.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def sRGBtoY(rgb: js.Tuple3[/* r */ Double, /* g */ Double, /* b */ Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sRGBtoY")(rgb.asInstanceOf[js.Any]).asInstanceOf[Double]
}
