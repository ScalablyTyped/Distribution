package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Procedural style of API needed to create elements and text nodes.
  *
  * In non-native browser environments (e.g. platforms such as web-workers), this is the
  * facade that enables element manipulation. This also facilitates backwards compatibility
  * with Renderer2.
  */
@js.native
trait ProceduralRenderer3 extends Renderer3 {
  /**
    * This property is allowed to be null / undefined,
    * in which case the view engine won't call it.
    * This is used as a performance optimization for production mode.
    */
  var destroyNode: js.UndefOr[(js.Function1[/* node */ RNode, Unit]) | Null] = js.native
  def addClass(el: RElement, name: String): Unit = js.native
  def appendChild(parent: RElement, newChild: RNode): Unit = js.native
  def createComment(value: String): RComment = js.native
  def createElement(name: String): RElement = js.native
  def createElement(name: String, namespace: String): RElement = js.native
  def createText(value: String): RText = js.native
  def destroy(): Unit = js.native
  def insertBefore(parent: RNode, newChild: RNode): Unit = js.native
  def insertBefore(parent: RNode, newChild: RNode, refChild: RNode): Unit = js.native
  def listen(
    target: GlobalTargetName,
    eventName: String,
    callback: js.Function1[/* event */ js.Any, Boolean | Unit]
  ): js.Function0[Unit] = js.native
  def listen(target: RNode, eventName: String, callback: js.Function1[/* event */ js.Any, Boolean | Unit]): js.Function0[Unit] = js.native
  def nextSibling(node: RNode): RNode | Null = js.native
  def parentNode(node: RNode): RElement | Null = js.native
  def removeAttribute(el: RElement, name: String): Unit = js.native
  def removeAttribute(el: RElement, name: String, namespace: String): Unit = js.native
  def removeChild(parent: RElement, oldChild: RNode): Unit = js.native
  def removeChild(parent: RElement, oldChild: RNode, isHostElement: Boolean): Unit = js.native
  def removeClass(el: RElement, name: String): Unit = js.native
  def removeStyle(el: RElement, style: String): Unit = js.native
  def removeStyle(el: RElement, style: String, flags: RendererStyleFlags2): Unit = js.native
  def removeStyle(el: RElement, style: String, flags: RendererStyleFlags3): Unit = js.native
  def selectRootElement(selectorOrNode: String): RElement = js.native
  def selectRootElement(selectorOrNode: String, preserveContent: Boolean): RElement = js.native
  def selectRootElement(selectorOrNode: js.Any): RElement = js.native
  def selectRootElement(selectorOrNode: js.Any, preserveContent: Boolean): RElement = js.native
  def setAttribute(el: RElement, name: String, value: String): Unit = js.native
  def setAttribute(el: RElement, name: String, value: String, namespace: String): Unit = js.native
  def setProperty(el: RElement, name: String, value: js.Any): Unit = js.native
  def setStyle(el: RElement, style: String, value: js.Any): Unit = js.native
  def setStyle(el: RElement, style: String, value: js.Any, flags: RendererStyleFlags2): Unit = js.native
  def setStyle(el: RElement, style: String, value: js.Any, flags: RendererStyleFlags3): Unit = js.native
  def setValue(node: RComment, value: String): Unit = js.native
  def setValue(node: RText, value: String): Unit = js.native
}

