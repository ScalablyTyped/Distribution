package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ɵangularPackagesCoreCoreBf
  extends TNode
     with TNodeWithLocalRefs {
  @JSName("child")
  var child_ɵangularPackagesCoreCoreBf: ɵangularPackagesCoreCoreBf | TTextNode | TElementContainerNode | TContainerNode | TProjectionNode | Null = js.native
  /**
    * Element nodes will have parents unless they are the first node of a component or
    * embedded view (which means their parent is in a different view and must be
    * retrieved using viewData[HOST_NODE]).
    */
  @JSName("parent")
  var parent_ɵangularPackagesCoreCoreBf: ɵangularPackagesCoreCoreBf | TElementContainerNode | Null = js.native
  /**
    * If this is a component TNode with projection, this will be an array of projected
    * TNodes or native nodes (see TNode.projection for more info). If it's a regular element node or
    * a component without projection, it will be null.
    */
  @JSName("projection")
  var projection_ɵangularPackagesCoreCoreBf: (js.Array[TNode | js.Array[RNode]]) | Null = js.native
  @JSName("tViews")
  var tViews_ɵangularPackagesCoreCoreBf: Null = js.native
}

object ɵangularPackagesCoreCoreBf {
  @scala.inline
  def apply(
    classBindings: TStylingRange,
    directiveEnd: Double,
    directiveStart: Double,
    directiveStylingLast: Double,
    flags: TNodeFlags,
    index: Double,
    injectorIndex: Double,
    providerIndexes: TNodeProviderIndexes,
    styleBindings: TStylingRange,
    tViews: Null,
    `type`: TNodeType
  ): ɵangularPackagesCoreCoreBf = {
    val __obj = js.Dynamic.literal(classBindings = classBindings.asInstanceOf[js.Any], directiveEnd = directiveEnd.asInstanceOf[js.Any], directiveStart = directiveStart.asInstanceOf[js.Any], directiveStylingLast = directiveStylingLast.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], injectorIndex = injectorIndex.asInstanceOf[js.Any], providerIndexes = providerIndexes.asInstanceOf[js.Any], styleBindings = styleBindings.asInstanceOf[js.Any], tViews = tViews.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ɵangularPackagesCoreCoreBf]
  }
  @scala.inline
  implicit class ɵangularPackagesCoreCoreBfOps[Self <: ɵangularPackagesCoreCoreBf] (val x: Self) extends AnyVal {
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
    def setTViews(value: Null): Self = this.set("tViews", value.asInstanceOf[js.Any])
    @scala.inline
    def setChild(
      value: ɵangularPackagesCoreCoreBf | TTextNode | TElementContainerNode | TContainerNode | TProjectionNode
    ): Self = this.set("child", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildNull: Self = this.set("child", null)
    @scala.inline
    def setParent(value: ɵangularPackagesCoreCoreBf | TElementContainerNode): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentNull: Self = this.set("parent", null)
    @scala.inline
    def setProjectionVarargs(value: (TNode | js.Array[RNode])*): Self = this.set("projection", js.Array(value :_*))
    @scala.inline
    def setProjection(value: js.Array[TNode | js.Array[RNode]]): Self = this.set("projection", value.asInstanceOf[js.Any])
    @scala.inline
    def setProjectionNull: Self = this.set("projection", null)
  }
  
}

