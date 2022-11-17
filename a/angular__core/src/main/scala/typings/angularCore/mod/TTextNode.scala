package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Static data for a text node */
trait TTextNode
  extends StObject
     with TNode {
  
  @JSName("child")
  var child_TTextNode: Null
  
  /**
    * Text nodes will have parents unless they are the first node of a component or
    * embedded view (which means their parent is in a different view and must be
    * retrieved using LView.node).
    */
  @JSName("parent")
  var parent_TTextNode: TElementNode | TElementContainerNode | Null
  
  @JSName("projection")
  var projection_TTextNode: Null
  
  @JSName("tViews")
  var tViews_TTextNode: Null
}
object TTextNode {
  
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
    projection: Null,
    providerIndexes: TNodeProviderIndexes,
    styleBindings: TStylingRange,
    tViews: Null,
    `type`: TNodeType,
    value: Any
  ): TTextNode = {
    val __obj = js.Dynamic.literal(child = child.asInstanceOf[js.Any], classBindings = classBindings.asInstanceOf[js.Any], componentOffset = componentOffset.asInstanceOf[js.Any], directiveEnd = directiveEnd.asInstanceOf[js.Any], directiveStart = directiveStart.asInstanceOf[js.Any], directiveStylingLast = directiveStylingLast.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], injectorIndex = injectorIndex.asInstanceOf[js.Any], projection = projection.asInstanceOf[js.Any], providerIndexes = providerIndexes.asInstanceOf[js.Any], styleBindings = styleBindings.asInstanceOf[js.Any], tViews = tViews.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], attrs = null, classes = null, classesWithoutHost = null, inputs = null, insertBeforeIndex = null, localNames = null, mergedAttrs = null, next = null, outputs = null, parent = null, projectionNext = null, propertyBindings = null, styles = null, stylesWithoutHost = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TTextNode]
  }
  
  extension [Self <: TTextNode](x: Self) {
    
    inline def setChild(value: Null): Self = StObject.set(x, "child", value.asInstanceOf[js.Any])
    
    inline def setParent(value: TElementNode | TElementContainerNode): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setProjection(value: Null): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    inline def setTViews(value: Null): Self = StObject.set(x, "tViews", value.asInstanceOf[js.Any])
  }
}
