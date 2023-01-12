package typings.antvG2

import typings.antvG2.libInterfaceMod.AnimateOption
import typings.antvG2.libInterfaceMod.Datum
import typings.antvG2.libInterfaceMod.ShapeFactory
import typings.antvG2.libInterfaceMod.ShapeInfo
import typings.antvG2.libInterfaceMod.ShapePoint
import typings.antvGBase.libInterfacesMod.IGroup
import typings.antvGBase.libInterfacesMod.IShape
import typings.antvGBase.libTypesMod.BBox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGeometryElementMod {
  
  @JSImport("@antv/g2/lib/geometry/element", JSImport.Default)
  @js.native
  open class default protected () extends Element {
    def this(cfg: ElementCfg) = this()
  }
  
  @js.native
  trait Element
    extends typings.antvG2.libBaseMod.default {
    
    /** shape 的动画配置 */
    var animate: AnimateOption | Boolean = js.native
    
    /**
      * 清空状量态，恢复至初始状态。
      */
    def clearStates(): Unit = js.native
    
    /** shape 容器 */
    var container: IGroup = js.native
    
    /** 原始数据 */
    /* private */ var data: Any = js.native
    
    /**
      * 绘制图形。
      * @param model 绘制数据。
      * @param isUpdate 可选，是否是更新发生后的绘制。
      */
    def draw(model: ShapeInfo): Unit = js.native
    def draw(model: ShapeInfo, isUpdate: Boolean): Unit = js.native
    
    /* private */ var drawShape: Any = js.native
    
    /** element 索引 */
    var elementIndex: Double = js.native
    
    /** element 对应的 Geometry 实例 */
    var geometry: typings.antvG2.libGeometryBaseMod.default[ShapePoint] = js.native
    
    /* private */ var getAnimateCfg: Any = js.native
    
    /**
      * 返回 Element 元素整体的 bbox，包含文本及文本连线（有的话）。
      * @returns 整体包围盒。
      */
    def getBBox(): BBox = js.native
    
    /**
      * 获取 Element 对应的原始数据。
      * @returns 原始数据。
      */
    def getData(): Datum = js.native
    
    /**
      * 获取 Element 对应的图形绘制数据。
      * @returns 图形绘制数据。
      */
    def getModel(): ShapeInfo = js.native
    
    /* private */ var getOffscreenGroup: Any = js.native
    
    /* private */ var getShapeType: Any = js.native
    
    /* private */ var getStateStyle: Any = js.native
    
    /**
      * 获取当前 Element 上所有的状态。
      * @returns 当前 Element 上所有的状态数组。
      */
    def getStates(): js.Array[String] = js.native
    
    /* private */ var getStatesStyle: Any = js.native
    
    /**
      * 查询当前 Element 上是否已设置 `stateName` 对应的状态。
      * @param stateName 状态名称。
      * @returns true 表示存在，false 表示不存在。
      */
    def hasState(stateName: String): Boolean = js.native
    
    /** 保存 shape 对应的 label */
    var labelShape: js.Array[IGroup] = js.native
    
    /** shape 绘制需要的数据 */
    /* private */ var model: Any = js.native
    
    /* private */ var offscreenGroup: Any = js.native
    
    /* private */ var setShapeInfo: Any = js.native
    
    /**
      * 设置 Element 的状态。
      *
      * 目前 Element 开放三种状态：
      * 1. active
      * 2. selected
      * 3. inactive
      *
      * 这三种状态相互独立，可以进行叠加。
      *
      * 这三种状态的样式可在 [[Theme]] 主题中或者通过 `geometry.state()` 接口进行配置。
      *
      * ```ts
      * // 激活 active 状态
      * setState('active', true);
      * ```
      *
      * @param stateName 状态名
      * @param stateStatus 是否开启状态
      */
    def setState(stateName: String, stateStatus: Boolean): Unit = js.native
    
    /** 最后创建的图形对象 */
    var shape: IShape | IGroup = js.native
    
    /** 用于创建各种 shape 的工厂对象 */
    var shapeFactory: ShapeFactory = js.native
    
    /** 绘制的 shape 类型 */
    /* private */ var shapeType: Any = js.native
    
    /* private */ var states: Any = js.native
    
    /* private */ var statesStyle: Any = js.native
    
    /* private */ var syncShapeStyle: Any = js.native
    
    /**
      * 更新图形。
      * @param model 更新的绘制数据。
      */
    def update(model: ShapeInfo): Unit = js.native
  }
  
  /** Element 构造函数传入参数类型 */
  trait ElementCfg extends StObject {
    
    /** shape 容器 */
    var container: IGroup
    
    /** element 的索引 */
    var elementIndex: js.UndefOr[Double] = js.undefined
    
    /** 虚拟 group，用户可以不传入 */
    var offscreenGroup: js.UndefOr[IGroup] = js.undefined
    
    /** 用于创建各种 shape 的工厂对象 */
    var shapeFactory: ShapeFactory
    
    /** 是否可见 */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object ElementCfg {
    
    inline def apply(container: IGroup, shapeFactory: ShapeFactory): ElementCfg = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], shapeFactory = shapeFactory.asInstanceOf[js.Any])
      __obj.asInstanceOf[ElementCfg]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ElementCfg] (val x: Self) extends AnyVal {
      
      inline def setContainer(value: IGroup): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setElementIndex(value: Double): Self = StObject.set(x, "elementIndex", value.asInstanceOf[js.Any])
      
      inline def setElementIndexUndefined: Self = StObject.set(x, "elementIndex", js.undefined)
      
      inline def setOffscreenGroup(value: IGroup): Self = StObject.set(x, "offscreenGroup", value.asInstanceOf[js.Any])
      
      inline def setOffscreenGroupUndefined: Self = StObject.set(x, "offscreenGroup", js.undefined)
      
      inline def setShapeFactory(value: ShapeFactory): Self = StObject.set(x, "shapeFactory", value.asInstanceOf[js.Any])
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
}
