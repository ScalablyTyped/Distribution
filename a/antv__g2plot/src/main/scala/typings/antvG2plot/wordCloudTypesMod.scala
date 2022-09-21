package typings.antvG2plot

import typings.antvG2plot.anon.PartialTagxnumberynumber
import typings.antvG2plot.antvG2plotStrings.archimedean
import typings.antvG2plot.antvG2plotStrings.italic
import typings.antvG2plot.antvG2plotStrings.normal
import typings.antvG2plot.antvG2plotStrings.oblique
import typings.antvG2plot.antvG2plotStrings.rectangular
import typings.antvG2plot.typesCommonMod.Datum
import typings.antvG2plot.typesCommonMod.Options
import typings.std.HTMLImageElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wordCloudTypesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.antvG2plot.antvG2plotStrings.normal
    - typings.antvG2plot.antvG2plotStrings.bold
    - typings.antvG2plot.antvG2plotStrings.bolder
    - typings.antvG2plot.antvG2plotStrings.lighter
    - scala.Double
    - scala.Unit
  */
  type FontWeight = js.UndefOr[_FontWeight | Double]
  
  trait Tag
    extends StObject
       with Word {
    
    /**
      * @title 字体
      */
    var font: js.UndefOr[String] = js.undefined
    
    /**
      * @title 是否包含文本
      * @default false
      */
    var hasText: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @title 单词所占盒子的高度
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /**
      * @title 一个单词所占的盒子的内边距
      * @description 值越大单词之间的间隔越大
      */
    var padding: js.UndefOr[Double] = js.undefined
    
    /**
      * @title 旋转角度
      */
    var rotate: js.UndefOr[Double] = js.undefined
    
    /**
      * @title 字体大小
      */
    var size: js.UndefOr[Double] = js.undefined
    
    /**
      * @title 字体样式
      */
    var style: js.UndefOr[normal | italic | oblique] = js.undefined
    
    /**
      * @title 文本粗细
      */
    var weight: js.UndefOr[FontWeight] = js.undefined
    
    /**
      * @title 单词所占盒子的宽度
      */
    var width: js.UndefOr[Double] = js.undefined
    
    /**
      * @title x 轴坐标
      */
    var x: js.UndefOr[Double] = js.undefined
    
    /**
      * @title y 轴坐标
      */
    var y: js.UndefOr[Double] = js.undefined
  }
  object Tag {
    
    inline def apply(color: String | Double, datum: Datum, text: String, value: Double): Tag = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], datum = datum.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tag]
    }
    
    extension [Self <: Tag](x: Self) {
      
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
      
      inline def setWeight(value: FontWeight): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
      
      inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait Word extends StObject {
    
    /**
      * @title 用于指定颜色字段
      */
    var color: String | Double
    
    /**
      * @title 原始数据
      */
    var datum: Datum
    
    /**
      * @title 文本内容
      */
    var text: String
    
    /**
      * @title 该文本所占权重
      */
    var value: Double
  }
  object Word {
    
    inline def apply(color: String | Double, datum: Datum, text: String, value: Double): Word = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], datum = datum.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Word]
    }
    
    extension [Self <: Word](x: Self) {
      
      inline def setColor(value: String | Double): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setDatum(value: Datum): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait WordCloudOptions
    extends StObject
       with Options {
    
    /**
      * @title 根据该字段进行颜色映射
      */
    val colorField: js.UndefOr[String] = js.undefined
    
    /**
      * @title 遮罩图片实例
      * @description 可以是图片 URL 或者 base64
      */
    val imageMask: js.UndefOr[HTMLImageElement | String] = js.undefined
    
    /**
      * @title 自定义每个词语的坐标。
      * @description 返回值必须包含 x 和 y 属性，其余的可选。也可以在 `wordStyle` 中的选项中设置。
      */
    val placementStrategy: js.UndefOr[
        js.Function3[
          /* word */ Word, 
          /* index */ js.UndefOr[Double], 
          /* words */ js.UndefOr[js.Array[Word]], 
          PartialTagxnumberynumber
        ]
      ] = js.undefined
    
    /**
      * @title 自定义所使用的随机函数
      * @description 其值可以是一个 [0, 1) 区间中的值；也可以是一个返回该值的函数，当该值是一个固定的值时，每次渲染；相同数据的词云图时，其对应的每个单词的布局坐标一致。
      */
    val random: js.UndefOr[Double | js.Function0[Double]] = js.undefined
    
    /**
      * @title 词云图形状
      * @description 1，当设置为 `archimedean` 时，整个词云图接近于`椭圆`的形状。 2，当设置为 `rectangular` 时，整个词云图接近于`矩形`的形状。
      * @default "archimedean"
      */
    val spiral: js.UndefOr[archimedean | rectangular] = js.undefined
    
    /**
      * @title 最大执行时间
      */
    val timeInterval: js.UndefOr[Double] = js.undefined
    
    /**
      * @title 词条权重字段
      */
    val weightField: String
    
    /**
      * @title 词条内容字段
      */
    val wordField: String
    
    val wordStyle: js.UndefOr[WordStyle] = js.undefined
  }
  object WordCloudOptions {
    
    inline def apply(data: js.Array[Record[String, Any]], weightField: String, wordField: String): WordCloudOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], weightField = weightField.asInstanceOf[js.Any], wordField = wordField.asInstanceOf[js.Any])
      __obj.asInstanceOf[WordCloudOptions]
    }
    
    extension [Self <: WordCloudOptions](x: Self) {
      
      inline def setColorField(value: String): Self = StObject.set(x, "colorField", value.asInstanceOf[js.Any])
      
      inline def setColorFieldUndefined: Self = StObject.set(x, "colorField", js.undefined)
      
      inline def setImageMask(value: HTMLImageElement | String): Self = StObject.set(x, "imageMask", value.asInstanceOf[js.Any])
      
      inline def setImageMaskUndefined: Self = StObject.set(x, "imageMask", js.undefined)
      
      inline def setPlacementStrategy(
        value: (/* word */ Word, /* index */ js.UndefOr[Double], /* words */ js.UndefOr[js.Array[Word]]) => PartialTagxnumberynumber
      ): Self = StObject.set(x, "placementStrategy", js.Any.fromFunction3(value))
      
      inline def setPlacementStrategyUndefined: Self = StObject.set(x, "placementStrategy", js.undefined)
      
      inline def setRandom(value: Double | js.Function0[Double]): Self = StObject.set(x, "random", value.asInstanceOf[js.Any])
      
      inline def setRandomFunction0(value: () => Double): Self = StObject.set(x, "random", js.Any.fromFunction0(value))
      
      inline def setRandomUndefined: Self = StObject.set(x, "random", js.undefined)
      
      inline def setSpiral(value: archimedean | rectangular): Self = StObject.set(x, "spiral", value.asInstanceOf[js.Any])
      
      inline def setSpiralUndefined: Self = StObject.set(x, "spiral", js.undefined)
      
      inline def setTimeInterval(value: Double): Self = StObject.set(x, "timeInterval", value.asInstanceOf[js.Any])
      
      inline def setTimeIntervalUndefined: Self = StObject.set(x, "timeInterval", js.undefined)
      
      inline def setWeightField(value: String): Self = StObject.set(x, "weightField", value.asInstanceOf[js.Any])
      
      inline def setWordField(value: String): Self = StObject.set(x, "wordField", value.asInstanceOf[js.Any])
      
      inline def setWordStyle(value: WordStyle): Self = StObject.set(x, "wordStyle", value.asInstanceOf[js.Any])
      
      inline def setWordStyleUndefined: Self = StObject.set(x, "wordStyle", js.undefined)
    }
  }
  
  trait WordStyle extends StObject {
    
    /**
      * @title 词云的字体
      * @description 当为函数时，其参数是一个经过处理之后的数据元素的值
      */
    val fontFamily: js.UndefOr[
        String | (js.Function3[
          /* word */ Word, 
          /* index */ js.UndefOr[Double], 
          /* words */ js.UndefOr[js.Array[Word]], 
          String
        ])
      ] = js.undefined
    
    /**
      * @title 字体的大小范围
      * @description 当为函数时，其参数是一个经过处理之后的数据元素的值
      */
    val fontSize: js.UndefOr[
        (js.Tuple2[Double, Double]) | Double | (js.Function3[
          /* word */ Word, 
          /* index */ js.UndefOr[Double], 
          /* words */ js.UndefOr[js.Array[Word]], 
          Double
        ])
      ] = js.undefined
    
    /**
      * @title 设置字体的粗细
      * @description 当为函数时，其参数是一个经过处理之后的数据元素的值
      */
    val fontWeight: js.UndefOr[
        FontWeight | (js.Function3[
          /* word */ Word, 
          /* index */ js.UndefOr[Double], 
          /* words */ js.UndefOr[js.Array[Word]], 
          FontWeight
        ])
      ] = js.undefined
    
    /**
      * @title 每个单词所占的盒子的内边距
      * @description 当为函数时，其参数是一个经过处理之后的数据元素的值  越大单词之间的间隔越大
      * @default 1
      */
    val padding: js.UndefOr[
        Double | (js.Function3[
          /* word */ Word, 
          /* index */ js.UndefOr[Double], 
          /* words */ js.UndefOr[js.Array[Word]], 
          Double
        ])
      ] = js.undefined
    
    /**
      * @title 旋转的最小角度和最大角度
      * @description 如果值是 number 或者 function ，则 `rotationSteps` 选项将失效
      * @default "[0, 90]"
      */
    val rotation: js.UndefOr[
        (js.Tuple2[Double, Double]) | Double | (js.Function3[
          /* word */ Word, 
          /* index */ js.UndefOr[Double], 
          /* words */ js.UndefOr[js.Array[Word]], 
          Double
        ])
      ] = js.undefined
    
    /**
      * @title 旋转实际的步数
      * @description 越大可能旋转角度越小，* 例如：如果 `rotation` 的值是 [0, 90]，`rotationSteps` 的值是 3，则最终可能旋转的角度有三种，分别是 0 度、45度和 90 度。
      * @default 2
      */
    val rotationSteps: js.UndefOr[Double] = js.undefined
  }
  object WordStyle {
    
    inline def apply(): WordStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WordStyle]
    }
    
    extension [Self <: WordStyle](x: Self) {
      
      inline def setFontFamily(
        value: String | (js.Function3[
              /* word */ Word, 
              /* index */ js.UndefOr[Double], 
              /* words */ js.UndefOr[js.Array[Word]], 
              String
            ])
      ): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyFunction3(
        value: (/* word */ Word, /* index */ js.UndefOr[Double], /* words */ js.UndefOr[js.Array[Word]]) => String
      ): Self = StObject.set(x, "fontFamily", js.Any.fromFunction3(value))
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontSize(
        value: (js.Tuple2[Double, Double]) | Double | (js.Function3[
              /* word */ Word, 
              /* index */ js.UndefOr[Double], 
              /* words */ js.UndefOr[js.Array[Word]], 
              Double
            ])
      ): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeFunction3(
        value: (/* word */ Word, /* index */ js.UndefOr[Double], /* words */ js.UndefOr[js.Array[Word]]) => Double
      ): Self = StObject.set(x, "fontSize", js.Any.fromFunction3(value))
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setFontWeight(
        value: FontWeight | (js.Function3[
              /* word */ Word, 
              /* index */ js.UndefOr[Double], 
              /* words */ js.UndefOr[js.Array[Word]], 
              FontWeight
            ])
      ): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightFunction3(
        value: (/* word */ Word, /* index */ js.UndefOr[Double], /* words */ js.UndefOr[js.Array[Word]]) => FontWeight
      ): Self = StObject.set(x, "fontWeight", js.Any.fromFunction3(value))
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setPadding(
        value: Double | (js.Function3[
              /* word */ Word, 
              /* index */ js.UndefOr[Double], 
              /* words */ js.UndefOr[js.Array[Word]], 
              Double
            ])
      ): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingFunction3(
        value: (/* word */ Word, /* index */ js.UndefOr[Double], /* words */ js.UndefOr[js.Array[Word]]) => Double
      ): Self = StObject.set(x, "padding", js.Any.fromFunction3(value))
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setRotation(
        value: (js.Tuple2[Double, Double]) | Double | (js.Function3[
              /* word */ Word, 
              /* index */ js.UndefOr[Double], 
              /* words */ js.UndefOr[js.Array[Word]], 
              Double
            ])
      ): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setRotationFunction3(
        value: (/* word */ Word, /* index */ js.UndefOr[Double], /* words */ js.UndefOr[js.Array[Word]]) => Double
      ): Self = StObject.set(x, "rotation", js.Any.fromFunction3(value))
      
      inline def setRotationSteps(value: Double): Self = StObject.set(x, "rotationSteps", value.asInstanceOf[js.Any])
      
      inline def setRotationStepsUndefined: Self = StObject.set(x, "rotationSteps", js.undefined)
      
      inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    }
  }
  
  trait _FontWeight extends StObject
}
