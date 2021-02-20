package typings.androiduix.android.graphics.drawable

import typings.androiduix.android.graphics.Rect
import typings.androiduix.android.graphics.drawable.Drawable.Callback
import typings.androiduix.android.graphics.drawable.Drawable.ConstantState
import typings.androiduix.android.graphics.drawable.DrawableContainer.DrawableContainerState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrawableContainer
  extends Drawable
     with Callback {
  
  def animate(schedule: Boolean): Unit = js.native
  
  @JSName("drawableSizeChange")
  def drawableSizeChange_MDrawableContainer(who: Drawable): Unit = js.native
  
  var mAlpha: js.Any = js.native
  
  var mAnimationRunnable: js.Any = js.native
  
  var mCurIndex: js.Any = js.native
  
  var mCurrDrawable: js.Any = js.native
  
  var mDrawableContainerState: js.Any = js.native
  
  var mEnterAnimationEnd: js.Any = js.native
  
  var mExitAnimationEnd: js.Any = js.native
  
  var mLastDrawable: js.Any = js.native
  
  var mMutated: Boolean = js.native
  
  /* private */ def needsMirroring(): js.Any = js.native
  
  def selectDrawable(idx: Double): Boolean = js.native
  
  def setConstantState(state: DrawableContainerState): Unit = js.native
  
  def setEnterFadeDuration(ms: Double): Unit = js.native
  
  def setExitFadeDuration(ms: Double): Unit = js.native
}
object DrawableContainer {
  
  @js.native
  trait DrawableContainerState extends ConstantState {
    
    def addChild(dr: Drawable): Double = js.native
    
    def canConstantState(): Boolean = js.native
    
    def computeConstantSize(): Unit = js.native
    
    /* private */ def createAllFutures(): js.Any = js.native
    
    def getCapacity(): Double = js.native
    
    def getChild(index: Double): Drawable = js.native
    
    def getChildCount(): Double = js.native
    
    def getChildren(): js.Array[Drawable] = js.native
    
    def getConstantHeight(): Double = js.native
    
    def getConstantMinimumHeight(): Double = js.native
    
    def getConstantMinimumWidth(): Double = js.native
    
    def getConstantPadding(): Rect = js.native
    
    def getConstantWidth(): Double = js.native
    
    def getEnterFadeDuration(): Double = js.native
    
    def getExitFadeDuration(): Double = js.native
    
    def getOpacity(): Double = js.native
    
    def isConstantSize(): Boolean = js.native
    
    def isStateful(): Boolean = js.native
    
    var mAutoMirrored: Boolean = js.native
    
    var mCanConstantState: Boolean = js.native
    
    var mCheckedConstantState: Boolean = js.native
    
    var mCheckedOpacity: Boolean = js.native
    
    var mCheckedStateful: Boolean = js.native
    
    var mComputedConstantSize: Boolean = js.native
    
    var mConstantHeight: Double = js.native
    
    var mConstantMinimumHeight: Double = js.native
    
    var mConstantMinimumWidth: Double = js.native
    
    var mConstantPadding: Rect = js.native
    
    var mConstantSize: Boolean = js.native
    
    var mConstantWidth: Double = js.native
    
    var mDither: Boolean = js.native
    
    var mDrawableFutures: js.Any = js.native
    
    var mDrawables: js.Array[Drawable] = js.native
    
    var mEnterFadeDuration: Double = js.native
    
    var mExitFadeDuration: Double = js.native
    
    var mMutated: Boolean = js.native
    
    val mNumChildren: Double = js.native
    
    var mOpacity: Double = js.native
    
    var mOwner: DrawableContainer = js.native
    
    var mPaddingChecked: Boolean = js.native
    
    var mStateful: Boolean = js.native
    
    var mVariablePadding: Boolean = js.native
    
    def mutate(): Unit = js.native
    
    def setConstantSize(constant: Boolean): Unit = js.native
    
    def setEnterFadeDuration(duration: Double): Unit = js.native
    
    def setExitFadeDuration(duration: Double): Unit = js.native
    
    def setVariablePadding(variable: Boolean): Unit = js.native
  }
  object DrawableContainerState {
    
