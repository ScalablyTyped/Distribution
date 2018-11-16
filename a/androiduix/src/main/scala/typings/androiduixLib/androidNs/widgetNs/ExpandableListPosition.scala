package typings
package androiduixLib.androidNs.widgetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.ExpandableListPosition")
@js.native
class ExpandableListPosition () extends js.Object {
  var childPos: scala.Double = js.native
  var flatListPos: scala.Double = js.native
  var groupPos: scala.Double = js.native
  var `type`: scala.Double = js.native
  def getPackedPosition(): scala.Double = js.native
  def recycle(): scala.Unit = js.native
  /* private */ def resetState(): js.Any = js.native
}

@JSGlobal("android.widget.ExpandableListPosition")
@js.native
object ExpandableListPosition extends js.Object {
  var CHILD: scala.Double = js.native
  var GROUP: scala.Double = js.native
  var MAX_POOL_SIZE: js.Any = js.native
  var sPool: js.Any = js.native
  /* private */ def getRecycledOrCreate(): js.Any = js.native
  def obtain(`type`: scala.Double, groupPos: scala.Double, childPos: scala.Double, flatListPos: scala.Double): androiduixLib.androidNs.widgetNs.ExpandableListPosition = js.native
  def obtainChildPosition(groupPosition: scala.Double, childPosition: scala.Double): androiduixLib.androidNs.widgetNs.ExpandableListPosition = js.native
  def obtainGroupPosition(groupPosition: scala.Double): androiduixLib.androidNs.widgetNs.ExpandableListPosition = js.native
  def obtainPosition(packedPosition: scala.Double): androiduixLib.androidNs.widgetNs.ExpandableListPosition = js.native
}

