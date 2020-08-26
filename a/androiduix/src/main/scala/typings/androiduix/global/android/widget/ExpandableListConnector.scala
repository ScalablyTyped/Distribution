package typings.androiduix.global.android.widget

import typings.androiduix.android.widget.ExpandableListAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.ExpandableListConnector")
@js.native
class ExpandableListConnector protected ()
  extends typings.androiduix.android.widget.ExpandableListConnector {
  def this(expandableListAdapter: ExpandableListAdapter) = this()
}

@JSGlobal("android.widget.ExpandableListConnector")
@js.native
object ExpandableListConnector extends js.Object {
  @js.native
  class GroupMetadata ()
    extends typings.androiduix.android.widget.ExpandableListConnector.GroupMetadata
  
  @js.native
  class MyDataSetObserver protected ()
    extends typings.androiduix.android.widget.ExpandableListConnector.MyDataSetObserver {
    def this(arg: typings.androiduix.android.widget.ExpandableListConnector) = this()
  }
  
  @js.native
  class PositionMetadata ()
    extends typings.androiduix.android.widget.ExpandableListConnector.PositionMetadata
  
  /* static members */
  @js.native
  object GroupMetadata extends js.Object {
    var REFRESH: Double = js.native
    def obtain(flPos: Double, lastChildFlPos: Double, gPos: Double, gId: Double): typings.androiduix.android.widget.ExpandableListConnector.GroupMetadata = js.native
  }
  
  /* static members */
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
      groupMetadata: typings.androiduix.android.widget.ExpandableListConnector.GroupMetadata,
      groupInsertIndex: Double
    ): typings.androiduix.android.widget.ExpandableListConnector.PositionMetadata = js.native
  }
  
}

