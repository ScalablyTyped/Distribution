package typings
package androiduixLib.androiduiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("androidui.AndroidUIElement")
@js.native
class AndroidUIElement ()
  extends stdLib.HTMLDivElement {
  var AndroidUI: AndroidUI = js.native
  /* CompleteClass */
  override val assignedSlot: stdLib.HTMLSlotElement | scala.Null = js.native
  /* CompleteClass */
  override var contentEditable: java.lang.String = js.native
  /* CompleteClass */
  override var inputMode: java.lang.String = js.native
  /* CompleteClass */
  override val isContentEditable: scala.Boolean = js.native
  /**
    * Returns the first following sibling that
    * is an element, and null otherwise.
    */
  /* CompleteClass */
  override val nextElementSibling: stdLib.Element | scala.Null = js.native
  /**
    * Returns the first preceding sibling that
    * is an element, and null otherwise.
    */
  /* CompleteClass */
  override val previousElementSibling: stdLib.Element | scala.Null = js.native
  /* CompleteClass */
  override val style: stdLib.CSSStyleDeclaration = js.native
  def attachedCallback(): scala.Unit = js.native
  def attributeChangedCallback(attributeName: java.lang.String, oldVal: java.lang.String, newVal: java.lang.String): scala.Unit = js.native
  def createdCallback(): scala.Unit = js.native
  def detachedCallback(): scala.Unit = js.native
}

