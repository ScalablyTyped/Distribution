package typings.amapJsApi.AMap

import typings.amapJsApi.amapJsApiStrings.click
import typings.amapJsApi.amapJsApiStrings.mousedown
import typings.amapJsApi.amapJsApiStrings.mousemove
import typings.amapJsApi.amapJsApiStrings.mouseout
import typings.amapJsApi.amapJsApiStrings.mouseover
import typings.amapJsApi.amapJsApiStrings.mouseup
import typings.amapJsApi.amapJsApiStrings.touchend
import typings.amapJsApi.amapJsApiStrings.touchstart
import typings.amapJsApi.anon.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelsLayer
  extends StObject
     with Layer {
  
  def add(labelMarker: js.Array[LabelMarker[js.Any]]): Unit = js.native
  /**
    * 图层中添加LabelMarker
    * @param labelMarker 标注对象
    */
  def add(labelMarker: LabelMarker[js.Any]): Unit = js.native
  
  /**
    * 清空图层
    */
  def clear(): Unit = js.native
  
  /**
    * 图层中移除LabelMarker
    * @param labelMarker 标注对象
    */
  def remove(labelMarker: LabelMarker[js.Any]): Unit = js.native
}
object LabelsLayer {
  
  trait EventData extends StObject {
    
    var data: Id
    
    var opts: typings.amapJsApi.anon.Icon
  }
  object EventData {
    
    inline def apply(data: Id, opts: typings.amapJsApi.anon.Icon): EventData = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], opts = opts.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventData]
    }
    
    extension [Self <: EventData](x: Self) {
      
      inline def setData(value: Id): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setOpts(value: typings.amapJsApi.anon.Icon): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
    }
  }
  
  trait EventMap[I] extends StObject {
    
    var click: Event_[typings.amapJsApi.amapJsApiStrings.click, LabelsLayerEvent[I]]
    
    var mousedown: Event_[typings.amapJsApi.amapJsApiStrings.mousedown, LabelsLayerEvent[I]]
    
    var mousemove: Event_[typings.amapJsApi.amapJsApiStrings.mousemove, LabelsLayerEvent[I]]
    
    var mouseout: Event_[typings.amapJsApi.amapJsApiStrings.mouseout, LabelsLayerEvent[I]]
    
    var mouseover: Event_[typings.amapJsApi.amapJsApiStrings.mouseover, LabelsLayerEvent[I]]
    
    var mouseup: Event_[typings.amapJsApi.amapJsApiStrings.mouseup, LabelsLayerEvent[I]]
    
    var touchend: Event_[typings.amapJsApi.amapJsApiStrings.touchend, LabelsLayerEvent[I]]
    
    var touchstart: Event_[typings.amapJsApi.amapJsApiStrings.touchstart, LabelsLayerEvent[I]]
  }
  object EventMap {
    
    inline def apply[I](
      click: Event_[click, LabelsLayerEvent[I]],
      mousedown: Event_[mousedown, LabelsLayerEvent[I]],
      mousemove: Event_[mousemove, LabelsLayerEvent[I]],
      mouseout: Event_[mouseout, LabelsLayerEvent[I]],
      mouseover: Event_[mouseover, LabelsLayerEvent[I]],
      mouseup: Event_[mouseup, LabelsLayerEvent[I]],
      touchend: Event_[touchend, LabelsLayerEvent[I]],
      touchstart: Event_[touchstart, LabelsLayerEvent[I]]
    ): EventMap[I] = {
      val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventMap[I]]
    }
    
    extension [Self <: EventMap[?], I](x: Self & EventMap[I]) {
      
      inline def setClick(value: Event_[click, LabelsLayerEvent[I]]): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
      
      inline def setMousedown(value: Event_[mousedown, LabelsLayerEvent[I]]): Self = StObject.set(x, "mousedown", value.asInstanceOf[js.Any])
      
      inline def setMousemove(value: Event_[mousemove, LabelsLayerEvent[I]]): Self = StObject.set(x, "mousemove", value.asInstanceOf[js.Any])
      
      inline def setMouseout(value: Event_[mouseout, LabelsLayerEvent[I]]): Self = StObject.set(x, "mouseout", value.asInstanceOf[js.Any])
      
      inline def setMouseover(value: Event_[mouseover, LabelsLayerEvent[I]]): Self = StObject.set(x, "mouseover", value.asInstanceOf[js.Any])
      
      inline def setMouseup(value: Event_[mouseup, LabelsLayerEvent[I]]): Self = StObject.set(x, "mouseup", value.asInstanceOf[js.Any])
      
      inline def setTouchend(value: Event_[touchend, LabelsLayerEvent[I]]): Self = StObject.set(x, "touchend", value.asInstanceOf[js.Any])
      
      inline def setTouchstart(value: Event_[touchstart, LabelsLayerEvent[I]]): Self = StObject.set(x, "touchstart", value.asInstanceOf[js.Any])
    }
  }
  
  trait LabelsLayerEvent[I] extends StObject {
    
    var data: EventData
    
    var lnglat: LngLat
    
    var pixel: Pixel
    
    var target: I
  }
  object LabelsLayerEvent {
    
    inline def apply[I](data: EventData, lnglat: LngLat, pixel: Pixel, target: I): LabelsLayerEvent[I] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], lnglat = lnglat.asInstanceOf[js.Any], pixel = pixel.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[LabelsLayerEvent[I]]
    }
    
    extension [Self <: LabelsLayerEvent[?], I](x: Self & LabelsLayerEvent[I]) {
      
      inline def setData(value: EventData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setLnglat(value: LngLat): Self = StObject.set(x, "lnglat", value.asInstanceOf[js.Any])
      
      inline def setPixel(value: Pixel): Self = StObject.set(x, "pixel", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: I): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options
    extends StObject
       with typings.amapJsApi.AMap.Layer.Options {
    
    /**
      * 图层的透明度
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /**
      * 图层是否可见
      */
    var visible: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 图层的层级
      */
    var zIndex: js.UndefOr[Double] = js.undefined
    
    var zooms: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
      
      inline def setZooms(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "zooms", value.asInstanceOf[js.Any])
      
      inline def setZoomsUndefined: Self = StObject.set(x, "zooms", js.undefined)
    }
  }
}
