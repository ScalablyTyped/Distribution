package typings.amapJsApiMap3d.AMap

import typings.amapJsApiMap3d.amapJsApiMap3dStrings.line
import typings.amapJsApiMap3d.amapJsApiMap3dStrings.mesh
import typings.amapJsApiMap3d.amapJsApiMap3dStrings.points
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Geometry3D extends StObject {
  
  val vertexColors: js.Array[Double]
  
  val vertexUVs: js.Array[Double]
  
  val vertices: js.Array[Double]
}
object Geometry3D {
  
  @scala.inline
  def apply(vertexColors: js.Array[Double], vertexUVs: js.Array[Double], vertices: js.Array[Double]): Geometry3D = {
    val __obj = js.Dynamic.literal(vertexColors = vertexColors.asInstanceOf[js.Any], vertexUVs = vertexUVs.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometry3D]
  }
  
  @scala.inline
  implicit class Geometry3DMutableBuilder[Self <: Geometry3D] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVertexColors(value: js.Array[Double]): Self = StObject.set(x, "vertexColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertexColorsVarargs(value: Double*): Self = StObject.set(x, "vertexColors", js.Array(value :_*))
    
    @scala.inline
    def setVertexUVs(value: js.Array[Double]): Self = StObject.set(x, "vertexUVs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertexUVsVarargs(value: Double*): Self = StObject.set(x, "vertexUVs", js.Array(value :_*))
    
    @scala.inline
    def setVertices(value: js.Array[Double]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticesVarargs(value: Double*): Self = StObject.set(x, "vertices", js.Array(value :_*))
  }
  
  trait Line
    extends StObject
       with Geometry3D {
    
    val segments: js.Array[Double]
    
    val textureIndices: js.Array[Double]
    
    val `type`: line
  }
  object Line {
    
    @scala.inline
    def apply(
      segments: js.Array[Double],
      textureIndices: js.Array[Double],
      vertexColors: js.Array[Double],
      vertexUVs: js.Array[Double],
      vertices: js.Array[Double]
    ): Line = {
      val __obj = js.Dynamic.literal(segments = segments.asInstanceOf[js.Any], textureIndices = textureIndices.asInstanceOf[js.Any], vertexColors = vertexColors.asInstanceOf[js.Any], vertexUVs = vertexUVs.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("line")
      __obj.asInstanceOf[Line]
    }
    
    @scala.inline
    implicit class LineMutableBuilder[Self <: Line] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSegments(value: js.Array[Double]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegmentsVarargs(value: Double*): Self = StObject.set(x, "segments", js.Array(value :_*))
      
      @scala.inline
      def setTextureIndices(value: js.Array[Double]): Self = StObject.set(x, "textureIndices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextureIndicesVarargs(value: Double*): Self = StObject.set(x, "textureIndices", js.Array(value :_*))
      
      @scala.inline
      def setType(value: line): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Mesh
    extends StObject
       with Geometry3D {
    
    val faces: js.Array[Double]
    
    val textureIndices: js.Array[Double]
    
    val `type`: mesh
  }
  object Mesh {
    
    @scala.inline
    def apply(
      faces: js.Array[Double],
      textureIndices: js.Array[Double],
      vertexColors: js.Array[Double],
      vertexUVs: js.Array[Double],
      vertices: js.Array[Double]
    ): Mesh = {
      val __obj = js.Dynamic.literal(faces = faces.asInstanceOf[js.Any], textureIndices = textureIndices.asInstanceOf[js.Any], vertexColors = vertexColors.asInstanceOf[js.Any], vertexUVs = vertexUVs.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("mesh")
      __obj.asInstanceOf[Mesh]
    }
    
    @scala.inline
    implicit class MeshMutableBuilder[Self <: Mesh] (val x: Self) extends AnyVal {
      
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
    }
  }
  
  trait Points
    extends StObject
       with Geometry3D {
    
    val pointAreas: js.Array[Double]
    
    val pointSizes: js.Array[Double]
    
    val textureIndices: js.Array[Double]
    
    val `type`: points
  }
  object Points {
    
    @scala.inline
    def apply(
      pointAreas: js.Array[Double],
      pointSizes: js.Array[Double],
      textureIndices: js.Array[Double],
      vertexColors: js.Array[Double],
      vertexUVs: js.Array[Double],
      vertices: js.Array[Double]
    ): Points = {
      val __obj = js.Dynamic.literal(pointAreas = pointAreas.asInstanceOf[js.Any], pointSizes = pointSizes.asInstanceOf[js.Any], textureIndices = textureIndices.asInstanceOf[js.Any], vertexColors = vertexColors.asInstanceOf[js.Any], vertexUVs = vertexUVs.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("points")
      __obj.asInstanceOf[Points]
    }
    
    @scala.inline
    implicit class PointsMutableBuilder[Self <: Points] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPointAreas(value: js.Array[Double]): Self = StObject.set(x, "pointAreas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointAreasVarargs(value: Double*): Self = StObject.set(x, "pointAreas", js.Array(value :_*))
      
      @scala.inline
      def setPointSizes(value: js.Array[Double]): Self = StObject.set(x, "pointSizes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointSizesVarargs(value: Double*): Self = StObject.set(x, "pointSizes", js.Array(value :_*))
      
      @scala.inline
      def setTextureIndices(value: js.Array[Double]): Self = StObject.set(x, "textureIndices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextureIndicesVarargs(value: Double*): Self = StObject.set(x, "textureIndices", js.Array(value :_*))
      
      @scala.inline
      def setType(value: points): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
