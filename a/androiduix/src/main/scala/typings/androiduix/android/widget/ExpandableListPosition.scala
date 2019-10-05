package typings.androiduix.android.widget

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.ExpandableListPosition")
@js.native
class ExpandableListPosition () extends js.Object {
  var childPos: Double = js.native
  var flatListPos: Double = js.native
  var groupPos: Double = js.native
  var `type`: Double = js.native
  def getPackedPosition(): Double = js.native
  def recycle(): Unit = js.native
  /* private */ def resetState(): js.Any = js.native
}

/* static members */
@JSGlobal("android.widget.ExpandableListPosition")
@js.native
object ExpandableListPosition extends js.Object {
  var CHILD: Double = js.native
  var GROUP: Double = js.native
  var MAX_POOL_SIZE: js.Any = js.native
  var sPool: js.Any = js.native
  /* private */ def getRecycledOrCreate(): js.Any = js.native
  def obtain(`type`: Double, groupPos: Double, childPos: Double, flatListPos: Double): ExpandableListPosition = js.native
  def obtainChildPosition(groupPosition: Double, childPosition: Double): ExpandableListPosition = js.native
  def obtainGroupPosition(groupPosition: Double): ExpandableListPosition = js.native
  def obtainPosition(packedPosition: Double): ExpandableListPosition = js.native
}

