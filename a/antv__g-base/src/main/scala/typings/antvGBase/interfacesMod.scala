package typings.antvGBase

import org.scalablytyped.runtime.Instantiable1
import typings.antvGBase.graphEventMod.default
import typings.antvGBase.typesMod.AnimateCfg
import typings.antvGBase.typesMod.BBox
import typings.antvGBase.typesMod.ChangeType
import typings.antvGBase.typesMod.ClipCfg
import typings.antvGBase.typesMod.Cursor
import typings.antvGBase.typesMod.ElementAttrs
import typings.antvGBase.typesMod.ElementFilterFn
import typings.antvGBase.typesMod.GroupCfg
import typings.antvGBase.typesMod.LooseObject
import typings.antvGBase.typesMod.OnFrame
import typings.antvGBase.typesMod.Point
import typings.antvGBase.typesMod.Renderer
import typings.antvGBase.typesMod.ShapeBase
import typings.antvGBase.typesMod.ShapeCfg
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g-base/lib/interfaces", JSImport.Namespace)
@js.native
object interfacesMod extends js.Object {
  
  @js.native
  trait IBase extends IObservable {
    
    var cfg: LooseObject = js.native
    
    /**
      * 销毁对象
      */
    def destroy(): js.Any = js.native
    
    /**
      * 是否销毁
      * @type {boolean}
      */
    var destroyed: Boolean = js.native
    
    /**
      * 获取属性值
      * @param  {string} name 属性名
      * @return {any} 属性值
      */
    def get(name: String): js.Any = js.native
    
    /**
      * 设置属性值
      * @param {string} name  属性名称
      * @param {any}    value 属性值
      */
    def set(name: String, value: js.Any): js.Any = js.native
  }
  
  @js.native
  trait ICanvas extends IContainer {
    
    /**
      * 改变画布大小
      * @param {number} width  宽度
      * @param {number} height 高度
      */
    def changeSize(width: Double, height: Double): js.Any = js.native
    
    /**
      * 绘制
      */
    def draw(): js.Any = js.native
    
    /**
      * 根据事件对象获取窗口坐标
      * @param  {Event} ev 事件对象
      * @return {object} 窗口坐标
      */
    def getClientByEvent(ev: Event): Point = js.native
    
    /**
      * 将 canvas 坐标转换成窗口坐标
      * @param {number} x canvas 上的 x 坐标
      * @param {number} y canvas 上的 y 坐标
      * @returns {object} 窗口坐标
      */
    def getClientByPoint(x: Double, y: Double): Point = js.native
    
    /**
      * 获取画布的 cursor 样式
      * @return {Cursor}
      */
    def getCursor(): Cursor = js.native
    
    /**
      * 将窗口坐标转变成画布坐标
      * @param  {number} clientX 窗口 x 坐标
      * @param  {number} clientY 窗口 y 坐标
      * @return {object} 画布坐标
      */
    def getPointByClient(clientX: Double, clientY: Double): Point = js.native
    
    /**
      * 根据事件对象获取画布坐标
      * @param  {Event} ev 事件对象
      * @return {object} 画布坐标
      */
    def getPointByEvent(ev: Event): Point = js.native
    
    /**
      * 获取当前的渲染引擎
      * @return {Renderer} 返回当前的渲染引擎
      */
    def getRenderer(): Renderer = js.native
    
    /**
      * 设置画布的 cursor 样式
      * @param {Cursor} cursor  cursor 样式
      */
    def setCursor(cursor: Cursor): js.Any = js.native
  }
  
  @js.native
  trait IContainer extends IElement {
    
    /**
      * 添加图形元素，已经在外面构造好的类
      * @param {IElement} element 图形元素（图形或者分组）
      */
    def add(element: IElement): js.Any = js.native
    
    /**
      * 添加图形分组，增加一个默认的 Group
      * @returns 添加的图形分组
      */
    def addGroup(): IGroup = js.native
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
    
    /**
      * 清理所有的子元素
      */
    def clear(): js.Any = js.native
    
    /**
      * 是否包含对应元素
      * @param {IElement} element 元素
      * @return {boolean}
      */
    def contain(element: IElement): Boolean = js.native
    
