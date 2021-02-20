package typings.androiduix.android.graphics.drawable

import typings.androiduix.android.graphics.drawable.Drawable.Callback
import typings.androiduix.android.graphics.drawable.Drawable.ConstantState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClipDrawable
  extends Drawable
     with Callback {
  
  @JSName("drawableSizeChange")
  def drawableSizeChange_MClipDrawable(who: Drawable): Unit = js.native
  
  var mClipState: js.Any = js.native
  
  var mTmpRect: js.Any = js.native
}
object ClipDrawable {
  
  @js.native
  trait ClipState extends ConstantState {
    
    def canConstantState(): Boolean = js.native
    
    var mCanConstantState: js.Any = js.native
    
    var mCheckedConstantState: js.Any = js.native
    
    var mDrawable: Drawable = js.native
    
    var mGravity: Double = js.native
    
    var mOrientation: Double = js.native
  }
  object ClipState {
    
    @scala.inline
    def apply(
      canConstantState: () => Boolean,
      mCanConstantState: js.Any,
      mCheckedConstantState: js.Any,
      mDrawable: Drawable,
      mGravity: Double,
      mOrientation: Double,
      newDrawable: () => Drawable
    ): ClipState = {
      val __obj = js.Dynamic.literal(canConstantState = js.Any.fromFunction0(canConstantState), mCanConstantState = mCanConstantState.asInstanceOf[js.Any], mCheckedConstantState = mCheckedConstantState.asInstanceOf[js.Any], mDrawable = mDrawable.asInstanceOf[js.Any], mGravity = mGravity.asInstanceOf[js.Any], mOrientation = mOrientation.asInstanceOf[js.Any], newDrawable = js.Any.fromFunction0(newDrawable))
      __obj.asInstanceOf[ClipState]
    }
    
    @scala.inline
    implicit class ClipStateMutableBuilder[Self <: ClipState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCanConstantState(value: () => Boolean): Self = StObject.set(x, "canConstantState", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMCanConstantState(value: js.Any): Self = StObject.set(x, "mCanConstantState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMCheckedConstantState(value: js.Any): Self = StObject.set(x, "mCheckedConstantState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMDrawable(value: Drawable): Self = StObject.set(x, "mDrawable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMGravity(value: Double): Self = StObject.set(x, "mGravity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMOrientation(value: Double): Self = StObject.set(x, "mOrientation", value.asInstanceOf[js.Any])
    }
  }
}
