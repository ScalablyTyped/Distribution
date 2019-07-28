package typings.aframe.aframeMod.Global

import typings.aframe.aframeMod.Component
import typings.aframe.aframeMod.Entity
import typings.aframe.aframeMod.ObjectMap
import typings.aframe.aframeMod.Scene
import typings.aframe.aframeMod.System
import typings.aframe.aframeStrings.`a-scene`
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

