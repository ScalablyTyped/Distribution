package typings.androiduix.android.widget.AbsListView

import typings.androiduix.android.view.View
import typings.androiduix.java_.util.List
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecycleBin extends js.Object {
  var _AbsListView_this: typings.androiduix.android.widget.AbsListView = js.native
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

object RecycleBin {
  @scala.inline
  def apply(
    _AbsListView_this: typings.androiduix.android.widget.AbsListView,
    addScrapView: (View, Double) => Unit,
    clear: () => Unit,
    clearTransientStateViews: () => Unit,
    fillActiveViews: (Double, Double) => Unit,
    getActiveView: Double => View,
    getScrapView: Double => View,
    getTransientStateView: Double => View,
    mActiveViews: js.Array[View],
    mCurrentScrap: js.Any,
    mFirstActivePosition: js.Any,
    mRecyclerListener: RecyclerListener,
    mScrapViews: js.Any,
    mSkippedScrap: js.Any,
    mTransientStateViews: js.Any,
    mTransientStateViewsById: js.Any,
    mViewTypeCount: js.Any,
    markChildrenDirty: () => Unit,
    pruneScrapViews: () => js.Any,
    reclaimScrapViews: List[View] => Unit,
    removeSkippedScrap: () => Unit,
    scrapActiveViews: () => Unit,
    setCacheColorHint: Double => Unit,
    setViewTypeCount: Double => Unit,
    shouldRecycleViewType: Double => Boolean
  ): RecycleBin = {
    val __obj = js.Dynamic.literal(_AbsListView_this = _AbsListView_this.asInstanceOf[js.Any], addScrapView = js.Any.fromFunction2(addScrapView), clear = js.Any.fromFunction0(clear), clearTransientStateViews = js.Any.fromFunction0(clearTransientStateViews), fillActiveViews = js.Any.fromFunction2(fillActiveViews), getActiveView = js.Any.fromFunction1(getActiveView), getScrapView = js.Any.fromFunction1(getScrapView), getTransientStateView = js.Any.fromFunction1(getTransientStateView), mActiveViews = mActiveViews.asInstanceOf[js.Any], mCurrentScrap = mCurrentScrap.asInstanceOf[js.Any], mFirstActivePosition = mFirstActivePosition.asInstanceOf[js.Any], mRecyclerListener = mRecyclerListener.asInstanceOf[js.Any], mScrapViews = mScrapViews.asInstanceOf[js.Any], mSkippedScrap = mSkippedScrap.asInstanceOf[js.Any], mTransientStateViews = mTransientStateViews.asInstanceOf[js.Any], mTransientStateViewsById = mTransientStateViewsById.asInstanceOf[js.Any], mViewTypeCount = mViewTypeCount.asInstanceOf[js.Any], markChildrenDirty = js.Any.fromFunction0(markChildrenDirty), pruneScrapViews = js.Any.fromFunction0(pruneScrapViews), reclaimScrapViews = js.Any.fromFunction1(reclaimScrapViews), removeSkippedScrap = js.Any.fromFunction0(removeSkippedScrap), scrapActiveViews = js.Any.fromFunction0(scrapActiveViews), setCacheColorHint = js.Any.fromFunction1(setCacheColorHint), setViewTypeCount = js.Any.fromFunction1(setViewTypeCount), shouldRecycleViewType = js.Any.fromFunction1(shouldRecycleViewType))
    __obj.asInstanceOf[RecycleBin]
  }
  @scala.inline
  implicit class RecycleBinOps[Self <: RecycleBin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_AbsListView_this(value: typings.androiduix.android.widget.AbsListView): Self = this.set("_AbsListView_this", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddScrapView(value: (View, Double) => Unit): Self = this.set("addScrapView", js.Any.fromFunction2(value))
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    @scala.inline
    def setClearTransientStateViews(value: () => Unit): Self = this.set("clearTransientStateViews", js.Any.fromFunction0(value))
    @scala.inline
    def setFillActiveViews(value: (Double, Double) => Unit): Self = this.set("fillActiveViews", js.Any.fromFunction2(value))
    @scala.inline
    def setGetActiveView(value: Double => View): Self = this.set("getActiveView", js.Any.fromFunction1(value))
    @scala.inline
    def setGetScrapView(value: Double => View): Self = this.set("getScrapView", js.Any.fromFunction1(value))
    @scala.inline
    def setGetTransientStateView(value: Double => View): Self = this.set("getTransientStateView", js.Any.fromFunction1(value))
    @scala.inline
    def setMActiveViewsVarargs(value: View*): Self = this.set("mActiveViews", js.Array(value :_*))
    @scala.inline
    def setMActiveViews(value: js.Array[View]): Self = this.set("mActiveViews", value.asInstanceOf[js.Any])
    @scala.inline
    def setMCurrentScrap(value: js.Any): Self = this.set("mCurrentScrap", value.asInstanceOf[js.Any])
    @scala.inline
    def setMFirstActivePosition(value: js.Any): Self = this.set("mFirstActivePosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setMRecyclerListener(value: RecyclerListener): Self = this.set("mRecyclerListener", value.asInstanceOf[js.Any])
    @scala.inline
    def setMScrapViews(value: js.Any): Self = this.set("mScrapViews", value.asInstanceOf[js.Any])
    @scala.inline
    def setMSkippedScrap(value: js.Any): Self = this.set("mSkippedScrap", value.asInstanceOf[js.Any])
    @scala.inline
    def setMTransientStateViews(value: js.Any): Self = this.set("mTransientStateViews", value.asInstanceOf[js.Any])
    @scala.inline
    def setMTransientStateViewsById(value: js.Any): Self = this.set("mTransientStateViewsById", value.asInstanceOf[js.Any])
    @scala.inline
    def setMViewTypeCount(value: js.Any): Self = this.set("mViewTypeCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarkChildrenDirty(value: () => Unit): Self = this.set("markChildrenDirty", js.Any.fromFunction0(value))
    @scala.inline
    def setPruneScrapViews(value: () => js.Any): Self = this.set("pruneScrapViews", js.Any.fromFunction0(value))
    @scala.inline
    def setReclaimScrapViews(value: List[View] => Unit): Self = this.set("reclaimScrapViews", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveSkippedScrap(value: () => Unit): Self = this.set("removeSkippedScrap", js.Any.fromFunction0(value))
    @scala.inline
    def setScrapActiveViews(value: () => Unit): Self = this.set("scrapActiveViews", js.Any.fromFunction0(value))
    @scala.inline
    def setSetCacheColorHint(value: Double => Unit): Self = this.set("setCacheColorHint", js.Any.fromFunction1(value))
    @scala.inline
    def setSetViewTypeCount(value: Double => Unit): Self = this.set("setViewTypeCount", js.Any.fromFunction1(value))
    @scala.inline
    def setShouldRecycleViewType(value: Double => Boolean): Self = this.set("shouldRecycleViewType", js.Any.fromFunction1(value))
  }
  
}

