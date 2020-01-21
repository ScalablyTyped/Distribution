package typings.amapJsApiMap3d

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDirections extends js.Object {
  val directions: js.Array[Double]
  val textureIndices: js.Array[Double]
  val vertexIndices: js.Array[Double]
}

object AnonDirections {
  @scala.inline
  def apply(directions: js.Array[Double], textureIndices: js.Array[Double], vertexIndices: js.Array[Double]): AnonDirections = {
    val __obj = js.Dynamic.literal(directions = directions.asInstanceOf[js.Any], textureIndices = textureIndices.asInstanceOf[js.Any], vertexIndices = vertexIndices.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDirections]
  }
}

