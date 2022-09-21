package typings.antvG2plot

import typings.antvG2plot.anon.NameString
import typings.antvG2plot.typesCommonMod.Datum
import typings.antvG2plot.utilsPatternMod.PatternOption
import typings.antvGBase.typesMod.ShapeAttrs
import typings.std.CanvasPattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object attrMod {
  
  type ColorAttr = String | js.Array[String] | (js.Function2[/* datum */ Datum, /* defaultColor */ js.UndefOr[String], String])
  
  type PatternAttr = CanvasPattern | PatternOption | (js.Function2[/* datum */ Datum, /* color */ String, PatternOption | CanvasPattern])
  
  type ShapeAttr = String | js.Array[String] | (js.Function1[/* datum */ Datum, String])
  
  type ShapeStyle = ShapeAttrs
  
  type SizeAttr = Double | (js.Tuple2[Double, Double]) | (js.Function1[/* datum */ Datum, Double])
  
  type StyleAttr = ShapeStyle | (js.Function1[/* datum */ Datum, ShapeStyle])
  
  type TooltipAttr = js.Function1[/* datum */ Datum, NameString]
}
