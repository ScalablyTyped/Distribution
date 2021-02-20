package typings.amapJsApiMap3d

import typings.amapJsApi.AMap.LngLat
import typings.amapJsApi.AMap.Pixel
import typings.amapJsApiMap3d.amapJsApiMap3dStrings.mesh
import typings.amapJsApiMap3d.amapJsApiMap3dStrings.meter
import typings.amapJsApiMap3d.amapJsApiMap3dStrings.px
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Color extends StObject {
    
    var color: js.UndefOr[String | js.Array[Double]] = js.native
    
    var height: js.UndefOr[Double | js.Array[Double]] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object Color {
    
    @scala.inline
    def apply(): Color = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Color]
    }
    
    @scala.inline
    implicit class ColorMutableBuilder[Self <: Color] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String | js.Array[Double]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value :_*))
      
      @scala.inline
      def setHeight(value: Double | js.Array[Double]): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHeightVarargs(value: Double*): Self = StObject.set(x, "height", js.Array(value :_*))
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  /* Inlined amap-js-api-map3d.AMap.Geometry3D & { readonly vertexIndices :std.Array<number>,  readonly directions :std.Array<number>,  readonly textureIndices :std.Array<number>} */
  @js.native
  trait Geometry3DreadonlyvertexI extends StObject {
    
    val directions: js.Array[Double] = js.native
    
    val textureIndices: js.Array[Double] = js.native
    
    val vertexColors: js.Array[Double] = js.native
    
    val vertexIndices: js.Array[Double] = js.native
    
    val vertexUVs: js.Array[Double] = js.native
    
    val vertices: js.Array[Double] = js.native
  }
  object Geometry3DreadonlyvertexI {
    
    @scala.inline
    def apply(
      directions: js.Array[Double],
      textureIndices: js.Array[Double],
      vertexColors: js.Array[Double],
      vertexIndices: js.Array[Double],
      vertexUVs: js.Array[Double],
      vertices: js.Array[Double]
    ): Geometry3DreadonlyvertexI = {
      val __obj = js.Dynamic.literal(directions = directions.asInstanceOf[js.Any], textureIndices = textureIndices.asInstanceOf[js.Any], vertexColors = vertexColors.asInstanceOf[js.Any], vertexIndices = vertexIndices.asInstanceOf[js.Any], vertexUVs = vertexUVs.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
      __obj.asInstanceOf[Geometry3DreadonlyvertexI]
    }
    
    @scala.inline
    implicit class Geometry3DreadonlyvertexIMutableBuilder[Self <: Geometry3DreadonlyvertexI] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirections(value: js.Array[Double]): Self = StObject.set(x, "directions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionsVarargs(value: Double*): Self = StObject.set(x, "directions", js.Array(value :_*))
      
      @scala.inline
      def setTextureIndices(value: js.Array[Double]): Self = StObject.set(x, "textureIndices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextureIndicesVarargs(value: Double*): Self = StObject.set(x, "textureIndices", js.Array(value :_*))
      
      @scala.inline
      def setVertexColors(value: js.Array[Double]): Self = StObject.set(x, "vertexColors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertexColorsVarargs(value: Double*): Self = StObject.set(x, "vertexColors", js.Array(value :_*))
      
      @scala.inline
      def setVertexIndices(value: js.Array[Double]): Self = StObject.set(x, "vertexIndices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertexIndicesVarargs(value: Double*): Self = StObject.set(x, "vertexIndices", js.Array(value :_*))
      
      @scala.inline
      def setVertexUVs(value: js.Array[Double]): Self = StObject.set(x, "vertexUVs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertexUVsVarargs(value: Double*): Self = StObject.set(x, "vertexUVs", js.Array(value :_*))
      
      @scala.inline
      def setVertices(value: js.Array[Double]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticesVarargs(value: Double*): Self = StObject.set(x, "vertices", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Height extends StObject {
    
    var height: js.UndefOr[Double] = js.native
    
    var position: js.UndefOr[Double] = js.native
    
    var scale: js.UndefOr[Double] = js.native
    
    var scene: js.UndefOr[Double] = js.native
  }
  object Height {
    
    @scala.inline
    def apply(): Height = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Height]
    }
    
    @scala.inline
    implicit class HeightMutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      @scala.inline
      def setScene(value: Double): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSceneUndefined: Self = StObject.set(x, "scene", js.undefined)
    }
  }
  
  /* Inlined amap-js-api-map3d.AMap.Geometry3D.Mesh & { readonly vertexNormals :std.Array<number>} */
  @js.native
  trait MeshreadonlyvertexNormals extends StObject {
    
    val faces: js.Array[Double] = js.native
    
    val textureIndices: js.Array[Double] = js.native
    
    val `type`: mesh = js.native
    
    val vertexColors: js.Array[Double] = js.native
    
    val vertexNormals: js.Array[Double] = js.native
    
    val vertexUVs: js.Array[Double] = js.native
    
    val vertices: js.Array[Double] = js.native
  }
  object MeshreadonlyvertexNormals {
    
    @scala.inline
    def apply(
      faces: js.Array[Double],
      textureIndices: js.Array[Double],
      `type`: mesh,
      vertexColors: js.Array[Double],
      vertexNormals: js.Array[Double],
      vertexUVs: js.Array[Double],
      vertices: js.Array[Double]
    ): MeshreadonlyvertexNormals = {
      val __obj = js.Dynamic.literal(faces = faces.asInstanceOf[js.Any], textureIndices = textureIndices.asInstanceOf[js.Any], vertexColors = vertexColors.asInstanceOf[js.Any], vertexNormals = vertexNormals.asInstanceOf[js.Any], vertexUVs = vertexUVs.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MeshreadonlyvertexNormals]
    }
    
    @scala.inline
    implicit class MeshreadonlyvertexNormalsMutableBuilder[Self <: MeshreadonlyvertexNormals] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFaces(value: js.Array[Double]): Self = StObject.set(x, "faces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFacesVarargs(value: Double*): Self = StObject.set(x, "faces", js.Array(value :_*))
      
      @scala.inline
      def setTextureIndices(value: js.Array[Double]): Self = StObject.set(x, "textureIndices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextureIndicesVarargs(value: Double*): Self = StObject.set(x, "textureIndices", js.Array(value :_*))
      
      @scala.inline
      def setType(value: mesh): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertexColors(value: js.Array[Double]): Self = StObject.set(x, "vertexColors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertexColorsVarargs(value: Double*): Self = StObject.set(x, "vertexColors", js.Array(value :_*))
      
      @scala.inline
      def setVertexNormals(value: js.Array[Double]): Self = StObject.set(x, "vertexNormals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertexNormalsVarargs(value: Double*): Self = StObject.set(x, "vertexNormals", js.Array(value :_*))
      
      @scala.inline
      def setVertexUVs(value: js.Array[Double]): Self = StObject.set(x, "vertexUVs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertexUVsVarargs(value: Double*): Self = StObject.set(x, "vertexUVs", js.Array(value :_*))
      
      @scala.inline
      def setVertices(value: js.Array[Double]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticesVarargs(value: Double*): Self = StObject.set(x, "vertices", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Path extends StObject {
    
    var path: js.Array[LngLat | (js.Tuple2[Double, Double])] = js.native
    
    var unit: js.UndefOr[meter] = js.native
  }
  object Path {
    
    @scala.inline
    def apply(path: js.Array[LngLat | (js.Tuple2[Double, Double])]): Path = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Path]
    }
    
    @scala.inline
    implicit class PathMutableBuilder[Self <: Path] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPath(value: js.Array[LngLat | (js.Tuple2[Double, Double])]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathVarargs(value: (LngLat | (js.Tuple2[Double, Double]))*): Self = StObject.set(x, "path", js.Array(value :_*))
      
      @scala.inline
      def setUnit(value: meter): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    }
  }
  
  @js.native
  trait Unit extends StObject {
    
    var path: js.Array[Pixel | (js.Tuple2[Double, Double])] = js.native
    
    var unit: px = js.native
  }
  object Unit {
    
    @scala.inline
    def apply(path: js.Array[Pixel | (js.Tuple2[Double, Double])], unit: px): Unit = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
      __obj.asInstanceOf[Unit]
    }
    
    @scala.inline
    implicit class UnitMutableBuilder[Self <: Unit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPath(value: js.Array[Pixel | (js.Tuple2[Double, Double])]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathVarargs(value: (Pixel | (js.Tuple2[Double, Double]))*): Self = StObject.set(x, "path", js.Array(value :_*))
      
      @scala.inline
      def setUnit(value: px): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    }
  }
}
