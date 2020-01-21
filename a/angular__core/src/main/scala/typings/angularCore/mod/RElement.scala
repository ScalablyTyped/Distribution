package typings.angularCore.mod

import typings.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Subset of API needed for writing attributes, properties, and setting up
  * listeners on Element.
  */
@js.native
trait RElement extends RNode {
  var classList: RDomTokenList = js.native
  var className: String = js.native
  var setProperty: js.UndefOr[js.Function2[/* name */ String, /* value */ js.Any, Unit]] = js.native
  var style: RCssStyleDeclaration = js.native
  def addEventListener(`type`: String, listener: EventListener): Unit = js.native
  def addEventListener(`type`: String, listener: EventListener, useCapture: Boolean): Unit = js.native
  def removeAttribute(name: String): Unit = js.native
  def removeEventListener(`type`: String): Unit = js.native
  def removeEventListener(`type`: String, listener: EventListener): Unit = js.native
  def removeEventListener(`type`: String, listener: EventListener, options: Boolean): Unit = js.native
  def setAttribute(name: String, value: String): Unit = js.native
  def setAttributeNS(namespaceURI: String, qualifiedName: String, value: String): Unit = js.native
}

