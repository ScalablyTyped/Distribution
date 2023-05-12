package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Static data for an LProjectionNode  */
trait TProjectionNode
  extends StObject
     with TNode {
  
  /** Index in the data[] array */
  @JSName("child")
  var child_TProjectionNode: Null
  
  /**
    * Projection nodes will have parents unless they are the first node of a component
    * or embedded view (which means their parent is in a different view and must be
    * retrieved using LView.node).
    */
  @JSName("parent")
  var parent_TProjectionNode: TElementNode | TElementContainerNode | Null
  
  /** Index of the projection node. (See TNode.projection for more info.) */
  @JSName("projection")
  var projection_TProjectionNode: Double
  
  @JSName("tView")
  var tView_TProjectionNode: Null
  
  @JSName("value")
  var value_TProjectionNode: Null
}
object TProjectionNode {
  
  inline def apply(
    child: Null,
    classBindings: TStylingRange,
    componentOffset: Double,
    directiveEnd: Double,
    directiveStart: Double,
    directiveStylingLast: Double,
    flags: TNodeFlags,
    index: Double,
    injectorIndex: Double,
    projection: Double,
    providerIndexes: TNodeProviderIndexes,
    styleBindings: TStylingRange,
    tView: Null,
    `type`: TNodeType,
    value: Null
  ): TProjectionNode = {
    val __obj = js.Dynamic.literal(child = child.asInstanceOf[js.Any], classBindings = classBindings.asInstanceOf[js.Any], componentOffset = componentOffset.asInstanceOf[js.Any], directiveEnd = directiveEnd.asInstanceOf[js.Any], directiveStart = directiveStart.asInstanceOf[js.Any], directiveStylingLast = directiveStylingLast.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], injectorIndex = injectorIndex.asInstanceOf[js.Any], projection = projection.asInstanceOf[js.Any], providerIndexes = providerIndexes.asInstanceOf[js.Any], styleBindings = styleBindings.asInstanceOf[js.Any], tView = tView.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], attrs = null, classes = null, classesWithoutHost = null, inputs = null, insertBeforeIndex = null, localNames = null, mergedAttrs = null, next = null, outputs = null, parent = null, prev = null, projectionNext = null, propertyBindings = null, styles = null, stylesWithoutHost = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TProjectionNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TProjectionNode] (val x: Self) extends AnyVal {
    
    inline def setChild(value: Null): Self = StObject.set(x, "child", value.asInstanceOf[js.Any])
    
    inline def setParent(value: TElementNode | TElementContainerNode): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setProjection(value: Double): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    inline def setTView(value: Null): Self = StObject.set(x, "tView", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Null): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
