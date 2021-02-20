package typings.amapJsApiMap3d.AMap

import typings.amapJsApi.AMap.LngLat
import typings.amapJsApi.AMap.Pixel
import typings.amapJsApiMap3d.anon.Color
import typings.amapJsApiMap3d.anon.Geometry3DreadonlyvertexI
import typings.amapJsApiMap3d.anon.MeshreadonlyvertexNormals
import typings.amapJsApiMap3d.anon.Path
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Object3D extends StObject {
  
  var DEPTH_TEST: Boolean = js.native
  
  val geometry: Geometry3D = js.native
  
  var needUpdate: Boolean = js.native
  
  def reDraw(): Unit = js.native
  
  // internal
  def reset(): Unit = js.native
  
  var textures: js.Array[String | HTMLCanvasElement] = js.native
  
  var transparent: Boolean = js.native
}
object Object3D {
  
  @scala.inline
  def apply(
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
  
  @js.native
  trait Line extends Object3D {
    
    @JSName("geometry")
    val geometry_Line: typings.amapJsApiMap3d.AMap.Geometry3D.Line = js.native
  }
  object Line {
    
    @scala.inline
    def apply(
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
    implicit class LineMutableBuilder[Self <: Line] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGeometry(value: typings.amapJsApiMap3d.AMap.Geometry3D.Line): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Mesh extends Object3D {
    
    @JSName("geometry")
    val geometry_Mesh: typings.amapJsApiMap3d.AMap.Geometry3D.Mesh = js.native
  }
  object Mesh {
    
    @scala.inline
    def apply(
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
    implicit class MeshMutableBuilder[Self <: Mesh] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGeometry(value: typings.amapJsApiMap3d.AMap.Geometry3D.Mesh): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MeshAcceptLights extends Mesh {
    
    @JSName("geometry")
    val geometry_MeshAcceptLights: MeshreadonlyvertexNormals = js.native
  }
  object MeshAcceptLights {
    
    @scala.inline
    def apply(
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
    implicit class MeshAcceptLightsMutableBuilder[Self <: MeshAcceptLights] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGeometry(value: MeshreadonlyvertexNormals): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    }
  }
  
  // inherit from WideLine
  @js.native
  trait MeshLine extends Object3D {
    
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
    
    type Options = Color with (Path | typings.amapJsApiMap3d.anon.Unit)
  }
  
  @scala.inline
  implicit class Object3DMutableBuilder[Self <: Object3D] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDEPTH_TEST(value: Boolean): Self = StObject.set(x, "DEPTH_TEST", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometry(value: Geometry3D): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeedUpdate(value: Boolean): Self = StObject.set(x, "needUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReDraw(value: () => Unit): Self = StObject.set(x, "reDraw", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTextures(value: js.Array[String | HTMLCanvasElement]): Self = StObject.set(x, "textures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTexturesVarargs(value: (String | HTMLCanvasElement)*): Self = StObject.set(x, "textures", js.Array(value :_*))
    
    @scala.inline
    def setTransparent(value: Boolean): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Points extends Object3D {
    
    var borderColor: String = js.native
    
    var borderWeight: Double = js.native
    
    @JSName("geometry")
    val geometry_Points: typings.amapJsApiMap3d.AMap.Geometry3D.Points = js.native
  }
  object Points {
    
    @scala.inline
    def apply(
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
    implicit class PointsMutableBuilder[Self <: Points] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderWeight(value: Double): Self = StObject.set(x, "borderWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeometry(value: typings.amapJsApiMap3d.AMap.Geometry3D.Points): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    }
  }
  
  object Prism {
    
    @js.native
    trait Options extends StObject {
      
      var color: String | (js.Array[js.Array[Double] | Double | String]) = js.native
      
      var color2: js.UndefOr[String | (js.Array[js.Array[Double] | Double | String])] = js.native
      
      var height: js.UndefOr[Double] = js.native
      
      var path: js.Array[(js.Array[LngLat | Pixel | (js.Tuple2[Double, Double])]) | LngLat | Pixel] = js.native
    }
    object Options {
      
      @scala.inline
      def apply(
        color: String | (js.Array[js.Array[Double] | Double | String]),
        path: js.Array[(js.Array[LngLat | Pixel | (js.Tuple2[Double, Double])]) | LngLat | Pixel]
      ): Options = {
        val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setColor(value: String | (js.Array[js.Array[Double] | Double | String])): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColor2(value: String | (js.Array[js.Array[Double] | Double | String])): Self = StObject.set(x, "color2", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColor2Undefined: Self = StObject.set(x, "color2", js.undefined)
        
        @scala.inline
        def setColor2Varargs(value: (js.Array[Double] | Double | String)*): Self = StObject.set(x, "color2", js.Array(value :_*))
        
        @scala.inline
        def setColorVarargs(value: (js.Array[Double] | Double | String)*): Self = StObject.set(x, "color", js.Array(value :_*))
        
        @scala.inline
        def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
        
        @scala.inline
        def setPath(value: js.Array[(js.Array[LngLat | Pixel | (js.Tuple2[Double, Double])]) | LngLat | Pixel]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPathVarargs(value: ((js.Array[LngLat | Pixel | (js.Tuple2[Double, Double])]) | LngLat | Pixel)*): Self = StObject.set(x, "path", js.Array(value :_*))
      }
    }
  }
  type Prism = MeshAcceptLights
  
  @js.native
  trait RoundPoints extends Points {
    
    var merge: Boolean = js.native
  }
  object RoundPoints {
    
    @scala.inline
    def apply(
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
    implicit class RoundPointsMutableBuilder[Self <: RoundPoints] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMerge(value: Boolean): Self = StObject.set(x, "merge", value.asInstanceOf[js.Any])
    }
  }
  
  object ThinLine {
    
    @js.native
    trait Options extends StObject {
      
      var altitude: js.UndefOr[Double] = js.native
      
      var color: String = js.native
      
      var dashArray: js.UndefOr[js.Array[Double]] = js.native
      
      var path: js.Array[js.Tuple2[Double, Double]] = js.native
    }
    object Options {
      
      @scala.inline
      def apply(color: String, path: js.Array[js.Tuple2[Double, Double]]): Options = {
        val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAltitude(value: Double): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAltitudeUndefined: Self = StObject.set(x, "altitude", js.undefined)
        
        @scala.inline
        def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDashArray(value: js.Array[Double]): Self = StObject.set(x, "dashArray", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDashArrayUndefined: Self = StObject.set(x, "dashArray", js.undefined)
        
        @scala.inline
        def setDashArrayVarargs(value: Double*): Self = StObject.set(x, "dashArray", js.Array(value :_*))
        
        @scala.inline
        def setPath(value: js.Array[js.Tuple2[Double, Double]]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPathVarargs(value: (js.Tuple2[Double, Double])*): Self = StObject.set(x, "path", js.Array(value :_*))
      }
    }
  }
  type ThinLine = Line
  
  type Wall = Prism
}
