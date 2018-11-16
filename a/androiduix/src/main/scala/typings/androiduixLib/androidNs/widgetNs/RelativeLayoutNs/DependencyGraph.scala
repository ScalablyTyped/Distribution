package typings
package androiduixLib.androidNs.widgetNs.RelativeLayoutNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.RelativeLayout.DependencyGraph")
@js.native
class DependencyGraph () extends js.Object {
  var mKeyNodes: androiduixLib.androidNs.utilNs.SparseMap[
    java.lang.String, 
    androiduixLib.androidNs.widgetNs.RelativeLayoutNs.DependencyGraphNs.Node
  ] = js.native
  var mNodes: js.Any = js.native
  var mRoots: js.Any = js.native
  def add(view: androiduixLib.androidNs.viewNs.View): scala.Unit = js.native
  def clear(): scala.Unit = js.native
  /* private */ def findRoots(rulesFilter: js.Any): js.Any = js.native
  def getSortedViews(sorted: js.Array[androiduixLib.androidNs.viewNs.View], rules: js.Array[scala.Double]): scala.Unit = js.native
}

