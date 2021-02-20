package typings.androiduix.android.graphics.drawable

import typings.androiduix.android.graphics.drawable.Drawable.Callback
import typings.androiduix.android.graphics.drawable.Drawable.ConstantState
import typings.androiduix.android.graphics.drawable.LayerDrawable.LayerState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayerDrawable
  extends Drawable
     with Callback {
  
  /* private */ def addLayer(layer: js.Any, id: js.Any, left: js.Any, top: js.Any, right: js.Any, bottom: js.Any): js.Any = js.native
  
  def createConstantState(state: LayerState): LayerState = js.native
  
  @JSName("drawableSizeChange")
  def drawableSizeChange_MLayerDrawable(who: Drawable): Unit = js.native
  
  /* private */ def ensurePadding(): js.Any = js.native
  
  def findDrawableByLayerId(id: String): Drawable = js.native
  
  def getDrawable(index: Double): Drawable = js.native
  
  def getId(index: Double): String = js.native
  
  def getNumberOfLayers(): Double = js.native
  
  var mLayerState: LayerState = js.native
  
  var mMutated: js.Any = js.native
  
  var mOpacityOverride: js.Any = js.native
  
  var mPaddingB: js.Any = js.native
  
  var mPaddingL: js.Any = js.native
  
  var mPaddingR: js.Any = js.native
  
  var mPaddingT: js.Any = js.native
  
  var mTmpRect: js.Any = js.native
  
  /* private */ def reapplyPadding(i: js.Any, r: js.Any): js.Any = js.native
  
  def setDrawableByLayerId(id: String, drawable: Drawable): Boolean = js.native
  
  def setId(index: Double, id: String): Unit = js.native
  
  def setLayerInset(index: Double, l: Double, t: Double, r: Double, b: Double): Unit = js.native
  
  def setOpacity(opacity: Double): Unit = js.native
}
object LayerDrawable {
  
  @js.native
  trait ChildDrawable extends StObject {
    
    var mDrawable: Drawable = js.native
    
    var mId: String = js.native
    
    var mInsetB: Double = js.native
    
    var mInsetL: Double = js.native
    
    var mInsetR: Double = js.native
    
    var mInsetT: Double = js.native
  }
  object ChildDrawable {
    
    @scala.inline
    def apply(
      mDrawable: Drawable,
      mId: String,
      mInsetB: Double,
      mInsetL: Double,
      mInsetR: Double,
      mInsetT: Double
    ): ChildDrawable = {
      val __obj = js.Dynamic.literal(mDrawable = mDrawable.asInstanceOf[js.Any], mId = mId.asInstanceOf[js.Any], mInsetB = mInsetB.asInstanceOf[js.Any], mInsetL = mInsetL.asInstanceOf[js.Any], mInsetR = mInsetR.asInstanceOf[js.Any], mInsetT = mInsetT.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChildDrawable]
    }
    
    @scala.inline
    implicit class ChildDrawableMutableBuilder[Self <: ChildDrawable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMDrawable(value: Drawable): Self = StObject.set(x, "mDrawable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMId(value: String): Self = StObject.set(x, "mId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMInsetB(value: Double): Self = StObject.set(x, "mInsetB", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMInsetL(value: Double): Self = StObject.set(x, "mInsetL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMInsetR(value: Double): Self = StObject.set(x, "mInsetR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMInsetT(value: Double): Self = StObject.set(x, "mInsetT", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LayerState extends ConstantState {
    
    def canConstantState(): Boolean = js.native
    
    def getOpacity(): Double = js.native
    
    def isStateful(): Boolean = js.native
    
    var mAutoMirrored: js.Any = js.native
    
    var mCanConstantState: js.Any = js.native
    
    var mCheckedConstantState: js.Any = js.native
    
    var mChildren: js.Array[ChildDrawable] = js.native
    
    var mHaveOpacity: js.Any = js.native
    
    var mHaveStateful: js.Any = js.native
    
    var mNum: Double = js.native
    
    var mOpacity: js.Any = js.native
    
    var mStateful: js.Any = js.native
  }
  object LayerState {
    
    @scala.inline
    def apply(
      canConstantState: () => Boolean,
      getOpacity: () => Double,
      isStateful: () => Boolean,
      mAutoMirrored: js.Any,
      mCanConstantState: js.Any,
      mCheckedConstantState: js.Any,
      mChildren: js.Array[ChildDrawable],
      mHaveOpacity: js.Any,
      mHaveStateful: js.Any,
      mNum: Double,
      mOpacity: js.Any,
      mStateful: js.Any,
      newDrawable: () => Drawable
    ): LayerState = {
      val __obj = js.Dynamic.literal(canConstantState = js.Any.fromFunction0(canConstantState), getOpacity = js.Any.fromFunction0(getOpacity), isStateful = js.Any.fromFunction0(isStateful), mAutoMirrored = mAutoMirrored.asInstanceOf[js.Any], mCanConstantState = mCanConstantState.asInstanceOf[js.Any], mCheckedConstantState = mCheckedConstantState.asInstanceOf[js.Any], mChildren = mChildren.asInstanceOf[js.Any], mHaveOpacity = mHaveOpacity.asInstanceOf[js.Any], mHaveStateful = mHaveStateful.asInstanceOf[js.Any], mNum = mNum.asInstanceOf[js.Any], mOpacity = mOpacity.asInstanceOf[js.Any], mStateful = mStateful.asInstanceOf[js.Any], newDrawable = js.Any.fromFunction0(newDrawable))
      __obj.asInstanceOf[LayerState]
    }
    
    @scala.inline
    implicit class LayerStateMutableBuilder[Self <: LayerState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCanConstantState(value: () => Boolean): Self = StObject.set(x, "canConstantState", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetOpacity(value: () => Double): Self = StObject.set(x, "getOpacity", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsStateful(value: () => Boolean): Self = StObject.set(x, "isStateful", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMAutoMirrored(value: js.Any): Self = StObject.set(x, "mAutoMirrored", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMCanConstantState(value: js.Any): Self = StObject.set(x, "mCanConstantState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMCheckedConstantState(value: js.Any): Self = StObject.set(x, "mCheckedConstantState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMChildren(value: js.Array[ChildDrawable]): Self = StObject.set(x, "mChildren", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMChildrenVarargs(value: ChildDrawable*): Self = StObject.set(x, "mChildren", js.Array(value :_*))
      
      @scala.inline
      def setMHaveOpacity(value: js.Any): Self = StObject.set(x, "mHaveOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMHaveStateful(value: js.Any): Self = StObject.set(x, "mHaveStateful", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMNum(value: Double): Self = StObject.set(x, "mNum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMOpacity(value: js.Any): Self = StObject.set(x, "mOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMStateful(value: js.Any): Self = StObject.set(x, "mStateful", value.asInstanceOf[js.Any])
    }
  }
}
