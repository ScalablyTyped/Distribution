package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ɵangularPackagesCoreCoreBh
  extends StObject
     with TNode
     with TNodeWithLocalRefs {
  
  @JSName("child")
  var child_ɵangularPackagesCoreCoreBh: ɵangularPackagesCoreCoreBh | TTextNode | TElementContainerNode | TContainerNode | TProjectionNode | Null
  
  /**
    * Element nodes will have parents unless they are the first node of a component or
    * embedded view (which means their parent is in a different view and must be
    * retrieved using viewData[HOST_NODE]).
    */
  @JSName("parent")
  var parent_ɵangularPackagesCoreCoreBh: ɵangularPackagesCoreCoreBh | TElementContainerNode | Null
  
  /**
    * If this is a component TNode with projection, this will be an array of projected
    * TNodes or native nodes (see TNode.projection for more info). If it's a regular element node
    * or a component without projection, it will be null.
    */
  @JSName("projection")
  var projection_ɵangularPackagesCoreCoreBh: (js.Array[TNode | js.Array[RNode]]) | Null
  
  @JSName("tViews")
  var tViews_ɵangularPackagesCoreCoreBh: Null
  
  /**
    * Stores TagName
    */
  @JSName("value")
  var value_ɵangularPackagesCoreCoreBh: String
}
object ɵangularPackagesCoreCoreBh {
  
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
    `type`: TNodeType,
    value: String
  ): ɵangularPackagesCoreCoreBh = {
    val __obj = js.Dynamic.literal(classBindings = classBindings.asInstanceOf[js.Any], directiveEnd = directiveEnd.asInstanceOf[js.Any], directiveStart = directiveStart.asInstanceOf[js.Any], directiveStylingLast = directiveStylingLast.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], injectorIndex = injectorIndex.asInstanceOf[js.Any], providerIndexes = providerIndexes.asInstanceOf[js.Any], styleBindings = styleBindings.asInstanceOf[js.Any], tViews = tViews.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], attrs = null, child = null, classes = null, classesWithoutHost = null, inputs = null, insertBeforeIndex = null, localNames = null, mergedAttrs = null, next = null, outputs = null, parent = null, projection = null, projectionNext = null, propertyBindings = null, styles = null, stylesWithoutHost = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ɵangularPackagesCoreCoreBh]
  }
  
  @scala.inline
  implicit class ɵangularPackagesCoreCoreBhMutableBuilder[Self <: ɵangularPackagesCoreCoreBh] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChild(
      value: ɵangularPackagesCoreCoreBh | TTextNode | TElementContainerNode | TContainerNode | TProjectionNode
    ): Self = StObject.set(x, "child", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildNull: Self = StObject.set(x, "child", null)
    
    @scala.inline
    def setParent(value: ɵangularPackagesCoreCoreBh | TElementContainerNode): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentNull: Self = StObject.set(x, "parent", null)
    
    @scala.inline
    def setProjection(value: js.Array[TNode | js.Array[RNode]]): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectionNull: Self = StObject.set(x, "projection", null)
    
    @scala.inline
    def setProjectionVarargs(value: (TNode | js.Array[RNode])*): Self = StObject.set(x, "projection", js.Array(value :_*))
    
    @scala.inline
    def setTViews(value: Null): Self = StObject.set(x, "tViews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
