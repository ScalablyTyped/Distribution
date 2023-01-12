package typings.amapJsApiMap3d.AMap

import typings.amapJsApi.AMap.LngLat
import typings.amapJsApi.AMap.Pixel
import typings.amapJsApiMap3d.anon.Geometry3DreadonlyvertexI
import typings.amapJsApiMap3d.anon.MeshreadonlyvertexNormals
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Object3D extends StObject {
  
  var DEPTH_TEST: Boolean
  
  val geometry: Geometry3D
  
  var needUpdate: Boolean
  
  def reDraw(): Unit
  
  // internal
  def reset(): Unit
  
  var textures: js.Array[String | HTMLCanvasElement]
  
  var transparent: Boolean
}
object Object3D {
  
  inline def apply(
    DEPTH_TEST: Boolean,
    geometry: Geometry3D,
    needUpdate: Boolean,
    reDraw: () => Unit,
    reset: () => Unit,
    textures: js.Array[String | HTMLCanvasElement],
    transparent: Boolean
  ): Object3D = {
    val __obj = js.Dynamic.literal(DEPTH_TEST = DEPTH_TEST.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], needUpdate = needUpdate.asInstanceOf[js.Any], reDraw = js.Any.fromFunction0(reDraw), reset = js.Any.fromFunction0(reset), textures = textures.asInstanceOf[js.Any], transparent = transparent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Object3D]
  }
  
  trait Line
    extends StObject
       with Object3D {
    
    @JSName("geometry")
    val geometry_Line: typings.amapJsApiMap3d.AMap.Geometry3D.Line
  }
  object Line {
    
    inline def apply(
      DEPTH_TEST: Boolean,
      geometry: typings.amapJsApiMap3d.AMap.Geometry3D.Line,
      needUpdate: Boolean,
      reDraw: () => Unit,
      reset: () => Unit,
      textures: js.Array[String | HTMLCanvasElement],
      transparent: Boolean
    ): Line = {
      val __obj = js.Dynamic.literal(DEPTH_TEST = DEPTH_TEST.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], needUpdate = needUpdate.asInstanceOf[js.Any], reDraw = js.Any.fromFunction0(reDraw), reset = js.Any.fromFunction0(reset), textures = textures.asInstanceOf[js.Any], transparent = transparent.asInstanceOf[js.Any])
      __obj.asInstanceOf[Line]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Line] (val x: Self) extends AnyVal {
      
      inline def setGeometry(value: typings.amapJsApiMap3d.AMap.Geometry3D.Line): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    }
  }
  
  trait Mesh
    extends StObject
       with Object3D {
    
    @JSName("geometry")
    val geometry_Mesh: typings.amapJsApiMap3d.AMap.Geometry3D.Mesh
  }
  object Mesh {
    
    inline def apply(
      DEPTH_TEST: Boolean,
      geometry: typings.amapJsApiMap3d.AMap.Geometry3D.Mesh,
      needUpdate: Boolean,
      reDraw: () => Unit,
      reset: () => Unit,
      textures: js.Array[String | HTMLCanvasElement],
      transparent: Boolean
    ): Mesh = {
      val __obj = js.Dynamic.literal(DEPTH_TEST = DEPTH_TEST.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], needUpdate = needUpdate.asInstanceOf[js.Any], reDraw = js.Any.fromFunction0(reDraw), reset = js.Any.fromFunction0(reset), textures = textures.asInstanceOf[js.Any], transparent = transparent.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mesh]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Mesh] (val x: Self) extends AnyVal {
      
      inline def setGeometry(value: typings.amapJsApiMap3d.AMap.Geometry3D.Mesh): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    }
  }
  
  trait MeshAcceptLights
    extends StObject
       with Mesh {
    
    @JSName("geometry")
    val geometry_MeshAcceptLights: MeshreadonlyvertexNormals
  }
  object MeshAcceptLights {
    
    inline def apply(
      DEPTH_TEST: Boolean,
      geometry: MeshreadonlyvertexNormals,
      needUpdate: Boolean,
      reDraw: () => Unit,
      reset: () => Unit,
      textures: js.Array[String | HTMLCanvasElement],
      transparent: Boolean
    ): MeshAcceptLights = {
      val __obj = js.Dynamic.literal(DEPTH_TEST = DEPTH_TEST.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], needUpdate = needUpdate.asInstanceOf[js.Any], reDraw = js.Any.fromFunction0(reDraw), reset = js.Any.fromFunction0(reset), textures = textures.asInstanceOf[js.Any], transparent = transparent.asInstanceOf[js.Any])
      __obj.asInstanceOf[MeshAcceptLights]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MeshAcceptLights] (val x: Self) extends AnyVal {
      
      inline def setGeometry(value: MeshreadonlyvertexNormals): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    }
  }
  
  // inherit from WideLine
  @js.native
  trait MeshLine
    extends StObject
       with Object3D {
    
    @JSName("geometry")
    val geometry_MeshLine: Geometry3DreadonlyvertexI = js.native
    
    def setColor(color: String): Unit = js.native
    
    def setHeight(height: js.Array[Double]): Unit = js.native
    def setHeight(height: Double): Unit = js.native
    
    def setPath(path: js.Array[LngLat | Pixel | (js.Tuple2[Double, Double])]): Unit = js.native
    
    def setWidth(width: Double): Unit = js.native
    
    var width: Double = js.native
  }
  object MeshLine {
    
    /* Rewritten from type alias, can be one of: 
      - typings.amapJsApiMap3d.anon.unitmeterundefinedpathArr
      - typings.amapJsApiMap3d.anon.unitpxpathArraynumbernumb
    */
    trait Options extends StObject
    object Options {
      
      inline def unitmeterundefinedpathArr(path: js.Array[LngLat | (js.Tuple2[Double, Double])]): typings.amapJsApiMap3d.anon.unitmeterundefinedpathArr = {
        val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.amapJsApiMap3d.anon.unitmeterundefinedpathArr]
      }
      
      inline def unitpxpathArraynumbernumb(path: js.Array[Pixel | (js.Tuple2[Double, Double])]): typings.amapJsApiMap3d.anon.unitpxpathArraynumbernumb = {
        val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], unit = "px")
        __obj.asInstanceOf[typings.amapJsApiMap3d.anon.unitpxpathArraynumbernumb]
      }
    }
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Object3D] (val x: Self) extends AnyVal {
    
    inline def setDEPTH_TEST(value: Boolean): Self = StObject.set(x, "DEPTH_TEST", value.asInstanceOf[js.Any])
    
    inline def setGeometry(value: Geometry3D): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    inline def setNeedUpdate(value: Boolean): Self = StObject.set(x, "needUpdate", value.asInstanceOf[js.Any])
    
    inline def setReDraw(value: () => Unit): Self = StObject.set(x, "reDraw", js.Any.fromFunction0(value))
    
    inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    inline def setTextures(value: js.Array[String | HTMLCanvasElement]): Self = StObject.set(x, "textures", value.asInstanceOf[js.Any])
    
    inline def setTexturesVarargs(value: (String | HTMLCanvasElement)*): Self = StObject.set(x, "textures", js.Array(value*))
    
    inline def setTransparent(value: Boolean): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
  }
  
  trait Points
    extends StObject
       with Object3D {
    
    var borderColor: String
    
    var borderWeight: Double
    
    @JSName("geometry")
    val geometry_Points: typings.amapJsApiMap3d.AMap.Geometry3D.Points
  }
  object Points {
    
    inline def apply(
      DEPTH_TEST: Boolean,
      borderColor: String,
      borderWeight: Double,
      geometry: typings.amapJsApiMap3d.AMap.Geometry3D.Points,
      needUpdate: Boolean,
      reDraw: () => Unit,
      reset: () => Unit,
      textures: js.Array[String | HTMLCanvasElement],
      transparent: Boolean
    ): Points = {
      val __obj = js.Dynamic.literal(DEPTH_TEST = DEPTH_TEST.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderWeight = borderWeight.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], needUpdate = needUpdate.asInstanceOf[js.Any], reDraw = js.Any.fromFunction0(reDraw), reset = js.Any.fromFunction0(reset), textures = textures.asInstanceOf[js.Any], transparent = transparent.asInstanceOf[js.Any])
      __obj.asInstanceOf[Points]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Points] (val x: Self) extends AnyVal {
      
      inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      inline def setBorderWeight(value: Double): Self = StObject.set(x, "borderWeight", value.asInstanceOf[js.Any])
      
      inline def setGeometry(value: typings.amapJsApiMap3d.AMap.Geometry3D.Points): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    }
  }
  
  object Prism {
    
    trait Options extends StObject {
      
      var color: String | (js.Array[js.Array[Double] | Double | String])
      
      var color2: js.UndefOr[String | (js.Array[js.Array[Double] | Double | String])] = js.undefined
      
      var height: js.UndefOr[Double] = js.undefined
      
      var path: js.Array[(js.Array[LngLat | Pixel | (js.Tuple2[Double, Double])]) | LngLat | Pixel]
    }
    object Options {
      
      inline def apply(
        color: String | (js.Array[js.Array[Double] | Double | String]),
        path: js.Array[(js.Array[LngLat | Pixel | (js.Tuple2[Double, Double])]) | LngLat | Pixel]
      ): Options = {
        val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        inline def setColor(value: String | (js.Array[js.Array[Double] | Double | String])): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
        
        inline def setColor2(value: String | (js.Array[js.Array[Double] | Double | String])): Self = StObject.set(x, "color2", value.asInstanceOf[js.Any])
        
        inline def setColor2Undefined: Self = StObject.set(x, "color2", js.undefined)
        
        inline def setColor2Varargs(value: (js.Array[Double] | Double | String)*): Self = StObject.set(x, "color2", js.Array(value*))
        
        inline def setColorVarargs(value: (js.Array[Double] | Double | String)*): Self = StObject.set(x, "color", js.Array(value*))
        
        inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
        
        inline def setPath(value: js.Array[(js.Array[LngLat | Pixel | (js.Tuple2[Double, Double])]) | LngLat | Pixel]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        inline def setPathVarargs(value: ((js.Array[LngLat | Pixel | (js.Tuple2[Double, Double])]) | LngLat | Pixel)*): Self = StObject.set(x, "path", js.Array(value*))
      }
    }
  }
  type Prism = MeshAcceptLights
  
  trait RoundPoints
    extends StObject
       with Points {
    
    var merge: Boolean
  }
  object RoundPoints {
    
    inline def apply(
      DEPTH_TEST: Boolean,
      borderColor: String,
      borderWeight: Double,
      geometry: typings.amapJsApiMap3d.AMap.Geometry3D.Points,
      merge: Boolean,
      needUpdate: Boolean,
      reDraw: () => Unit,
      reset: () => Unit,
      textures: js.Array[String | HTMLCanvasElement],
      transparent: Boolean
    ): RoundPoints = {
      val __obj = js.Dynamic.literal(DEPTH_TEST = DEPTH_TEST.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderWeight = borderWeight.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], merge = merge.asInstanceOf[js.Any], needUpdate = needUpdate.asInstanceOf[js.Any], reDraw = js.Any.fromFunction0(reDraw), reset = js.Any.fromFunction0(reset), textures = textures.asInstanceOf[js.Any], transparent = transparent.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoundPoints]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RoundPoints] (val x: Self) extends AnyVal {
      
      inline def setMerge(value: Boolean): Self = StObject.set(x, "merge", value.asInstanceOf[js.Any])
    }
  }
  
  object ThinLine {
    
    trait Options extends StObject {
      
      var altitude: js.UndefOr[Double] = js.undefined
      
      var color: String
      
      var dashArray: js.UndefOr[js.Array[Double]] = js.undefined
      
      var path: js.Array[js.Tuple2[Double, Double]]
    }
    object Options {
      
      inline def apply(color: String, path: js.Array[js.Tuple2[Double, Double]]): Options = {
        val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        inline def setAltitude(value: Double): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
        
        inline def setAltitudeUndefined: Self = StObject.set(x, "altitude", js.undefined)
        
        inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
        
        inline def setDashArray(value: js.Array[Double]): Self = StObject.set(x, "dashArray", value.asInstanceOf[js.Any])
        
        inline def setDashArrayUndefined: Self = StObject.set(x, "dashArray", js.undefined)
        
        inline def setDashArrayVarargs(value: Double*): Self = StObject.set(x, "dashArray", js.Array(value*))
        
        inline def setPath(value: js.Array[js.Tuple2[Double, Double]]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        inline def setPathVarargs(value: (js.Tuple2[Double, Double])*): Self = StObject.set(x, "path", js.Array(value*))
      }
    }
  }
  type ThinLine = Line
  
  type Wall = Prism
}