    /**
      * 查找元素，找到第一个返回
      * @param  {ElementFilterFn} fn 匹配函数
      * @return {IElement|null} 元素，可以为空
      */
    def find(fn: ElementFilterFn): IElement = js.native
    
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
      * 是否是实体分组，即对应实际的渲染元素
      * @return {boolean} 是否是实体分组
      */
    def findAllByName(name: String): js.Array[IElement] = js.native
    
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
    def isCanvas(): js.Any = js.native
    
    /**
      * 移除对应子元素
      * @param {IElement} element 子元素
      * @param {boolean} destroy 是否销毁子元素，默认为 true
      */
    def removeChild(element: IElement): js.Any = js.native
    def removeChild(element: IElement, destroy: Boolean): js.Any = js.native
    
    /**
      * 子元素按照 zIndex 进行排序
      */
    def sort(): js.Any = js.native
  }
  
  @js.native
  trait ICtor[T]
    extends Instantiable1[/* cfg */ js.Any, T]
  
  @js.native
  trait IElement extends IBase {
    
    /**
      * 执行动画
      * @param {OnFrame}  onFrame  自定义帧动画函数
      * @param {number}   duration 动画执行时间
      * @param {string}   easing   动画缓动效果
      * @param {function} callback 动画执行后的回调
      * @param {number}   delay    动画延迟时间
      */
    def animate(onFrame: OnFrame, duration: Double): js.Any = js.native
    def animate(
      onFrame: OnFrame,
      duration: Double,
      easing: js.UndefOr[scala.Nothing],
      callback: js.UndefOr[scala.Nothing],
      delay: Double
    ): js.Any = js.native
    def animate(onFrame: OnFrame, duration: Double, easing: js.UndefOr[scala.Nothing], callback: js.Function): js.Any = js.native
    def animate(
      onFrame: OnFrame,
      duration: Double,
      easing: js.UndefOr[scala.Nothing],
      callback: js.Function,
      delay: Double
    ): js.Any = js.native
    def animate(onFrame: OnFrame, duration: Double, easing: String): js.Any = js.native
    def animate(
      onFrame: OnFrame,
      duration: Double,
      easing: String,
      callback: js.UndefOr[scala.Nothing],
      delay: Double
    ): js.Any = js.native
    def animate(onFrame: OnFrame, duration: Double, easing: String, callback: js.Function): js.Any = js.native
    def animate(onFrame: OnFrame, duration: Double, easing: String, callback: js.Function, delay: Double): js.Any = js.native
    /**
      * 执行动画
      * @param {ElementAttrs} toAttrs 动画最终状态
      * @param {AnimateCfg}   cfg     动画配置
      */
    def animate(toAttrs: js.Any, cfg: AnimateCfg): js.Any = js.native
    /**
      * 执行动画
      * @param {ElementAttrs} toAttrs 动画最终状态
      * @param {number}       duration 动画执行时间
      * @param {string}       easing 动画缓动效果
      * @param {function}     callback 动画执行后的回调
      * @param {number}       delay 动画延迟时间
      */
    def animate(toAttrs: ElementAttrs, duration: Double): js.Any = js.native
    def animate(
      toAttrs: ElementAttrs,
      duration: Double,
      easing: js.UndefOr[scala.Nothing],
      callback: js.UndefOr[scala.Nothing],
      delay: Double
    ): js.Any = js.native
    def animate(toAttrs: ElementAttrs, duration: Double, easing: js.UndefOr[scala.Nothing], callback: js.Function): js.Any = js.native
    def animate(
      toAttrs: ElementAttrs,
      duration: Double,
      easing: js.UndefOr[scala.Nothing],
      callback: js.Function,
      delay: Double
    ): js.Any = js.native
    def animate(toAttrs: ElementAttrs, duration: Double, easing: String): js.Any = js.native
    def animate(
      toAttrs: ElementAttrs,
      duration: Double,
      easing: String,
      callback: js.UndefOr[scala.Nothing],
      delay: Double
    ): js.Any = js.native
    def animate(toAttrs: ElementAttrs, duration: Double, easing: String, callback: js.Function): js.Any = js.native
    def animate(toAttrs: ElementAttrs, duration: Double, easing: String, callback: js.Function, delay: Double): js.Any = js.native
    
    /**
      * 将向量应用设置的矩阵
      * @param {number[]} v 向量
      */
    def applyToMatrix(v: js.Array[Double]): js.Any = js.native
    
