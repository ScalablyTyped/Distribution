package typings
package androiduixLib.androidNs.widgetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.RatingBar")
@js.native
class RatingBar protected () extends AbsSeekBar {
  def this(context: androiduixLib.androidNs.contentNs.Context) = this()
  def this(context: androiduixLib.androidNs.contentNs.Context, bindElement: stdLib.HTMLElement) = this()
  def this(context: androiduixLib.androidNs.contentNs.Context, bindElement: stdLib.HTMLElement, defStyle: stdLib.Map[java.lang.String, java.lang.String]) = this()
  var mNumStars: js.Any = js.native
  var mOnRatingBarChangeListener: js.Any = js.native
  var mProgressOnStartTracking: js.Any = js.native
  def dispatchRatingChange(fromUser: scala.Boolean): scala.Unit = js.native
  def getNumStars(): scala.Double = js.native
  def getOnRatingBarChangeListener(): androiduixLib.androidNs.widgetNs.RatingBarNs.OnRatingBarChangeListener = js.native
  /* private */ def getProgressPerStar(): js.Any = js.native
  def getRating(): scala.Double = js.native
  def getStepSize(): scala.Double = js.native
  def isIndicator(): scala.Boolean = js.native
  def setIsIndicator(isIndicator: scala.Boolean): scala.Unit = js.native
  def setNumStars(numStars: scala.Double): scala.Unit = js.native
  def setOnRatingBarChangeListener(listener: androiduixLib.androidNs.widgetNs.RatingBarNs.OnRatingBarChangeListener): scala.Unit = js.native
  def setRating(rating: scala.Double): scala.Unit = js.native
  def setStepSize(stepSize: scala.Double): scala.Unit = js.native
  /* private */ def updateSecondaryProgress(progress: js.Any): js.Any = js.native
}

