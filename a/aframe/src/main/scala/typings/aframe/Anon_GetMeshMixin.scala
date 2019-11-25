package typings.aframe

import typings.aframe.aframeMod.Component
import typings.aframe.aframeMod.Entity
import typings.aframe.aframeMod.ObjectMap
import typings.aframe.aframeMod.System
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GetMeshMixin extends js.Object {
  var primitives: ObjectMap[Entity[ObjectMap[Component[_, System[_]]]]]
  def getMeshMixin(): Anon_DefaultComponents
}

object Anon_GetMeshMixin {
  @scala.inline
  def apply(
    getMeshMixin: () => Anon_DefaultComponents,
    primitives: ObjectMap[Entity[ObjectMap[Component[_, System[_]]]]]
  ): Anon_GetMeshMixin = {
    val __obj = js.Dynamic.literal(getMeshMixin = js.Any.fromFunction0(getMeshMixin), primitives = primitives.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_GetMeshMixin]
  }
}

