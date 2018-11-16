package typings
package atAngularCoreLib.srcViewTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ViewData extends js.Object {
  var component: js.Any
  var context: js.Any
  var `def`: ViewDefinition
  var disposables: js.Array[DisposableFn] | scala.Null
  var initIndex: scala.Double
  var nodes: ScalablyTyped.runtime.NumberDictionary[NodeData]
  var oldValues: js.Array[_]
  var parent: ViewData | scala.Null
  var parentNodeDef: NodeDef | scala.Null
  var renderer: atAngularCoreLib.srcRenderApiMod.Renderer2
  var root: RootData
  var state: ViewState
  var viewContainerParent: ViewData | scala.Null
}

