package typings.amapJsApi.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelMarker[ExtraData]
  extends StObject
     with Overlay[ExtraData] {
  
  // should be void
  // internal
  def getBounds(): Bounds = js.native
  
  /**
    * 获取透明度
    */
  def getOpacity(): Double = js.native
  
  /**
    * 获取标注位置
    */
  def getPosition(): js.Tuple2[Double | String, Double | String] = js.native
  
  /**
    * 获取显示级别范围
    */
  def getZooms(): js.Tuple2[Double, Double] = js.native
  
  /**
    * 设置透明度
    * @param opacity 透明度
    */
  def setOpacity(opacity: Double): Unit = js.native
  
  /**
    * 设置标注位置
    * @param position 标注位置
    */
  def setPosition(position: js.Tuple2[Double, Double]): Unit = js.native
  
  /**
    * 设置显示级别范围
    * @param zooms 显示级别范围
    */
  def setZooms(zooms: js.Tuple2[Double, Double]): Unit = js.native
}
object LabelMarker {
  
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
  
  type EventMap[I] = typings.amapJsApi.AMap.LabelsLayer.EventMap[I]
  
  /* Rewritten from type alias, can be one of: 
    - typings.amapJsApi.amapJsApiStrings.normal
    - typings.amapJsApi.amapJsApiStrings.thin
    - typings.amapJsApi.amapJsApiStrings.bold
  */
  trait FontWeight extends StObject
  object FontWeight {
    
    inline def bold: typings.amapJsApi.amapJsApiStrings.bold = "bold".asInstanceOf[typings.amapJsApi.amapJsApiStrings.bold]
    
    inline def normal: typings.amapJsApi.amapJsApiStrings.normal = "normal".asInstanceOf[typings.amapJsApi.amapJsApiStrings.normal]
    
    inline def thin: typings.amapJsApi.amapJsApiStrings.thin = "thin".asInstanceOf[typings.amapJsApi.amapJsApiStrings.thin]
  }
  
  trait IconOptions extends StObject {
    
    var anchor: js.UndefOr[Anchor] = js.undefined
    
    // internal
    var angel: js.UndefOr[Double] = js.undefined
    
    // unsupport Pixel in v1.4.14
    var clipOrigin: js.UndefOr[js.Array[Double] | Pixel] = js.undefined
    
    var clipSize: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
    
    var image: js.UndefOr[String] = js.undefined
    
    var retina: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[js.Array[Double] | Size] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var zooms: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  }
  object IconOptions {
    
