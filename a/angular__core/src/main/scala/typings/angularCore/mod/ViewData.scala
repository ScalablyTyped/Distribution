package typings.angularCore.mod

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * View instance data.
  * Attention: Adding fields to this is performance sensitive!
  */
trait ViewData extends js.Object {
  var component: js.Any
  var context: js.Any
  var `def`: ɵViewDefinition
  var disposables: js.Array[DisposableFn] | Null
  var initIndex: Double
  var nodes: NumberDictionary[NodeData]
  var oldValues: js.Array[_]
  var parent: ViewData | Null
  var parentNodeDef: NodeDef | Null
  var renderer: Renderer2
  var root: RootData
  var state: ViewState
  var viewContainerParent: ViewData | Null
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
    state: ViewState,
    disposables: js.Array[DisposableFn] = null,
    parent: ViewData = null,
    parentNodeDef: NodeDef = null,
    viewContainerParent: ViewData = null
  ): ViewData = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], initIndex = initIndex.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], oldValues = oldValues.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("def")(`def`.asInstanceOf[js.Any])
    if (disposables != null) __obj.updateDynamic("disposables")(disposables.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (parentNodeDef != null) __obj.updateDynamic("parentNodeDef")(parentNodeDef.asInstanceOf[js.Any])
    if (viewContainerParent != null) __obj.updateDynamic("viewContainerParent")(viewContainerParent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewData]
  }
}

