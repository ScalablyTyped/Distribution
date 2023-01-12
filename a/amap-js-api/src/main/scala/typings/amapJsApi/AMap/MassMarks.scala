package typings.amapJsApi.AMap

import typings.amapJsApi.AMap.MassMarks.Data
import typings.amapJsApi.AMap.MassMarks.Style
import typings.amapJsApi.amapJsApiStrings.click
import typings.amapJsApi.amapJsApiStrings.dblclick
import typings.amapJsApi.amapJsApiStrings.lnglat
import typings.amapJsApi.amapJsApiStrings.mousedown
import typings.amapJsApi.amapJsApiStrings.mouseout
import typings.amapJsApi.amapJsApiStrings.mouseover
import typings.amapJsApi.amapJsApiStrings.mouseup
import typings.amapJsApi.amapJsApiStrings.touchend
import typings.amapJsApi.amapJsApiStrings.touchstart
import typings.amapJsApi.anon.LnglatLngLat
import typings.std.Exclude
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MassMarks[D /* <: Data */]
  extends StObject
     with Layer {
  
  /**
    * 清除海量点
    */
  def clear(): Unit = js.native
  
  /**
    * 获取数据集
    */
  def getData(): js.Array[(Pick[D, Exclude[/* keyof D */ String, lnglat]]) & LnglatLngLat] = js.native
  
  /**
    * 获取显示样式
    */
  def getStyle(): Style | js.Array[Style] = js.native
  
  def setData(data: String): Unit = js.native
  /**
    * 设置数据集
    * @param data 数据集
    */
  def setData(data: js.Array[D]): Unit = js.native
  
  def setStyle(style: js.Array[Style]): Unit = js.native
  /**
    * 设置显示样式
    * @param style 样式设置
    */
  def setStyle(style: Style): Unit = js.native
}
object MassMarks {
  
  trait Data extends StObject {
    
    var lnglat: LocationValue
    
    var style: js.UndefOr[Double] = js.undefined
  }
  object Data {
    
    inline def apply(lnglat: LocationValue): Data = {
      val __obj = js.Dynamic.literal(lnglat = lnglat.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      inline def setLnglat(value: LocationValue): Self = StObject.set(x, "lnglat", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: Double): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait EventMap[I] extends StObject {
    
    var click: UIEvent[typings.amapJsApi.amapJsApiStrings.click, I]
    
    var dblclick: UIEvent[typings.amapJsApi.amapJsApiStrings.dblclick, I]
    
    var mousedown: UIEvent[typings.amapJsApi.amapJsApiStrings.mousedown, I]
    
    var mouseout: UIEvent[typings.amapJsApi.amapJsApiStrings.mouseout, I]
    
    var mouseover: UIEvent[typings.amapJsApi.amapJsApiStrings.mouseover, I]
    
    var mouseup: UIEvent[typings.amapJsApi.amapJsApiStrings.mouseup, I]
    
    var touchend: UIEvent[typings.amapJsApi.amapJsApiStrings.touchend, I]
    
    var touchstart: UIEvent[typings.amapJsApi.amapJsApiStrings.touchstart, I]
  }
  object EventMap {
    
    inline def apply[I](
      click: UIEvent[click, I],
      dblclick: UIEvent[dblclick, I],
      mousedown: UIEvent[mousedown, I],
      mouseout: UIEvent[mouseout, I],
      mouseover: UIEvent[mouseover, I],
      mouseup: UIEvent[mouseup, I],
      touchend: UIEvent[touchend, I],
      touchstart: UIEvent[touchstart, I]
    ): EventMap[I] = {
      val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventMap[I]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventMap[?], I] (val x: Self & EventMap[I]) extends AnyVal {
      
      inline def setClick(value: UIEvent[click, I]): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
      
      inline def setDblclick(value: UIEvent[dblclick, I]): Self = StObject.set(x, "dblclick", value.asInstanceOf[js.Any])
      
      inline def setMousedown(value: UIEvent[mousedown, I]): Self = StObject.set(x, "mousedown", value.asInstanceOf[js.Any])
      
      inline def setMouseout(value: UIEvent[mouseout, I]): Self = StObject.set(x, "mouseout", value.asInstanceOf[js.Any])
      
      inline def setMouseover(value: UIEvent[mouseover, I]): Self = StObject.set(x, "mouseover", value.asInstanceOf[js.Any])
      
      inline def setMouseup(value: UIEvent[mouseup, I]): Self = StObject.set(x, "mouseup", value.asInstanceOf[js.Any])
      
      inline def setTouchend(value: UIEvent[touchend, I]): Self = StObject.set(x, "touchend", value.asInstanceOf[js.Any])
      
      inline def setTouchstart(value: UIEvent[touchstart, I]): Self = StObject.set(x, "touchstart", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options
    extends StObject
       with typings.amapJsApi.AMap.Layer.Options {
    
    /**
      * 是否在拖拽缩放过程中实时重绘
      */
    var alwayRender: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 指针样式
      */
    var cursor: js.UndefOr[String] = js.undefined
    
    /**
      * 设置点的样式
      */
    var style: Style | js.Array[Style]
    
    /**
      * 显示层级
      */
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(style: Style | js.Array[Style]): Options = {
      val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAlwayRender(value: Boolean): Self = StObject.set(x, "alwayRender", value.asInstanceOf[js.Any])
      
      inline def setAlwayRenderUndefined: Self = StObject.set(x, "alwayRender", js.undefined)
      
      inline def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
      
      inline def setStyle(value: Style | js.Array[Style]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleVarargs(value: Style*): Self = StObject.set(x, "style", js.Array(value*))
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  trait Style extends StObject {
    
    /**
      * 图标显示位置偏移量，以图标的左上角为基准点（0,0）点
      */
    var anchor: Pixel
    
    /**
      * 旋转角度
      */
    var rotation: js.UndefOr[Double] = js.undefined
    
    /**
      * 图标的尺寸
      */
    var size: Size
    
    /**
      * 图标的地址
      */
    var url: String
  }
  object Style {
    
    inline def apply(anchor: Pixel, size: Size, url: String): Style = {
      val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Style]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Style] (val x: Self) extends AnyVal {
      
      inline def setAnchor(value: Pixel): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  type UIEvent[N /* <: String */, I] = Event_[N, typings.amapJsApi.anon.Data[I]]
}
