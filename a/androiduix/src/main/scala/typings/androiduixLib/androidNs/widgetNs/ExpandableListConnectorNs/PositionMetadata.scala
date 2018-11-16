package typings
package androiduixLib.androidNs.widgetNs.ExpandableListConnectorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.ExpandableListConnector.PositionMetadata")
@js.native
class PositionMetadata () extends js.Object {
  var groupInsertIndex: scala.Double = js.native
  var groupMetadata: GroupMetadata = js.native
  var position: androiduixLib.androidNs.widgetNs.ExpandableListPosition = js.native
  def isExpanded(): scala.Boolean = js.native
  def recycle(): scala.Unit = js.native
  /* private */ def resetState(): js.Any = js.native
}

@JSGlobal("android.widget.ExpandableListConnector.PositionMetadata")
@js.native
object PositionMetadata extends js.Object {
  var MAX_POOL_SIZE: js.Any = js.native
  var sPool: js.Any = js.native
  /* private */ def getRecycledOrCreate(): js.Any = js.native
  def obtain(
    flatListPos: scala.Double,
    `type`: scala.Double,
    groupPos: scala.Double,
    childPos: scala.Double,
    groupMetadata: androiduixLib.androidNs.widgetNs.ExpandableListConnectorNs.GroupMetadata,
    groupInsertIndex: scala.Double
  ): androiduixLib.androidNs.widgetNs.ExpandableListConnectorNs.PositionMetadata = js.native
}

