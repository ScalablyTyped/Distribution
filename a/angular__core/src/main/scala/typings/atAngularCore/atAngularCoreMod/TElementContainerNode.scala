package typings.atAngularCore.atAngularCoreMod

import typings.atAngularCore.InitialInputData
import typings.atAngularCore.TAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Static data for an <ng-container> */
trait TElementContainerNode
  extends TNode
     with TNodeWithLocalRefs {
  @JSName("child")
  var child_TElementContainerNode: ɵangular_packages_core_core_bf | TTextNode | TContainerNode | TElementContainerNode | TProjectionNode | Null
  @JSName("parent")
  var parent_TElementContainerNode: ɵangular_packages_core_core_bf | TElementContainerNode | Null
  @JSName("projection")
  var projection_TElementContainerNode: Null
  @JSName("tViews")
  var tViews_TElementContainerNode: Null
}

object TElementContainerNode {
  @scala.inline
  def apply(
    directiveEnd: Double,
    directiveStart: Double,
    flags: TNodeFlags,
    index: Double,
    injectorIndex: Double,
    projection: Null,
    propertyMetadataEndIndex: Double,
    propertyMetadataStartIndex: Double,
    providerIndexes: TNodeProviderIndexes,
    tViews: Null,
    `type`: TNodeType,
    attrs: TAttributes = null,
    child: ɵangular_packages_core_core_bf | TTextNode | TContainerNode | TElementContainerNode | TProjectionNode = null,
    classes: StylingMapArray | TStylingContext = null,
    initialInputs: InitialInputData = null,
    inputs: PropertyAliases = null,
    localNames: js.Array[String | Double] = null,
    next: TNode = null,
    outputs: PropertyAliases = null,
    parent: ɵangular_packages_core_core_bf | TElementContainerNode = null,
    projectionNext: TNode = null,
    styles: StylingMapArray | TStylingContext = null,
    tagName: String = null
  ): TElementContainerNode = {
    val __obj = js.Dynamic.literal(directiveEnd = directiveEnd, directiveStart = directiveStart, flags = flags, index = index, injectorIndex = injectorIndex, projection = projection, propertyMetadataEndIndex = propertyMetadataEndIndex, propertyMetadataStartIndex = propertyMetadataStartIndex, providerIndexes = providerIndexes, tViews = tViews)
    __obj.updateDynamic("type")(`type`)
    if (attrs != null) __obj.updateDynamic("attrs")(attrs)
    if (child != null) __obj.updateDynamic("child")(child.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (initialInputs != null) __obj.updateDynamic("initialInputs")(initialInputs)
    if (inputs != null) __obj.updateDynamic("inputs")(inputs)
    if (localNames != null) __obj.updateDynamic("localNames")(localNames)
    if (next != null) __obj.updateDynamic("next")(next)
    if (outputs != null) __obj.updateDynamic("outputs")(outputs)
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (projectionNext != null) __obj.updateDynamic("projectionNext")(projectionNext)
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (tagName != null) __obj.updateDynamic("tagName")(tagName)
    __obj.asInstanceOf[TElementContainerNode]
  }
}

