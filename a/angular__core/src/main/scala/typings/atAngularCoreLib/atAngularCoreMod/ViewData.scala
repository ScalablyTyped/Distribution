package typings
package atAngularCoreLib.atAngularCoreMod

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
  var disposables: js.Array[DisposableFn] | scala.Null
  var initIndex: scala.Double
  var nodes: org.scalablytyped.runtime.NumberDictionary[NodeData]
  var oldValues: js.Array[_]
  var parent: ViewData | scala.Null
  var parentNodeDef: NodeDef | scala.Null
  var renderer: Renderer2
  var root: RootData
  var state: ViewState
  var viewContainerParent: ViewData | scala.Null
}

object ViewData {
  @scala.inline
  def apply(
    component: js.Any,
    context: js.Any,
    `def`: ɵViewDefinition,
    initIndex: scala.Double,
    nodes: org.scalablytyped.runtime.NumberDictionary[NodeData],
    oldValues: js.Array[_],
    renderer: Renderer2,
    root: RootData,
    state: ViewState,
    disposables: js.Array[DisposableFn] = null,
    parent: ViewData = null,
    parentNodeDef: NodeDef = null,
    viewContainerParent: ViewData = null
  ): ViewData = {
    val __obj = js.Dynamic.literal(component = component, context = context, initIndex = initIndex, nodes = nodes, oldValues = oldValues, renderer = renderer, root = root, state = state)
    __obj.updateDynamic("def")(`def`)
    if (disposables != null) __obj.updateDynamic("disposables")(disposables)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (parentNodeDef != null) __obj.updateDynamic("parentNodeDef")(parentNodeDef)
    if (viewContainerParent != null) __obj.updateDynamic("viewContainerParent")(viewContainerParent)
    __obj.asInstanceOf[ViewData]
  }
}

