package typings.angularCore.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ɵLContext extends js.Object {
  /**
    * The instance of the Component node.
    */
  var component: js.UndefOr[js.Object | Null] = js.native
  /**
    * The list of active directives that exist on this element.
    */
  var directives: js.UndefOr[js.Array[_] | Null] = js.native
  /**
    * The component's parent view data.
    */
  var lView: ɵangularPackagesCoreCoreBp = js.native
  /**
    * The map of local references (local reference name => element or directive instance) that exist
    * on this element.
    */
  var localRefs: js.UndefOr[StringDictionary[js.Any] | Null] = js.native
  /**
    * The instance of the DOM node that is attached to the lNode.
    */
  var native: RNode = js.native
  /**
    * The index instance of the node.
    */
  var nodeIndex: Double = js.native
}

object ɵLContext {
  @scala.inline
  def apply(lView: ɵangularPackagesCoreCoreBp, native: RNode, nodeIndex: Double): ɵLContext = {
    val __obj = js.Dynamic.literal(lView = lView.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any], nodeIndex = nodeIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ɵLContext]
  }
  @scala.inline
  implicit class ɵLContextOps[Self <: ɵLContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLView(value: ɵangularPackagesCoreCoreBp): Self = this.set("lView", value.asInstanceOf[js.Any])
    @scala.inline
    def setNative(value: RNode): Self = this.set("native", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeIndex(value: Double): Self = this.set("nodeIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setComponent(value: js.Object): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    @scala.inline
    def setComponentNull: Self = this.set("component", null)
    @scala.inline
    def setDirectivesVarargs(value: js.Any*): Self = this.set("directives", js.Array(value :_*))
    @scala.inline
    def setDirectives(value: js.Array[_]): Self = this.set("directives", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectives: Self = this.set("directives", js.undefined)
    @scala.inline
    def setDirectivesNull: Self = this.set("directives", null)
    @scala.inline
    def setLocalRefs(value: StringDictionary[js.Any]): Self = this.set("localRefs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalRefs: Self = this.set("localRefs", js.undefined)
    @scala.inline
    def setLocalRefsNull: Self = this.set("localRefs", null)
  }
  
}

