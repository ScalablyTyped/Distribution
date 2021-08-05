package typings.aframe.anon

import typings.aframe.mod.Component
import typings.aframe.mod.Entity
import typings.aframe.mod.ObjectMap
import typings.aframe.mod.System
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMeshMixin extends StObject {
  
  def getMeshMixin(): DefaultComponents
  
  var primitives: ObjectMap[Entity[ObjectMap[Component[js.Any, System[js.Any]]]]]
}
object GetMeshMixin {
  
  inline def apply(
    getMeshMixin: () => DefaultComponents,
    primitives: ObjectMap[Entity[ObjectMap[Component[js.Any, System[js.Any]]]]]
  ): GetMeshMixin = {
    val __obj = js.Dynamic.literal(getMeshMixin = js.Any.fromFunction0(getMeshMixin), primitives = primitives.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMeshMixin]
  }
  
  extension [Self <: GetMeshMixin](x: Self) {
    
    inline def setGetMeshMixin(value: () => DefaultComponents): Self = StObject.set(x, "getMeshMixin", js.Any.fromFunction0(value))
    
    inline def setPrimitives(value: ObjectMap[Entity[ObjectMap[Component[js.Any, System[js.Any]]]]]): Self = StObject.set(x, "primitives", value.asInstanceOf[js.Any])
  }
}
