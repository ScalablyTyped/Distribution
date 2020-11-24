package typings.androiduix.android.graphics.drawable

import typings.androiduix.java_.lang.Runnable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShadowDrawable extends Drawable {
  
  def drawableSizeChange(who: Drawable): js.Any = js.native
  
  def getDrawable(): Drawable = js.native
  
  def invalidateDrawable(who: Drawable): Unit = js.native
  
  var mMutated: js.Any = js.native
  
  var mState: js.Any = js.native
  
  def scheduleDrawable(who: Drawable, what: Runnable, when: Double): Unit = js.native
  
  def setShadow(radius: Double, dx: Double, dy: Double, color: Double): Unit = js.native
  
  def unscheduleDrawable(who: Drawable, what: Runnable): Unit = js.native
}
