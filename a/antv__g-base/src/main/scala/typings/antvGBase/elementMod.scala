package typings.antvGBase

import typings.antvGBase.anon.Matrix
import typings.antvGBase.interfacesMod.ICanvas
import typings.antvGBase.interfacesMod.IContainer
import typings.antvGBase.interfacesMod.ICtor
import typings.antvGBase.interfacesMod.IElement
import typings.antvGBase.interfacesMod.IGroup
import typings.antvGBase.interfacesMod.IShape
import typings.antvGBase.typesMod.AnimateCfg
import typings.antvGBase.typesMod.BBox
import typings.antvGBase.typesMod.ChangeType
import typings.antvGBase.typesMod.ClipCfg
import typings.antvGBase.typesMod.ElementAttrs
import typings.antvGBase.typesMod.OnFrame
import typings.antvGBase.typesMod.ShapeAttrs
import typings.antvGBase.typesMod.ShapeBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g-base/lib/abstract/element", JSImport.Namespace)
@js.native
object elementMod extends js.Object {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.antvGBase.interfacesMod.IObservable because Already inherited
  - typings.antvGBase.interfacesMod.IBase because Already inherited
  - typings.antvGBase.interfacesMod.IElement because var conflicts: cfg, destroyed. Inlined getParent, getCanvas, getShapeBase, getGroupBase, onCanvasChange, isGroup, remove, remove, attr, attr, attr, attr, getBBox, getCanvasBBox, clone, show, hide, setZIndex, toFront, toBack, resetMatrix, getMatrix, setMatrix, applyToMatrix, invertFromMatrix, isAnimatePaused, animate, animate, animate, animate, animate, animate, animate, animate, animate, animate, animate, animate, animate, animate, animate, animate, animate, stopAnimate, stopAnimate, pauseAnimate, resumeAnimate, setClip, getClip, isClipped, emitDelegation, translate, translate, move, moveTo, scale, scale, rotate, rotateAtStart, rotateAtPoint */ @js.native
  trait Element
    extends typings.antvGBase.baseMod.default {
    
    /**
      * 属性更改后需要做的事情
      * @protected
      */
    def afterAttrsChange(targetAttrs: js.Any): Unit = js.native
    
    /**
      * 执行动画，支持多种函数签名
      * 1. animate(toAttrs: ElementAttrs, duration: number, easing?: string, callback?: () => void, delay?: number)
      * 2. animate(onFrame: OnFrame, duration: number, easing?: string, callback?: () => void, delay?: number)
      * 3. animate(toAttrs: ElementAttrs, cfg: AnimateCfg)
      * 4. animate(onFrame: OnFrame, cfg: AnimateCfg)
      * 各个参数的含义为:
      *   toAttrs  动画最终状态
      *   onFrame  自定义帧动画函数
      *   duration 动画执行时间
      *   easing   动画缓动效果
      *   callback 动画执行后的回调
      *   delay    动画延迟时间
      */
    def animate(args: js.Any*): Unit = js.native
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
    
    def applyMatrix(matrix: js.Array[Double]): Unit = js.native
    
    /**
      * 将向量应用设置的矩阵
      * @param {number[]} v 向量
      */
    def applyToMatrix(v: js.Array[Double]): js.Any = js.native
    @JSName("applyToMatrix")
    def applyToMatrix_Array(v: js.Array[Double]): js.Array[Double] = js.native
    
    /**
      * 获取全量的图形属性
      */
    def attr(): js.Any = js.native
    def attr(args: js.Any*): js.Any = js.native
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
      * @protected
      * 图形属性
      * @type {ShapeAttrs}
      */
    var attrs: ShapeAttrs = js.native
    
    @JSName("clone")
    def clone_Any(): js.Any = js.native
    
    var emitDelegateEvent: js.Any = js.native
    
    /**
      * 触发委托事件
      * @param  {string}     type 事件类型
      * @param  {GraphEvent} eventObj 事件对象
      */
    /**
      * 触发委托事件
      * @param  {string}  type 事件类型
      * @param  {GraphEvent}  eventObj 事件对象
      */
    def emitDelegation(`type`: String, eventObj: typings.antvGBase.graphEventMod.default): Unit = js.native
    
    /**
      * 获取包围盒，这个包围盒是相对于图形元素自己，不会计算 matrix
      * @returns {BBox} 包围盒
      */
    def getBBox(): js.Any = js.native
    @JSName("getBBox")
    def getBBox_BBox(): BBox = js.native
    
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
      * @protected
      * 获取默认的属相
      */
    def getDefaultAttrs(): Matrix = js.native
    
    /**
      * @protected
      * 获取默认的矩阵
      * @returns {number[]|null} 默认的矩阵
      */
    def getDefaultMatrix(): js.Any = js.native
    
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
    
    def getParent(): IGroup = js.native
    /**
      * 获取父元素
      * @return {IContainer} 父元素一般是 Group 或者是 Canvas
      */
    @JSName("getParent")
    def getParent_IContainer(): IContainer = js.native
    
    /**
      * 获取 Shape 的基类
      * @return {IShape} Shape 的基类，用作工厂方法来获取类实例
      */
    def getShapeBase(): ShapeBase = js.native
    
    def getTotalMatrix(): js.Any = js.native
    
    /**
      * 隐藏
      */
    def hide(): js.Any = js.native
    @JSName("hide")
    def hide_This(): this.type = js.native
    
    /**
      * @protected
      * 初始化动画
      */
    def initAnimate(): Unit = js.native
    
    /**
      * @protected
      * 初始化属性，有些属性需要加工
      * @param {object} attrs 属性值
      */
    def initAttrs(attrs: ShapeAttrs): Unit = js.native
    
    /**
      * 根据设置的矩阵，将向量转换相对于图形/分组的位置
      * @param {number[]} v 向量
      */
    def invertFromMatrix(v: js.Array[Double]): js.Any = js.native
    @JSName("invertFromMatrix")
    def invertFromMatrix_Array(v: js.Array[Double]): js.Array[Double] = js.native
    
    /**
      * 是否处于动画暂停状态
      * @return {boolean} 是否处于动画暂停状态
      */
    def isAnimatePaused(): js.Any = js.native
    
    def isClipped(refX: js.Any, refY: js.Any): Boolean = js.native
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
      * 移动元素到目标位置，等价于 move 方法。由于 moveTo 的语义性更强，因此在文档中推荐使用 moveTo 方法
      * @param {number} targetX 目标位置的 x 轴坐标
      * @param {number} targetY 目标位置的 y 轴坐标
      * @return {IElement} 元素
      */
    @JSName("moveTo")
    def moveTo_This(targetX: Double, targetY: Double): this.type = js.native
    
    /**
      * 移动元素到目标位置
      * @param {number} targetX 目标位置的水平坐标
      * @param {number} targetX 目标位置的垂直坐标
      * @return {IElement} 元素
      */
    @JSName("move")
    def move_This(targetX: Double, targetY: Double): this.type = js.native
    
    /**
      * @protected
      * 属性值发生改变
      * @param {string} name 属性名
      * @param {any} value 属性值
      * @param {any} originValue 属性值
      */
    def onAttrChange(name: String, value: js.Any, originValue: js.Any): Unit = js.native
    
    /**
      * 当引擎画布变化时，可以调用这个方法，告知 canvas 图形属性发生了改变
      * 这个方法一般不要直接调用，在实现 element 的继承类时可以复写
      * @param {ChangeType} changeType 改变的类型
      */
    def onCanvasChange(changeType: ChangeType): js.Any = js.native
    /**
      * @protected
      * 一些方法调用会引起画布变化
      * @param {ChangeType} changeType 改变的类型
      */
    @JSName("onCanvasChange")
    def onCanvasChange_Unit(changeType: ChangeType): Unit = js.native
    
    /**
      * 暂停图形的动画
      */
    def pauseAnimate(): js.Any = js.native
    /**
      * 暂停动画
      */
    @JSName("pauseAnimate")
    def pauseAnimate_This(): this.type = js.native
    
    /**
      * 从父元素中移除
      * @param {boolean} destroy 是否同时销毁
      */
    def remove(): js.Any = js.native
    def remove(destroy: Boolean): js.Any = js.native
    @JSName("remove")
    def remove_Unit(): Unit = js.native
    @JSName("remove")
    def remove_Unit(destroy: Boolean): Unit = js.native
    
    /**
      * 清除掉所有平移、旋转和缩放
      */
    def resetMatrix(): js.Any = js.native
    @JSName("resetMatrix")
    def resetMatrix_Unit(): Unit = js.native
    
    /**
      * 恢复暂停的动画
      */
    def resumeAnimate(): js.Any = js.native
    /**
      * 恢复动画
      */
    @JSName("resumeAnimate")
    def resumeAnimate_This(): this.type = js.native
    
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
      * 以画布左上角 (0, 0) 为中心旋转元素
      * @param {number} radian 旋转角度(弧度值)
      * @return {IElement} 元素
      */
    @JSName("rotate")
    def rotate_This(radian: Double): this.type = js.native
    
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
      * 缩放元素
      * @param {number} ratioX 水平缩放比例
      * @param {number} ratioY 垂直缩放比例
      * @return {IElement} 元素
      */
    @JSName("scale")
    def scale_This(ratioX: Double): this.type = js.native
    @JSName("scale")
    def scale_This(ratioX: Double, ratioY: Double): this.type = js.native
    
    /**
      * 内部设置属性值的接口
      * @param {string} name 属性名
      * @param {any} value 属性值
      */
    def setAttr(name: String, value: js.Any): Unit = js.native
    
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
    @JSName("setMatrix")
    def setMatrix_Unit(m: js.Array[Double]): Unit = js.native
    
    /**
      * 设置 zIndex
      */
    def setZIndex(zIndex: Double): js.Any = js.native
    @JSName("setZIndex")
    def setZIndex_This(zIndex: Double): this.type = js.native
    
    /**
      * 显示
      */
    def show(): js.Any = js.native
    @JSName("show")
    def show_This(): this.type = js.native
    
    /**
      * 停止图形的动画
      * @param {boolean} toEnd 是否到动画的最终状态
      */
    def stopAnimate(): js.Any = js.native
    def stopAnimate(toEnd: Boolean): js.Any = js.native
    /**
      * 停止动画
      * @param {boolean} toEnd 是否到动画的最终状态
      */
    @JSName("stopAnimate")
    def stopAnimate_Unit(): Unit = js.native
    @JSName("stopAnimate")
    def stopAnimate_Unit(toEnd: Boolean): Unit = js.native
    
    /**
      * 最后面
      */
    def toBack(): js.Any = js.native
    @JSName("toBack")
    def toBack_Unit(): Unit = js.native
    
    /**
      * 最前面
      */
    def toFront(): js.Any = js.native
    @JSName("toFront")
    def toFront_Unit(): Unit = js.native
    
    /**
      * 移动元素
      * @param {number} translateX 水平移动距离
      * @param {number} translateY 垂直移动距离
      * @return {IElement} 元素
      */
    def translate(): this.type = js.native
    def translate(translateX: js.UndefOr[scala.Nothing], translateY: Double): this.type = js.native
    /**
      * 移动元素
      * @param {number} translateX x 轴方向的移动距离
      * @param {number} translateY y 轴方向的移动距离
      * @return {IElement} 元素
      */
    def translate(translateX: Double): IElement = js.native
    def translate(translateX: Double, translateY: Double): IElement = js.native
    @JSName("translate")
    def translate_This(translateX: Double): this.type = js.native
    @JSName("translate")
    def translate_This(translateX: Double, translateY: Double): this.type = js.native
  }
  
  @js.native
  abstract class default protected () extends Element {
    def this(cfg: js.Any) = this()
  }
}