    @scala.inline
    def apply(
      addChild: Drawable => Double,
      canConstantState: () => Boolean,
      computeConstantSize: () => Unit,
      createAllFutures: () => js.Any,
      getCapacity: () => Double,
      getChild: Double => Drawable,
      getChildCount: () => Double,
      getChildren: () => js.Array[Drawable],
      getConstantHeight: () => Double,
      getConstantMinimumHeight: () => Double,
      getConstantMinimumWidth: () => Double,
      getConstantPadding: () => Rect,
      getConstantWidth: () => Double,
      getEnterFadeDuration: () => Double,
      getExitFadeDuration: () => Double,
      getOpacity: () => Double,
      isConstantSize: () => Boolean,
      isStateful: () => Boolean,
      mAutoMirrored: Boolean,
      mCanConstantState: Boolean,
      mCheckedConstantState: Boolean,
      mCheckedOpacity: Boolean,
      mCheckedStateful: Boolean,
      mComputedConstantSize: Boolean,
      mConstantHeight: Double,
      mConstantMinimumHeight: Double,
      mConstantMinimumWidth: Double,
      mConstantPadding: Rect,
      mConstantSize: Boolean,
      mConstantWidth: Double,
      mDither: Boolean,
      mDrawableFutures: js.Any,
      mDrawables: js.Array[Drawable],
      mEnterFadeDuration: Double,
      mExitFadeDuration: Double,
      mMutated: Boolean,
      mNumChildren: Double,
      mOpacity: Double,
      mOwner: DrawableContainer,
      mPaddingChecked: Boolean,
      mStateful: Boolean,
      mVariablePadding: Boolean,
      mutate: () => Unit,
      newDrawable: () => Drawable,
      setConstantSize: Boolean => Unit,
      setEnterFadeDuration: Double => Unit,
      setExitFadeDuration: Double => Unit,
      setVariablePadding: Boolean => Unit
    ): DrawableContainerState = {
      val __obj = js.Dynamic.literal(addChild = js.Any.fromFunction1(addChild), canConstantState = js.Any.fromFunction0(canConstantState), computeConstantSize = js.Any.fromFunction0(computeConstantSize), createAllFutures = js.Any.fromFunction0(createAllFutures), getCapacity = js.Any.fromFunction0(getCapacity), getChild = js.Any.fromFunction1(getChild), getChildCount = js.Any.fromFunction0(getChildCount), getChildren = js.Any.fromFunction0(getChildren), getConstantHeight = js.Any.fromFunction0(getConstantHeight), getConstantMinimumHeight = js.Any.fromFunction0(getConstantMinimumHeight), getConstantMinimumWidth = js.Any.fromFunction0(getConstantMinimumWidth), getConstantPadding = js.Any.fromFunction0(getConstantPadding), getConstantWidth = js.Any.fromFunction0(getConstantWidth), getEnterFadeDuration = js.Any.fromFunction0(getEnterFadeDuration), getExitFadeDuration = js.Any.fromFunction0(getExitFadeDuration), getOpacity = js.Any.fromFunction0(getOpacity), isConstantSize = js.Any.fromFunction0(isConstantSize), isStateful = js.Any.fromFunction0(isStateful), mAutoMirrored = mAutoMirrored.asInstanceOf[js.Any], mCanConstantState = mCanConstantState.asInstanceOf[js.Any], mCheckedConstantState = mCheckedConstantState.asInstanceOf[js.Any], mCheckedOpacity = mCheckedOpacity.asInstanceOf[js.Any], mCheckedStateful = mCheckedStateful.asInstanceOf[js.Any], mComputedConstantSize = mComputedConstantSize.asInstanceOf[js.Any], mConstantHeight = mConstantHeight.asInstanceOf[js.Any], mConstantMinimumHeight = mConstantMinimumHeight.asInstanceOf[js.Any], mConstantMinimumWidth = mConstantMinimumWidth.asInstanceOf[js.Any], mConstantPadding = mConstantPadding.asInstanceOf[js.Any], mConstantSize = mConstantSize.asInstanceOf[js.Any], mConstantWidth = mConstantWidth.asInstanceOf[js.Any], mDither = mDither.asInstanceOf[js.Any], mDrawableFutures = mDrawableFutures.asInstanceOf[js.Any], mDrawables = mDrawables.asInstanceOf[js.Any], mEnterFadeDuration = mEnterFadeDuration.asInstanceOf[js.Any], mExitFadeDuration = mExitFadeDuration.asInstanceOf[js.Any], mMutated = mMutated.asInstanceOf[js.Any], mNumChildren = mNumChildren.asInstanceOf[js.Any], mOpacity = mOpacity.asInstanceOf[js.Any], mOwner = mOwner.asInstanceOf[js.Any], mPaddingChecked = mPaddingChecked.asInstanceOf[js.Any], mStateful = mStateful.asInstanceOf[js.Any], mVariablePadding = mVariablePadding.asInstanceOf[js.Any], mutate = js.Any.fromFunction0(mutate), newDrawable = js.Any.fromFunction0(newDrawable), setConstantSize = js.Any.fromFunction1(setConstantSize), setEnterFadeDuration = js.Any.fromFunction1(setEnterFadeDuration), setExitFadeDuration = js.Any.fromFunction1(setExitFadeDuration), setVariablePadding = js.Any.fromFunction1(setVariablePadding))
      __obj.asInstanceOf[DrawableContainerState]
    }
    
