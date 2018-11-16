package typings
package androiduixLib.androidNs.widgetNs.AbsListViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.AbsListView.RecycleBin")
@js.native
class RecycleBin protected () extends js.Object {
  def this(arg: androiduixLib.androidNs.widgetNs.AbsListView) = this()
  var _AbsListView_this: androiduixLib.androidNs.widgetNs.AbsListView = js.native
  var mActiveViews: js.Array[androiduixLib.androidNs.viewNs.View] = js.native
  var mCurrentScrap: js.Any = js.native
  var mFirstActivePosition: js.Any = js.native
  var mRecyclerListener: RecyclerListener = js.native
  var mScrapViews: js.Any = js.native
  var mSkippedScrap: js.Any = js.native
  var mTransientStateViews: js.Any = js.native
  var mTransientStateViewsById: js.Any = js.native
  var mViewTypeCount: js.Any = js.native
  def addScrapView(scrap: androiduixLib.androidNs.viewNs.View, position: scala.Double): scala.Unit = js.native
  def clear(): scala.Unit = js.native
  def clearTransientStateViews(): scala.Unit = js.native
  def fillActiveViews(childCount: scala.Double, firstActivePosition: scala.Double): scala.Unit = js.native
  def getActiveView(position: scala.Double): androiduixLib.androidNs.viewNs.View = js.native
  def getScrapView(position: scala.Double): androiduixLib.androidNs.viewNs.View = js.native
  def getTransientStateView(position: scala.Double): androiduixLib.androidNs.viewNs.View = js.native
  def markChildrenDirty(): scala.Unit = js.native
  /* private */ def pruneScrapViews(): js.Any = js.native
  def reclaimScrapViews(views: androiduixLib.javaNs.utilNs.List[androiduixLib.androidNs.viewNs.View]): scala.Unit = js.native
  def removeSkippedScrap(): scala.Unit = js.native
  def scrapActiveViews(): scala.Unit = js.native
  def setCacheColorHint(color: scala.Double): scala.Unit = js.native
  def setViewTypeCount(viewTypeCount: scala.Double): scala.Unit = js.native
  def shouldRecycleViewType(viewType: scala.Double): scala.Boolean = js.native
}

