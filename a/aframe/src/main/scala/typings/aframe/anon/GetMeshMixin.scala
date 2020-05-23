package typings.aframe.anon

import typings.aframe.mod.Component
import typings.aframe.mod.Entity
import typings.aframe.mod.ObjectMap
import typings.aframe.mod.System
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMeshMixin extends js.Object {
  var primitives: ObjectMap[Entity[ObjectMap[Component[_, System[_]]]]]
  def getMeshMixin(): DefaultComponents
}

object GetMeshMixin {
  @scala.inline
  def apply(
    getMeshMixin: () => DefaultComponents,
    primitives: ObjectMap[Entity[ObjectMap[Component[_, System[_]]]]]
  ): GetMeshMixin = {
    val __obj = js.Dynamic.literal(getMeshMixin = js.Any.fromFunction0(getMeshMixin), primitives = primitives.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMeshMixin]
  }
}

