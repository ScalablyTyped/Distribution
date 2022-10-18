package typings.antvG2

import typings.antvG2.antvG2Ints.`0`
import typings.csstype.mod.Properties
import typings.csstype.mod.Property.FontFamily
import typings.csstype.mod.Property.FontStyle
import typings.csstype.mod.Property.FontVariant
import typings.csstype.mod.Property.FontWeight
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilTextMod {
  
  @JSImport("@antv/g2/lib/util/text", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEllipsisText(text: Any, maxWidth: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getEllipsisText")(text.asInstanceOf[js.Any], maxWidth.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getEllipsisText(text: Any, maxWidth: Double, font: Font): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getEllipsisText")(text.asInstanceOf[js.Any], maxWidth.asInstanceOf[js.Any], font.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  object measureTextWidth {
    
    inline def apply(args: Any*): Any = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    @JSImport("@antv/g2/lib/util/text", "measureTextWidth")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@antv/g2/lib/util/text", "measureTextWidth.cache")
    @js.native
    def cache: Map[Any, Any] = js.native
    inline def cache_=(x: Map[Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cache")(x.asInstanceOf[js.Any])
  }
  
  /* Inlined std.Pick<@antv/g2.@antv/g2/lib/util/text.FontFace, 'fontFamily' | 'fontWeight' | 'fontStyle' | 'fontVariant'> & {  fontSize :number | undefined} */
  trait Font extends StObject {
    
    var fontFamily: js.UndefOr[FontFamily] = js.undefined
    
    var fontSize: js.UndefOr[Double] = js.undefined
    
    var fontStyle: js.UndefOr[FontStyle] = js.undefined
    
    var fontVariant: js.UndefOr[FontVariant] = js.undefined
    
    var fontWeight: js.UndefOr[FontWeight] = js.undefined
  }
  object Font {
    
    inline def apply(): Font = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Font]
    }
    
    extension [Self <: Font](x: Self) {
      
      inline def setFontFamily(value: FontFamily): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setFontStyle(value: FontStyle): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setFontVariant(value: FontVariant): Self = StObject.set(x, "fontVariant", value.asInstanceOf[js.Any])
      
      inline def setFontVariantUndefined: Self = StObject.set(x, "fontVariant", js.undefined)
      
      inline def setFontWeight(value: FontWeight): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    }
  }
  
  type FontFace = Properties[String | `0`, String]
}
