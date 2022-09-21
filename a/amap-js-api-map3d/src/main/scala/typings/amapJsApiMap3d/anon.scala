package typings.amapJsApiMap3d

import typings.amapJsApi.AMap.LngLat
import typings.amapJsApi.AMap.Pixel
import typings.amapJsApiMap3d.AMap.Object3D.MeshLine.Options
import typings.amapJsApiMap3d.amapJsApiMap3dStrings.mesh
import typings.amapJsApiMap3d.amapJsApiMap3dStrings.meter
import typings.amapJsApiMap3d.amapJsApiMap3dStrings.px
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined amap-js-api-map3d.AMap.Geometry3D & { readonly vertexIndices :std.Array<number>,  readonly directions :std.Array<number>,  readonly textureIndices :std.Array<number>} */
  trait Geometry3DreadonlyvertexI extends StObject {
    
    val directions: js.Array[Double]
    
    val textureIndices: js.Array[Double]
    
    val vertexColors: js.Array[Double]
    
    val vertexIndices: js.Array[Double]
    
    val vertexUVs: js.Array[Double]
    
    val vertices: js.Array[Double]
  }
  object Geometry3DreadonlyvertexI {
    
    inline def apply(
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
    
    extension [Self <: Geometry3DreadonlyvertexI](x: Self) {
      
      inline def setDirections(value: js.Array[Double]): Self = StObject.set(x, "directions", value.asInstanceOf[js.Any])
      
      inline def setDirectionsVarargs(value: Double*): Self = StObject.set(x, "directions", js.Array(value*))
      
      inline def setTextureIndices(value: js.Array[Double]): Self = StObject.set(x, "textureIndices", value.asInstanceOf[js.Any])
      
      inline def setTextureIndicesVarargs(value: Double*): Self = StObject.set(x, "textureIndices", js.Array(value*))
      
      inline def setVertexColors(value: js.Array[Double]): Self = StObject.set(x, "vertexColors", value.asInstanceOf[js.Any])
      
      inline def setVertexColorsVarargs(value: Double*): Self = StObject.set(x, "vertexColors", js.Array(value*))
      
      inline def setVertexIndices(value: js.Array[Double]): Self = StObject.set(x, "vertexIndices", value.asInstanceOf[js.Any])
      
      inline def setVertexIndicesVarargs(value: Double*): Self = StObject.set(x, "vertexIndices", js.Array(value*))
      
      inline def setVertexUVs(value: js.Array[Double]): Self = StObject.set(x, "vertexUVs", value.asInstanceOf[js.Any])
      
      inline def setVertexUVsVarargs(value: Double*): Self = StObject.set(x, "vertexUVs", js.Array(value*))
      
      inline def setVertices(value: js.Array[Double]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
      
      inline def setVerticesVarargs(value: Double*): Self = StObject.set(x, "vertices", js.Array(value*))
    }
  }
  
  trait Height extends StObject {
    
    var height: js.UndefOr[Double] = js.undefined
    
    var position: js.UndefOr[Double] = js.undefined
    
    var scale: js.UndefOr[Double] = js.undefined
    
    var scene: js.UndefOr[Double] = js.undefined
  }
  object Height {
    
    inline def apply(): Height = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Height]
    }
    
    extension [Self <: Height](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setScene(value: Double): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
      
      inline def setSceneUndefined: Self = StObject.set(x, "scene", js.undefined)
    }
  }
  
  /* Inlined amap-js-api-map3d.AMap.Geometry3D.Mesh & { readonly vertexNormals :std.Array<number>} */
  trait MeshreadonlyvertexNormals extends StObject {
    
    val faces: js.Array[Double]
    
    val textureIndices: js.Array[Double]
    
    val `type`: mesh
    
    val vertexColors: js.Array[Double]
    
    val vertexNormals: js.Array[Double]
    
    val vertexUVs: js.Array[Double]
    
    val vertices: js.Array[Double]
  }
  object MeshreadonlyvertexNormals {
    
    inline def apply(
      faces: js.Array[Double],
      textureIndices: js.Array[Double],
      vertexColors: js.Array[Double],
      vertexNormals: js.Array[Double],
      vertexUVs: js.Array[Double],
      vertices: js.Array[Double]
    ): MeshreadonlyvertexNormals = {
      val __obj = js.Dynamic.literal(faces = faces.asInstanceOf[js.Any], textureIndices = textureIndices.asInstanceOf[js.Any], vertexColors = vertexColors.asInstanceOf[js.Any], vertexNormals = vertexNormals.asInstanceOf[js.Any], vertexUVs = vertexUVs.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("mesh")
      __obj.asInstanceOf[MeshreadonlyvertexNormals]
    }
    
    extension [Self <: MeshreadonlyvertexNormals](x: Self) {
      
      inline def setFaces(value: js.Array[Double]): Self = StObject.set(x, "faces", value.asInstanceOf[js.Any])
      
      inline def setFacesVarargs(value: Double*): Self = StObject.set(x, "faces", js.Array(value*))
      
      inline def setTextureIndices(value: js.Array[Double]): Self = StObject.set(x, "textureIndices", value.asInstanceOf[js.Any])
      
      inline def setTextureIndicesVarargs(value: Double*): Self = StObject.set(x, "textureIndices", js.Array(value*))
      
      inline def setType(value: mesh): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setVertexColors(value: js.Array[Double]): Self = StObject.set(x, "vertexColors", value.asInstanceOf[js.Any])
      
      inline def setVertexColorsVarargs(value: Double*): Self = StObject.set(x, "vertexColors", js.Array(value*))
      
      inline def setVertexNormals(value: js.Array[Double]): Self = StObject.set(x, "vertexNormals", value.asInstanceOf[js.Any])
      
      inline def setVertexNormalsVarargs(value: Double*): Self = StObject.set(x, "vertexNormals", js.Array(value*))
      
      inline def setVertexUVs(value: js.Array[Double]): Self = StObject.set(x, "vertexUVs", value.asInstanceOf[js.Any])
      
      inline def setVertexUVsVarargs(value: Double*): Self = StObject.set(x, "vertexUVs", js.Array(value*))
      
      inline def setVertices(value: js.Array[Double]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
      
      inline def setVerticesVarargs(value: Double*): Self = StObject.set(x, "vertices", js.Array(value*))
    }
  }
  
  /* Inlined {  unit :'meter' | undefined,   path :std.Array<[number, number]> | std.Array<amap-js-api.AMap.LngLat>} & {  width :number | undefined,   height :number | std.Array<number> | undefined,   color :string | std.Array<number> | undefined} */
  trait unitmeterundefinedpathArr
    extends StObject
       with Options {
    
    var color: js.UndefOr[String | js.Array[Double]] = js.undefined
    
    var height: js.UndefOr[Double | js.Array[Double]] = js.undefined
    
    var path: js.Array[LngLat | (js.Tuple2[Double, Double])]
    
    var unit: js.UndefOr[meter] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object unitmeterundefinedpathArr {
    
    inline def apply(path: js.Array[LngLat | (js.Tuple2[Double, Double])]): unitmeterundefinedpathArr = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[unitmeterundefinedpathArr]
    }
    
    extension [Self <: unitmeterundefinedpathArr](x: Self) {
      
      inline def setColor(value: String | js.Array[Double]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value*))
      
      inline def setHeight(value: Double | js.Array[Double]): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHeightVarargs(value: Double*): Self = StObject.set(x, "height", js.Array(value*))
      
      inline def setPath(value: js.Array[LngLat | (js.Tuple2[Double, Double])]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: (LngLat | (js.Tuple2[Double, Double]))*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setUnit(value: meter): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  /* Inlined {  unit :'px',   path :std.Array<[number, number]> | std.Array<amap-js-api.AMap.Pixel>} & {  width :number | undefined,   height :number | std.Array<number> | undefined,   color :string | std.Array<number> | undefined} */
  trait unitpxpathArraynumbernumb
    extends StObject
       with Options {
    
    var color: js.UndefOr[String | js.Array[Double]] = js.undefined
    
    var height: js.UndefOr[Double | js.Array[Double]] = js.undefined
    
    var path: js.Array[Pixel | (js.Tuple2[Double, Double])]
    
    var unit: px
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object unitpxpathArraynumbernumb {
    
    inline def apply(path: js.Array[Pixel | (js.Tuple2[Double, Double])]): unitpxpathArraynumbernumb = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], unit = "px")
      __obj.asInstanceOf[unitpxpathArraynumbernumb]
    }
    
    extension [Self <: unitpxpathArraynumbernumb](x: Self) {
      
      inline def setColor(value: String | js.Array[Double]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value*))
      
      inline def setHeight(value: Double | js.Array[Double]): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHeightVarargs(value: Double*): Self = StObject.set(x, "height", js.Array(value*))
      
      inline def setPath(value: js.Array[Pixel | (js.Tuple2[Double, Double])]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: (Pixel | (js.Tuple2[Double, Double]))*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setUnit(value: px): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
