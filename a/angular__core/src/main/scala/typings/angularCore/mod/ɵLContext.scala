package typings.angularCore.mod

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
  var lView: ɵangularPackagesCoreCoreBo
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
    lView: ɵangularPackagesCoreCoreBo,
    native: RNode,
    nodeIndex: Double,
    component: js.UndefOr[Null | js.Object] = js.undefined,
    directives: js.UndefOr[Null | js.Array[_]] = js.undefined,
    localRefs: js.UndefOr[Null | StringDictionary[js.Any]] = js.undefined
  ): ɵLContext = {
    val __obj = js.Dynamic.literal(lView = lView.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any], nodeIndex = nodeIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(component)) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(directives)) __obj.updateDynamic("directives")(directives.asInstanceOf[js.Any])
    if (!js.isUndefined(localRefs)) __obj.updateDynamic("localRefs")(localRefs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ɵLContext]
  }
}

