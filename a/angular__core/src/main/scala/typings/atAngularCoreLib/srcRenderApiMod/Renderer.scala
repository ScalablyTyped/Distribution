package typings
package atAngularCoreLib.srcRenderApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/render/api", "Renderer")
@js.native
abstract class Renderer () extends js.Object {
  def animate(
    element: js.Any,
    startingStyles: js.Any,
    keyframes: js.Array[_],
    duration: scala.Double,
    delay: scala.Double,
    easing: java.lang.String
  ): js.Any = js.native
  def animate(
    element: js.Any,
    startingStyles: js.Any,
    keyframes: js.Array[_],
    duration: scala.Double,
    delay: scala.Double,
    easing: java.lang.String,
    previousPlayers: js.Array[_]
  ): js.Any = js.native
  def attachViewAfter(node: js.Any, viewRootNodes: js.Array[_]): scala.Unit = js.native
  def createElement(parentElement: js.Any, name: java.lang.String): js.Any = js.native
  def createElement(parentElement: js.Any, name: java.lang.String, debugInfo: RenderDebugInfo): js.Any = js.native
  def createTemplateAnchor(parentElement: js.Any): js.Any = js.native
  def createTemplateAnchor(parentElement: js.Any, debugInfo: RenderDebugInfo): js.Any = js.native
  def createText(parentElement: js.Any, value: java.lang.String): js.Any = js.native
  def createText(parentElement: js.Any, value: java.lang.String, debugInfo: RenderDebugInfo): js.Any = js.native
  def createViewRoot(hostElement: js.Any): js.Any = js.native
  def destroyView(hostElement: js.Any, viewAllNodes: js.Array[_]): scala.Unit = js.native
  def detachView(viewRootNodes: js.Array[_]): scala.Unit = js.native
  def invokeElementMethod(renderElement: js.Any, methodName: java.lang.String): scala.Unit = js.native
  def invokeElementMethod(renderElement: js.Any, methodName: java.lang.String, args: js.Array[_]): scala.Unit = js.native
  def listen(renderElement: js.Any, name: java.lang.String, callback: js.Function): js.Function = js.native
  def listenGlobal(target: java.lang.String, name: java.lang.String, callback: js.Function): js.Function = js.native
  def projectNodes(parentElement: js.Any, nodes: js.Array[_]): scala.Unit = js.native
  def selectRootElement(selectorOrNode: java.lang.String): js.Any = js.native
  def selectRootElement(selectorOrNode: java.lang.String, debugInfo: RenderDebugInfo): js.Any = js.native
  def selectRootElement(selectorOrNode: js.Any): js.Any = js.native
  def selectRootElement(selectorOrNode: js.Any, debugInfo: RenderDebugInfo): js.Any = js.native
  /**
    * Used only in debug mode to serialize property changes to dom nodes as attributes.
    */
  def setBindingDebugInfo(renderElement: js.Any, propertyName: java.lang.String, propertyValue: java.lang.String): scala.Unit = js.native
  def setElementAttribute(renderElement: js.Any, attributeName: java.lang.String): scala.Unit = js.native
  def setElementAttribute(renderElement: js.Any, attributeName: java.lang.String, attributeValue: java.lang.String): scala.Unit = js.native
  def setElementClass(renderElement: js.Any, className: java.lang.String, isAdd: scala.Boolean): scala.Unit = js.native
  def setElementProperty(renderElement: js.Any, propertyName: java.lang.String, propertyValue: js.Any): scala.Unit = js.native
  def setElementStyle(renderElement: js.Any, styleName: java.lang.String): scala.Unit = js.native
  def setElementStyle(renderElement: js.Any, styleName: java.lang.String, styleValue: java.lang.String): scala.Unit = js.native
  def setText(renderNode: js.Any, text: java.lang.String): scala.Unit = js.native
}

