package typings.amapJsApiMap3d.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Geometry3D_ extends js.Object {
  
  val vertexColors: js.Array[Double] = js.native
  
  val vertexUVs: js.Array[Double] = js.native
  
  val vertices: js.Array[Double] = js.native
}
object Geometry3D_ {
  
  @scala.inline
  def apply(vertexColors: js.Array[Double], vertexUVs: js.Array[Double], vertices: js.Array[Double]): Geometry3D_ = {
    val __obj = js.Dynamic.literal(vertexColors = vertexColors.asInstanceOf[js.Any], vertexUVs = vertexUVs.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometry3D_]
  }
  
  @scala.inline
  implicit class Geometry3D_Ops[Self <: Geometry3D_] (val x: Self) extends AnyVal {
    
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
    def setVertexColorsVarargs(value: Double*): Self = this.set("vertexColors", js.Array(value :_*))
    
    @scala.inline
    def setVertexColors(value: js.Array[Double]): Self = this.set("vertexColors", value.asInstanceOf[js.Any])
    
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
