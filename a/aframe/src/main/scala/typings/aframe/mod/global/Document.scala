package typings.aframe.mod.global

import typings.aframe.aframeStrings.`a-scene`
import typings.aframe.mod.Component
import typings.aframe.mod.Entity
import typings.aframe.mod.ObjectMap
import typings.aframe.mod.Scene
import typings.aframe.mod.System
import typings.std.Element
import typings.std.NodeListOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Custom elements augment document methods to return custom HTML
  */
@js.native
trait Document extends StObject {
  
  def createElement(tagName: String): Entity[ObjectMap[Component[js.Any, System[js.Any]]]] = js.native
  
  def querySelector(selectors: String): Entity[js.Any] = js.native
  
  def querySelectorAll(selectors: String): NodeListOf[Entity[js.Any] | Element] = js.native
  
  @JSName("querySelector")
  def querySelector_ascene(selectors: `a-scene`): Scene = js.native
}
