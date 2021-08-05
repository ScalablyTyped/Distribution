package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Static data for an LContainer */
trait TContainerNode
  extends StObject
     with TNode
     with TNodeWithLocalRefs {
  
  @JSName("child")
  var child_TContainerNode: Null
  
  /**
    * Container nodes will have parents unless:
    *
    * - They are the first node of a component or embedded view
    * - They are dynamically created
    */
  @JSName("parent")
  var parent_TContainerNode: ɵangularPackagesCoreCoreBh | TElementContainerNode | Null
  
  @JSName("projection")
  var projection_TContainerNode: Null
  
  @JSName("value")
  var value_TContainerNode: Null
}
object TContainerNode {
  
  inline def apply(
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
    `type`: TNodeType,
    value: Null
  ): TContainerNode = {
    val __obj = js.Dynamic.literal(child = child.asInstanceOf[js.Any], classBindings = classBindings.asInstanceOf[js.Any], directiveEnd = directiveEnd.asInstanceOf[js.Any], directiveStart = directiveStart.asInstanceOf[js.Any], directiveStylingLast = directiveStylingLast.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], injectorIndex = injectorIndex.asInstanceOf[js.Any], projection = projection.asInstanceOf[js.Any], providerIndexes = providerIndexes.asInstanceOf[js.Any], styleBindings = styleBindings.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], attrs = null, classes = null, classesWithoutHost = null, inputs = null, insertBeforeIndex = null, localNames = null, mergedAttrs = null, next = null, outputs = null, parent = null, projectionNext = null, propertyBindings = null, styles = null, stylesWithoutHost = null, tViews = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TContainerNode]
  }
  
  extension [Self <: TContainerNode](x: Self) {
    
    inline def setChild(value: Null): Self = StObject.set(x, "child", value.asInstanceOf[js.Any])
    
    inline def setParent(value: ɵangularPackagesCoreCoreBh | TElementContainerNode): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setProjection(value: Null): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Null): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
