package typings.androiduix.android.widget

import typings.androiduix.android.widget.RatingBar.OnRatingBarChangeListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RatingBar extends AbsSeekBar {
  
  def dispatchRatingChange(fromUser: Boolean): Unit = js.native
  
  def getNumStars(): Double = js.native
  
  def getOnRatingBarChangeListener(): OnRatingBarChangeListener = js.native
  
  /* private */ def getProgressPerStar(): js.Any = js.native
  
  def getRating(): Double = js.native
  
  def getStepSize(): Double = js.native
  
  def isIndicator(): Boolean = js.native
  
  var mNumStars: js.Any = js.native
  
  var mOnRatingBarChangeListener: js.Any = js.native
  
  var mProgressOnStartTracking: js.Any = js.native
  
  def setIsIndicator(isIndicator: Boolean): Unit = js.native
  
  def setNumStars(numStars: Double): Unit = js.native
  
  def setOnRatingBarChangeListener(listener: OnRatingBarChangeListener): Unit = js.native
  
  def setRating(rating: Double): Unit = js.native
  
  def setStepSize(stepSize: Double): Unit = js.native
  
  /* private */ def updateSecondaryProgress(progress: js.Any): js.Any = js.native
}
object RatingBar {
  
  @js.native
  trait OnRatingBarChangeListener extends StObject {
    
    def onRatingChanged(ratingBar: RatingBar, rating: Double, fromUser: Boolean): Unit = js.native
  }
  object OnRatingBarChangeListener {
    
    @scala.inline
    def apply(onRatingChanged: (RatingBar, Double, Boolean) => Unit): OnRatingBarChangeListener = {
      val __obj = js.Dynamic.literal(onRatingChanged = js.Any.fromFunction3(onRatingChanged))
      __obj.asInstanceOf[OnRatingBarChangeListener]
    }
    
    @scala.inline
    implicit class OnRatingBarChangeListenerMutableBuilder[Self <: OnRatingBarChangeListener] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnRatingChanged(value: (RatingBar, Double, Boolean) => Unit): Self = StObject.set(x, "onRatingChanged", js.Any.fromFunction3(value))
    }
  }
}
