package typings.amapJsApiMap3d

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined amap-js-api-map3d.AMap.Geometry3D & { readonly vertexIndices  :std.Array<number>,  readonly directions  :std.Array<number>,  readonly textureIndices  :std.Array<number>} */
trait Geometry3DreadonlyvertexI extends js.Object {
  val directions: js.Array[Double]
  val textureIndices: js.Array[Double]
  val vertexColors: js.Array[Double]
  val vertexIndices: js.Array[Double]
  val vertexUVs: js.Array[Double]
  val vertices: js.Array[Double]
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
}

