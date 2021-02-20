package typings.amapJsApiToolBar

import typings.amapJsApi.AMap.EventEmitter
import typings.amapJsApi.AMap.Event_
import typings.amapJsApi.AMap.LngLat
import typings.amapJsApi.AMap.Marker
import typings.amapJsApi.AMap.Pixel
import typings.amapJsApiToolBar.amapJsApiToolBarStrings.`location-failed`
import typings.amapJsApiToolBar.amapJsApiToolBarStrings.`location-success`
import typings.amapJsApiToolBar.amapJsApiToolBarStrings.hide
import typings.amapJsApiToolBar.amapJsApiToolBarStrings.location
import typings.amapJsApiToolBar.amapJsApiToolBarStrings.show
import typings.amapJsApiToolBar.amapJsApiToolBarStrings.zoomin
import typings.amapJsApiToolBar.amapJsApiToolBarStrings.zoomout
import typings.amapJsApiToolBar.anon.Lnglat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AMap {
  
  @js.native
  trait ToolBar extends EventEmitter {
    
    /**
      * 进行位置定位
      */
    def doLocation(): Unit = js.native
    
    /**
      * 获取上次定位的结果
      */
    def getLocation(): js.UndefOr[LngLat | Null] = js.native
    
    /**
      * 获取工具条相对于地图容器左上角的偏移量
      */
    def getOffset(): Pixel = js.native
    
    /**
      * 隐藏工具条
      */
    def hide(): Unit = js.native
    
    /**
      * 隐藏方向键盘
      */
    def hideDirection(): Unit = js.native
    
    /**
      * 隐藏定位小部件
      */
    def hideLocation(): Unit = js.native
    
    /**
      * 隐藏缩放级别等级条
      */
    def hideRuler(): Unit = js.native
    
    /**
      * 设置工具条相对于地图容器左上角的偏移量
      * @param offset 偏移量
      */
    def setOffset(offset: Pixel): Unit = js.native
    
    /**
      * 显示工具条
      */
    def show(): Unit = js.native
    
    /**
      * 显示方向键盘
      */
    def showDirection(): Unit = js.native
    
    /**
      * 显示定位小部件
      */
    def showLocation(): Unit = js.native
    
    /**
      * 显示缩放级别等级条
      */
    def showRuler(): Unit = js.native
  }
  object ToolBar {
    
    @js.native
    trait EventMap extends StObject {
      
      var hide: Event_[typings.amapJsApiToolBar.amapJsApiToolBarStrings.hide, js.UndefOr[scala.Nothing]] = js.native
      
      var location: Event_[typings.amapJsApiToolBar.amapJsApiToolBarStrings.location, Lnglat] = js.native
      
      // TODO geolocation.getCurrentPosition
      var `location-failed`: Event_[
            typings.amapJsApiToolBar.amapJsApiToolBarStrings.`location-failed`, 
            js.UndefOr[scala.Nothing]
          ] = js.native
      
      // internal
      var `location-success`: Event_[
            typings.amapJsApiToolBar.amapJsApiToolBarStrings.`location-success`, 
            js.UndefOr[scala.Nothing]
          ] = js.native
      
      var show: Event_[typings.amapJsApiToolBar.amapJsApiToolBarStrings.show, js.UndefOr[scala.Nothing]] = js.native
      
      var zoomchanged: Event_[zoomin | zoomout, js.UndefOr[scala.Nothing]] = js.native
    }
    object EventMap {
      
      @scala.inline
      def apply(
        hide: Event_[hide, js.UndefOr[scala.Nothing]],
        location: Event_[location, Lnglat],
        `location-failed`: Event_[`location-failed`, js.UndefOr[scala.Nothing]],
        `location-success`: Event_[`location-success`, js.UndefOr[scala.Nothing]],
        show: Event_[show, js.UndefOr[scala.Nothing]],
        zoomchanged: Event_[zoomin | zoomout, js.UndefOr[scala.Nothing]]
      ): EventMap = {
        val __obj = js.Dynamic.literal(hide = hide.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any], zoomchanged = zoomchanged.asInstanceOf[js.Any])
        __obj.updateDynamic("location-failed")(`location-failed`.asInstanceOf[js.Any])
        __obj.updateDynamic("location-success")(`location-success`.asInstanceOf[js.Any])
        __obj.asInstanceOf[EventMap]
      }
      
      @scala.inline
      implicit class EventMapMutableBuilder[Self <: EventMap] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setHide(value: Event_[hide, js.UndefOr[scala.Nothing]]): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLocation(value: Event_[location, Lnglat]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setLocation-failed`(value: Event_[`location-failed`, js.UndefOr[scala.Nothing]]): Self = StObject.set(x, "location-failed", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setLocation-success`(value: Event_[`location-success`, js.UndefOr[scala.Nothing]]): Self = StObject.set(x, "location-success", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShow(value: Event_[show, js.UndefOr[scala.Nothing]]): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setZoomchanged(value: Event_[zoomin | zoomout, js.UndefOr[scala.Nothing]]): Self = StObject.set(x, "zoomchanged", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Options extends StObject {
      
      /**
        * 是否自动定位，即地图初始化加载完成后，是否自动定位的用户所在地，仅在支持HTML5的浏览器中有效
        */
      var autoPosition: js.UndefOr[Boolean] = js.native
      
      /**
        * 方向键盘是否可见
        */
      var direction: js.UndefOr[Boolean] = js.native
      
      /**
        * 是否使用精简模式
        */
      var liteStyle: js.UndefOr[Boolean] = js.native
      
      /**
        * 是否显示定位按钮
        */
      var locate: js.UndefOr[Boolean] = js.native
      
      /**
        * 自定义定位图标，值为Marker对象
        */
      var locationMarker: js.UndefOr[Marker[_]] = js.native
      
      /**
        * 定位失败后，是否开启IP定位
        */
      var noIpLocate: js.UndefOr[Boolean] = js.native
      
      /**
        * 相对于地图容器左上角的偏移量
        */
      var offset: js.UndefOr[Pixel] = js.native
      
      /**
        * 控件停靠位置
        * LT:左上角;
        * RT:右上角;
        * LB:左下角;
        * RB:右下角;
        */
      var position: js.UndefOr[Position] = js.native
      
      /**
        * 标尺键盘是否可见
        */
      var ruler: js.UndefOr[Boolean] = js.native
      
      // internal
      var timeout: js.UndefOr[Double] = js.native
      
      /**
        * 是否使用高德定位sdk用来辅助优化定位效果
        */
      var useNative: js.UndefOr[Boolean] = js.native
    }
    object Options {
      
      @scala.inline
      def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAutoPosition(value: Boolean): Self = StObject.set(x, "autoPosition", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAutoPositionUndefined: Self = StObject.set(x, "autoPosition", js.undefined)
        
        @scala.inline
        def setDirection(value: Boolean): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
        
        @scala.inline
        def setLiteStyle(value: Boolean): Self = StObject.set(x, "liteStyle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLiteStyleUndefined: Self = StObject.set(x, "liteStyle", js.undefined)
        
        @scala.inline
        def setLocate(value: Boolean): Self = StObject.set(x, "locate", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLocateUndefined: Self = StObject.set(x, "locate", js.undefined)
        
        @scala.inline
        def setLocationMarker(value: Marker[_]): Self = StObject.set(x, "locationMarker", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLocationMarkerUndefined: Self = StObject.set(x, "locationMarker", js.undefined)
        
        @scala.inline
        def setNoIpLocate(value: Boolean): Self = StObject.set(x, "noIpLocate", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNoIpLocateUndefined: Self = StObject.set(x, "noIpLocate", js.undefined)
        
        @scala.inline
        def setOffset(value: Pixel): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
        
        @scala.inline
        def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
        
        @scala.inline
        def setRuler(value: Boolean): Self = StObject.set(x, "ruler", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRulerUndefined: Self = StObject.set(x, "ruler", js.undefined)
        
        @scala.inline
        def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
        
        @scala.inline
        def setUseNative(value: Boolean): Self = StObject.set(x, "useNative", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUseNativeUndefined: Self = StObject.set(x, "useNative", js.undefined)
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.amapJsApiToolBar.amapJsApiToolBarStrings.LT
      - typings.amapJsApiToolBar.amapJsApiToolBarStrings.RT
      - typings.amapJsApiToolBar.amapJsApiToolBarStrings.LB
      - typings.amapJsApiToolBar.amapJsApiToolBarStrings.RB
    */
    trait Position extends StObject
    object Position {
      
      @scala.inline
      def LB: typings.amapJsApiToolBar.amapJsApiToolBarStrings.LB = "LB".asInstanceOf[typings.amapJsApiToolBar.amapJsApiToolBarStrings.LB]
      
      @scala.inline
      def LT: typings.amapJsApiToolBar.amapJsApiToolBarStrings.LT = "LT".asInstanceOf[typings.amapJsApiToolBar.amapJsApiToolBarStrings.LT]
      
      @scala.inline
      def RB: typings.amapJsApiToolBar.amapJsApiToolBarStrings.RB = "RB".asInstanceOf[typings.amapJsApiToolBar.amapJsApiToolBarStrings.RB]
      
      @scala.inline
      def RT: typings.amapJsApiToolBar.amapJsApiToolBarStrings.RT = "RT".asInstanceOf[typings.amapJsApiToolBar.amapJsApiToolBarStrings.RT]
    }
  }
}
