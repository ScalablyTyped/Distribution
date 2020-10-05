package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  */
@js.native
trait LFrame extends js.Object {
  /**
    * Current pointer to the binding index.
    */
  var bindingIndex: Double = js.native
  /**
    * The root index from which pure function instructions should calculate their binding
    * indices. In component views, this is TView.bindingStartIndex. In a host binding
    * context, this is the TView.expandoStartIndex + any dirs/hostVars before the given dir.
    */
  var bindingRootIndex: Double = js.native
  /**
    * Child LFrame.
    *
    * This is used to cache existing LFrames to relieve the memory pressure.
    */
  var child: LFrame | Null = js.native
  /**
    * The last viewData retrieved by nextContext().
    * Allows building nextContext() and reference() calls.
    *
    * e.g. const inner = x().$implicit; const outer = x().$implicit;
    */
  var contextLView: ɵangularPackagesCoreCoreBp = js.native
  /**
    * When host binding is executing this points to the directive index.
    * `TView.data[currentDirectiveIndex]` is `DirectiveDef`
    * `LView[currentDirectiveIndex]` is directive instance.
    */
  var currentDirectiveIndex: Double = js.native
  /**
    * Current namespace to be used when creating elements
    */
  var currentNamespace: String | Null = js.native
  /**
    * Current index of a View or Content Query which needs to be processed next.
    * We iterate over the list of Queries and increment current query index at every step.
    */
  var currentQueryIndex: Double = js.native
  /**
    * Store the element depth count. This is used to identify the root elements of the template
    * so that we can then attach patch data `LView` to only those elements. We know that those
    * are the only places where the patch data could change, this way we will save on number
    * of places where tha patching occurs.
    */
  var elementDepthCount: Double = js.native
  /**
    * If `isParent` is:
    *  - `true`: then `previousOrParentTNode` points to a parent node.
    *  - `false`: then `previousOrParentTNode` points to previous node (sibling).
    */
  var isParent: Boolean = js.native
  /**
    * State of the current view being processed.
    *
    * An array of nodes (text, element, container, etc), pipes, their bindings, and
    * any local variables that need to be stored between invocations.
    */
  var lView: ɵangularPackagesCoreCoreBp = js.native
  /**
    * Parent LFrame.
    *
    * This is needed when `leaveView` is called to restore the previous state.
    */
  var parent: LFrame = js.native
  /**
    * Used to set the parent property when nodes are created and track query results.
    *
    * This is used in conjunction with `isParent`.
    */
  var previousOrParentTNode: TNode = js.native
  /**
    * Index of currently selected element in LView.
    *
    * Used by binding instructions. Updated as part of advance instruction.
    */
  var selectedIndex: Double = js.native
  /**
    * Current `TView` associated with the `LFrame.lView`.
    *
    * One can get `TView` from `lFrame[TVIEW]` however because it is so common it makes sense to
    * store it in `LFrame` for perf reasons.
    */
  var tView: TView = js.native
}

object LFrame {
  @scala.inline
  def apply(
    bindingIndex: Double,
    bindingRootIndex: Double,
    contextLView: ɵangularPackagesCoreCoreBp,
    currentDirectiveIndex: Double,
    currentQueryIndex: Double,
    elementDepthCount: Double,
    isParent: Boolean,
    lView: ɵangularPackagesCoreCoreBp,
    parent: LFrame,
    previousOrParentTNode: TNode,
    selectedIndex: Double,
    tView: TView
  ): LFrame = {
    val __obj = js.Dynamic.literal(bindingIndex = bindingIndex.asInstanceOf[js.Any], bindingRootIndex = bindingRootIndex.asInstanceOf[js.Any], contextLView = contextLView.asInstanceOf[js.Any], currentDirectiveIndex = currentDirectiveIndex.asInstanceOf[js.Any], currentQueryIndex = currentQueryIndex.asInstanceOf[js.Any], elementDepthCount = elementDepthCount.asInstanceOf[js.Any], isParent = isParent.asInstanceOf[js.Any], lView = lView.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], previousOrParentTNode = previousOrParentTNode.asInstanceOf[js.Any], selectedIndex = selectedIndex.asInstanceOf[js.Any], tView = tView.asInstanceOf[js.Any])
    __obj.asInstanceOf[LFrame]
  }
  @scala.inline
  implicit class LFrameOps[Self <: LFrame] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBindingIndex(value: Double): Self = this.set("bindingIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setBindingRootIndex(value: Double): Self = this.set("bindingRootIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setContextLView(value: ɵangularPackagesCoreCoreBp): Self = this.set("contextLView", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentDirectiveIndex(value: Double): Self = this.set("currentDirectiveIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentQueryIndex(value: Double): Self = this.set("currentQueryIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setElementDepthCount(value: Double): Self = this.set("elementDepthCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsParent(value: Boolean): Self = this.set("isParent", value.asInstanceOf[js.Any])
    @scala.inline
    def setLView(value: ɵangularPackagesCoreCoreBp): Self = this.set("lView", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: LFrame): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreviousOrParentTNode(value: TNode): Self = this.set("previousOrParentTNode", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectedIndex(value: Double): Self = this.set("selectedIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setTView(value: TView): Self = this.set("tView", value.asInstanceOf[js.Any])
    @scala.inline
    def setChild(value: LFrame): Self = this.set("child", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildNull: Self = this.set("child", null)
    @scala.inline
    def setCurrentNamespace(value: String): Self = this.set("currentNamespace", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentNamespaceNull: Self = this.set("currentNamespace", null)
  }
  
}

