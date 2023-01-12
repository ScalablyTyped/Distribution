package typings.amapJsApi.AMap

import typings.amapJsApi.AMap.Marker.Anchor
import typings.amapJsApi.AMap.Marker.Label
import typings.amapJsApi.amapJsApiStrings.click
import typings.amapJsApi.amapJsApiStrings.dblclick
import typings.amapJsApi.amapJsApiStrings.dragend
import typings.amapJsApi.amapJsApiStrings.dragging
import typings.amapJsApi.amapJsApiStrings.dragstart
import typings.amapJsApi.amapJsApiStrings.mousedown
import typings.amapJsApi.amapJsApiStrings.mousemove
import typings.amapJsApi.amapJsApiStrings.mouseout
import typings.amapJsApi.amapJsApiStrings.mouseover
import typings.amapJsApi.amapJsApiStrings.mouseup
import typings.amapJsApi.amapJsApiStrings.movealong
import typings.amapJsApi.amapJsApiStrings.moveend
import typings.amapJsApi.amapJsApiStrings.moving
import typings.amapJsApi.amapJsApiStrings.rightclick
import typings.amapJsApi.amapJsApiStrings.touchend
import typings.amapJsApi.amapJsApiStrings.touchmove
import typings.amapJsApi.amapJsApiStrings.touchstart
import typings.amapJsApi.anon.PassedPath
import typings.amapJsApi.anon.Position
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Marker[ExtraData]
  extends StObject
     with Overlay[ExtraData] {
  
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
  def markOnAMAP(obj: Position): Unit = js.native
  
  /**
    * 以指定的速度，点标记沿指定的路径移动
    * @param path 移动轨迹
    * @param speed 速度
    * @param timingFunction 缓动函数
    * @param circleable 是否循环
    */
  def moveAlong(path: js.Array[LngLat], speed: Double): Unit = js.native
  def moveAlong(path: js.Array[LngLat], speed: Double, timingFunction: js.Function1[/* t */ Double, Double]): Unit = js.native
  def moveAlong(
    path: js.Array[LngLat],
    speed: Double,
    timingFunction: js.Function1[/* t */ Double, Double],
    circleable: Boolean
  ): Unit = js.native
  def moveAlong(path: js.Array[LngLat], speed: Double, timingFunction: Unit, circleable: Boolean): Unit = js.native
  
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
object Marker {
  
  /* Rewritten from type alias, can be one of: 
    - typings.amapJsApi.amapJsApiStrings.`top-left`
    - typings.amapJsApi.amapJsApiStrings.`top-center`
    - typings.amapJsApi.amapJsApiStrings.`top-right`
    - typings.amapJsApi.amapJsApiStrings.`middle-left`
    - typings.amapJsApi.amapJsApiStrings.center
    - typings.amapJsApi.amapJsApiStrings.`middle-right`
    - typings.amapJsApi.amapJsApiStrings.`bottom-left`
    - typings.amapJsApi.amapJsApiStrings.`bottom-center`
    - typings.amapJsApi.amapJsApiStrings.`bottom-right`
  */
  trait Anchor extends StObject
  object Anchor {
    
    inline def `bottom-center`: typings.amapJsApi.amapJsApiStrings.`bottom-center` = "bottom-center".asInstanceOf[typings.amapJsApi.amapJsApiStrings.`bottom-center`]
    
    inline def `bottom-left`: typings.amapJsApi.amapJsApiStrings.`bottom-left` = "bottom-left".asInstanceOf[typings.amapJsApi.amapJsApiStrings.`bottom-left`]
    
    inline def `bottom-right`: typings.amapJsApi.amapJsApiStrings.`bottom-right` = "bottom-right".asInstanceOf[typings.amapJsApi.amapJsApiStrings.`bottom-right`]
    
    inline def center: typings.amapJsApi.amapJsApiStrings.center = "center".asInstanceOf[typings.amapJsApi.amapJsApiStrings.center]
    
    inline def `middle-left`: typings.amapJsApi.amapJsApiStrings.`middle-left` = "middle-left".asInstanceOf[typings.amapJsApi.amapJsApiStrings.`middle-left`]
    
    inline def `middle-right`: typings.amapJsApi.amapJsApiStrings.`middle-right` = "middle-right".asInstanceOf[typings.amapJsApi.amapJsApiStrings.`middle-right`]
    
    inline def `top-center`: typings.amapJsApi.amapJsApiStrings.`top-center` = "top-center".asInstanceOf[typings.amapJsApi.amapJsApiStrings.`top-center`]
    
    inline def `top-left`: typings.amapJsApi.amapJsApiStrings.`top-left` = "top-left".asInstanceOf[typings.amapJsApi.amapJsApiStrings.`top-left`]
    
    inline def `top-right`: typings.amapJsApi.amapJsApiStrings.`top-right` = "top-right".asInstanceOf[typings.amapJsApi.amapJsApiStrings.`top-right`]
  }
  
  trait EventMap[I] extends StObject {
    
    var click: MapsEvent[typings.amapJsApi.amapJsApiStrings.click, I]
    
    var dblclick: MapsEvent[typings.amapJsApi.amapJsApiStrings.dblclick, I]
    
    var dragend: MapsEvent[typings.amapJsApi.amapJsApiStrings.dragend, I]
    
    var dragging: MapsEvent[typings.amapJsApi.amapJsApiStrings.dragging, I]
    
    var dragstart: MapsEvent[typings.amapJsApi.amapJsApiStrings.dragstart, I]
    
    var mousedown: MapsEvent[typings.amapJsApi.amapJsApiStrings.mousedown, I]
    
    var mousemove: MapsEvent[typings.amapJsApi.amapJsApiStrings.mousemove, I]
    
    var mouseout: MapsEvent[typings.amapJsApi.amapJsApiStrings.mouseout, I]
    
    var mouseover: MapsEvent[typings.amapJsApi.amapJsApiStrings.mouseover, I]
    
    var mouseup: MapsEvent[typings.amapJsApi.amapJsApiStrings.mouseup, I]
    
    var movealong: Event_[typings.amapJsApi.amapJsApiStrings.movealong, Unit]
    
    var moveend: Event_[typings.amapJsApi.amapJsApiStrings.moveend, Unit]
    
    var moving: Event_[typings.amapJsApi.amapJsApiStrings.moving, PassedPath]
    
    var rightclick: MapsEvent[typings.amapJsApi.amapJsApiStrings.rightclick, I]
    
    var touchend: MapsEvent[typings.amapJsApi.amapJsApiStrings.touchend, I]
    
    var touchmove: MapsEvent[typings.amapJsApi.amapJsApiStrings.touchmove, I]
    
    var touchstart: MapsEvent[typings.amapJsApi.amapJsApiStrings.touchstart, I]
  }
  object EventMap {
    
    inline def apply[I](
      click: MapsEvent[click, I],
      dblclick: MapsEvent[dblclick, I],
      dragend: MapsEvent[dragend, I],
      dragging: MapsEvent[dragging, I],
      dragstart: MapsEvent[dragstart, I],
      mousedown: MapsEvent[mousedown, I],
      mousemove: MapsEvent[mousemove, I],
      mouseout: MapsEvent[mouseout, I],
      mouseover: MapsEvent[mouseover, I],
      mouseup: MapsEvent[mouseup, I],
      movealong: Event_[movealong, Unit],
      moveend: Event_[moveend, Unit],
      moving: Event_[moving, PassedPath],
      rightclick: MapsEvent[rightclick, I],
      touchend: MapsEvent[touchend, I],
      touchmove: MapsEvent[touchmove, I],
      touchstart: MapsEvent[touchstart, I]
    ): EventMap[I] = {
      val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragging = dragging.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], movealong = movealong.asInstanceOf[js.Any], moveend = moveend.asInstanceOf[js.Any], moving = moving.asInstanceOf[js.Any], rightclick = rightclick.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventMap[I]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventMap[?], I] (val x: Self & EventMap[I]) extends AnyVal {
      
      inline def setClick(value: MapsEvent[click, I]): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
      
      inline def setDblclick(value: MapsEvent[dblclick, I]): Self = StObject.set(x, "dblclick", value.asInstanceOf[js.Any])
      
      inline def setDragend(value: MapsEvent[dragend, I]): Self = StObject.set(x, "dragend", value.asInstanceOf[js.Any])
      
      inline def setDragging(value: MapsEvent[dragging, I]): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
      
      inline def setDragstart(value: MapsEvent[dragstart, I]): Self = StObject.set(x, "dragstart", value.asInstanceOf[js.Any])
      
      inline def setMousedown(value: MapsEvent[mousedown, I]): Self = StObject.set(x, "mousedown", value.asInstanceOf[js.Any])
      
      inline def setMousemove(value: MapsEvent[mousemove, I]): Self = StObject.set(x, "mousemove", value.asInstanceOf[js.Any])
      
      inline def setMouseout(value: MapsEvent[mouseout, I]): Self = StObject.set(x, "mouseout", value.asInstanceOf[js.Any])
      
      inline def setMouseover(value: MapsEvent[mouseover, I]): Self = StObject.set(x, "mouseover", value.asInstanceOf[js.Any])
      
      inline def setMouseup(value: MapsEvent[mouseup, I]): Self = StObject.set(x, "mouseup", value.asInstanceOf[js.Any])
      
      inline def setMovealong(value: Event_[movealong, Unit]): Self = StObject.set(x, "movealong", value.asInstanceOf[js.Any])
      
      inline def setMoveend(value: Event_[moveend, Unit]): Self = StObject.set(x, "moveend", value.asInstanceOf[js.Any])
      
      inline def setMoving(value: Event_[moving, PassedPath]): Self = StObject.set(x, "moving", value.asInstanceOf[js.Any])
      
      inline def setRightclick(value: MapsEvent[rightclick, I]): Self = StObject.set(x, "rightclick", value.asInstanceOf[js.Any])
      
      inline def setTouchend(value: MapsEvent[touchend, I]): Self = StObject.set(x, "touchend", value.asInstanceOf[js.Any])
      
      inline def setTouchmove(value: MapsEvent[touchmove, I]): Self = StObject.set(x, "touchmove", value.asInstanceOf[js.Any])
      
      inline def setTouchstart(value: MapsEvent[touchstart, I]): Self = StObject.set(x, "touchstart", value.asInstanceOf[js.Any])
    }
  }
  
  trait Label extends StObject {
    
    var content: js.UndefOr[String] = js.undefined
    
    var direction: js.UndefOr[LabelDirection] = js.undefined
    
    var offset: js.UndefOr[Pixel] = js.undefined
  }
  object Label {
    
    inline def apply(): Label = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Label]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Label] (val x: Self) extends AnyVal {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setDirection(value: LabelDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setOffset(value: Pixel): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.amapJsApi.amapJsApiStrings.top
    - typings.amapJsApi.amapJsApiStrings.right
    - typings.amapJsApi.amapJsApiStrings.bottom
    - typings.amapJsApi.amapJsApiStrings.left
    - typings.amapJsApi.amapJsApiStrings.center
  */
  trait LabelDirection extends StObject
  object LabelDirection {
    
    inline def bottom: typings.amapJsApi.amapJsApiStrings.bottom = "bottom".asInstanceOf[typings.amapJsApi.amapJsApiStrings.bottom]
    
    inline def center: typings.amapJsApi.amapJsApiStrings.center = "center".asInstanceOf[typings.amapJsApi.amapJsApiStrings.center]
    
    inline def left: typings.amapJsApi.amapJsApiStrings.left = "left".asInstanceOf[typings.amapJsApi.amapJsApiStrings.left]
    
    inline def right: typings.amapJsApi.amapJsApiStrings.right = "right".asInstanceOf[typings.amapJsApi.amapJsApiStrings.right]
    
    inline def top: typings.amapJsApi.amapJsApiStrings.top = "top".asInstanceOf[typings.amapJsApi.amapJsApiStrings.top]
  }
  
  trait Options[ExtraData]
    extends StObject
       with typings.amapJsApi.AMap.Overlay.Options[ExtraData] {
    
    /**
      * 标记锚点
      */
    var anchor: js.UndefOr[Anchor] = js.undefined
    
    /**
      * 点标记的旋转角度
      */
    var angle: js.UndefOr[Double] = js.undefined
    
    /**
      * 点标记的动画效果
      */
    var animation: js.UndefOr[AnimationName] = js.undefined
    
    /**
      * 是否自动旋转
      */
    var autoRotation: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 点标记显示内容
      */
    var content: js.UndefOr[String | HTMLElement] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    /**
      * 需在点标记中显示的图标
      */
    var icon: js.UndefOr[String | Icon] = js.undefined
    
    /**
      * 文本标注
      */
    var label: js.UndefOr[Label] = js.undefined
    
    /**
      * 点标记显示位置偏移量
      */
    var offset: js.UndefOr[Pixel] = js.undefined
    
    /**
      * 点标记在地图上显示的位置
      */
    var position: js.UndefOr[LocationValue] = js.undefined
    
    /**
      * 拖拽点标记时是否开启点标记离开地图的效果
      */
    var raiseOnDrag: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 点标记阴影
      */
    var shadow: js.UndefOr[Icon | String] = js.undefined
    
    /**
      * 可点击区域
      */
    var shape: js.UndefOr[MarkerShape] = js.undefined
    
    /**
      * 鼠标滑过点标记时的文字提示
      */
    var title: js.UndefOr[String] = js.undefined
    
    /**
      * 鼠标点击时marker是否置顶
      */
    var topWhenClick: js.UndefOr[Boolean] = js.undefined
    
    var topWhenMouseOver: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 点标记是否可见
      */
    var visible: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 点标记的叠加顺序
      */
    var zIndex: js.UndefOr[Double] = js.undefined
    
    // internal
    var zooms: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  }
  object Options {
    
    inline def apply[ExtraData](): Options[ExtraData] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[ExtraData]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options[?], ExtraData] (val x: Self & Options[ExtraData]) extends AnyVal {
      
      inline def setAnchor(value: Anchor): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
      
      inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
      
      inline def setAnimation(value: AnimationName): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setAutoRotation(value: Boolean): Self = StObject.set(x, "autoRotation", value.asInstanceOf[js.Any])
      
      inline def setAutoRotationUndefined: Self = StObject.set(x, "autoRotation", js.undefined)
      
      inline def setContent(value: String | HTMLElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setIcon(value: String | Icon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setLabel(value: Label): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setOffset(value: Pixel): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setPosition(value: LocationValue): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setRaiseOnDrag(value: Boolean): Self = StObject.set(x, "raiseOnDrag", value.asInstanceOf[js.Any])
      
      inline def setRaiseOnDragUndefined: Self = StObject.set(x, "raiseOnDrag", js.undefined)
      
      inline def setShadow(value: Icon | String): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
      
      inline def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
      
      inline def setShape(value: MarkerShape): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTopWhenClick(value: Boolean): Self = StObject.set(x, "topWhenClick", value.asInstanceOf[js.Any])
      
      inline def setTopWhenClickUndefined: Self = StObject.set(x, "topWhenClick", js.undefined)
      
      inline def setTopWhenMouseOver(value: Boolean): Self = StObject.set(x, "topWhenMouseOver", value.asInstanceOf[js.Any])
      
      inline def setTopWhenMouseOverUndefined: Self = StObject.set(x, "topWhenMouseOver", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
      
      inline def setZooms(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "zooms", value.asInstanceOf[js.Any])
      
      inline def setZoomsUndefined: Self = StObject.set(x, "zooms", js.undefined)
    }
  }
}