    inline def apply(): IconOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IconOptions]
    }
    
    extension [Self <: IconOptions](x: Self) {
      
      inline def setAnchor(value: Anchor): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
      
      inline def setAngel(value: Double): Self = StObject.set(x, "angel", value.asInstanceOf[js.Any])
      
      inline def setAngelUndefined: Self = StObject.set(x, "angel", js.undefined)
      
      inline def setClipOrigin(value: js.Array[Double] | Pixel): Self = StObject.set(x, "clipOrigin", value.asInstanceOf[js.Any])
      
      inline def setClipOriginUndefined: Self = StObject.set(x, "clipOrigin", js.undefined)
      
      inline def setClipOriginVarargs(value: Double*): Self = StObject.set(x, "clipOrigin", js.Array(value :_*))
      
      inline def setClipSize(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "clipSize", value.asInstanceOf[js.Any])
      
      inline def setClipSizeUndefined: Self = StObject.set(x, "clipSize", js.undefined)
      
      inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setRetina(value: Boolean): Self = StObject.set(x, "retina", value.asInstanceOf[js.Any])
      
      inline def setRetinaUndefined: Self = StObject.set(x, "retina", js.undefined)
      
      inline def setSize(value: js.Array[Double] | Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSizeVarargs(value: Double*): Self = StObject.set(x, "size", js.Array(value :_*))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setZooms(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "zooms", value.asInstanceOf[js.Any])
      
      inline def setZoomsUndefined: Self = StObject.set(x, "zooms", js.undefined)
    }
  }
  
  trait Options[ExtraData]
    extends StObject
       with typings.amapJsApi.AMap.Overlay.Options[ExtraData] {
    
    var icon: js.UndefOr[IconOptions] = js.undefined
    
    var opacity: js.UndefOr[Double] = js.undefined
    
    var position: js.UndefOr[String | LocationValue] = js.undefined
    
    var rank: js.UndefOr[Double] = js.undefined
    
    var text: js.UndefOr[TextOptions] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    // internal
    var zIndex: js.UndefOr[Double] = js.undefined
    
    var zooms: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  }
  object Options {
    
    inline def apply[ExtraData](): Options[ExtraData] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[ExtraData]]
    }
    
    extension [Self <: Options[?], ExtraData](x: Self & Options[ExtraData]) {
      
      inline def setIcon(value: IconOptions): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setPosition(value: String | LocationValue): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setRank(value: Double): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
      
      inline def setRankUndefined: Self = StObject.set(x, "rank", js.undefined)
      
      inline def setText(value: TextOptions): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
      
      inline def setZooms(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "zooms", value.asInstanceOf[js.Any])
      
      inline def setZoomsUndefined: Self = StObject.set(x, "zooms", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.amapJsApi.amapJsApiStrings.top
    - typings.amapJsApi.amapJsApiStrings.right
    - typings.amapJsApi.amapJsApiStrings.bottom
    - typings.amapJsApi.amapJsApiStrings.left
    - typings.amapJsApi.amapJsApiStrings.center
  */
  trait TextDirection extends StObject
  object TextDirection {
    
    inline def bottom: typings.amapJsApi.amapJsApiStrings.bottom = "bottom".asInstanceOf[typings.amapJsApi.amapJsApiStrings.bottom]
    
    inline def center: typings.amapJsApi.amapJsApiStrings.center = "center".asInstanceOf[typings.amapJsApi.amapJsApiStrings.center]
    
    inline def left: typings.amapJsApi.amapJsApiStrings.left = "left".asInstanceOf[typings.amapJsApi.amapJsApiStrings.left]
    
    inline def right: typings.amapJsApi.amapJsApiStrings.right = "right".asInstanceOf[typings.amapJsApi.amapJsApiStrings.right]
    
    inline def top: typings.amapJsApi.amapJsApiStrings.top = "top".asInstanceOf[typings.amapJsApi.amapJsApiStrings.top]
  }
  
  trait TextOptions extends StObject {
    
    var content: js.UndefOr[String] = js.undefined
    
    var direction: js.UndefOr[TextDirection] = js.undefined
    
    var offset: js.UndefOr[Pixel | (js.Tuple2[Double, Double])] = js.undefined
    
    var style: js.UndefOr[TextStyle] = js.undefined
    
    var zooms: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  }
  object TextOptions {
    
    inline def apply(): TextOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextOptions]
    }
    
    extension [Self <: TextOptions](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setDirection(value: TextDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setOffset(value: Pixel | (js.Tuple2[Double, Double])): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setStyle(value: TextStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setZooms(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "zooms", value.asInstanceOf[js.Any])
      
      inline def setZoomsUndefined: Self = StObject.set(x, "zooms", js.undefined)
    }
  }
  
  trait TextStyle extends StObject {
    
    var fillColor: js.UndefOr[String] = js.undefined
    
    var fontFamily: js.UndefOr[String] = js.undefined
    
    var fontSize: js.UndefOr[Double] = js.undefined
    
    var fontWeight: js.UndefOr[FontWeight] = js.undefined
    
    var strokeColor: js.UndefOr[String] = js.undefined
    
    var strokeWidth: js.UndefOr[Double] = js.undefined
  }
  object TextStyle {
    
    inline def apply(): TextStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextStyle]
    }
    
    extension [Self <: TextStyle](x: Self) {
      
      inline def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
      
      inline def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setFontWeight(value: FontWeight): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setStrokeColor(value: String): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
      
      inline def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
      
      inline def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
    }
  }
}
