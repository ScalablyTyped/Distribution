package typings.antvG2plot.anon

import typings.antvG2plot.antvG2plotStrings.italic
import typings.antvG2plot.antvG2plotStrings.normal
import typings.antvG2plot.antvG2plotStrings.oblique
import typings.antvG2plot.typesCommonMod.Datum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@antv/g2plot.@antv/g2plot/lib/plots/word-cloud/types.Tag> & {  x :number,   y :number} */
trait PartialTagxnumberynumber extends StObject {
  
  var color: js.UndefOr[String | Double] = js.undefined
  
  var datum: js.UndefOr[Datum] = js.undefined
  
  var font: js.UndefOr[String] = js.undefined
  
  var hasText: js.UndefOr[Boolean] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var padding: js.UndefOr[Double] = js.undefined
  
  var rotate: js.UndefOr[Double] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  var style: js.UndefOr[normal | italic | oblique] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[Double] = js.undefined
  
  var weight: js.UndefOr[typings.antvG2plot.wordCloudTypesMod.FontWeight] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
  
  var x: js.UndefOr[Double] & Double
  
  var y: js.UndefOr[Double] & Double
}
object PartialTagxnumberynumber {
  
  inline def apply(x: js.UndefOr[Double] & Double, y: js.UndefOr[Double] & Double): PartialTagxnumberynumber = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialTagxnumberynumber]
  }
  
  extension [Self <: PartialTagxnumberynumber](x: Self) {
    
    inline def setColor(value: String | Double): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDatum(value: Datum): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
    
    inline def setDatumUndefined: Self = StObject.set(x, "datum", js.undefined)
    
    inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setHasText(value: Boolean): Self = StObject.set(x, "hasText", value.asInstanceOf[js.Any])
    
    inline def setHasTextUndefined: Self = StObject.set(x, "hasText", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
    
    inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStyle(value: normal | italic | oblique): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setWeight(value: typings.antvG2plot.wordCloudTypesMod.FontWeight): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setX(value: js.UndefOr[Double] & Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: js.UndefOr[Double] & Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
