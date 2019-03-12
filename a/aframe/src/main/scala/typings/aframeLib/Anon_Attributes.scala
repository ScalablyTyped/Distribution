package typings
package aframeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attributes extends js.Object {
  def computeTangents(geometry: threeLib.threeDashCoreMod.BufferGeometry): scala.Null
  def mergeBufferAttributes(attributes: js.Array[threeLib.threeDashCoreMod.BufferAttribute]): threeLib.threeDashCoreMod.BufferAttribute
  def mergeBufferGeometries(geometries: js.Array[threeLib.threeDashCoreMod.BufferGeometry]): threeLib.threeDashCoreMod.BufferGeometry
}

object Anon_Attributes {
  @scala.inline
  def apply(
    computeTangents: threeLib.threeDashCoreMod.BufferGeometry => scala.Null,
    mergeBufferAttributes: js.Array[threeLib.threeDashCoreMod.BufferAttribute] => threeLib.threeDashCoreMod.BufferAttribute,
    mergeBufferGeometries: js.Array[threeLib.threeDashCoreMod.BufferGeometry] => threeLib.threeDashCoreMod.BufferGeometry
  ): Anon_Attributes = {
    val __obj = js.Dynamic.literal(computeTangents = js.Any.fromFunction1(computeTangents), mergeBufferAttributes = js.Any.fromFunction1(mergeBufferAttributes), mergeBufferGeometries = js.Any.fromFunction1(mergeBufferGeometries))
  
    __obj.asInstanceOf[Anon_Attributes]
  }
}

