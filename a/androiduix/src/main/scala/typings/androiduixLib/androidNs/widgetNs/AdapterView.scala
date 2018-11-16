package typings
package androiduixLib.androidNs.widgetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.AdapterView")
@js.native
abstract class AdapterView[T /* <: Adapter */] ()
  extends androiduixLib.androidNs.viewNs.ViewGroup {
  var mBlockLayoutRequests: scala.Boolean = js.native
  var mDataChanged: scala.Boolean = js.native
  var mDesiredFocusableInTouchModeState: js.Any = js.native
  var mDesiredFocusableState: js.Any = js.native
  var mEmptyView: js.Any = js.native
  var mFirstPosition: scala.Double = js.native
  var mInLayout: scala.Boolean = js.native
  var mItemCount: scala.Double = js.native
  var mLayoutHeight: js.Any = js.native
  var mNeedSync: scala.Boolean = js.native
  var mNextSelectedPosition: scala.Double = js.native
  var mNextSelectedRowId: scala.Double = js.native
  var mOldItemCount: scala.Double = js.native
  var mOldSelectedPosition: scala.Double = js.native
  var mOldSelectedRowId: scala.Double = js.native
  var mOnItemClickListener: js.Any = js.native
  var mOnItemLongClickListener: androiduixLib.androidNs.widgetNs.AdapterViewNs.OnItemLongClickListener = js.native
  var mOnItemSelectedListener: js.Any = js.native
  var mSelectedPosition: scala.Double = js.native
  var mSelectedRowId: scala.Double = js.native
  var mSelectionNotifier: js.Any = js.native
  var mSpecificTop: scala.Double = js.native
  var mSyncHeight: scala.Double = js.native
  var mSyncMode: scala.Double = js.native
  var mSyncPosition: scala.Double = js.native
  var mSyncRowId: scala.Double = js.native
  def checkFocus(): scala.Unit = js.native
  def checkSelectionChanged(): scala.Unit = js.native
  def findSyncPosition(): scala.Double = js.native
  /* private */ def fireOnSelected(): js.Any = js.native
  def getAdapter(): T = js.native
  def getCount(): scala.Double = js.native
  def getEmptyView(): androiduixLib.androidNs.viewNs.View = js.native
  def getFirstVisiblePosition(): scala.Double = js.native
  def getItemAtPosition(position: scala.Double): js.Any = js.native
  def getItemIdAtPosition(position: scala.Double): scala.Double = js.native
  def getLastVisiblePosition(): scala.Double = js.native
  def getOnItemClickListener(): androiduixLib.androidNs.widgetNs.AdapterViewNs.OnItemClickListener = js.native
  def getOnItemLongClickListener(): androiduixLib.androidNs.widgetNs.AdapterViewNs.OnItemLongClickListener = js.native
  def getOnItemSelectedListener(): androiduixLib.androidNs.widgetNs.AdapterViewNs.OnItemSelectedListener = js.native
  def getPositionForView(view: androiduixLib.androidNs.viewNs.View): scala.Double = js.native
  def getSelectedItem(): js.Any = js.native
  def getSelectedItemId(): scala.Double = js.native
  def getSelectedItemPosition(): scala.Double = js.native
  def getSelectedView(): androiduixLib.androidNs.viewNs.View = js.native
  def handleDataChanged(): scala.Unit = js.native
  def isInFilterMode(): scala.Boolean = js.native
  /* private */ def isScrollableForAccessibility(): js.Any = js.native
  def lookForSelectablePosition(position: scala.Double, lookDown: scala.Boolean): scala.Double = js.native
  /* private */ def performAccessibilityActionsOnSelected(): js.Any = js.native
  def performItemClick(view: androiduixLib.androidNs.viewNs.View, position: scala.Double, id: scala.Double): scala.Boolean = js.native
  def rememberSyncState(): scala.Unit = js.native
  /* private */ def selectionChanged(): js.Any = js.native
  def setAdapter(adapter: T): scala.Unit = js.native
  def setEmptyView(emptyView: androiduixLib.androidNs.viewNs.View): scala.Unit = js.native
  def setNextSelectedPositionInt(position: scala.Double): scala.Unit = js.native
  def setOnItemClickListener(listener: androiduixLib.androidNs.widgetNs.AdapterViewNs.OnItemClickListener): scala.Unit = js.native
  def setOnItemLongClickListener(listener: androiduixLib.androidNs.widgetNs.AdapterViewNs.OnItemLongClickListener): scala.Unit = js.native
  def setOnItemSelectedListener(listener: androiduixLib.androidNs.widgetNs.AdapterViewNs.OnItemSelectedListener): scala.Unit = js.native
  def setSelectedPositionInt(position: scala.Double): scala.Unit = js.native
  def setSelection(position: scala.Double): scala.Unit = js.native
  /* private */ def updateEmptyStatus(empty: js.Any): js.Any = js.native
}

@JSGlobal("android.widget.AdapterView")
@js.native
object AdapterView extends js.Object {
  var INVALID_POSITION: scala.Double = js.native
  var INVALID_ROW_ID: scala.Double = js.native
  var ITEM_VIEW_TYPE_HEADER_OR_FOOTER: scala.Double = js.native
  var ITEM_VIEW_TYPE_IGNORE: scala.Double = js.native
  var SYNC_FIRST_POSITION: scala.Double = js.native
  var SYNC_MAX_DURATION_MILLIS: scala.Double = js.native
  var SYNC_SELECTED_POSITION: scala.Double = js.native
}

