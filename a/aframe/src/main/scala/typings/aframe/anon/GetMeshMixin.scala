package typings.aframe.anon

import typings.aframe.mod.Component
import typings.aframe.mod.Entity
import typings.aframe.mod.ObjectMap
import typings.aframe.mod.System
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetMeshMixin extends js.Object {
  
  def getMeshMixin(): DefaultComponents = js.native
  
  var primitives: ObjectMap[Entity[ObjectMap[Component[_, System[_]]]]] = js.native
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
  
  @scala.inline
  implicit class GetMeshMixinOps[Self <: GetMeshMixin] (val x: Self) extends AnyVal {
    
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
    def setGetMeshMixin(value: () => DefaultComponents): Self = this.set("getMeshMixin", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPrimitives(value: ObjectMap[Entity[ObjectMap[Component[_, System[_]]]]]): Self = this.set("primitives", value.asInstanceOf[js.Any])
  }
}
