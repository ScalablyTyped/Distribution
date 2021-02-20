package typings.androiduix.android.graphics.drawable

import typings.androiduix.android.graphics.drawable.Drawable.Callback
import typings.androiduix.android.graphics.drawable.Drawable.ConstantState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RotateDrawable
  extends Drawable
     with Callback {
  
  @JSName("drawableSizeChange")
  def drawableSizeChange_MRotateDrawable(who: Drawable): Unit = js.native
  
  def getDrawable(): Drawable = js.native
  
  var mMutated: js.Any = js.native
  
  var mState: js.Any = js.native
}
object RotateDrawable {
  
  @js.native
  trait RotateState extends ConstantState {
    
    def canConstantState(): Boolean = js.native
    
    var mCanConstantState: js.Any = js.native
    
    var mCheckedConstantState: js.Any = js.native
    
    var mCurrentDegrees: Double = js.native
    
    var mDrawable: Drawable = js.native
    
    var mFromDegrees: Double = js.native
    
    var mPivotX: Double = js.native
    
    var mPivotXRel: Boolean = js.native
    
    var mPivotY: Double = js.native
    
    var mPivotYRel: Boolean = js.native
    
    var mToDegrees: Double = js.native
  }
  object RotateState {
    
    @scala.inline
    def apply(
      canConstantState: () => Boolean,
      mCanConstantState: js.Any,
      mCheckedConstantState: js.Any,
      mCurrentDegrees: Double,
      mDrawable: Drawable,
      mFromDegrees: Double,
      mPivotX: Double,
      mPivotXRel: Boolean,
      mPivotY: Double,
      mPivotYRel: Boolean,
      mToDegrees: Double,
      newDrawable: () => Drawable
    ): RotateState = {
      val __obj = js.Dynamic.literal(canConstantState = js.Any.fromFunction0(canConstantState), mCanConstantState = mCanConstantState.asInstanceOf[js.Any], mCheckedConstantState = mCheckedConstantState.asInstanceOf[js.Any], mCurrentDegrees = mCurrentDegrees.asInstanceOf[js.Any], mDrawable = mDrawable.asInstanceOf[js.Any], mFromDegrees = mFromDegrees.asInstanceOf[js.Any], mPivotX = mPivotX.asInstanceOf[js.Any], mPivotXRel = mPivotXRel.asInstanceOf[js.Any], mPivotY = mPivotY.asInstanceOf[js.Any], mPivotYRel = mPivotYRel.asInstanceOf[js.Any], mToDegrees = mToDegrees.asInstanceOf[js.Any], newDrawable = js.Any.fromFunction0(newDrawable))
      __obj.asInstanceOf[RotateState]
    }
    
    @scala.inline
    implicit class RotateStateMutableBuilder[Self <: RotateState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCanConstantState(value: () => Boolean): Self = StObject.set(x, "canConstantState", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMCanConstantState(value: js.Any): Self = StObject.set(x, "mCanConstantState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMCheckedConstantState(value: js.Any): Self = StObject.set(x, "mCheckedConstantState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMCurrentDegrees(value: Double): Self = StObject.set(x, "mCurrentDegrees", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMDrawable(value: Drawable): Self = StObject.set(x, "mDrawable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMFromDegrees(value: Double): Self = StObject.set(x, "mFromDegrees", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMPivotX(value: Double): Self = StObject.set(x, "mPivotX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMPivotXRel(value: Boolean): Self = StObject.set(x, "mPivotXRel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMPivotY(value: Double): Self = StObject.set(x, "mPivotY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMPivotYRel(value: Boolean): Self = StObject.set(x, "mPivotYRel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMToDegrees(value: Double): Self = StObject.set(x, "mToDegrees", value.asInstanceOf[js.Any])
    }
  }
}
