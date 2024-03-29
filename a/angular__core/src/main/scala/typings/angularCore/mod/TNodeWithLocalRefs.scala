package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Type representing a set of TNodes that can have local refs (`#foo`) placed on them.
  */
/* Rewritten from type alias, can be one of: 
  - typings.angularCore.mod.TContainerNode
  - typings.angularCore.mod.TElementNode
  - typings.angularCore.mod.TElementContainerNode
*/
trait TNodeWithLocalRefs extends StObject
object TNodeWithLocalRefs {
  
  inline def TContainerNode(
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
    `type`: TNodeType,
    value: Null
  ): typings.angularCore.mod.TContainerNode = {
    val __obj = js.Dynamic.literal(child = child.asInstanceOf[js.Any], classBindings = classBindings.asInstanceOf[js.Any], componentOffset = componentOffset.asInstanceOf[js.Any], directiveEnd = directiveEnd.asInstanceOf[js.Any], directiveStart = directiveStart.asInstanceOf[js.Any], directiveStylingLast = directiveStylingLast.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], injectorIndex = injectorIndex.asInstanceOf[js.Any], projection = projection.asInstanceOf[js.Any], providerIndexes = providerIndexes.asInstanceOf[js.Any], styleBindings = styleBindings.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], attrs = null, classes = null, classesWithoutHost = null, inputs = null, insertBeforeIndex = null, localNames = null, mergedAttrs = null, next = null, outputs = null, parent = null, prev = null, projectionNext = null, propertyBindings = null, styles = null, stylesWithoutHost = null, tView = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularCore.mod.TContainerNode]
  }
  
  inline def TElementContainerNode(
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
    tView: Null,
    `type`: TNodeType,
    value: Any
  ): typings.angularCore.mod.TElementContainerNode = {
    val __obj = js.Dynamic.literal(classBindings = classBindings.asInstanceOf[js.Any], componentOffset = componentOffset.asInstanceOf[js.Any], directiveEnd = directiveEnd.asInstanceOf[js.Any], directiveStart = directiveStart.asInstanceOf[js.Any], directiveStylingLast = directiveStylingLast.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], injectorIndex = injectorIndex.asInstanceOf[js.Any], projection = projection.asInstanceOf[js.Any], providerIndexes = providerIndexes.asInstanceOf[js.Any], styleBindings = styleBindings.asInstanceOf[js.Any], tView = tView.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], attrs = null, child = null, classes = null, classesWithoutHost = null, inputs = null, insertBeforeIndex = null, localNames = null, mergedAttrs = null, next = null, outputs = null, parent = null, prev = null, projectionNext = null, propertyBindings = null, styles = null, stylesWithoutHost = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularCore.mod.TElementContainerNode]
  }
  
  inline def TElementNode(
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
  ): typings.angularCore.mod.TElementNode = {
    val __obj = js.Dynamic.literal(classBindings = classBindings.asInstanceOf[js.Any], componentOffset = componentOffset.asInstanceOf[js.Any], directiveEnd = directiveEnd.asInstanceOf[js.Any], directiveStart = directiveStart.asInstanceOf[js.Any], directiveStylingLast = directiveStylingLast.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], injectorIndex = injectorIndex.asInstanceOf[js.Any], providerIndexes = providerIndexes.asInstanceOf[js.Any], styleBindings = styleBindings.asInstanceOf[js.Any], tView = tView.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], attrs = null, child = null, classes = null, classesWithoutHost = null, inputs = null, insertBeforeIndex = null, localNames = null, mergedAttrs = null, next = null, outputs = null, parent = null, prev = null, projection = null, projectionNext = null, propertyBindings = null, styles = null, stylesWithoutHost = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularCore.mod.TElementNode]
  }
}
