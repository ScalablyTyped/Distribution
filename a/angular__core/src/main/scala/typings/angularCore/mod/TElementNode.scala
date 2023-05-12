package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Static data for an element  */
trait TElementNode
  extends StObject
     with TNode
     with TNodeWithLocalRefs {
  
  @JSName("child")
  var child_TElementNode: TElementNode | TTextNode | TElementContainerNode | TContainerNode | TProjectionNode | Null
  
  /**
    * Element nodes will have parents unless they are the first node of a component or
    * embedded view (which means their parent is in a different view and must be
    * retrieved using viewData[HOST_NODE]).
    */
  @JSName("parent")
  var parent_TElementNode: TElementNode | TElementContainerNode | Null
  
  /**
    * If this is a component TNode with projection, this will be an array of projected
    * TNodes or native nodes (see TNode.projection for more info). If it's a regular element node
    * or a component without projection, it will be null.
    */
  @JSName("projection")
  var projection_TElementNode: (js.Array[TNode | js.Array[RNode]]) | Null
  
  @JSName("tView")
  var tView_TElementNode: Null
  
  /**
    * Stores TagName
    */
  @JSName("value")
  var value_TElementNode: String
}
object TElementNode {
  
  inline def apply(
    classBindings: TStylingRange,
    componentOffset: Double,
    directiveEnd: Double,
    directiveStart: Double,
    directiveStylingLast: Double,
    flags: TNodeFlags,
    index: Double,
    injectorIndex: Double,
    providerIndexes: TNodeProviderIndexes,
    styleBindings: TStylingRange,
    tView: Null,
    `type`: TNodeType,
    value: String
  ): TElementNode = {
    val __obj = js.Dynamic.literal(classBindings = classBindings.asInstanceOf[js.Any], componentOffset = componentOffset.asInstanceOf[js.Any], directiveEnd = directiveEnd.asInstanceOf[js.Any], directiveStart = directiveStart.asInstanceOf[js.Any], directiveStylingLast = directiveStylingLast.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], injectorIndex = injectorIndex.asInstanceOf[js.Any], providerIndexes = providerIndexes.asInstanceOf[js.Any], styleBindings = styleBindings.asInstanceOf[js.Any], tView = tView.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], attrs = null, child = null, classes = null, classesWithoutHost = null, inputs = null, insertBeforeIndex = null, localNames = null, mergedAttrs = null, next = null, outputs = null, parent = null, prev = null, projection = null, projectionNext = null, propertyBindings = null, styles = null, stylesWithoutHost = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TElementNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TElementNode] (val x: Self) extends AnyVal {
    
    inline def setChild(value: TElementNode | TTextNode | TElementContainerNode | TContainerNode | TProjectionNode): Self = StObject.set(x, "child", value.asInstanceOf[js.Any])
    
    inline def setChildNull: Self = StObject.set(x, "child", null)
    
    inline def setParent(value: TElementNode | TElementContainerNode): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setProjection(value: js.Array[TNode | js.Array[RNode]]): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    inline def setProjectionNull: Self = StObject.set(x, "projection", null)
    
    inline def setProjectionVarargs(value: (TNode | js.Array[RNode])*): Self = StObject.set(x, "projection", js.Array(value*))
    
    inline def setTView(value: Null): Self = StObject.set(x, "tView", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