    /**
      * 获取全量的图形属性
      */
    def attr(): js.Any = js.native
    /**
      * 设置图形属性
      * @param {object} attrs 图形属性配置项，键值对方式
      */
    def attr(attrs: js.Object): js.Any = js.native
    /**
      * 获取图形属性
      * @param {string} name 图形属性名
      * @returns 图形属性值
      */
    def attr(name: String): js.Any = js.native
    /**
      * 设置图形属性
      * @param {string} name  图形属性名
      * @param {any}    value 图形属性值
      */
    def attr(name: String, value: js.Any): js.Any = js.native
    
    /**
      * 触发委托事件
      * @param  {string}  type 事件类型
      * @param  {GraphEvent}  eventObj 事件对象
      */
    def emitDelegation(`type`: String, eventObj: default): Unit = js.native
    
    /**
      * 获取包围盒，这个包围盒是相对于图形元素自己，不会计算 matrix
      * @returns {BBox} 包围盒
      */
    def getBBox(): js.Any = js.native
    
    /**
      * 获取所属的 Canvas
      * @return {ICanvas} Canvas 对象
      */
    def getCanvas(): ICanvas = js.native
    
    /**
      * 获取图形元素相对画布的包围盒，会计算从顶层到当前的 matrix
      * @returns {BBox} 包围盒
      */
    def getCanvasBBox(): BBox = js.native
    
    /**
      * 获取 clip ，clip 对象是一个 Shape
      * @returns {IShape} clip 的 Shape
      */
    def getClip(): IShape = js.native
    
    /**
      * 获取 Group 的基类，用于添加默认的 Group
      * @return {IGroup} group 类型
      */
    def getGroupBase(): ICtor[IGroup] = js.native
    
    /**
      * 获取 transform 后的矩阵
      * @return {number[]} 矩阵
      */
    def getMatrix(): js.Array[Double] = js.native
    
    /**
      * 获取父元素
      * @return {IContainer} 父元素一般是 Group 或者是 Canvas
      */
    def getParent(): IContainer = js.native
    
    /**
      * 获取 Shape 的基类
      * @return {IShape} Shape 的基类，用作工厂方法来获取类实例
      */
    def getShapeBase(): ShapeBase = js.native
    
    /**
      * 隐藏
      */
    def hide(): js.Any = js.native
    
    /**
      * 根据设置的矩阵，将向量转换相对于图形/分组的位置
      * @param {number[]} v 向量
      */
    def invertFromMatrix(v: js.Array[Double]): js.Any = js.native
    
    /**
      * 是否处于动画暂停状态
      * @return {boolean} 是否处于动画暂停状态
      */
    def isAnimatePaused(): js.Any = js.native
    
    /**
      * 指定的点是否被裁剪掉
      * @param  {number}  refX 相对于图形的坐标 x
      * @param  {number}  refY 相对于图形的坐标 Y
      * @return {boolean} 是否被裁剪
      */
    def isClipped(refX: Double, refY: Double): Boolean = js.native
    
    /**
      * 是否是分组
      * @return {boolean} 是否是分组
      */
    def isGroup(): Boolean = js.native
    
    /**
      * 移动元素到目标位置
      * @param {number} targetX 目标位置的 x 轴坐标
      * @param {number} targetY 目标位置的 y 轴坐标
      * @return {IElement} 元素
      */
    def move(targetX: Double, targetY: Double): IElement = js.native
    
    /**
      * 移动元素到目标位置，等价于 move 方法。由于 moveTo 的语义性更强，因此在文档中推荐使用 moveTo 方法
      * @param {number} targetX 目标位置的 x 轴坐标
      * @param {number} targetY 目标位置的 y 轴坐标
      * @return {IElement} 元素
      */
    def moveTo(targetX: Double, targetY: Double): IElement = js.native
    
    /**
      * 当引擎画布变化时，可以调用这个方法，告知 canvas 图形属性发生了改变
      * 这个方法一般不要直接调用，在实现 element 的继承类时可以复写
      * @param {ChangeType} changeType 改变的类型
      */
    def onCanvasChange(changeType: ChangeType): js.Any = js.native
    
    /**
      * 暂停图形的动画
      */
    def pauseAnimate(): js.Any = js.native
    
