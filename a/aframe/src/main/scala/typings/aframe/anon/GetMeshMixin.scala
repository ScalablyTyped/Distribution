package typings.aframe.anon

import typings.aframe.mod.Component
import typings.aframe.mod.Entity
import typings.aframe.mod.ObjectMap
import typings.aframe.mod.System
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetMeshMixin extends StObject {
  
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
  implicit class GetMeshMixinMutableBuilder[Self <: GetMeshMixin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetMeshMixin(value: () => DefaultComponents): Self = StObject.set(x, "getMeshMixin", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPrimitives(value: ObjectMap[Entity[ObjectMap[Component[_, System[_]]]]]): Self = StObject.set(x, "primitives", value.asInstanceOf[js.Any])
  }
}
