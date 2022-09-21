package typings.antvG2

import typings.antvG2.antvG2Booleans.`false`
import typings.antvG2.labelInterfaceMod.LabelItem
import typings.antvG2.libInterfaceMod.AnimateOption
import typings.antvG2.libInterfaceMod.GeometryLabelLayoutCfg
import typings.antvGBase.interfacesMod.IGroup
import typings.antvGBase.interfacesMod.IShape
import typings.antvGBase.typesMod.BBox
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object labelsMod {
  
  @JSImport("@antv/g2/lib/component/labels", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Labels {
    def this(cfg: LabelsGroupCfg) = this()
  }
  
  @js.native
  trait Labels extends StObject {
    
    /* private */ var adjustLabel: Any = js.native
    
    /** 动画配置 */
    var animate: AnimateOption | `false` = js.native
    
    /** 清除当前 labels */
    def clear(): Unit = js.native
    
    /** 图形容器 */
    var container: IGroup = js.native
    
    /* private */ var createOffscreenGroup: Any = js.native
    
    /** 销毁 */
    def destroy(): Unit = js.native
    
    /* private */ var doLayout: Any = js.native
    
    /** 用于指定 labels 布局的类型 */
    var layout: GeometryLabelLayoutCfg | js.Array[GeometryLabelLayoutCfg] = js.native
    
    /** label 绘制的区域 */
    var region: BBox = js.native
    
    /**
      * 渲染文本
      */
    def render(items: js.Array[LabelItem], shapes: Record[String, IShape | IGroup]): js.Promise[Unit] = js.native
    def render(items: js.Array[LabelItem], shapes: Record[String, IShape | IGroup], isUpdate: Boolean): js.Promise[Unit] = js.native
    
    /* private */ var renderLabel: Any = js.native
    
    /**
      * 绘制标签背景
      * @param labelItems
      */
    /* private */ var renderLabelBackground: Any = js.native
    
    /* private */ var renderLabelLine: Any = js.native
    
    /** 存储当前 shape 的映射表，键值为 shape id */
    var shapesMap: Record[String, IGroup] = js.native
  }
  
  trait LabelsGroupCfg extends StObject {
    
    /** label 容器 */
    var container: IGroup
    
    /** label 布局配置 */
    var layout: js.UndefOr[GeometryLabelLayoutCfg | js.Array[GeometryLabelLayoutCfg]] = js.undefined
  }
  object LabelsGroupCfg {
    
    inline def apply(container: IGroup): LabelsGroupCfg = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
      __obj.asInstanceOf[LabelsGroupCfg]
    }
    
    extension [Self <: LabelsGroupCfg](x: Self) {
      
      inline def setContainer(value: IGroup): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setLayout(value: GeometryLabelLayoutCfg | js.Array[GeometryLabelLayoutCfg]): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      inline def setLayoutVarargs(value: GeometryLabelLayoutCfg*): Self = StObject.set(x, "layout", js.Array(value*))
    }
  }
}
