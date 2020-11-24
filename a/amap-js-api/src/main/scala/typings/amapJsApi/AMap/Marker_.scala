package typings.amapJsApi.AMap

import typings.amapJsApi.AMap.Marker.Anchor
import typings.amapJsApi.AMap.Marker.Label
import typings.amapJsApi.anon.Name
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Marker_[ExtraData] extends Overlay[ExtraData] {
  
  /**
    * 获取锚点
    */
  def getAnchor(): js.UndefOr[Anchor] = js.native
  
  /**
    *     获取点标记的旋转角度
    */
  def getAngle(): Double = js.native
  
  /**
    * 获取点标记的动画效果类型
    */
  def getAnimation(): AnimationName = js.native
  
  /**
    *     获取点标记是否支持鼠标单击事件
    */
  def getClickable(): Boolean = js.native
  
  /**
    * 获取点标记内容
    */
  def getContent(): String | HTMLElement = js.native
  
  /**
    * 获取点标记对象是否可拖拽移动
    */
  def getDraggable(): Boolean = js.native
  
  /**
    * 获取Icon内容
    */
  def getIcon(): js.UndefOr[String | Icon] = js.native
  
  /**
    *     获取点标记文本标签内容
    */
  def getLabel(): js.UndefOr[Label] = js.native
  
  /**
    * 获取偏移量
    */
  def getOffset(): Pixel = js.native
  
  /**
    *     获取点标记的位置
    */
  def getPosition(): js.UndefOr[LngLat] = js.native
  
  /**
    * 获取阴影图标
    */
  def getShadow(): js.UndefOr[Icon | String] = js.native
  
  /**
    * 获取可点击区域
    */
  def getShape(): js.UndefOr[MarkerShape] = js.native
  
  /**
    * 获取点标记的文字提示
    */
  def getTitle(): js.UndefOr[String] = js.native
  
  /**
    * 获取是否展示在最顶层
    */
  def getTop(): Boolean = js.native
  
  /**
    * 获取点标记的叠加顺序
    */
  def getzIndex(): Double = js.native
  
  /**
    * 唤起高德地图客户端标注页
    * @param obj 唤起参数
    */
  def markOnAMAP(): Unit = js.native
  def markOnAMAP(obj: Name): Unit = js.native
  
  /**
    * 以指定的速度，点标记沿指定的路径移动
    * @param path 移动轨迹
    * @param speed 速度
    * @param timingFunction 缓动函数
    * @param circleable 是否循环
    */
  def moveAlong(path: js.Array[LngLat], speed: Double): Unit = js.native
  def moveAlong(
    path: js.Array[LngLat],
    speed: Double,
    timingFunction: js.UndefOr[scala.Nothing],
    circleable: Boolean
  ): Unit = js.native
  def moveAlong(path: js.Array[LngLat], speed: Double, timingFunction: js.Function1[/* t */ Double, Double]): Unit = js.native
  def moveAlong(
    path: js.Array[LngLat],
    speed: Double,
    timingFunction: js.Function1[/* t */ Double, Double],
    circleable: Boolean
  ): Unit = js.native
  
  /**
    * 以给定速度移动点标记到指定位置
    * @param lnglat 目标位置
    * @param speed 速度
    * @param timingFunction 缓动函数
    */
  def moveTo(lnglat: LocationValue, speed: Double): Unit = js.native
  def moveTo(lnglat: LocationValue, speed: Double, timingFunction: js.Function1[/* t */ Double, Double]): Unit = js.native
  
  /**
    *     暂定点标记的动画效果
    */
  def pauseMove(): Boolean = js.native
  
  /**
    * 重新开始点标记的动画效果
    */
  def resumeMove(): Boolean = js.native
  
  /**
    * 设置锚点
    */
  def setAnchor(): Unit = js.native
  def setAnchor(anchor: Anchor): Unit = js.native
  
  /**
    *     设置点标记的旋转角度
    * @param angle 旋转角度
    */
  def setAngle(angle: Double): Unit = js.native
  
  /**
    * 设置点标记的动画效果
    * @param animate 动画效果类型
    */
  def setAnimation(animate: AnimationName): Unit = js.native
  def setAnimation(animate: AnimationName, prevent: Boolean): Unit = js.native
  
  /**
    * 设置点标记是支持鼠标单击事件
    * @param cilckable 是否支持点击
    */
  def setClickable(cilckable: Boolean): Unit = js.native
  
  /**
    *     设置点标记显示内容，可以是HTML要素字符串或者HTML DOM对象
    * @param content 显示内容
    */
  def setContent(content: String): Unit = js.native
  def setContent(content: HTMLElement): Unit = js.native
  
  /**
    * 设置鼠标悬停时的光标
    * @param cursor 光标
    */
  def setCursor(cursor: String): Unit = js.native
  
  /**
    * 设置点标记对象是否可拖拽移动
    * @param draggable 是否可拖拽移动
    */
  def setDraggable(draggable: Boolean): Unit = js.native
  
  /**
    * 设置点标记的显示图标
    * @param content 图标
    */
  def setIcon(content: String): Unit = js.native
  def setIcon(content: Icon): Unit = js.native
  
  /**
    * 设置点标记文本标签内容
    * @param label 标签内容
    */
  def setLabel(): Unit = js.native
  def setLabel(label: Label): Unit = js.native
  
  /**
    *     设置偏移量
    * @param offset 偏移量
    */
  def setOffset(offset: Pixel): Unit = js.native
  
  /**
    * 设置点标记位置
    * @param position 位置经纬度
    */
  def setPosition(position: LocationValue): Unit = js.native
  
  /**
    * 设置阴影效果
    * @param icon 阴影效果
    */
  def setShadow(): Unit = js.native
  def setShadow(icon: String): Unit = js.native
  def setShadow(icon: Icon): Unit = js.native
  
  /**
    * 设置可点击区域
    * @param shape 可点击区域
    */
  def setShape(): Unit = js.native
  def setShape(shape: MarkerShape): Unit = js.native
  
  /**
    * 鼠标滑过点标时的文字提示
    * @param title 提示文字
    */
  def setTitle(title: String): Unit = js.native
  
  /**
    * 设置是否展示在最顶层
    * @param isTop 是否展示在最顶层
    */
  def setTop(isTop: Boolean): Unit = js.native
  
  /**
    * 设置点标记的叠加顺序
    * @param index 层级
    */
  def setzIndex(index: Double): Unit = js.native
  
  /**
    * 点标记停止动画
    */
  def stopMove(): Unit = js.native
}
