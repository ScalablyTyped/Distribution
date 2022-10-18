package typings.antvG2plot

import typings.antvG2plot.anon.NameValue
import typings.antvG2plot.libTypesCommonMod.Datum
import typings.antvG2plot.libUtilsPatternMod.PatternOption
import typings.antvGBase.libTypesMod.ShapeAttrs
import typings.std.CanvasPattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesAttrMod {
  
  type ColorAttr = String | js.Array[String] | (js.Function2[/* datum */ Datum, /* defaultColor */ js.UndefOr[String], String])
  
  type PatternAttr = CanvasPattern | PatternOption | (js.Function2[/* datum */ Datum, /* color */ String, PatternOption | CanvasPattern])
  
  type ShapeAttr = String | js.Array[String] | (js.Function1[/* datum */ Datum, String])
  
  type ShapeStyle = ShapeAttrs
  
  type SizeAttr = Double | (js.Tuple2[Double, Double]) | (js.Function1[/* datum */ Datum, Double])
  
  type StyleAttr = ShapeStyle | (js.Function1[/* datum */ Datum, ShapeStyle])
  
  type TooltipAttr = js.Function1[/* datum */ Datum, NameValue]
}
