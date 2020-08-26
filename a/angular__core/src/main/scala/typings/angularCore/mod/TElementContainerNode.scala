package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Static data for an <ng-container> */
@js.native
trait TElementContainerNode
  extends TNode
     with TNodeWithLocalRefs {
  @JSName("child")
  var child_TElementContainerNode: ɵangularPackagesCoreCoreBf | TTextNode | TContainerNode | TElementContainerNode | TProjectionNode | Null = js.native
  @JSName("parent")
  var parent_TElementContainerNode: ɵangularPackagesCoreCoreBf | TElementContainerNode | Null = js.native
  @JSName("projection")
  var projection_TElementContainerNode: Null = js.native
  @JSName("tViews")
  var tViews_TElementContainerNode: Null = js.native
}

object TElementContainerNode {
  @scala.inline
  def apply(
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
  ): TElementContainerNode = {
    val __obj = js.Dynamic.literal(classBindings = classBindings.asInstanceOf[js.Any], directiveEnd = directiveEnd.asInstanceOf[js.Any], directiveStart = directiveStart.asInstanceOf[js.Any], directiveStylingLast = directiveStylingLast.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], injectorIndex = injectorIndex.asInstanceOf[js.Any], projection = projection.asInstanceOf[js.Any], providerIndexes = providerIndexes.asInstanceOf[js.Any], styleBindings = styleBindings.asInstanceOf[js.Any], tViews = tViews.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TElementContainerNode]
  }
  @scala.inline
  implicit class TElementContainerNodeOps[Self <: TElementContainerNode] (val x: Self) extends AnyVal {
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
    def setProjection(value: Null): Self = this.set("projection", value.asInstanceOf[js.Any])
    @scala.inline
    def setTViews(value: Null): Self = this.set("tViews", value.asInstanceOf[js.Any])
    @scala.inline
    def setChild(
      value: ɵangularPackagesCoreCoreBf | TTextNode | TContainerNode | TElementContainerNode | TProjectionNode
    ): Self = this.set("child", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildNull: Self = this.set("child", null)
    @scala.inline
    def setParent(value: ɵangularPackagesCoreCoreBf | TElementContainerNode): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentNull: Self = this.set("parent", null)
  }
  
}

