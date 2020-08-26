package typings.angularCore.mod

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * View instance data.
  * Attention: Adding fields to this is performance sensitive!
  */
@js.native
trait ViewData extends js.Object {
  var component: js.Any = js.native
  var context: js.Any = js.native
  var `def`: ɵViewDefinition = js.native
  var disposables: js.Array[DisposableFn] | Null = js.native
  var initIndex: Double = js.native
  var nodes: NumberDictionary[NodeData] = js.native
  var oldValues: js.Array[_] = js.native
  var parent: ViewData | Null = js.native
  var parentNodeDef: NodeDef | Null = js.native
  var renderer: Renderer2 = js.native
  var root: RootData = js.native
  var state: ViewState = js.native
  var viewContainerParent: ViewData | Null = js.native
}

object ViewData {
  @scala.inline
  def apply(
    component: js.Any,
    context: js.Any,
    `def`: ɵViewDefinition,
    initIndex: Double,
    nodes: NumberDictionary[NodeData],
    oldValues: js.Array[_],
    renderer: Renderer2,
    root: RootData,
    state: ViewState
  ): ViewData = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], initIndex = initIndex.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], oldValues = oldValues.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("def")(`def`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewData]
  }
  @scala.inline
  implicit class ViewDataOps[Self <: ViewData] (val x: Self) extends AnyVal {
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
    def setComponent(value: js.Any): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def setContext(value: js.Any): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setDef(value: ɵViewDefinition): Self = this.set("def", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitIndex(value: Double): Self = this.set("initIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodes(value: NumberDictionary[NodeData]): Self = this.set("nodes", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldValuesVarargs(value: js.Any*): Self = this.set("oldValues", js.Array(value :_*))
    @scala.inline
    def setOldValues(value: js.Array[_]): Self = this.set("oldValues", value.asInstanceOf[js.Any])
    @scala.inline
    def setRenderer(value: Renderer2): Self = this.set("renderer", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoot(value: RootData): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: ViewState): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisposablesVarargs(value: DisposableFn*): Self = this.set("disposables", js.Array(value :_*))
    @scala.inline
    def setDisposables(value: js.Array[DisposableFn]): Self = this.set("disposables", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisposablesNull: Self = this.set("disposables", null)
    @scala.inline
    def setParent(value: ViewData): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentNull: Self = this.set("parent", null)
    @scala.inline
    def setParentNodeDef(value: NodeDef): Self = this.set("parentNodeDef", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentNodeDefNull: Self = this.set("parentNodeDef", null)
    @scala.inline
    def setViewContainerParent(value: ViewData): Self = this.set("viewContainerParent", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewContainerParentNull: Self = this.set("viewContainerParent", null)
  }
  
}

