package typings.androiduix.android.widget

import typings.androiduix.android.graphics.Rect
import typings.androiduix.android.view.View
import typings.androiduix.android.widget.AbsSpinner.RecycleBin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbsSpinner extends AdapterView[SpinnerAdapter] {
  
  def getChildHeight(child: View): Double = js.native
  
  def getChildWidth(child: View): Double = js.native
  
  /* private */ def initAbsSpinner(): js.Any = js.native
  
  def layoutSpinner(delta: Double, animate: Boolean): Unit = js.native
  
  var mAdapter: SpinnerAdapter = js.native
  
  var mDataSetObserver: js.Any = js.native
  
  var mHeightMeasureSpec: Double = js.native
  
  var mRecycler: RecycleBin = js.native
  
  var mSelectionBottomPadding: Double = js.native
  
  var mSelectionLeftPadding: Double = js.native
  
  var mSelectionRightPadding: Double = js.native
  
  var mSelectionTopPadding: Double = js.native
  
  var mSpinnerPadding: Rect = js.native
  
  var mTouchFrame: js.Any = js.native
  
  var mWidthMeasureSpec: Double = js.native
  
  def pointToPosition(x: Double, y: Double): Double = js.native
  
  def recycleAllViews(): Unit = js.native
  
  def resetList(): Unit = js.native
  
  def setSelection(position: Double, animate: Boolean): Unit = js.native
  
  def setSelectionInt(position: Double, animate: Boolean): Unit = js.native
}
object AbsSpinner {
  
  @js.native
  trait RecycleBin extends StObject {
    
    var _AbsSpinner_this: AbsSpinner = js.native
    
    def clear(): Unit = js.native
    
    def get(position: Double): View = js.native
    
    var mScrapHeap: js.Any = js.native
    
    def put(position: Double, v: View): Unit = js.native
  }
  object RecycleBin {
    
    @scala.inline
    def apply(
      _AbsSpinner_this: AbsSpinner,
      clear: () => Unit,
      get: Double => View,
      mScrapHeap: js.Any,
      put: (Double, View) => Unit
    ): RecycleBin = {
      val __obj = js.Dynamic.literal(_AbsSpinner_this = _AbsSpinner_this.asInstanceOf[js.Any], clear = js.Any.fromFunction0(clear), get = js.Any.fromFunction1(get), mScrapHeap = mScrapHeap.asInstanceOf[js.Any], put = js.Any.fromFunction2(put))
      __obj.asInstanceOf[RecycleBin]
    }
    
    @scala.inline
    implicit class RecycleBinMutableBuilder[Self <: RecycleBin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGet(value: Double => View): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMScrapHeap(value: js.Any): Self = StObject.set(x, "mScrapHeap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPut(value: (Double, View) => Unit): Self = StObject.set(x, "put", js.Any.fromFunction2(value))
      
      @scala.inline
      def set_AbsSpinner_this(value: AbsSpinner): Self = StObject.set(x, "_AbsSpinner_this", value.asInstanceOf[js.Any])
    }
  }
}
