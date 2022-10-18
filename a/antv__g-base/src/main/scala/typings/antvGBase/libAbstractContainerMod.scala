package typings.antvGBase

import typings.antvGBase.libInterfacesMod.IElement
import typings.antvGBase.libInterfacesMod.IGroup
import typings.antvGBase.libInterfacesMod.IShape
import typings.antvGBase.libTypesMod.ElementFilterFn
import typings.antvGBase.libTypesMod.GroupCfg
import typings.antvGBase.libTypesMod.ShapeCfg
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAbstractContainerMod {
  
  /* note: abstract class */ @JSImport("@antv/g-base/lib/abstract/container", JSImport.Default)
  @js.native
  open class default () extends Container
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.antvGBase.libInterfacesMod.IObservable because Already inherited
  - typings.antvGBase.libInterfacesMod.IBase because Already inherited
  - typings.antvGBase.libInterfacesMod.IElement because Already inherited
  - typings.antvGBase.libInterfacesMod.IContainer because var conflicts: cfg, destroyed. Inlined addShape, addShape, isCanvas, addGroup, addGroup, addGroup, getShape, add, getChildren, sort, clear, getFirst, getLast, getChildByIndex, getCount, contain, removeChild, removeChild, findAll, find, findById, findByClassName, findAllByName */ @js.native
  trait Container
    extends typings.antvGBase.libAbstractElementMod.default {
    
    def _applyChildrenMarix(totalMatrix: Any): Unit = js.native
    
    def _applyElementMatrix(element: Any): Unit = js.native
    
    def _findShape(children: js.Array[IElement], x: Double, y: Double, ev: Event): Any = js.native
    
    /**
      * 添加图形元素，已经在外面构造好的类
      * @param {IElement} element 图形元素（图形或者分组）
      */
    def add(element: IElement): Any = js.native
    
    /**
      * 添加图形分组，增加一个默认的 Group
      * @returns 添加的图形分组
      */
    def addGroup(): IGroup = js.native
    def addGroup(args: Any*): IGroup = js.native
    /**
      * 添加图形分组，并设置配置项
      * @param {GroupCfg} cfg 图形分组的配置项
      * @returns 添加的图形分组
      */
    def addGroup(cfg: GroupCfg): IGroup = js.native
    /**
      * 添加图形分组，指定类型
      * @param {IGroup} classConstructor 图形分组的构造函数
      * @param {GroupCfg} cfg 图形分组配置项
      * @returns 添加的图形分组
      */
    def addGroup(classConstructor: IGroup, cfg: GroupCfg): IGroup = js.native
    
    def addShape(args: Any*): IShape = js.native
    /**
      * 添加图形
      * @param {ShapeCfg} cfg  图形配置项
      * @returns 添加的图形对象
      */
    def addShape(cfg: ShapeCfg): IShape = js.native
    /**
      * 添加图形
      * @param {string} type 图形类型
      * @param {ShapeCfg} cfg  图形配置项
      * @returns 添加的图形对象
      */
    def addShape(`type`: String, cfg: ShapeCfg): IShape = js.native
    
    @JSName("add")
    def add_Unit(element: IElement): Unit = js.native
    
    /**
      * 清理所有的子元素
      */
    def clear(): Any = js.native
    @JSName("clear")
    def clear_Unit(): Unit = js.native
    
    /**
      * 是否包含对应元素
      * @param {IElement} element 元素
      * @return {boolean}
      */
    def contain(element: IElement): Boolean = js.native
    
    /**
      * 查找元素，找到第一个返回
      * @param  {ElementFilterFn} fn    匹配函数
      * @return {IElement|null} 元素，可以为空
      */
    /**
      * 查找元素，找到第一个返回
      * @param  {ElementFilterFn} fn 匹配函数
      * @return {IElement|null} 元素，可以为空
      */
    def find(fn: ElementFilterFn): IElement = js.native
    
    /**
      * 查找所有匹配的元素
      * @param  {ElementFilterFn}   fn  匹配函数
      * @return {IElement[]} 元素数组
      */
    /**
      * 查找所有匹配的元素
      * @param  {ElementFilterFn} fn 匹配函数
      * @return {IElement[]} 元素数组
      */
    def findAll(fn: ElementFilterFn): js.Array[IElement] = js.native
    
    /**
      * 根据 name 查找元素列表
      * @param {string}      name 元素名称
      * @return {IElement[]} 元素
      */
    /**
      * 根据 name 查找元素列表
      * @param {string}      name 元素名称
      * @return {IElement[]} 元素
      * 是否是实体分组，即对应实际的渲染元素
      * @return {boolean} 是否是实体分组
      */
    def findAllByName(name: String): js.Array[IElement] = js.native
    
    /**
      * 该方法即将废弃，不建议使用
      * 根据 className 查找元素
      * TODO: 该方式定义暂时只给 G6 3.3 以后的版本使用，待 G6 中的 findByClassName 方法移除后，G 也需要同步移除
      * @param {string} className 元素 className
      * @return {IElement | null} 元素
      */
    /**
      * 该方法即将废弃，不建议使用
      * 根据 className 查找元素
      * TODO: 该方法暂时只给 G6 3.3 以后的版本使用，待 G6 中的 findByClassName 方法移除后，G 也需要同步移除
      * @param {string} className 元素 className
      * @return {IElement | null} 元素
      */
    def findByClassName(className: String): IElement = js.native
    
    /**
      * 根据 ID 查找元素
      * @param {string} id 元素 id
      * @return {IElement|null} 元素
      */
    /**
      * 根据 ID 查找元素
      * @param {string} id 元素 id
      * @return {IElement | null} 元素
      */
    def findById(id: String): IElement = js.native
    
    /**
      * 根据索引获取子元素
      * @return {IElement} 第一个元素
      */
    def getChildByIndex(index: Double): IElement = js.native
    
    /**
      * 获取所有的子元素
      * @return {IElement[]} 子元素的集合
      */
    def getChildren(): js.Array[IElement] = js.native
    
    /**
      * 子元素的数量
      * @return {number} 子元素数量
      */
    def getCount(): Double = js.native
    
    /**
      * 获取第一个子元素
      * @return {IElement} 第一个元素
      */
    def getFirst(): IElement = js.native
    
    /**
      * 获取最后一个子元素
      * @return {IElement} 元素
      */
    def getLast(): IElement = js.native
    
    /**
      * 根据 x,y 获取对应的图形
      * @param {number} x x 坐标
      * @param {number} y y 坐标
      * @param {Event} 浏览器事件对象
      * @returns 添加的图形分组
      */
    def getShape(x: Double, y: Double, ev: Event): IShape = js.native
    
    /**
      * 容器是否是 Canvas 画布
      */
    def isCanvas(): Any = js.native
    @JSName("isCanvas")
    def isCanvas_Boolean(): Boolean = js.native
    
    def onAttrChange(name: Any, value: Any, originValue: Any): Unit = js.native
    
    /**
      * 移除对应子元素
      * @param {IElement} element 子元素
      * @param {boolean} destroy 是否销毁子元素，默认为 true
      */
    def removeChild(element: IElement): Any = js.native
    def removeChild(element: IElement, destroy: Boolean): Any = js.native
    /**
      * 移除对应子元素
      * @param {IElement} element 子元素
      * @param {boolean} destroy 是否销毁子元素，默认为 true
      */
    @JSName("removeChild")
    def removeChild_Unit(element: IElement): Unit = js.native
    @JSName("removeChild")
    def removeChild_Unit(element: IElement, destroy: Boolean): Unit = js.native
    
    /**
      * 子元素按照 zIndex 进行排序
      */
    def sort(): Any = js.native
    @JSName("sort")
    def sort_Unit(): Unit = js.native
  }
}
