package typings.antvG2plot

import typings.antvG2plot.anon.OffsetX
import typings.antvG2plot.antvG2plotBooleans.`false`
import typings.antvG2plot.attrMod.ShapeStyle
import typings.antvG2plot.attrMod.StyleAttr
import typings.antvG2plot.typesCommonMod.AnnotationPosition
import typings.antvG2plot.typesCommonMod.Datum
import typings.antvG2plot.typesCommonMod.Options
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object funnelTypesMod {
  
  trait ConversionPosition extends StObject {
    
    var end: AnnotationPosition
    
    var start: AnnotationPosition
  }
  object ConversionPosition {
    
    inline def apply(end: AnnotationPosition, start: AnnotationPosition): ConversionPosition = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConversionPosition]
    }
    
    extension [Self <: ConversionPosition](x: Self) {
      
      inline def setEnd(value: AnnotationPosition): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndFunction2(
        value: (/* xScales */ (js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Scale */ Any
            ]) | (Record[
              String, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Scale */ Any
            ]), /* yScales */ (js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Scale */ Any
            ]) | (Record[
              String, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Scale */ Any
            ])) => js.Tuple2[Double | String, Double | String]
      ): Self = StObject.set(x, "end", js.Any.fromFunction2(value))
      
      inline def setStart(value: AnnotationPosition): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartFunction2(
        value: (/* xScales */ (js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Scale */ Any
            ]) | (Record[
              String, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Scale */ Any
            ]), /* yScales */ (js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Scale */ Any
            ]) | (Record[
              String, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Scale */ Any
            ])) => js.Tuple2[Double | String, Double | String]
      ): Self = StObject.set(x, "start", js.Any.fromFunction2(value))
    }
  }
  
  trait FunnelOptions
    extends StObject
       with Options {
    
    /**
      * @title 对比字段
      * @description 漏斗图将根据此字段转置为对比漏斗图
      */
    val compareField: js.UndefOr[String] = js.undefined
    
    /**
      * @title 转化率信息
      */
    val conversionTag: js.UndefOr[`false` | OffsetX] = js.undefined
    
    /**
      * @title 是否是动态高度
      * @default false
      */
    val dynamicHeight: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @title 漏斗图样式
      */
    val funnelStyle: js.UndefOr[StyleAttr] = js.undefined
    
    /**
      * @title 是否转置
      * @default false
      */
    val isTransposed: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @title 最大宽度
      * @description 范围0-1
      */
    val maxSize: js.UndefOr[Double] = js.undefined
    
    /**
      * @title 最小宽度
      * @description 范围0-1
      */
    val minSize: js.UndefOr[Double] = js.undefined
    
    /**
      * @title 分组字段
      * @description 漏斗图将根据此字段转置为分面漏斗图
      */
    val seriesField: js.UndefOr[String] = js.undefined
    
    /**
      * @title shape 形状
      * @description pyramid 金字塔, 只在基础漏斗图中适用. 在对比漏斗图以及设置 dynamicHeight: 'true' 时不适用
      */
    val shape: js.UndefOr[String] = js.undefined
    
    /**
      * @title 漏斗分面标题
      * @description 是否关闭漏斗的标题展示，适用于存在多组漏斗的情形，如：分组漏斗图、对比漏斗图。
      */
    val showFacetTitle: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @title x轴字段
      */
    val xField: js.UndefOr[String] = js.undefined
    
    /**
      * @title y轴字段
      */
    val yField: js.UndefOr[String] = js.undefined
  }
  object FunnelOptions {
    
    inline def apply(data: js.Array[Record[String, Any]]): FunnelOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[FunnelOptions]
    }
    
    extension [Self <: FunnelOptions](x: Self) {
      
      inline def setCompareField(value: String): Self = StObject.set(x, "compareField", value.asInstanceOf[js.Any])
      
      inline def setCompareFieldUndefined: Self = StObject.set(x, "compareField", js.undefined)
      
      inline def setConversionTag(value: `false` | OffsetX): Self = StObject.set(x, "conversionTag", value.asInstanceOf[js.Any])
      
      inline def setConversionTagUndefined: Self = StObject.set(x, "conversionTag", js.undefined)
      
      inline def setDynamicHeight(value: Boolean): Self = StObject.set(x, "dynamicHeight", value.asInstanceOf[js.Any])
      
      inline def setDynamicHeightUndefined: Self = StObject.set(x, "dynamicHeight", js.undefined)
      
      inline def setFunnelStyle(value: StyleAttr): Self = StObject.set(x, "funnelStyle", value.asInstanceOf[js.Any])
      
      inline def setFunnelStyleFunction1(value: /* datum */ Datum => ShapeStyle): Self = StObject.set(x, "funnelStyle", js.Any.fromFunction1(value))
      
      inline def setFunnelStyleUndefined: Self = StObject.set(x, "funnelStyle", js.undefined)
      
      inline def setIsTransposed(value: Boolean): Self = StObject.set(x, "isTransposed", value.asInstanceOf[js.Any])
      
      inline def setIsTransposedUndefined: Self = StObject.set(x, "isTransposed", js.undefined)
      
      inline def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
      
      inline def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
      
      inline def setMinSize(value: Double): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
      
      inline def setMinSizeUndefined: Self = StObject.set(x, "minSize", js.undefined)
      
      inline def setSeriesField(value: String): Self = StObject.set(x, "seriesField", value.asInstanceOf[js.Any])
      
      inline def setSeriesFieldUndefined: Self = StObject.set(x, "seriesField", js.undefined)
      
      inline def setShape(value: String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      inline def setShowFacetTitle(value: Boolean): Self = StObject.set(x, "showFacetTitle", value.asInstanceOf[js.Any])
      
      inline def setShowFacetTitleUndefined: Self = StObject.set(x, "showFacetTitle", js.undefined)
      
      inline def setXField(value: String): Self = StObject.set(x, "xField", value.asInstanceOf[js.Any])
      
      inline def setXFieldUndefined: Self = StObject.set(x, "xField", js.undefined)
      
      inline def setYField(value: String): Self = StObject.set(x, "yField", value.asInstanceOf[js.Any])
      
      inline def setYFieldUndefined: Self = StObject.set(x, "yField", js.undefined)
    }
  }
}
