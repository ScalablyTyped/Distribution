package typings.aframe.mod.global.AFRAME

import typings.aframe.anon.DefaultComponents
import typings.aframe.mod.Component
import typings.aframe.mod.Entity
import typings.aframe.mod.ObjectMap
import typings.aframe.mod.System
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("AFRAME.primitives")
@js.native
object primitives extends js.Object {
  
  def getMeshMixin(): DefaultComponents = js.native
  
  var primitives: ObjectMap[Entity[ObjectMap[Component[_, System[_]]]]] = js.native
}
