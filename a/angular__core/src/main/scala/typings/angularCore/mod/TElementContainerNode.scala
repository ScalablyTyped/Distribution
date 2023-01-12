package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Static data for an <ng-container> */
trait TElementContainerNode
  extends StObject
     with TNode
     with TNodeWithLocalRefs {
  
  @JSName("child")
  var child_TElementContainerNode: TElementNode | TTextNode | TContainerNode | TElementContainerNode | TProjectionNode | Null
  
  @JSName("parent")
  var parent_TElementContainerNode: TElementNode | TElementContainerNode | Null
  
  @JSName("projection")
  var projection_TElementContainerNode: Null
  
  @JSName("tViews")
  var tViews_TElementContainerNode: Null
}
object TElementContainerNode {
  
  inline def apply(
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
    value: Any
  ): TElementContainerNode = {
    val __obj = js.Dynamic.literal(classBindings = classBindings.asInstanceOf[js.Any], directiveEnd = directiveEnd.asInstanceOf[js.Any], directiveStart = directiveStart.asInstanceOf[js.Any], directiveStylingLast = directiveStylingLast.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], injectorIndex = injectorIndex.asInstanceOf[js.Any], projection = projection.asInstanceOf[js.Any], providerIndexes = providerIndexes.asInstanceOf[js.Any], styleBindings = styleBindings.asInstanceOf[js.Any], tViews = tViews.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], attrs = null, child = null, classes = null, classesWithoutHost = null, inputs = null, insertBeforeIndex = null, localNames = null, mergedAttrs = null, next = null, outputs = null, parent = null, projectionNext = null, propertyBindings = null, styles = null, stylesWithoutHost = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TElementContainerNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TElementContainerNode] (val x: Self) extends AnyVal {
    
    inline def setChild(value: TElementNode | TTextNode | TContainerNode | TElementContainerNode | TProjectionNode): Self = StObject.set(x, "child", value.asInstanceOf[js.Any])
    
    inline def setChildNull: Self = StObject.set(x, "child", null)
    
    inline def setParent(value: TElementNode | TElementContainerNode): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setProjection(value: Null): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    inline def setTViews(value: Null): Self = StObject.set(x, "tViews", value.asInstanceOf[js.Any])
  }
}
