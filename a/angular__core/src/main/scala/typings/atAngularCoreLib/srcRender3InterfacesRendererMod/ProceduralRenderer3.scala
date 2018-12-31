package typings
package atAngularCoreLib.srcRender3InterfacesRendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProceduralRenderer3 extends js.Object {
  /**
    * This property is allowed to be null / undefined,
    * in which case the view engine won't call it.
    * This is used as a performance optimization for production mode.
    */
  var destroyNode: js.UndefOr[(js.Function1[/* node */ RNode, scala.Unit]) | scala.Null] = js.native
  def addClass(el: RElement, name: java.lang.String): scala.Unit = js.native
  def appendChild(parent: RElement, newChild: RNode): scala.Unit = js.native
  def createComment(value: java.lang.String): RComment = js.native
  def createElement(name: java.lang.String): RElement = js.native
  def createElement(name: java.lang.String, namespace: java.lang.String): RElement = js.native
  def createText(value: java.lang.String): RText = js.native
  def destroy(): scala.Unit = js.native
  def insertBefore(parent: RNode, newChild: RNode): scala.Unit = js.native
  def insertBefore(parent: RNode, newChild: RNode, refChild: RNode): scala.Unit = js.native
  def listen(
    target: RNode,
    eventName: java.lang.String,
    callback: js.Function1[/* event */ js.Any, scala.Boolean | scala.Unit]
  ): js.Function0[scala.Unit] = js.native
  def nextSibling(node: RNode): RNode | scala.Null = js.native
  def parentNode(node: RNode): RElement | scala.Null = js.native
  def removeAttribute(el: RElement, name: java.lang.String): scala.Unit = js.native
  def removeAttribute(el: RElement, name: java.lang.String, namespace: java.lang.String): scala.Unit = js.native
  def removeChild(parent: RElement, oldChild: RNode): scala.Unit = js.native
  def removeClass(el: RElement, name: java.lang.String): scala.Unit = js.native
  def removeStyle(el: RElement, style: java.lang.String): scala.Unit = js.native
  def removeStyle(el: RElement, style: java.lang.String, flags: RendererStyleFlags3): scala.Unit = js.native
  def removeStyle(el: RElement, style: java.lang.String, flags: atAngularCoreLib.srcRenderApiMod.RendererStyleFlags2): scala.Unit = js.native
  def selectRootElement(selectorOrNode: java.lang.String): RElement = js.native
  def selectRootElement(selectorOrNode: js.Any): RElement = js.native
  def setAttribute(el: RElement, name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def setAttribute(el: RElement, name: java.lang.String, value: java.lang.String, namespace: java.lang.String): scala.Unit = js.native
  def setProperty(el: RElement, name: java.lang.String, value: js.Any): scala.Unit = js.native
  def setStyle(el: RElement, style: java.lang.String, value: js.Any): scala.Unit = js.native
  def setStyle(el: RElement, style: java.lang.String, value: js.Any, flags: RendererStyleFlags3): scala.Unit = js.native
  def setStyle(
    el: RElement,
    style: java.lang.String,
    value: js.Any,
    flags: atAngularCoreLib.srcRenderApiMod.RendererStyleFlags2
  ): scala.Unit = js.native
  def setValue(node: RText, value: java.lang.String): scala.Unit = js.native
}

