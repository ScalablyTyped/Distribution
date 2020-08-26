package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Static data for a text node */
@js.native
trait TTextNode extends TNode {
  @JSName("child")
  var child_TTextNode: Null = js.native
  /**
    * Text nodes will have parents unless they are the first node of a component or
    * embedded view (which means their parent is in a different view and must be
    * retrieved using LView.node).
    */
  @JSName("parent")
  var parent_TTextNode: ɵangularPackagesCoreCoreBf | TElementContainerNode | Null = js.native
  @JSName("projection")
  var projection_TTextNode: Null = js.native
  @JSName("tViews")
  var tViews_TTextNode: Null = js.native
}

object TTextNode {
  @scala.inline
  def apply(
    child: Null,
    classBindings: TStylingRange,
    directiveEnd: Double,
    directiveStart: Double,
    directiveStylingLast: Double,
    flags: TNodeFlags,
    index: Double,
    injectorIndex: Double,
    projection: Null,
    providerIndexes: TNodeProviderIndexes,
    styleBindings: TStylingRange,
    tViews: Null,
    `type`: TNodeType
  ): TTextNode = {
    val __obj = js.Dynamic.literal(child = child.asInstanceOf[js.Any], classBindings = classBindings.asInstanceOf[js.Any], directiveEnd = directiveEnd.asInstanceOf[js.Any], directiveStart = directiveStart.asInstanceOf[js.Any], directiveStylingLast = directiveStylingLast.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], injectorIndex = injectorIndex.asInstanceOf[js.Any], projection = projection.asInstanceOf[js.Any], providerIndexes = providerIndexes.asInstanceOf[js.Any], styleBindings = styleBindings.asInstanceOf[js.Any], tViews = tViews.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TTextNode]
  }
  @scala.inline
  implicit class TTextNodeOps[Self <: TTextNode] (val x: Self) extends AnyVal {
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
    def setChild(value: Null): Self = this.set("child", value.asInstanceOf[js.Any])
    @scala.inline
    def setProjection(value: Null): Self = this.set("projection", value.asInstanceOf[js.Any])
    @scala.inline
    def setTViews(value: Null): Self = this.set("tViews", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: ɵangularPackagesCoreCoreBf | TElementContainerNode): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentNull: Self = this.set("parent", null)
  }
  
}

