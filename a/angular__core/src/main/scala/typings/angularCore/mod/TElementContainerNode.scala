package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Static data for an <ng-container> */
@js.native
trait TElementContainerNode
  extends TNode
     with TNodeWithLocalRefs {
  
  @JSName("child")
  var child_TElementContainerNode: ɵangularPackagesCoreCoreBh | TTextNode | TContainerNode | TElementContainerNode | TProjectionNode | Null = js.native
  
  @JSName("parent")
  var parent_TElementContainerNode: ɵangularPackagesCoreCoreBh | TElementContainerNode | Null = js.native
  
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
    `type`: TNodeType,
    value: js.Any
  ): TElementContainerNode = {
    val __obj = js.Dynamic.literal(classBindings = classBindings.asInstanceOf[js.Any], directiveEnd = directiveEnd.asInstanceOf[js.Any], directiveStart = directiveStart.asInstanceOf[js.Any], directiveStylingLast = directiveStylingLast.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], injectorIndex = injectorIndex.asInstanceOf[js.Any], projection = projection.asInstanceOf[js.Any], providerIndexes = providerIndexes.asInstanceOf[js.Any], styleBindings = styleBindings.asInstanceOf[js.Any], tViews = tViews.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TElementContainerNode]
  }
  
  @scala.inline
  implicit class TElementContainerNodeMutableBuilder[Self <: TElementContainerNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChild(
      value: ɵangularPackagesCoreCoreBh | TTextNode | TContainerNode | TElementContainerNode | TProjectionNode
    ): Self = StObject.set(x, "child", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildNull: Self = StObject.set(x, "child", null)
    
    @scala.inline
    def setParent(value: ɵangularPackagesCoreCoreBh | TElementContainerNode): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentNull: Self = StObject.set(x, "parent", null)
    
    @scala.inline
    def setProjection(value: Null): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTViews(value: Null): Self = StObject.set(x, "tViews", value.asInstanceOf[js.Any])
  }
}
