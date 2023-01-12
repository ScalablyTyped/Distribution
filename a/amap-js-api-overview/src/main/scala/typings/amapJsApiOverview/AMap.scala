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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AMap {
  
  /**
    * 地图鹰眼插件
    */
  @js.native
  trait OverView[L /* <: TileLayer */]
    extends StObject
       with EventEmitter {
    
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
    
    trait EventMap extends StObject {
      
      var close: Event_[typings.amapJsApiOverview.amapJsApiOverviewStrings.close, Unit]
      
      var hide: Event_[typings.amapJsApiOverview.amapJsApiOverviewStrings.hide, Unit]
      
      var open: Event_[typings.amapJsApiOverview.amapJsApiOverviewStrings.open, Unit]
      
      var show: Event_[typings.amapJsApiOverview.amapJsApiOverviewStrings.show, Unit]
    }
    object EventMap {
      
      inline def apply(
        close: Event_[close, Unit],
        hide: Event_[hide, Unit],
        open: Event_[open, Unit],
        show: Event_[show, Unit]
      ): EventMap = {
        val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], hide = hide.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
        __obj.asInstanceOf[EventMap]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: EventMap] (val x: Self) extends AnyVal {
        
        inline def setClose(value: Event_[close, Unit]): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
        
        inline def setHide(value: Event_[hide, Unit]): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
        
        inline def setOpen(value: Event_[open, Unit]): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
        
        inline def setShow(value: Event_[show, Unit]): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      }
    }
    
    trait Options[L /* <: TileLayer */] extends StObject {
      
      /**
        * 鹰眼是否展开，默认为false
        */
      var isOpen: js.UndefOr[Boolean] = js.undefined
      
      /**
        * 鹰眼窗体中需显示的切片图层
        */
      var tileLayer: js.UndefOr[L] = js.undefined
      
      /**
        * 鹰眼是否显示，默认为true
        */
      var visible: js.UndefOr[Boolean] = js.undefined
    }
    object Options {
      
      inline def apply[L /* <: TileLayer */](): Options[L] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options[L]]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Options[?], L /* <: TileLayer */] (val x: Self & Options[L]) extends AnyVal {
        
        inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
        
        inline def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
        
        inline def setTileLayer(value: L): Self = StObject.set(x, "tileLayer", value.asInstanceOf[js.Any])
        
        inline def setTileLayerUndefined: Self = StObject.set(x, "tileLayer", js.undefined)
        
        inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
        
        inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      }
    }
  }
}
