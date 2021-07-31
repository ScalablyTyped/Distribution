package typings.amapJsApi.AMap

import typings.amapJsApi.AMap.InfoWindow.Anchor
import typings.amapJsApi.amapJsApiStrings.change
import typings.amapJsApi.amapJsApiStrings.close
import typings.amapJsApi.amapJsApiStrings.open
import typings.amapJsApi.anon.Target
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InfoWindow[ExtraData]
  extends StObject
     with Overlay[ExtraData] {
  
  /**
    * 关闭信息窗体
    */
  def close(): Unit = js.native
  
  /**
    * 获取锚点
    */
  def getAnchor(): js.UndefOr[Anchor] = js.native
  
  /**
    * 获取信息窗体内容
    */
  def getContent(): js.UndefOr[String | HTMLElement] = js.native
  
  /**
    * 获取信息窗体是否打开
    */
  def getIsOpen(): Boolean = js.native
  
  /**
    * 获取信息窗体显示基点位置
    */
  def getPosition(): js.UndefOr[LngLat] = js.native
  
  /**
    * 获取信息窗体大小
    */
  def getSize(): js.UndefOr[Size] = js.native
  
  /**
    * 在地图的指定位置打开信息窗体
    * @param map 地图
    * @param position 打开的位置
    */
  def open(map: Map): Unit = js.native
  def open(map: Map, position: LocationValue): Unit = js.native
  
  /**
    * 设置锚点
    * @param anchor 锚点
    */
  def setAnchor(): Unit = js.native
  def setAnchor(anchor: Anchor): Unit = js.native
  
  /**
    * 设置信息窗体内容
    * @param content 窗体内容
    */
  def setContent(content: String): Unit = js.native
  def setContent(content: HTMLElement): Unit = js.native
  
  // internal
  def setOffset(offset: Pixel): Unit = js.native
  
  /**
    * 设置信息窗体显示基点位置
    * @param lnglat 位置经纬度
    */
  def setPosition(lnglat: LocationValue): Unit = js.native
  
  /**
    * 设置信息窗体大小
    * @param size 大小
    */
  def setSize(size: SizeValue): Unit = js.native
}
object InfoWindow {
  
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
    
    @scala.inline
    def `bottom-center`: typings.amapJsApi.amapJsApiStrings.`bottom-center` = "bottom-center".asInstanceOf[typings.amapJsApi.amapJsApiStrings.`bottom-center`]
    
    @scala.inline
    def `bottom-left`: typings.amapJsApi.amapJsApiStrings.`bottom-left` = "bottom-left".asInstanceOf[typings.amapJsApi.amapJsApiStrings.`bottom-left`]
    
    @scala.inline
    def `bottom-right`: typings.amapJsApi.amapJsApiStrings.`bottom-right` = "bottom-right".asInstanceOf[typings.amapJsApi.amapJsApiStrings.`bottom-right`]
    
    @scala.inline
    def center: typings.amapJsApi.amapJsApiStrings.center = "center".asInstanceOf[typings.amapJsApi.amapJsApiStrings.center]
    
    @scala.inline
    def `middle-left`: typings.amapJsApi.amapJsApiStrings.`middle-left` = "middle-left".asInstanceOf[typings.amapJsApi.amapJsApiStrings.`middle-left`]
    
    @scala.inline
    def `middle-right`: typings.amapJsApi.amapJsApiStrings.`middle-right` = "middle-right".asInstanceOf[typings.amapJsApi.amapJsApiStrings.`middle-right`]
    
    @scala.inline
    def `top-center`: typings.amapJsApi.amapJsApiStrings.`top-center` = "top-center".asInstanceOf[typings.amapJsApi.amapJsApiStrings.`top-center`]
    
    @scala.inline
    def `top-left`: typings.amapJsApi.amapJsApiStrings.`top-left` = "top-left".asInstanceOf[typings.amapJsApi.amapJsApiStrings.`top-left`]
    
    @scala.inline
    def `top-right`: typings.amapJsApi.amapJsApiStrings.`top-right` = "top-right".asInstanceOf[typings.amapJsApi.amapJsApiStrings.`top-right`]
  }
  
  trait EventMap[I] extends StObject {
    
    var change: Event_[typings.amapJsApi.amapJsApiStrings.change, Target[I]]
    
    var close: Event_[typings.amapJsApi.amapJsApiStrings.close, Target[I]]
    
    var open: Event_[typings.amapJsApi.amapJsApiStrings.open, Target[I]]
  }
  object EventMap {
    
    @scala.inline
    def apply[I](change: Event_[change, Target[I]], close: Event_[close, Target[I]], open: Event_[open, Target[I]]): EventMap[I] = {
      val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventMap[I]]
    }
    
    @scala.inline
    implicit class EventMapMutableBuilder[Self <: EventMap[?], I] (val x: Self & EventMap[I]) extends AnyVal {
      
      @scala.inline
      def setChange(value: Event_[change, Target[I]]): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClose(value: Event_[close, Target[I]]): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpen(value: Event_[open, Target[I]]): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options[ExtraData]
    extends StObject
       with typings.amapJsApi.AMap.Overlay.Options[ExtraData] {
    
    /**
      * 信息窗体锚点
      */
    var anchor: js.UndefOr[Anchor] = js.undefined
    
    /**
      * 是否自动调整窗体到视野内
      */
    var autoMove: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 控制是否在鼠标点击地图后关闭信息窗体
      */
    var closeWhenClickMap: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 显示内容
      */
    var content: js.UndefOr[String | HTMLElement] = js.undefined
    
    // internal
    var height: js.UndefOr[Double] = js.undefined
    
    /**
      * 是否自定义窗体
      */
    var isCustom: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 信息窗体显示位置偏移量
      */
    var offset: js.UndefOr[Pixel] = js.undefined
    
    /**
      * 信息窗体显示基点位置
      */
    var position: js.UndefOr[LocationValue] = js.undefined
    
    /**
      * 是否显示信息窗体阴影
      */
    var showShadow: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 信息窗体尺寸
      */
    var size: js.UndefOr[SizeValue] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply[ExtraData](): Options[ExtraData] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[ExtraData]]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options[?], ExtraData] (val x: Self & Options[ExtraData]) extends AnyVal {
      
      @scala.inline
      def setAnchor(value: Anchor): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
      
      @scala.inline
      def setAutoMove(value: Boolean): Self = StObject.set(x, "autoMove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoMoveUndefined: Self = StObject.set(x, "autoMove", js.undefined)
      
      @scala.inline
      def setCloseWhenClickMap(value: Boolean): Self = StObject.set(x, "closeWhenClickMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseWhenClickMapUndefined: Self = StObject.set(x, "closeWhenClickMap", js.undefined)
      
      @scala.inline
      def setContent(value: String | HTMLElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setIsCustom(value: Boolean): Self = StObject.set(x, "isCustom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCustomUndefined: Self = StObject.set(x, "isCustom", js.undefined)
      
      @scala.inline
      def setOffset(value: Pixel): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setPosition(value: LocationValue): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setShowShadow(value: Boolean): Self = StObject.set(x, "showShadow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowShadowUndefined: Self = StObject.set(x, "showShadow", js.undefined)
      
      @scala.inline
      def setSize(value: SizeValue): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
