package typings
package androiduixLib.androidNs.widgetNs.RelativeLayoutNs.DependencyGraphNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.RelativeLayout.DependencyGraph.Node")
@js.native
class Node () extends js.Object {
  var dependencies: androiduixLib.androidNs.utilNs.SparseMap[java.lang.String, Node] = js.native
  var dependents: androiduixLib.androidNs.utilNs.ArrayMap[Node, androiduixLib.androidNs.widgetNs.RelativeLayoutNs.DependencyGraph] = js.native
  var view: androiduixLib.androidNs.viewNs.View = js.native
  def release(): scala.Unit = js.native
}

/* static members */
@JSGlobal("android.widget.RelativeLayout.DependencyGraph.Node")
@js.native
object Node extends js.Object {
  var POOL_LIMIT: js.Any = js.native
  var sPool: js.Any = js.native
  def acquire(view: androiduixLib.androidNs.viewNs.View): androiduixLib.androidNs.widgetNs.RelativeLayoutNs.DependencyGraphNs.Node = js.native
}

