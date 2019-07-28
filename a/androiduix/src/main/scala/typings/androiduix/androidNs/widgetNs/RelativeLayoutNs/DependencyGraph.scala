package typings.androiduix.androidNs.widgetNs.RelativeLayoutNs

import typings.androiduix.androidNs.utilNs.SparseMap
import typings.androiduix.androidNs.viewNs.View
import typings.androiduix.androidNs.widgetNs.RelativeLayoutNs.DependencyGraphNs.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.RelativeLayout.DependencyGraph")
@js.native
class DependencyGraph () extends js.Object {
  var mKeyNodes: SparseMap[String, Node] = js.native
  var mNodes: js.Any = js.native
  var mRoots: js.Any = js.native
  def add(view: View): Unit = js.native
  def clear(): Unit = js.native
  /* private */ def findRoots(rulesFilter: js.Any): js.Any = js.native
  def getSortedViews(sorted: js.Array[View], rules: js.Array[Double]): Unit = js.native
}

