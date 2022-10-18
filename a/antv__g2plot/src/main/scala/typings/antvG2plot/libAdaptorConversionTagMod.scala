package typings.antvG2plot

import typings.antvG2plot.anon.Formatter
import typings.antvG2plot.anon.HeadSize
import typings.antvG2plot.antvG2plotBooleans.`false`
import typings.antvG2plot.libCoreAdaptorMod.Params
import typings.antvG2plot.libTypesCommonMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAdaptorConversionTagMod {
  
  @JSImport("@antv/g2plot/lib/adaptor/conversion-tag", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def conversionTag[O /* <: OptionWithConversionTag & Options */](field: String): js.Function1[/* params */ Params[O], Params[O]] = ^.asInstanceOf[js.Dynamic].applyDynamic("conversionTag")(field.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* params */ Params[O], Params[O]]]
  inline def conversionTag[O /* <: OptionWithConversionTag & Options */](field: String, horizontal: Boolean): js.Function1[/* params */ Params[O], Params[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("conversionTag")(field.asInstanceOf[js.Any], horizontal.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* params */ Params[O], Params[O]]]
  inline def conversionTag[O /* <: OptionWithConversionTag & Options */](field: String, horizontal: Boolean, disabled: Boolean): js.Function1[/* params */ Params[O], Params[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("conversionTag")(field.asInstanceOf[js.Any], horizontal.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* params */ Params[O], Params[O]]]
  inline def conversionTag[O /* <: OptionWithConversionTag & Options */](field: String, horizontal: Unit, disabled: Boolean): js.Function1[/* params */ Params[O], Params[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("conversionTag")(field.asInstanceOf[js.Any], horizontal.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* params */ Params[O], Params[O]]]
  
  trait ConversionTagOptions extends StObject {
    
    /** 箭头形状配置 */
    var arrow: js.UndefOr[HeadSize | `false`] = js.undefined
    
    /** tag 距离轴线距离 */
    var offset: js.UndefOr[Double] = js.undefined
    
    /** tag 高度 */
    var size: js.UndefOr[Double] = js.undefined
    
    /** tag 对柱子间距 */
    var spacing: js.UndefOr[Double] = js.undefined
    
    /** 文本配置 */
    var text: js.UndefOr[Formatter | `false`] = js.undefined
  }
  object ConversionTagOptions {
    
    inline def apply(): ConversionTagOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConversionTagOptions]
    }
    
    extension [Self <: ConversionTagOptions](x: Self) {
      
      inline def setArrow(value: HeadSize | `false`): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
      
      inline def setArrowUndefined: Self = StObject.set(x, "arrow", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      
      inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
      
      inline def setText(value: Formatter | `false`): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  trait OptionWithConversionTag extends StObject {
    
    var conversionTag: js.UndefOr[ConversionTagOptions | `false`] = js.undefined
  }
  object OptionWithConversionTag {
    
    inline def apply(): OptionWithConversionTag = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionWithConversionTag]
    }
    
    extension [Self <: OptionWithConversionTag](x: Self) {
      
      inline def setConversionTag(value: ConversionTagOptions | `false`): Self = StObject.set(x, "conversionTag", value.asInstanceOf[js.Any])
      
      inline def setConversionTagUndefined: Self = StObject.set(x, "conversionTag", js.undefined)
    }
  }
}
