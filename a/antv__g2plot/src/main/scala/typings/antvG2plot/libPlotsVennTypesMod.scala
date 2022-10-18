package typings.antvG2plot

import typings.antvG2.libInterfaceMod.Datum
import typings.antvG2plot.anon.IDFIELD
import typings.antvG2plot.libTypesAttrMod.ShapeStyle
import typings.antvG2plot.libTypesAttrMod.StyleAttr
import typings.antvG2plot.libTypesCommonMod.Options
import typings.antvG2plot.libTypesLabelMod.Label
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsVennTypesMod {
  
  /* Inlined {  offsetY :number,   offsetX :number} & std.Pick<@antv/g2plot.@antv/g2plot/lib/plots/venn/types.VennOptions, 'label'> */
  trait CustomInfo extends StObject {
    
    var label: js.UndefOr[Label] = js.undefined
    
    var offsetX: Double
    
    var offsetY: Double
  }
  object CustomInfo {
    
    inline def apply(offsetX: Double, offsetY: Double): CustomInfo = {
      val __obj = js.Dynamic.literal(offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomInfo]
    }
    
    extension [Self <: CustomInfo](x: Self) {
      
      inline def setLabel(value: Label): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
      
      inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    }
  }
  
  type VennData = js.Array[Datum & IDFIELD]
  
  trait VennOptions
    extends StObject
       with Options {
    
    /**
      * @title 并集合的颜色混合方式
      * @description  可选项: 参考 https://gka.github.io/chroma.js/#chroma-blend
      * @default "multiply"
      */
    val blendMode: js.UndefOr[String] = js.undefined
    
    /**
      * @title 颜色
      */
    @JSName("color")
    val color_VennOptions: js.UndefOr[
        String | js.Array[String] | (js.Function2[
          /* datum */ typings.antvG2plot.libTypesCommonMod.Datum, 
          /* defaultColor */ js.UndefOr[String], 
          String
        ])
      ] = js.undefined
    
    /**
      * @title 韦恩图数据
      */
    @JSName("data")
    val data_VennOptions: js.Array[Datum]
    
    /**
      * @title point 样式
      */
    val pointStyle: js.UndefOr[StyleAttr] = js.undefined
    
    /**
      * @title 集合字段
      */
    val setsField: String
    
    /**
      * @title 大小字段
      */
    val sizeField: String
  }
  object VennOptions {
    
    inline def apply(data: js.Array[Datum], setsField: String, sizeField: String): VennOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], setsField = setsField.asInstanceOf[js.Any], sizeField = sizeField.asInstanceOf[js.Any])
      __obj.asInstanceOf[VennOptions]
    }
    
    extension [Self <: VennOptions](x: Self) {
      
      inline def setBlendMode(value: String): Self = StObject.set(x, "blendMode", value.asInstanceOf[js.Any])
      
      inline def setBlendModeUndefined: Self = StObject.set(x, "blendMode", js.undefined)
      
      inline def setColor(
        value: String | js.Array[String] | (js.Function2[
              /* datum */ typings.antvG2plot.libTypesCommonMod.Datum, 
              /* defaultColor */ js.UndefOr[String], 
              String
            ])
      ): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorFunction2(
        value: (/* datum */ typings.antvG2plot.libTypesCommonMod.Datum, /* defaultColor */ js.UndefOr[String]) => String
      ): Self = StObject.set(x, "color", js.Any.fromFunction2(value))
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setColorVarargs(value: String*): Self = StObject.set(x, "color", js.Array(value*))
      
      inline def setData(value: js.Array[Datum]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: Datum*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setPointStyle(value: StyleAttr): Self = StObject.set(x, "pointStyle", value.asInstanceOf[js.Any])
      
      inline def setPointStyleFunction1(value: /* datum */ typings.antvG2plot.libTypesCommonMod.Datum => ShapeStyle): Self = StObject.set(x, "pointStyle", js.Any.fromFunction1(value))
      
      inline def setPointStyleUndefined: Self = StObject.set(x, "pointStyle", js.undefined)
      
      inline def setSetsField(value: String): Self = StObject.set(x, "setsField", value.asInstanceOf[js.Any])
      
      inline def setSizeField(value: String): Self = StObject.set(x, "sizeField", value.asInstanceOf[js.Any])
    }
  }
}
