package typings.aframe.aframeMod._Global_

import typings.aframe.aframeMod.Component
import typings.aframe.aframeMod.Entity
import typings.aframe.aframeMod.ObjectMap
import typings.aframe.aframeMod.System
import typings.std.Element
import typings.std.HTMLCollectionBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLCollection extends HTMLCollectionBase {
  /**
  		 * Retrieves a select object or an object from an options collection.
  		 */
  def namedItem(name: String): Element | (Entity[ObjectMap[Component[_, System[_]]]]) | Null = js.native
}

