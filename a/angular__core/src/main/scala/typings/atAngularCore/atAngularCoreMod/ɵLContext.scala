package typings.atAngularCore.atAngularCoreMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ɵLContext extends js.Object {
  /**
    * The instance of the Component node.
    */
  var component: js.UndefOr[js.Object | Null] = js.undefined
  /**
    * The list of active directives that exist on this element.
    */
  var directives: js.UndefOr[js.Array[_] | Null] = js.undefined
  /**
    * The component's parent view data.
    */
  var lView: ɵangular_packages_core_core_bj
  /**
    * The map of local references (local reference name => element or directive instance) that exist
    * on this element.
    */
  var localRefs: js.UndefOr[StringDictionary[js.Any] | Null] = js.undefined
  /**
    * The instance of the DOM node that is attached to the lNode.
    */
  var native: RNode
  /**
    * The index instance of the node.
    */
  var nodeIndex: Double
}

object ɵLContext {
  @scala.inline
  def apply(
    lView: ɵangular_packages_core_core_bj,
    native: RNode,
    nodeIndex: Double,
    component: js.Object = null,
    directives: js.Array[_] = null,
    localRefs: StringDictionary[js.Any] = null
  ): ɵLContext = {
    val __obj = js.Dynamic.literal(lView = lView.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any], nodeIndex = nodeIndex.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (directives != null) __obj.updateDynamic("directives")(directives.asInstanceOf[js.Any])
    if (localRefs != null) __obj.updateDynamic("localRefs")(localRefs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ɵLContext]
  }
}