    /**
      * 从父元素中移除
      * @param {boolean} destroy 是否同时销毁
      */
    def remove(): js.Any = js.native
    def remove(destroy: Boolean): js.Any = js.native
    
    /**
      * 清除掉所有平移、旋转和缩放
      */
    def resetMatrix(): js.Any = js.native
    
    /**
      * 恢复暂停的动画
      */
    def resumeAnimate(): js.Any = js.native
    
    /**
      * 以画布左上角 (0, 0) 为中心旋转元素
      * @param {number} radian 旋转角度(弧度值)
      * @return {IElement} 元素
      */
    def rotate(radian: Double): IElement = js.native
    
    /**
      * 以任意点 (x, y) 为中心旋转元素
      * @param {number} radian 旋转角度(弧度值)
      * @return {IElement} 元素
      */
    def rotateAtPoint(x: Double, y: Double, rotate: Double): IElement = js.native
    
    /**
      * 以起始点为中心旋转元素
      * @param {number} radian 旋转角度(弧度值)
      * @return {IElement} 元素
      */
    def rotateAtStart(rotate: Double): IElement = js.native
    
    /**
      * 缩放元素
      * @param {number} ratioX x 方向的缩放比例
      * @param {number} ratioY y 方向的缩放比例
      * @return {IElement} 元素
      */
    def scale(ratioX: Double, ratioY: Double): IElement = js.native
    /**
      * 缩放元素
      * @param {number} ratio 各个方向的缩放比例
      * @return {IElement} 元素
      */
    def scale(ratio: Double): IElement = js.native
    
    /**
      * 设置 clip ，会在内部转换成对应的图形
      * @param {ClipCfg} clipCfg 配置项
      */
    def setClip(clipCfg: ClipCfg): js.Any = js.native
    
    /**
      * 设置 transform 的矩阵
      * @param {number[]} m 应用到图形元素的矩阵
      */
    def setMatrix(m: js.Array[Double]): js.Any = js.native
    
    /**
      * 设置 zIndex
      */
    def setZIndex(zIndex: Double): js.Any = js.native
    
    /**
      * 显示
      */
    def show(): js.Any = js.native
    
    /**
      * 停止图形的动画
      * @param {boolean} toEnd 是否到动画的最终状态
      */
    def stopAnimate(): js.Any = js.native
    def stopAnimate(toEnd: Boolean): js.Any = js.native
    
    /**
      * 最后面
      */
    def toBack(): js.Any = js.native
    
    /**
      * 最前面
      */
    def toFront(): js.Any = js.native
    
    /**
      * 移动元素
      * @param {number} translateX x 轴方向的移动距离
      * @param {number} translateY y 轴方向的移动距离
      * @return {IElement} 元素
      */
    def translate(translateX: Double): IElement = js.native
    def translate(translateX: Double, translateY: Double): IElement = js.native
  }
  
  @js.native
  trait IGroup extends IContainer {
    
    /**
      * 是否是实体分组，即对应实际的渲染元素
      * @return {boolean} 是否是实体分组
      */
    def isEntityGroup(): Boolean = js.native
  }
  
  @js.native
  trait IObservable extends js.Object {
    
    /**
      * 触发事件, trigger 的别名函数
      * @param eventName 事件名称
      * @param eventObject 参数
      */
    def emit(eventName: String, eventObject: js.Object): js.Any = js.native
    
    def getEvents(): js.Any = js.native
    
    /**
      * 移除事件
      */
    def off(): js.Any = js.native
    /**
      * 移除事件
      * @param eventName 事件名
      */
    def off(eventName: String): js.Any = js.native
    /**
      * 移除事件
      * @param eventName 事件名
      * @param callback  回调函数
      */
    def off(eventName: String, callback: js.Function): js.Any = js.native
    
    /**
      * 绑定事件
      * @param  eventName 事件名
      * @param callback  回调函数
      */
    def on(eventName: String, callback: js.Function): js.Any = js.native
  }
  
  @js.native
  trait IShape extends IElement {
    
    /**
      * 是否用于 clip, 默认为 false
      * @return {boolean} 图形是否用于 clip
      */
    def isClipShape(): Boolean = js.native
    
    /**
      * 图形拾取
      * @param {number} x x 坐标
      * @param {number} y y 坐标
      * @returns 是否已被拾取
      */
    def isHit(x: Double, y: Double): Boolean = js.native
  }
}
