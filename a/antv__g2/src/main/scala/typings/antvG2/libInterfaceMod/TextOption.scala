package typings.antvG2.libInterfaceMod

import typings.antvComponent.libTypesMod.EnhancedTextBackgroundCfg
import typings.antvG2.antvG2Strings.head
import typings.antvG2.antvG2Strings.middle
import typings.antvG2.antvG2Strings.tail
import typings.antvGBase.libTypesMod.ShapeAttrs
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent @antv/g2.@antv/g2/lib/interface.PointPositionBaseOption */
/* Inlined parent std.Omit<@antv/g2.@antv/g2/lib/dependents.EnhancedTextCfg, 'content'> */
trait TextOption extends StObject {
  
  /**
    * @title 是否进行动画
    */
  val animate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @title 动画参数配置
    * @description 当且仅当 `animate` 属性为 true，即动画开启时生效。
    */
  val animateOption: js.UndefOr[ComponentAnimateOption] = js.undefined
  
  var autoEllipsis: js.UndefOr[Boolean] = js.undefined
  
  var background: js.UndefOr[EnhancedTextBackgroundCfg] = js.undefined
  
  var content: js.UndefOr[
    String | Double | (js.Function1[/* filteredData */ js.Array[js.Object], String | Double])
  ] = js.undefined
  
  var ellipsisPosition: js.UndefOr[head | middle | tail] = js.undefined
  
  var isVertical: js.UndefOr[Boolean] = js.undefined
  
  var maxLength: js.UndefOr[Double] = js.undefined
  
  /**
    * @title x 方向的偏移量
    */
  val offsetX: js.UndefOr[Double] = js.undefined
  
  /**
    * @title y 方向的偏移量
    */
  val offsetY: js.UndefOr[Double] = js.undefined
  
  /**
    * @title Point 定位位置
    */
  val position: AnnotationPosition
  
  var rotate: js.UndefOr[Double] = js.undefined
  
  var style: js.UndefOr[ShapeAttrs] = js.undefined
  
  /**
    * @title 是否顶层
    * @description 指定 annotation 是否绘制在 canvas 最上层，默认为 false, 即绘制在最下层
    */
  val top: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @title 类型
    */
  val `type`: js.UndefOr[String] = js.undefined
}
object TextOption {
  
  inline def apply(position: AnnotationPosition): TextOption = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextOption]
  }
  
  extension [Self <: TextOption](x: Self) {
    
    inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateOption(value: ComponentAnimateOption): Self = StObject.set(x, "animateOption", value.asInstanceOf[js.Any])
    
    inline def setAnimateOptionUndefined: Self = StObject.set(x, "animateOption", js.undefined)
    
    inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    inline def setAutoEllipsis(value: Boolean): Self = StObject.set(x, "autoEllipsis", value.asInstanceOf[js.Any])
    
    inline def setAutoEllipsisUndefined: Self = StObject.set(x, "autoEllipsis", js.undefined)
    
    inline def setBackground(value: EnhancedTextBackgroundCfg): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setContent(value: String | Double | (js.Function1[/* filteredData */ js.Array[js.Object], String | Double])): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentFunction1(value: /* filteredData */ js.Array[js.Object] => String | Double): Self = StObject.set(x, "content", js.Any.fromFunction1(value))
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setEllipsisPosition(value: head | middle | tail): Self = StObject.set(x, "ellipsisPosition", value.asInstanceOf[js.Any])
    
    inline def setEllipsisPositionUndefined: Self = StObject.set(x, "ellipsisPosition", js.undefined)
    
    inline def setIsVertical(value: Boolean): Self = StObject.set(x, "isVertical", value.asInstanceOf[js.Any])
    
    inline def setIsVerticalUndefined: Self = StObject.set(x, "isVertical", js.undefined)
    
    inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
    
    inline def setPosition(value: AnnotationPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionFunction2(
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
    ): Self = StObject.set(x, "position", js.Any.fromFunction2(value))
    
    inline def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
    
    inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
    
    inline def setStyle(value: ShapeAttrs): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTop(value: Boolean): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
