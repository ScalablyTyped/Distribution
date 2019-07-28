package typings.aframe

import typings.aframe.aframeMod.Component
import typings.aframe.aframeMod.Entity
import typings.aframe.aframeMod.ObjectMap
import typings.aframe.aframeMod.System
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ComponentNameDelimiter extends js.Object {
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

