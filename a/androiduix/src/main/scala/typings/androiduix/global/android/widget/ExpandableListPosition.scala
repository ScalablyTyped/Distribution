package typings.androiduix.global.android.widget

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("android.widget.ExpandableListPosition")
@js.native
class ExpandableListPosition ()
  extends typings.androiduix.android.widget.ExpandableListPosition
object ExpandableListPosition {
  
  @JSGlobal("android.widget.ExpandableListPosition")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("android.widget.ExpandableListPosition.CHILD")
  @js.native
  def CHILD: Double = js.native
  @scala.inline
  def CHILD_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHILD")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.widget.ExpandableListPosition.GROUP")
  @js.native
  def GROUP: Double = js.native
  @scala.inline
  def GROUP_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GROUP")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.widget.ExpandableListPosition.MAX_POOL_SIZE")
  @js.native
  def MAX_POOL_SIZE: js.Any = js.native
  @scala.inline
  def MAX_POOL_SIZE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_POOL_SIZE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.widget.ExpandableListPosition.getRecycledOrCreate")
  @js.native
  def getRecycledOrCreate(): js.Any = js.native
  
  /* static member */
  @JSGlobal("android.widget.ExpandableListPosition.obtain")
  @js.native
  def obtain(`type`: Double, groupPos: Double, childPos: Double, flatListPos: Double): typings.androiduix.android.widget.ExpandableListPosition = js.native
  
  /* static member */
  @JSGlobal("android.widget.ExpandableListPosition.obtainChildPosition")
  @js.native
  def obtainChildPosition(groupPosition: Double, childPosition: Double): typings.androiduix.android.widget.ExpandableListPosition = js.native
  
  /* static member */
  @JSGlobal("android.widget.ExpandableListPosition.obtainGroupPosition")
  @js.native
  def obtainGroupPosition(groupPosition: Double): typings.androiduix.android.widget.ExpandableListPosition = js.native
  
  /* static member */
  @JSGlobal("android.widget.ExpandableListPosition.obtainPosition")
  @js.native
  def obtainPosition(packedPosition: Double): typings.androiduix.android.widget.ExpandableListPosition = js.native
  
  /* static member */
  @JSGlobal("android.widget.ExpandableListPosition.sPool")
  @js.native
  def sPool: js.Any = js.native
  @scala.inline
  def sPool_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sPool")(x.asInstanceOf[js.Any])
}
