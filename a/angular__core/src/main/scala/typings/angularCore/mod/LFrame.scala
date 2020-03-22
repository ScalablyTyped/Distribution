package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  */
trait LFrame extends js.Object {
  /**
    * Current pointer to the binding index.
    */
  var bindingIndex: Double
  /**
    * The root index from which pure function instructions should calculate their binding
    * indices. In component views, this is TView.bindingStartIndex. In a host binding
    * context, this is the TView.expandoStartIndex + any dirs/hostVars before the given dir.
    */
  var bindingRootIndex: Double
  /**
    * Child LFrame.
    *
    * This is used to cache existing LFrames to relieve the memory pressure.
    */
  var child: LFrame | Null
  /**
    * The last viewData retrieved by nextContext().
    * Allows building nextContext() and reference() calls.
    *
    * e.g. const inner = x().$implicit; const outer = x().$implicit;
    */
  var contextLView: ɵangularPackagesCoreCoreBo
  /**
    * When host binding is executing this points to the directive index.
    * `TView.data[currentDirectiveIndex]` is `DirectiveDef`
    * `LView[currentDirectiveIndex]` is directive instance.
    */
  var currentDirectiveIndex: Double
  /**
    * Current namespace to be used when creating elements
    */
  var currentNamespace: String | Null
  /**
    * Current index of a View or Content Query which needs to be processed next.
    * We iterate over the list of Queries and increment current query index at every step.
    */
  var currentQueryIndex: Double
  /**
    * Current sanitizer
    */
  var currentSanitizer: StyleSanitizeFn | Null
  /**
    * Store the element depth count. This is used to identify the root elements of the template
    * so that we can then attach patch data `LView` to only those elements. We know that those
    * are the only places where the patch data could change, this way we will save on number
    * of places where tha patching occurs.
    */
  var elementDepthCount: Double
  /**
    * If `isParent` is:
    *  - `true`: then `previousOrParentTNode` points to a parent node.
    *  - `false`: then `previousOrParentTNode` points to previous node (sibling).
    */
  var isParent: Boolean
  /**
    * State of the current view being processed.
    *
    * An array of nodes (text, element, container, etc), pipes, their bindings, and
    * any local variables that need to be stored between invocations.
    */
  var lView: ɵangularPackagesCoreCoreBo
  /**
    * Parent LFrame.
    *
    * This is needed when `leaveView` is called to restore the previous state.
    */
  var parent: LFrame
  /**
    * Used to set the parent property when nodes are created and track query results.
    *
    * This is used in conjunction with `isParent`.
    */
  var previousOrParentTNode: TNode
  /**
    * Index of currently selected element in LView.
    *
    * Used by binding instructions. Updated as part of advance instruction.
    */
  var selectedIndex: Double
  /**
    * Current `TView` associated with the `LFrame.lView`.
    *
    * One can get `TView` from `lFrame[TVIEW]` however because it is so common it makes sense to
    * store it in `LFrame` for perf reasons.
    */
  var tView: TView
}

object LFrame {
  @scala.inline
  def apply(
    bindingIndex: Double,
    bindingRootIndex: Double,
    contextLView: ɵangularPackagesCoreCoreBo,
    currentDirectiveIndex: Double,
    currentQueryIndex: Double,
    elementDepthCount: Double,
    isParent: Boolean,
    lView: ɵangularPackagesCoreCoreBo,
    parent: LFrame,
    previousOrParentTNode: TNode,
    selectedIndex: Double,
    tView: TView,
    child: LFrame = null,
    currentNamespace: String = null,
    currentSanitizer: (/* prop */ String, /* value */ String | ɵSafeValue | Null, /* mode */ js.UndefOr[StyleSanitizeMode]) => js.Any = null
  ): LFrame = {
    val __obj = js.Dynamic.literal(bindingIndex = bindingIndex.asInstanceOf[js.Any], bindingRootIndex = bindingRootIndex.asInstanceOf[js.Any], contextLView = contextLView.asInstanceOf[js.Any], currentDirectiveIndex = currentDirectiveIndex.asInstanceOf[js.Any], currentQueryIndex = currentQueryIndex.asInstanceOf[js.Any], elementDepthCount = elementDepthCount.asInstanceOf[js.Any], isParent = isParent.asInstanceOf[js.Any], lView = lView.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], previousOrParentTNode = previousOrParentTNode.asInstanceOf[js.Any], selectedIndex = selectedIndex.asInstanceOf[js.Any], tView = tView.asInstanceOf[js.Any])
    if (child != null) __obj.updateDynamic("child")(child.asInstanceOf[js.Any])
    if (currentNamespace != null) __obj.updateDynamic("currentNamespace")(currentNamespace.asInstanceOf[js.Any])
    if (currentSanitizer != null) __obj.updateDynamic("currentSanitizer")(js.Any.fromFunction3(currentSanitizer))
    __obj.asInstanceOf[LFrame]
  }
}

