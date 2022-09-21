package typings.aframe.anon

import typings.aframe.mod.Component
import typings.aframe.mod.Entity
import typings.aframe.mod.ObjectMap
import typings.aframe.mod.System
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetComponentProperty extends StObject {
  
  def getComponentProperty(entity: Entity[ObjectMap[Component[Any, System[Any]]]], componentName: String): Any = js.native
  def getComponentProperty(entity: Entity[ObjectMap[Component[Any, System[Any]]]], componentName: String, delimiter: String): Any = js.native
  
  def setComponentProperty(entity: Entity[ObjectMap[Component[Any, System[Any]]]], componentName: String, value: Any): Unit = js.native
  def setComponentProperty(
    entity: Entity[ObjectMap[Component[Any, System[Any]]]],
    componentName: String,
    value: Any,
    delimiter: String
  ): Unit = js.native
}
