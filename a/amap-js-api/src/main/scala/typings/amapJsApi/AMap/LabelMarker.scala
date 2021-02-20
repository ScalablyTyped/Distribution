package typings.amapJsApi.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelMarker[ExtraData] extends Overlay[ExtraData] {
  
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
  
  type EventMap[I] = typings.amapJsApi.AMap.LabelsLayer.EventMap[I]
  
  /* Rewritten from type alias, can be one of: 
    - typings.amapJsApi.amapJsApiStrings.normal
    - typings.amapJsApi.amapJsApiStrings.thin
    - typings.amapJsApi.amapJsApiStrings.bold
  */
  trait FontWeight extends StObject
  object FontWeight {
    
    @scala.inline
    def bold: typings.amapJsApi.amapJsApiStrings.bold = "bold".asInstanceOf[typings.amapJsApi.amapJsApiStrings.bold]
    
    @scala.inline
    def normal: typings.amapJsApi.amapJsApiStrings.normal = "normal".asInstanceOf[typings.amapJsApi.amapJsApiStrings.normal]
    
    @scala.inline
    def thin: typings.amapJsApi.amapJsApiStrings.thin = "thin".asInstanceOf[typings.amapJsApi.amapJsApiStrings.thin]
  }
  
  @js.native
  trait IconOptions extends StObject {
    
    var anchor: js.UndefOr[Anchor] = js.native
    
    // internal
    var angel: js.UndefOr[Double] = js.native
    
    // unsupport Pixel in v1.4.14
    var clipOrigin: js.UndefOr[js.Array[Double] | Pixel] = js.native
    
    var clipSize: js.UndefOr[js.Tuple2[Double, Double]] = js.native
    
    var image: js.UndefOr[String] = js.native
    
    var retina: js.UndefOr[Boolean] = js.native
    
    var size: js.UndefOr[js.Array[Double] | Size] = js.native
    
    var `type`: js.UndefOr[String] = js.native
    
    var zooms: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  }
  object IconOptions {
    
    @scala.inline
    def apply(): IconOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IconOptions]
    }
    
    @scala.inline
    implicit class IconOptionsMutableBuilder[Self <: IconOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnchor(value: Anchor): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
      
      @scala.inline
      def setAngel(value: Double): Self = StObject.set(x, "angel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAngelUndefined: Self = StObject.set(x, "angel", js.undefined)
      
      @scala.inline
      def setClipOrigin(value: js.Array[Double] | Pixel): Self = StObject.set(x, "clipOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipOriginUndefined: Self = StObject.set(x, "clipOrigin", js.undefined)
      
      @scala.inline
      def setClipOriginVarargs(value: Double*): Self = StObject.set(x, "clipOrigin", js.Array(value :_*))
      
      @scala.inline
      def setClipSize(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "clipSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipSizeUndefined: Self = StObject.set(x, "clipSize", js.undefined)
      
      @scala.inline
      def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      @scala.inline
      def setRetina(value: Boolean): Self = StObject.set(x, "retina", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetinaUndefined: Self = StObject.set(x, "retina", js.undefined)
      
      @scala.inline
      def setSize(value: js.Array[Double] | Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSizeVarargs(value: Double*): Self = StObject.set(x, "size", js.Array(value :_*))
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setZooms(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "zooms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomsUndefined: Self = StObject.set(x, "zooms", js.undefined)
    }
  }
  
  @js.native
  trait Options[ExtraData]
    extends typings.amapJsApi.AMap.Overlay.Options[ExtraData] {
    
    var icon: js.UndefOr[IconOptions] = js.native
    
    var opacity: js.UndefOr[Double] = js.native
    
    var position: js.UndefOr[String | LocationValue] = js.native
    
    var rank: js.UndefOr[Double] = js.native
    
    var text: js.UndefOr[TextOptions] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    // internal
    var zIndex: js.UndefOr[Double] = js.native
    
    var zooms: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply[ExtraData](): Options[ExtraData] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[ExtraData]]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options[_], ExtraData] (val x: Self with Options[ExtraData]) extends AnyVal {
      
      @scala.inline
      def setIcon(value: IconOptions): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setPosition(value: String | LocationValue): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setRank(value: Double): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRankUndefined: Self = StObject.set(x, "rank", js.undefined)
      
      @scala.inline
      def setText(value: TextOptions): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
      
      @scala.inline
      def setZooms(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "zooms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomsUndefined: Self = StObject.set(x, "zooms", js.undefined)
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
    
    @scala.inline
    def bottom: typings.amapJsApi.amapJsApiStrings.bottom = "bottom".asInstanceOf[typings.amapJsApi.amapJsApiStrings.bottom]
    
    @scala.inline
    def center: typings.amapJsApi.amapJsApiStrings.center = "center".asInstanceOf[typings.amapJsApi.amapJsApiStrings.center]
    
    @scala.inline
    def left: typings.amapJsApi.amapJsApiStrings.left = "left".asInstanceOf[typings.amapJsApi.amapJsApiStrings.left]
    
    @scala.inline
    def right: typings.amapJsApi.amapJsApiStrings.right = "right".asInstanceOf[typings.amapJsApi.amapJsApiStrings.right]
    
    @scala.inline
    def top: typings.amapJsApi.amapJsApiStrings.top = "top".asInstanceOf[typings.amapJsApi.amapJsApiStrings.top]
  }
  
  @js.native
  trait TextOptions extends StObject {
    
    var content: js.UndefOr[String] = js.native
    
    var direction: js.UndefOr[TextDirection] = js.native
    
    var offset: js.UndefOr[Pixel | (js.Tuple2[Double, Double])] = js.native
    
    var style: js.UndefOr[TextStyle] = js.native
    
    var zooms: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  }
  object TextOptions {
    
    @scala.inline
    def apply(): TextOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextOptions]
    }
    
    @scala.inline
    implicit class TextOptionsMutableBuilder[Self <: TextOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setDirection(value: TextDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setOffset(value: Pixel | (js.Tuple2[Double, Double])): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setStyle(value: TextStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setZooms(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "zooms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomsUndefined: Self = StObject.set(x, "zooms", js.undefined)
    }
  }
  
  @js.native
  trait TextStyle extends StObject {
    
    var fillColor: js.UndefOr[String] = js.native
    
    var fontFamily: js.UndefOr[String] = js.native
    
    var fontSize: js.UndefOr[Double] = js.native
    
    var fontWeight: js.UndefOr[FontWeight] = js.native
    
    var strokeColor: js.UndefOr[String] = js.native
    
    var strokeWidth: js.UndefOr[Double] = js.native
  }
  object TextStyle {
    
    @scala.inline
    def apply(): TextStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextStyle]
    }
    
    @scala.inline
    implicit class TextStyleMutableBuilder[Self <: TextStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setFontWeight(value: FontWeight): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      @scala.inline
      def setStrokeColor(value: String): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
      
      @scala.inline
      def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
    }
  }
}
