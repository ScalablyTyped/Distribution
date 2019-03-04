package typings
package atAngularCoreLib.srcRender3InterfacesContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LContext extends js.Object {
  /**
    * The instance of the Component node.
    */
  var component: js.UndefOr[js.Object | scala.Null]
  /**
    * The list of active directives that exist on this element.
    */
  var directives: js.UndefOr[js.Array[_] | scala.Null]
  /**
    * The component's parent view data.
    */
  var lView: atAngularCoreLib.srcRender3InterfacesViewMod.LView
  /**
    * The map of local references (local reference name => element or directive instance) that exist
    * on this element.
    */
  var localRefs: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any] | scala.Null]
  /**
    * The instance of the DOM node that is attached to the lNode.
    */
  var native: atAngularCoreLib.srcRender3InterfacesRendererMod.RElement
  /**
    * The index instance of the node.
    */
  var nodeIndex: scala.Double
}

object LContext {
  @scala.inline
  def apply(
    lView: atAngularCoreLib.srcRender3InterfacesViewMod.LView,
    native: atAngularCoreLib.srcRender3InterfacesRendererMod.RElement,
    nodeIndex: scala.Double,
    component: js.Object = null,
    directives: js.Array[_] = null,
    localRefs: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): LContext = {
    val __obj = js.Dynamic.literal(lView = lView, native = native, nodeIndex = nodeIndex)
    if (component != null) __obj.updateDynamic("component")(component)
    if (directives != null) __obj.updateDynamic("directives")(directives)
    if (localRefs != null) __obj.updateDynamic("localRefs")(localRefs)
    __obj.asInstanceOf[LContext]
  }
}

