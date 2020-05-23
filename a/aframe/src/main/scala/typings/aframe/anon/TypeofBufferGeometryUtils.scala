package typings.aframe.anon

import typings.three.bufferAttributeMod.BufferAttribute
import typings.three.bufferGeometryMod.BufferGeometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofBufferGeometryUtils extends js.Object {
  def computeTangents(geometry: BufferGeometry): Null
  def mergeBufferAttributes(attributes: js.Array[BufferAttribute]): BufferAttribute
  def mergeBufferGeometries(geometries: js.Array[BufferGeometry]): BufferGeometry
}

object TypeofBufferGeometryUtils {
  @scala.inline
  def apply(
    computeTangents: BufferGeometry => Null,
    mergeBufferAttributes: js.Array[BufferAttribute] => BufferAttribute,
    mergeBufferGeometries: js.Array[BufferGeometry] => BufferGeometry
  ): TypeofBufferGeometryUtils = {
    val __obj = js.Dynamic.literal(computeTangents = js.Any.fromFunction1(computeTangents), mergeBufferAttributes = js.Any.fromFunction1(mergeBufferAttributes), mergeBufferGeometries = js.Any.fromFunction1(mergeBufferGeometries))
    __obj.asInstanceOf[TypeofBufferGeometryUtils]
  }
}

