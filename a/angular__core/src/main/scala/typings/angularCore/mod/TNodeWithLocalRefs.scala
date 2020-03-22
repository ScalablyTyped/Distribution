package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Type representing a set of TNodes that can have local refs (`#foo`) placed on them.
  */
/* Rewritten from type alias, can be one of: 
  - typings.angularCore.mod.TContainerNode
  - typings.angularCore.mod.ɵangularPackagesCoreCoreBe
  - typings.angularCore.mod.TElementContainerNode
*/
trait TNodeWithLocalRefs extends js.Object

object TNodeWithLocalRefs {
  @scala.inline
  def TContainerNode(
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
    attrs: TAttributes = null,
    classes: String = null,
    initialInputs: InitialInputData = null,
    inputs: PropertyAliases = null,
    localNames: js.Array[String | Double] = null,
    mergedAttrs: TAttributes = null,
    next: TNode = null,
    outputs: PropertyAliases = null,
    parent: ɵangularPackagesCoreCoreBe | TElementContainerNode = null,
    projectionNext: TNode = null,
    propertyBindings: js.Array[Double] = null,
    residualClasses: KeyValueArray[_] = null,
    residualStyles: KeyValueArray[_] = null,
    styles: String = null,
    tViews: TView | js.Array[TView] = null,
    tagName: String = null
  ): TNodeWithLocalRefs = {
    val __obj = js.Dynamic.literal(child = child.asInstanceOf[js.Any], classBindings = classBindings.asInstanceOf[js.Any], directiveEnd = directiveEnd.asInstanceOf[js.Any], directiveStart = directiveStart.asInstanceOf[js.Any], directiveStylingLast = directiveStylingLast.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], injectorIndex = injectorIndex.asInstanceOf[js.Any], projection = projection.asInstanceOf[js.Any], providerIndexes = providerIndexes.asInstanceOf[js.Any], styleBindings = styleBindings.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (attrs != null) __obj.updateDynamic("attrs")(attrs.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (initialInputs != null) __obj.updateDynamic("initialInputs")(initialInputs.asInstanceOf[js.Any])
    if (inputs != null) __obj.updateDynamic("inputs")(inputs.asInstanceOf[js.Any])
    if (localNames != null) __obj.updateDynamic("localNames")(localNames.asInstanceOf[js.Any])
    if (mergedAttrs != null) __obj.updateDynamic("mergedAttrs")(mergedAttrs.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    if (outputs != null) __obj.updateDynamic("outputs")(outputs.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (projectionNext != null) __obj.updateDynamic("projectionNext")(projectionNext.asInstanceOf[js.Any])
    if (propertyBindings != null) __obj.updateDynamic("propertyBindings")(propertyBindings.asInstanceOf[js.Any])
    if (residualClasses != null) __obj.updateDynamic("residualClasses")(residualClasses.asInstanceOf[js.Any])
    if (residualStyles != null) __obj.updateDynamic("residualStyles")(residualStyles.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (tViews != null) __obj.updateDynamic("tViews")(tViews.asInstanceOf[js.Any])
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TNodeWithLocalRefs]
  }
  @scala.inline
  def ɵangularPackagesCoreCoreBe(
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
    attrs: TAttributes = null,
    child: typings.angularCore.mod.ɵangularPackagesCoreCoreBe | TTextNode | TElementContainerNode | TContainerNode | TProjectionNode = null,
    classes: String = null,
    initialInputs: InitialInputData = null,
    inputs: PropertyAliases = null,
    localNames: js.Array[String | Double] = null,
    mergedAttrs: TAttributes = null,
    next: TNode = null,
    outputs: PropertyAliases = null,
    parent: typings.angularCore.mod.ɵangularPackagesCoreCoreBe | TElementContainerNode = null,
    projection: js.Array[TNode | js.Array[RNode]] = null,
    projectionNext: TNode = null,
    propertyBindings: js.Array[Double] = null,
    residualClasses: KeyValueArray[_] = null,
    residualStyles: KeyValueArray[_] = null,
    styles: String = null,
    tagName: String = null
  ): TNodeWithLocalRefs = {
    val __obj = js.Dynamic.literal(classBindings = classBindings.asInstanceOf[js.Any], directiveEnd = directiveEnd.asInstanceOf[js.Any], directiveStart = directiveStart.asInstanceOf[js.Any], directiveStylingLast = directiveStylingLast.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], injectorIndex = injectorIndex.asInstanceOf[js.Any], providerIndexes = providerIndexes.asInstanceOf[js.Any], styleBindings = styleBindings.asInstanceOf[js.Any], tViews = tViews.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (attrs != null) __obj.updateDynamic("attrs")(attrs.asInstanceOf[js.Any])
    if (child != null) __obj.updateDynamic("child")(child.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (initialInputs != null) __obj.updateDynamic("initialInputs")(initialInputs.asInstanceOf[js.Any])
    if (inputs != null) __obj.updateDynamic("inputs")(inputs.asInstanceOf[js.Any])
    if (localNames != null) __obj.updateDynamic("localNames")(localNames.asInstanceOf[js.Any])
    if (mergedAttrs != null) __obj.updateDynamic("mergedAttrs")(mergedAttrs.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    if (outputs != null) __obj.updateDynamic("outputs")(outputs.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (projectionNext != null) __obj.updateDynamic("projectionNext")(projectionNext.asInstanceOf[js.Any])
    if (propertyBindings != null) __obj.updateDynamic("propertyBindings")(propertyBindings.asInstanceOf[js.Any])
    if (residualClasses != null) __obj.updateDynamic("residualClasses")(residualClasses.asInstanceOf[js.Any])
    if (residualStyles != null) __obj.updateDynamic("residualStyles")(residualStyles.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TNodeWithLocalRefs]
  }
  @scala.inline
  def TElementContainerNode(
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
    attrs: TAttributes = null,
    child: ɵangularPackagesCoreCoreBe | TTextNode | TContainerNode | typings.angularCore.mod.TElementContainerNode | TProjectionNode = null,
    classes: String = null,
    initialInputs: InitialInputData = null,
    inputs: PropertyAliases = null,
    localNames: js.Array[String | Double] = null,
    mergedAttrs: TAttributes = null,
    next: TNode = null,
    outputs: PropertyAliases = null,
    parent: ɵangularPackagesCoreCoreBe | typings.angularCore.mod.TElementContainerNode = null,
    projectionNext: TNode = null,
    propertyBindings: js.Array[Double] = null,
    residualClasses: KeyValueArray[_] = null,
    residualStyles: KeyValueArray[_] = null,
    styles: String = null,
    tagName: String = null
  ): TNodeWithLocalRefs = {
    val __obj = js.Dynamic.literal(classBindings = classBindings.asInstanceOf[js.Any], directiveEnd = directiveEnd.asInstanceOf[js.Any], directiveStart = directiveStart.asInstanceOf[js.Any], directiveStylingLast = directiveStylingLast.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], injectorIndex = injectorIndex.asInstanceOf[js.Any], projection = projection.asInstanceOf[js.Any], providerIndexes = providerIndexes.asInstanceOf[js.Any], styleBindings = styleBindings.asInstanceOf[js.Any], tViews = tViews.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (attrs != null) __obj.updateDynamic("attrs")(attrs.asInstanceOf[js.Any])
    if (child != null) __obj.updateDynamic("child")(child.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (initialInputs != null) __obj.updateDynamic("initialInputs")(initialInputs.asInstanceOf[js.Any])
    if (inputs != null) __obj.updateDynamic("inputs")(inputs.asInstanceOf[js.Any])
    if (localNames != null) __obj.updateDynamic("localNames")(localNames.asInstanceOf[js.Any])
    if (mergedAttrs != null) __obj.updateDynamic("mergedAttrs")(mergedAttrs.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    if (outputs != null) __obj.updateDynamic("outputs")(outputs.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (projectionNext != null) __obj.updateDynamic("projectionNext")(projectionNext.asInstanceOf[js.Any])
    if (propertyBindings != null) __obj.updateDynamic("propertyBindings")(propertyBindings.asInstanceOf[js.Any])
    if (residualClasses != null) __obj.updateDynamic("residualClasses")(residualClasses.asInstanceOf[js.Any])
    if (residualStyles != null) __obj.updateDynamic("residualStyles")(residualStyles.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TNodeWithLocalRefs]
  }
}

