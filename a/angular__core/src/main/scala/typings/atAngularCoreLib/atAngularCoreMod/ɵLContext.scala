package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ɵLContext extends js.Object {
  /**
    * The instance of the Component node.
    */
  var component: js.UndefOr[js.Object | scala.Null] = js.undefined
  /**
    * The list of active directives that exist on this element.
    */
  var directives: js.UndefOr[js.Array[_] | scala.Null] = js.undefined
  /**
    * The component's parent view data.
    */
  var lView: ɵangular_packages_core_core_bm
  /**
    * The map of local references (local reference name => element or directive instance) that exist
    * on this element.
    */
  var localRefs: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any] | scala.Null] = js.undefined
  /**
    * The instance of the DOM node that is attached to the lNode.
    */
  var native: RNode
  /**
    * The index instance of the node.
    */
  var nodeIndex: scala.Double
}

object ɵLContext {
  @scala.inline
  def apply(
    lView: ɵangular_packages_core_core_bm,
    native: RNode,
    nodeIndex: scala.Double,
    component: js.Object = null,
    directives: js.Array[_] = null,
    localRefs: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): ɵLContext = {
    val __obj = js.Dynamic.literal(lView = lView, native = native, nodeIndex = nodeIndex)
    if (component != null) __obj.updateDynamic("component")(component)
    if (directives != null) __obj.updateDynamic("directives")(directives)
    if (localRefs != null) __obj.updateDynamic("localRefs")(localRefs)
    __obj.asInstanceOf[ɵLContext]
  }
}

