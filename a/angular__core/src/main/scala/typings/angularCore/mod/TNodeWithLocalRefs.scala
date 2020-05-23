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
    classesWithoutHost: String = null,
    initialInputs: js.UndefOr[Null | InitialInputData] = js.undefined,
    inputs: PropertyAliases = null,
    localNames: js.Array[String | Double] = null,
    mergedAttrs: TAttributes = null,
    next: TNode = null,
    outputs: PropertyAliases = null,
    parent: ɵangularPackagesCoreCoreBe | TElementContainerNode = null,
    projectionNext: TNode = null,
    propertyBindings: js.Array[Double] = null,
    residualClasses: js.UndefOr[Null | KeyValueArray[_]] = js.undefined,
    residualStyles: js.UndefOr[Null | KeyValueArray[_]] = js.undefined,
    styles: String = null,
    stylesWithoutHost: String = null,
    tViews: TView | js.Array[TView] = null,
    tagName: String = null
  ): TNodeWithLocalRefs = {
    val __obj = js.Dynamic.literal(child = child.asInstanceOf[js.Any], classBindings = classBindings.asInstanceOf[js.Any], directiveEnd = directiveEnd.asInstanceOf[js.Any], directiveStart = directiveStart.asInstanceOf[js.Any], directiveStylingLast = directiveStylingLast.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], injectorIndex = injectorIndex.asInstanceOf[js.Any], projection = projection.asInstanceOf[js.Any], providerIndexes = providerIndexes.asInstanceOf[js.Any], styleBindings = styleBindings.asInstanceOf[js.Any], attrs = attrs.asInstanceOf[js.Any], classes = classes.asInstanceOf[js.Any], classesWithoutHost = classesWithoutHost.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], localNames = localNames.asInstanceOf[js.Any], mergedAttrs = mergedAttrs.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], projectionNext = projectionNext.asInstanceOf[js.Any], propertyBindings = propertyBindings.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], stylesWithoutHost = stylesWithoutHost.asInstanceOf[js.Any], tViews = tViews.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(initialInputs)) __obj.updateDynamic("initialInputs")(initialInputs.asInstanceOf[js.Any])
    if (!js.isUndefined(residualClasses)) __obj.updateDynamic("residualClasses")(residualClasses.asInstanceOf[js.Any])
    if (!js.isUndefined(residualStyles)) __obj.updateDynamic("residualStyles")(residualStyles.asInstanceOf[js.Any])
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
    classesWithoutHost: String = null,
    initialInputs: js.UndefOr[Null | InitialInputData] = js.undefined,
    inputs: PropertyAliases = null,
    localNames: js.Array[String | Double] = null,
    mergedAttrs: TAttributes = null,
    next: TNode = null,
    outputs: PropertyAliases = null,
    parent: typings.angularCore.mod.ɵangularPackagesCoreCoreBe | TElementContainerNode = null,
    projection: js.Array[TNode | js.Array[RNode]] = null,
    projectionNext: TNode = null,
    propertyBindings: js.Array[Double] = null,
    residualClasses: js.UndefOr[Null | KeyValueArray[_]] = js.undefined,
    residualStyles: js.UndefOr[Null | KeyValueArray[_]] = js.undefined,
    styles: String = null,
    stylesWithoutHost: String = null,
    tagName: String = null
  ): TNodeWithLocalRefs = {
    val __obj = js.Dynamic.literal(classBindings = classBindings.asInstanceOf[js.Any], directiveEnd = directiveEnd.asInstanceOf[js.Any], directiveStart = directiveStart.asInstanceOf[js.Any], directiveStylingLast = directiveStylingLast.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], injectorIndex = injectorIndex.asInstanceOf[js.Any], providerIndexes = providerIndexes.asInstanceOf[js.Any], styleBindings = styleBindings.asInstanceOf[js.Any], tViews = tViews.asInstanceOf[js.Any], attrs = attrs.asInstanceOf[js.Any], child = child.asInstanceOf[js.Any], classes = classes.asInstanceOf[js.Any], classesWithoutHost = classesWithoutHost.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], localNames = localNames.asInstanceOf[js.Any], mergedAttrs = mergedAttrs.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], projection = projection.asInstanceOf[js.Any], projectionNext = projectionNext.asInstanceOf[js.Any], propertyBindings = propertyBindings.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], stylesWithoutHost = stylesWithoutHost.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(initialInputs)) __obj.updateDynamic("initialInputs")(initialInputs.asInstanceOf[js.Any])
    if (!js.isUndefined(residualClasses)) __obj.updateDynamic("residualClasses")(residualClasses.asInstanceOf[js.Any])
    if (!js.isUndefined(residualStyles)) __obj.updateDynamic("residualStyles")(residualStyles.asInstanceOf[js.Any])
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
    classesWithoutHost: String = null,
    initialInputs: js.UndefOr[Null | InitialInputData] = js.undefined,
    inputs: PropertyAliases = null,
    localNames: js.Array[String | Double] = null,
    mergedAttrs: TAttributes = null,
    next: TNode = null,
    outputs: PropertyAliases = null,
    parent: ɵangularPackagesCoreCoreBe | typings.angularCore.mod.TElementContainerNode = null,
    projectionNext: TNode = null,
    propertyBindings: js.Array[Double] = null,
    residualClasses: js.UndefOr[Null | KeyValueArray[_]] = js.undefined,
    residualStyles: js.UndefOr[Null | KeyValueArray[_]] = js.undefined,
    styles: String = null,
    stylesWithoutHost: String = null,
    tagName: String = null
  ): TNodeWithLocalRefs = {
    val __obj = js.Dynamic.literal(classBindings = classBindings.asInstanceOf[js.Any], directiveEnd = directiveEnd.asInstanceOf[js.Any], directiveStart = directiveStart.asInstanceOf[js.Any], directiveStylingLast = directiveStylingLast.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], injectorIndex = injectorIndex.asInstanceOf[js.Any], projection = projection.asInstanceOf[js.Any], providerIndexes = providerIndexes.asInstanceOf[js.Any], styleBindings = styleBindings.asInstanceOf[js.Any], tViews = tViews.asInstanceOf[js.Any], attrs = attrs.asInstanceOf[js.Any], child = child.asInstanceOf[js.Any], classes = classes.asInstanceOf[js.Any], classesWithoutHost = classesWithoutHost.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], localNames = localNames.asInstanceOf[js.Any], mergedAttrs = mergedAttrs.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], projectionNext = projectionNext.asInstanceOf[js.Any], propertyBindings = propertyBindings.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], stylesWithoutHost = stylesWithoutHost.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(initialInputs)) __obj.updateDynamic("initialInputs")(initialInputs.asInstanceOf[js.Any])
    if (!js.isUndefined(residualClasses)) __obj.updateDynamic("residualClasses")(residualClasses.asInstanceOf[js.Any])
    if (!js.isUndefined(residualStyles)) __obj.updateDynamic("residualStyles")(residualStyles.asInstanceOf[js.Any])
    __obj.asInstanceOf[TNodeWithLocalRefs]
  }
}

