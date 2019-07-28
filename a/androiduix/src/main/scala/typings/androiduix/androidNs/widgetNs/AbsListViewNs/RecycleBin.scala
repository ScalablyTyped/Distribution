package typings.androiduix.androidNs.widgetNs.AbsListViewNs

import typings.androiduix.androidNs.viewNs.View
import typings.androiduix.androidNs.widgetNs.AbsListView
import typings.androiduix.javaNs.utilNs.List
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.AbsListView.RecycleBin")
@js.native
class RecycleBin protected () extends js.Object {
  def this(arg: AbsListView) = this()
  var _AbsListView_this: AbsListView = js.native
  var mActiveViews: js.Array[View] = js.native
  var mCurrentScrap: js.Any = js.native
  var mFirstActivePosition: js.Any = js.native
  var mRecyclerListener: RecyclerListener = js.native
  var mScrapViews: js.Any = js.native
  var mSkippedScrap: js.Any = js.native
  var mTransientStateViews: js.Any = js.native
  var mTransientStateViewsById: js.Any = js.native
  var mViewTypeCount: js.Any = js.native
  def addScrapView(scrap: View, position: Double): Unit = js.native
  def clear(): Unit = js.native
  def clearTransientStateViews(): Unit = js.native
  def fillActiveViews(childCount: Double, firstActivePosition: Double): Unit = js.native
  def getActiveView(position: Double): View = js.native
  def getScrapView(position: Double): View = js.native
  def getTransientStateView(position: Double): View = js.native
  def markChildrenDirty(): Unit = js.native
  /* private */ def pruneScrapViews(): js.Any = js.native
  def reclaimScrapViews(views: List[View]): Unit = js.native
  def removeSkippedScrap(): Unit = js.native
  def scrapActiveViews(): Unit = js.native
  def setCacheColorHint(color: Double): Unit = js.native
  def setViewTypeCount(viewTypeCount: Double): Unit = js.native
  def shouldRecycleViewType(viewType: Double): Boolean = js.native
}

