package typings.atAngularCore.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core", "Renderer")
@js.native
abstract class Renderer () extends js.Object {
  def animate(
    element: js.Any,
    startingStyles: js.Any,
    keyframes: js.Array[_],
    duration: Double,
    delay: Double,
    easing: String
  ): js.Any = js.native
  def animate(
    element: js.Any,
    startingStyles: js.Any,
    keyframes: js.Array[_],
    duration: Double,
    delay: Double,
    easing: String,
    previousPlayers: js.Array[_]
  ): js.Any = js.native
  def attachViewAfter(node: js.Any, viewRootNodes: js.Array[_]): Unit = js.native
  def createElement(parentElement: js.Any, name: String): js.Any = js.native
  def createElement(parentElement: js.Any, name: String, debugInfo: ɵRenderDebugInfo): js.Any = js.native
  def createTemplateAnchor(parentElement: js.Any): js.Any = js.native
  def createTemplateAnchor(parentElement: js.Any, debugInfo: ɵRenderDebugInfo): js.Any = js.native
  def createText(parentElement: js.Any, value: String): js.Any = js.native
  def createText(parentElement: js.Any, value: String, debugInfo: ɵRenderDebugInfo): js.Any = js.native
  def createViewRoot(hostElement: js.Any): js.Any = js.native
  def destroyView(hostElement: js.Any, viewAllNodes: js.Array[_]): Unit = js.native
  def detachView(viewRootNodes: js.Array[_]): Unit = js.native
  def invokeElementMethod(renderElement: js.Any, methodName: String): Unit = js.native
  def invokeElementMethod(renderElement: js.Any, methodName: String, args: js.Array[_]): Unit = js.native
  def listen(renderElement: js.Any, name: String, callback: js.Function): js.Function = js.native
  def listenGlobal(target: String, name: String, callback: js.Function): js.Function = js.native
  def projectNodes(parentElement: js.Any, nodes: js.Array[_]): Unit = js.native
  def selectRootElement(selectorOrNode: String): js.Any = js.native
  def selectRootElement(selectorOrNode: String, debugInfo: ɵRenderDebugInfo): js.Any = js.native
  def selectRootElement(selectorOrNode: js.Any): js.Any = js.native
  def selectRootElement(selectorOrNode: js.Any, debugInfo: ɵRenderDebugInfo): js.Any = js.native
  /**
    * Used only in debug mode to serialize property changes to dom nodes as attributes.
    */
  def setBindingDebugInfo(renderElement: js.Any, propertyName: String, propertyValue: String): Unit = js.native
  def setElementAttribute(renderElement: js.Any, attributeName: String): Unit = js.native
  def setElementAttribute(renderElement: js.Any, attributeName: String, attributeValue: String): Unit = js.native
  def setElementClass(renderElement: js.Any, className: String, isAdd: Boolean): Unit = js.native
  def setElementProperty(renderElement: js.Any, propertyName: String, propertyValue: js.Any): Unit = js.native
  def setElementStyle(renderElement: js.Any, styleName: String): Unit = js.native
  def setElementStyle(renderElement: js.Any, styleName: String, styleValue: String): Unit = js.native
  def setText(renderNode: js.Any, text: String): Unit = js.native
}

