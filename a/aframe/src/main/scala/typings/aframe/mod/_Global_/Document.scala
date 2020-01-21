package typings.aframe.mod._Global_

import typings.aframe.aframeStrings.`a-scene`
import typings.aframe.mod.Component
import typings.aframe.mod.Entity
import typings.aframe.mod.ObjectMap
import typings.aframe.mod.Scene
import typings.aframe.mod.System
import typings.std.Element
import typings.std.NodeListOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Custom elements augment document methods to return custom HTML
	 */
@js.native
trait Document extends js.Object {
  def createElement(tagName: String): Entity[ObjectMap[Component[_, System[_]]]] = js.native
  def querySelector(selectors: String): Entity[_] = js.native
  def querySelectorAll(selectors: String): NodeListOf[Entity[_] | Element] = js.native
  @JSName("querySelector")
  def querySelector_ascene(selectors: `a-scene`): Scene = js.native
}

