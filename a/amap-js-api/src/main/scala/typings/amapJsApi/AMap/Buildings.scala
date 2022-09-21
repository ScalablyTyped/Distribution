package typings.amapJsApi.AMap

import typings.amapJsApi.AMap.Buildings.Style
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Buildings
  extends StObject
     with Layer {
  
  /**
    * 按区域设置楼块的颜色
    * @param style 颜色设置
    */
  def setStyle(style: Style): Unit = js.native
}
object Buildings {
  
  trait AreaStyle extends StObject {
    
    var color1: String
    
    var color2: js.UndefOr[String] = js.undefined
    
    var path: js.Array[LocationValue]
    
    var rejectTexture: js.UndefOr[Boolean] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object AreaStyle {
    
    inline def apply(color1: String, path: js.Array[LocationValue]): AreaStyle = {
      val __obj = js.Dynamic.literal(color1 = color1.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[AreaStyle]
    }
    
    extension [Self <: AreaStyle](x: Self) {
      
      inline def setColor1(value: String): Self = StObject.set(x, "color1", value.asInstanceOf[js.Any])
      
      inline def setColor2(value: String): Self = StObject.set(x, "color2", value.asInstanceOf[js.Any])
      
      inline def setColor2Undefined: Self = StObject.set(x, "color2", js.undefined)
      
      inline def setPath(value: js.Array[LocationValue]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: LocationValue*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setRejectTexture(value: Boolean): Self = StObject.set(x, "rejectTexture", value.asInstanceOf[js.Any])
      
      inline def setRejectTextureUndefined: Self = StObject.set(x, "rejectTexture", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait Options
    extends StObject
       with typings.amapJsApi.AMap.Layer.Options {
    
    /**
      * 高度比例系数，可控制3D视图下的楼块高度
      */
    var heightFactor: js.UndefOr[Double] = js.undefined
    
    // inner
    var merge: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 不透明度
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    var sort: js.UndefOr[Boolean] = js.undefined
    
    /**
      *     是否可见
      */
    var visible: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 层级
      */
    var zIndex: js.UndefOr[Double] = js.undefined
    
    /**
      * 可见级别范围
      */
    var zooms: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setHeightFactor(value: Double): Self = StObject.set(x, "heightFactor", value.asInstanceOf[js.Any])
      
      inline def setHeightFactorUndefined: Self = StObject.set(x, "heightFactor", js.undefined)
      
      inline def setMerge(value: Boolean): Self = StObject.set(x, "merge", value.asInstanceOf[js.Any])
      
      inline def setMergeUndefined: Self = StObject.set(x, "merge", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setSort(value: Boolean): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
      
      inline def setZooms(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "zooms", value.asInstanceOf[js.Any])
      
      inline def setZoomsUndefined: Self = StObject.set(x, "zooms", js.undefined)
    }
  }
  
  trait Style extends StObject {
    
    var areas: js.Array[AreaStyle]
    
    var hideWithoutStyle: js.UndefOr[Boolean] = js.undefined
  }
  object Style {
    
    inline def apply(areas: js.Array[AreaStyle]): Style = {
      val __obj = js.Dynamic.literal(areas = areas.asInstanceOf[js.Any])
      __obj.asInstanceOf[Style]
    }
    
    extension [Self <: Style](x: Self) {
      
      inline def setAreas(value: js.Array[AreaStyle]): Self = StObject.set(x, "areas", value.asInstanceOf[js.Any])
      
      inline def setAreasVarargs(value: AreaStyle*): Self = StObject.set(x, "areas", js.Array(value*))
      
      inline def setHideWithoutStyle(value: Boolean): Self = StObject.set(x, "hideWithoutStyle", value.asInstanceOf[js.Any])
      
      inline def setHideWithoutStyleUndefined: Self = StObject.set(x, "hideWithoutStyle", js.undefined)
    }
  }
}
