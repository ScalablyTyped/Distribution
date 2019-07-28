package typings.androiduix.androidNs.widgetNs.ExpandableListConnectorNs

import typings.androiduix.androidNs.widgetNs.ExpandableListPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.ExpandableListConnector.PositionMetadata")
@js.native
class PositionMetadata () extends js.Object {
  var groupInsertIndex: Double = js.native
  var groupMetadata: GroupMetadata = js.native
  var position: ExpandableListPosition = js.native
  def isExpanded(): Boolean = js.native
  def recycle(): Unit = js.native
  /* private */ def resetState(): js.Any = js.native
}

/* static members */
@JSGlobal("android.widget.ExpandableListConnector.PositionMetadata")
@js.native
object PositionMetadata extends js.Object {
  var MAX_POOL_SIZE: js.Any = js.native
  var sPool: js.Any = js.native
  /* private */ def getRecycledOrCreate(): js.Any = js.native
  def obtain(
    flatListPos: Double,
    `type`: Double,
    groupPos: Double,
    childPos: Double,
    groupMetadata: GroupMetadata,
    groupInsertIndex: Double
  ): PositionMetadata = js.native
}