    @scala.inline
    implicit class DrawableContainerStateMutableBuilder[Self <: DrawableContainerState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddChild(value: Drawable => Double): Self = StObject.set(x, "addChild", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCanConstantState(value: () => Boolean): Self = StObject.set(x, "canConstantState", js.Any.fromFunction0(value))
      
      @scala.inline
      def setComputeConstantSize(value: () => Unit): Self = StObject.set(x, "computeConstantSize", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCreateAllFutures(value: () => js.Any): Self = StObject.set(x, "createAllFutures", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetCapacity(value: () => Double): Self = StObject.set(x, "getCapacity", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetChild(value: Double => Drawable): Self = StObject.set(x, "getChild", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetChildCount(value: () => Double): Self = StObject.set(x, "getChildCount", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetChildren(value: () => js.Array[Drawable]): Self = StObject.set(x, "getChildren", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetConstantHeight(value: () => Double): Self = StObject.set(x, "getConstantHeight", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetConstantMinimumHeight(value: () => Double): Self = StObject.set(x, "getConstantMinimumHeight", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetConstantMinimumWidth(value: () => Double): Self = StObject.set(x, "getConstantMinimumWidth", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetConstantPadding(value: () => Rect): Self = StObject.set(x, "getConstantPadding", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetConstantWidth(value: () => Double): Self = StObject.set(x, "getConstantWidth", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetEnterFadeDuration(value: () => Double): Self = StObject.set(x, "getEnterFadeDuration", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetExitFadeDuration(value: () => Double): Self = StObject.set(x, "getExitFadeDuration", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetOpacity(value: () => Double): Self = StObject.set(x, "getOpacity", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsConstantSize(value: () => Boolean): Self = StObject.set(x, "isConstantSize", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsStateful(value: () => Boolean): Self = StObject.set(x, "isStateful", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMAutoMirrored(value: Boolean): Self = StObject.set(x, "mAutoMirrored", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMCanConstantState(value: Boolean): Self = StObject.set(x, "mCanConstantState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMCheckedConstantState(value: Boolean): Self = StObject.set(x, "mCheckedConstantState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMCheckedOpacity(value: Boolean): Self = StObject.set(x, "mCheckedOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMCheckedStateful(value: Boolean): Self = StObject.set(x, "mCheckedStateful", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMComputedConstantSize(value: Boolean): Self = StObject.set(x, "mComputedConstantSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMConstantHeight(value: Double): Self = StObject.set(x, "mConstantHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMConstantMinimumHeight(value: Double): Self = StObject.set(x, "mConstantMinimumHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMConstantMinimumWidth(value: Double): Self = StObject.set(x, "mConstantMinimumWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMConstantPadding(value: Rect): Self = StObject.set(x, "mConstantPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMConstantSize(value: Boolean): Self = StObject.set(x, "mConstantSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMConstantWidth(value: Double): Self = StObject.set(x, "mConstantWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMDither(value: Boolean): Self = StObject.set(x, "mDither", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMDrawableFutures(value: js.Any): Self = StObject.set(x, "mDrawableFutures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMDrawables(value: js.Array[Drawable]): Self = StObject.set(x, "mDrawables", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMDrawablesVarargs(value: Drawable*): Self = StObject.set(x, "mDrawables", js.Array(value :_*))
      
      @scala.inline
      def setMEnterFadeDuration(value: Double): Self = StObject.set(x, "mEnterFadeDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMExitFadeDuration(value: Double): Self = StObject.set(x, "mExitFadeDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMMutated(value: Boolean): Self = StObject.set(x, "mMutated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMNumChildren(value: Double): Self = StObject.set(x, "mNumChildren", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMOpacity(value: Double): Self = StObject.set(x, "mOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMOwner(value: DrawableContainer): Self = StObject.set(x, "mOwner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMPaddingChecked(value: Boolean): Self = StObject.set(x, "mPaddingChecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMStateful(value: Boolean): Self = StObject.set(x, "mStateful", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMVariablePadding(value: Boolean): Self = StObject.set(x, "mVariablePadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMutate(value: () => Unit): Self = StObject.set(x, "mutate", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetConstantSize(value: Boolean => Unit): Self = StObject.set(x, "setConstantSize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetEnterFadeDuration(value: Double => Unit): Self = StObject.set(x, "setEnterFadeDuration", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetExitFadeDuration(value: Double => Unit): Self = StObject.set(x, "setExitFadeDuration", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetVariablePadding(value: Boolean => Unit): Self = StObject.set(x, "setVariablePadding", js.Any.fromFunction1(value))
    }
  }
}
