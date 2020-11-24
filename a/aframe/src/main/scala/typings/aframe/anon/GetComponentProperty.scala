package typings.aframe.anon

import typings.aframe.mod.Component
import typings.aframe.mod.Entity
import typings.aframe.mod.ObjectMap
import typings.aframe.mod.System
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetComponentProperty extends js.Object {
  
  def getComponentProperty(entity: Entity[ObjectMap[Component[_, System[_]]]], componentName: String): js.Any = js.native
  def getComponentProperty(entity: Entity[ObjectMap[Component[_, System[_]]]], componentName: String, delimiter: String): js.Any = js.native
  
  def setComponentProperty(entity: Entity[ObjectMap[Component[_, System[_]]]], componentName: String, value: js.Any): Unit = js.native
  def setComponentProperty(
    entity: Entity[ObjectMap[Component[_, System[_]]]],
    componentName: String,
    value: js.Any,
    delimiter: String
  ): Unit = js.native
}
