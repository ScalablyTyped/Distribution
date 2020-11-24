package typings.amapJsApiMap3d.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined amap-js-api-map3d.AMap.Geometry3D & { readonly vertexIndices :std.Array<number>,  readonly directions :std.Array<number>,  readonly textureIndices :std.Array<number>} */
@js.native
trait Geometry3DreadonlyvertexI extends js.Object {
  
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
  implicit class Geometry3DreadonlyvertexIOps[Self <: Geometry3DreadonlyvertexI] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDirectionsVarargs(value: Double*): Self = this.set("directions", js.Array(value :_*))
    
    @scala.inline
    def setDirections(value: js.Array[Double]): Self = this.set("directions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextureIndicesVarargs(value: Double*): Self = this.set("textureIndices", js.Array(value :_*))
    
    @scala.inline
    def setTextureIndices(value: js.Array[Double]): Self = this.set("textureIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertexColorsVarargs(value: Double*): Self = this.set("vertexColors", js.Array(value :_*))
    
    @scala.inline
    def setVertexColors(value: js.Array[Double]): Self = this.set("vertexColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertexIndicesVarargs(value: Double*): Self = this.set("vertexIndices", js.Array(value :_*))
    
    @scala.inline
    def setVertexIndices(value: js.Array[Double]): Self = this.set("vertexIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertexUVsVarargs(value: Double*): Self = this.set("vertexUVs", js.Array(value :_*))
    
    @scala.inline
    def setVertexUVs(value: js.Array[Double]): Self = this.set("vertexUVs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticesVarargs(value: Double*): Self = this.set("vertices", js.Array(value :_*))
    
    @scala.inline
    def setVertices(value: js.Array[Double]): Self = this.set("vertices", value.asInstanceOf[js.Any])
  }
}
