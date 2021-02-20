package typings.amapJsApiOverview

import typings.amapJsApi.AMap.EventEmitter
import typings.amapJsApi.AMap.Event_
import typings.amapJsApi.AMap.TileLayer
import typings.amapJsApiOverview.amapJsApiOverviewStrings.close
import typings.amapJsApiOverview.amapJsApiOverviewStrings.hide
import typings.amapJsApiOverview.amapJsApiOverviewStrings.open
import typings.amapJsApiOverview.amapJsApiOverviewStrings.show
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AMap {
  
  /**
    * 地图鹰眼插件
    */
  @js.native
  trait OverView[L /* <: TileLayer */] extends EventEmitter {
    
    /***
      * 折叠鹰眼窗口
      */
    def close(): Unit = js.native
    
    /**
      * 获取窗体中显示的切片图层
      */
    def getTileLayer(): L = js.native
    
    /**
      * 隐藏鹰眼窗体
      */
    def hide(): Unit = js.native
    
    /**
      * 展开鹰眼窗口
      */
    def open(): Unit = js.native
    
    /**
      * 设置鹰眼中需显示的切片图层
      * @param tileLayer 切片图层
      */
    def setTileLayer(tileLayer: L): Unit = js.native
    
    /**
      * 显示鹰眼窗体
      */
    def show(): Unit = js.native
  }
  object OverView {
    
    @js.native
    trait EventMap extends StObject {
      
      var close: Event_[
            typings.amapJsApiOverview.amapJsApiOverviewStrings.close, 
            js.UndefOr[scala.Nothing]
          ] = js.native
      
      var hide: Event_[typings.amapJsApiOverview.amapJsApiOverviewStrings.hide, js.UndefOr[scala.Nothing]] = js.native
      
      var open: Event_[typings.amapJsApiOverview.amapJsApiOverviewStrings.open, js.UndefOr[scala.Nothing]] = js.native
      
      var show: Event_[typings.amapJsApiOverview.amapJsApiOverviewStrings.show, js.UndefOr[scala.Nothing]] = js.native
    }
    object EventMap {
      
      @scala.inline
      def apply(
        close: Event_[close, js.UndefOr[scala.Nothing]],
        hide: Event_[hide, js.UndefOr[scala.Nothing]],
        open: Event_[open, js.UndefOr[scala.Nothing]],
        show: Event_[show, js.UndefOr[scala.Nothing]]
      ): EventMap = {
        val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], hide = hide.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
        __obj.asInstanceOf[EventMap]
      }
      
      @scala.inline
      implicit class EventMapMutableBuilder[Self <: EventMap] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setClose(value: Event_[close, js.UndefOr[scala.Nothing]]): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHide(value: Event_[hide, js.UndefOr[scala.Nothing]]): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOpen(value: Event_[open, js.UndefOr[scala.Nothing]]): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShow(value: Event_[show, js.UndefOr[scala.Nothing]]): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Options[L /* <: TileLayer */] extends StObject {
      
      /**
        * 鹰眼是否展开，默认为false
        */
      var isOpen: js.UndefOr[Boolean] = js.native
      
      /**
        * 鹰眼窗体中需显示的切片图层
        */
      var tileLayer: js.UndefOr[L] = js.native
      
      /**
        * 鹰眼是否显示，默认为true
        */
      var visible: js.UndefOr[Boolean] = js.native
    }
    object Options {
      
      @scala.inline
      def apply[L /* <: TileLayer */](): Options[L] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options[L]]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options[_], L /* <: TileLayer */] (val x: Self with Options[L]) extends AnyVal {
        
        @scala.inline
        def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
        
        @scala.inline
        def setTileLayer(value: L): Self = StObject.set(x, "tileLayer", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTileLayerUndefined: Self = StObject.set(x, "tileLayer", js.undefined)
        
        @scala.inline
        def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      }
    }
  }
}
