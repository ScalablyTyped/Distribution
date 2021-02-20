package typings.androiduix.global.android.widget

import typings.androiduix.android.widget.ExpandableListAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("android.widget.ExpandableListConnector")
@js.native
class ExpandableListConnector protected ()
  extends typings.androiduix.android.widget.ExpandableListConnector {
  def this(expandableListAdapter: ExpandableListAdapter) = this()
}
object ExpandableListConnector {
  
  @JSGlobal("android.widget.ExpandableListConnector.GroupMetadata")
  @js.native
  class GroupMetadata ()
    extends typings.androiduix.android.widget.ExpandableListConnector.GroupMetadata
  object GroupMetadata {
    
    @JSGlobal("android.widget.ExpandableListConnector.GroupMetadata")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("android.widget.ExpandableListConnector.GroupMetadata.REFRESH")
    @js.native
    def REFRESH: Double = js.native
    @scala.inline
    def REFRESH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REFRESH")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.widget.ExpandableListConnector.GroupMetadata.obtain")
    @js.native
    def obtain(flPos: Double, lastChildFlPos: Double, gPos: Double, gId: Double): typings.androiduix.android.widget.ExpandableListConnector.GroupMetadata = js.native
  }
  
  @JSGlobal("android.widget.ExpandableListConnector.MyDataSetObserver")
  @js.native
  class MyDataSetObserver protected ()
    extends typings.androiduix.android.widget.ExpandableListConnector.MyDataSetObserver {
    def this(arg: typings.androiduix.android.widget.ExpandableListConnector) = this()
  }
  
  @JSGlobal("android.widget.ExpandableListConnector.PositionMetadata")
  @js.native
  class PositionMetadata ()
    extends typings.androiduix.android.widget.ExpandableListConnector.PositionMetadata
  object PositionMetadata {
    
    @JSGlobal("android.widget.ExpandableListConnector.PositionMetadata")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("android.widget.ExpandableListConnector.PositionMetadata.MAX_POOL_SIZE")
    @js.native
    def MAX_POOL_SIZE: js.Any = js.native
    @scala.inline
    def MAX_POOL_SIZE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_POOL_SIZE")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.widget.ExpandableListConnector.PositionMetadata.getRecycledOrCreate")
    @js.native
    def getRecycledOrCreate(): js.Any = js.native
    
    /* static member */
    @JSGlobal("android.widget.ExpandableListConnector.PositionMetadata.obtain")
    @js.native
    def obtain(
      flatListPos: Double,
      `type`: Double,
      groupPos: Double,
      childPos: Double,
      groupMetadata: typings.androiduix.android.widget.ExpandableListConnector.GroupMetadata,
      groupInsertIndex: Double
    ): typings.androiduix.android.widget.ExpandableListConnector.PositionMetadata = js.native
    
    /* static member */
    @JSGlobal("android.widget.ExpandableListConnector.PositionMetadata.sPool")
    @js.native
    def sPool: js.Any = js.native
    @scala.inline
    def sPool_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sPool")(x.asInstanceOf[js.Any])
  }
}
