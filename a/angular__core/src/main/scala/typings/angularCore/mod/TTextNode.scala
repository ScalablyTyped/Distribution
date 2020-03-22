package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Static data for a text node */
trait TTextNode extends TNode {
  @JSName("child")
  var child_TTextNode: Null
  /**
    * Text nodes will have parents unless they are the first node of a component or
    * embedded view (which means their parent is in a different view and must be
    * retrieved using LView.node).
    */
  @JSName("parent")
  var parent_TTextNode: ɵangularPackagesCoreCoreBe | TElementContainerNode | Null
  @JSName("projection")
  var projection_TTextNode: Null
  @JSName("tViews")
  var tViews_TTextNode: Null
}

object TTextNode {
  @scala.inline
  def apply(
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
    tViews: Null,
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
    tagName: String = null
  ): TTextNode = {
    val __obj = js.Dynamic.literal(child = child.asInstanceOf[js.Any], classBindings = classBindings.asInstanceOf[js.Any], directiveEnd = directiveEnd.asInstanceOf[js.Any], directiveStart = directiveStart.asInstanceOf[js.Any], directiveStylingLast = directiveStylingLast.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], injectorIndex = injectorIndex.asInstanceOf[js.Any], projection = projection.asInstanceOf[js.Any], providerIndexes = providerIndexes.asInstanceOf[js.Any], styleBindings = styleBindings.asInstanceOf[js.Any], tViews = tViews.asInstanceOf[js.Any])
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
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TTextNode]
  }
}

