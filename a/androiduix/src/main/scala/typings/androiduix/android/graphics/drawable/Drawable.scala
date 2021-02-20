package typings.androiduix.android.graphics.drawable

import typings.androiduix.android.content.res.Resources
import typings.androiduix.android.graphics.Canvas
import typings.androiduix.android.graphics.Rect
import typings.androiduix.android.graphics.drawable.Drawable.Callback
import typings.androiduix.android.graphics.drawable.Drawable.ConstantState
import typings.androiduix.java_.lang.Runnable
import typings.androiduix.java_.lang.ref.WeakReference
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Drawable extends StObject {
  
  def copyBounds(): Rect = js.native
  def copyBounds(bounds: Rect): Rect = js.native
  
  def draw(canvas: Canvas): js.Any = js.native
  
  def getAlpha(): Double = js.native
  
  def getBounds(): Rect = js.native
  
  def getCallback(): Callback = js.native
  
  def getConstantState(): ConstantState = js.native
  
  def getCurrent(): Drawable = js.native
  
  def getIntrinsicHeight(): Double = js.native
  
  def getIntrinsicWidth(): Double = js.native
  
  def getLevel(): Double = js.native
  
  def getMinimumHeight(): Double = js.native
  
  def getMinimumWidth(): Double = js.native
  
  def getOpacity(): Double = js.native
  
  def getPadding(padding: Rect): Boolean = js.native
  
  def getState(): js.Array[Double] = js.native
  
  def inflate(r: Resources, parser: HTMLElement): Unit = js.native
  
  def invalidateSelf(): Unit = js.native
  
  def isAutoMirrored(): Boolean = js.native
  
  def isStateful(): Boolean = js.native
  
  def isVisible(): Boolean = js.native
  
  def jumpToCurrentState(): Unit = js.native
  
  var mBounds: Rect = js.native
  
  var mCallback: WeakReference[Callback] = js.native
  
  var mIgnoreNotifySizeChange: js.Any = js.native
  
  var mLevel: Double = js.native
  
  var mStateSet: js.Array[Double] = js.native
  
  var mVisible: Boolean = js.native
  
  def mutate(): Drawable = js.native
  
  def notifySizeChangeSelf(): Unit = js.native
  
  /* protected */ def onBoundsChange(bounds: Rect): Unit = js.native
  
  /* protected */ def onLevelChange(level: Double): Boolean = js.native
  
  /* protected */ def onStateChange(state: js.Array[Double]): Boolean = js.native
  
  def scheduleSelf(what: js.Any, when: js.Any): Unit = js.native
  
  def setAlpha(alpha: Double): Unit = js.native
  
  def setAutoMirrored(mirrored: Boolean): Unit = js.native
  
  def setBounds(left: js.Any, top: js.Any, right: js.Any, bottom: js.Any): js.Any = js.native
  def setBounds(rect: Rect): js.Any = js.native
  
  def setCallback(cb: Callback): Unit = js.native
  
  def setDither(dither: Boolean): Unit = js.native
  
  def setIgnoreNotifySizeChange(isIgnore: Boolean): Unit = js.native
  
  def setLevel(level: Double): Boolean = js.native
  
  def setState(stateSet: js.Array[Double]): Boolean = js.native
  
  def setVisible(visible: Boolean, restart: Boolean): Boolean = js.native
  
  def unscheduleSelf(what: js.Any): Unit = js.native
}
object Drawable {
  
  @js.native
  trait Callback extends StObject {
    
    var drawableSizeChange: js.UndefOr[js.Function1[/* who */ Drawable, Unit]] = js.native
    
    def invalidateDrawable(who: Drawable): Unit = js.native
    
    def scheduleDrawable(who: Drawable, what: Runnable, when: Double): Unit = js.native
    
    def unscheduleDrawable(who: Drawable, what: Runnable): Unit = js.native
  }
  object Callback {
    
    @scala.inline
    def apply(
      invalidateDrawable: Drawable => Unit,
      scheduleDrawable: (Drawable, Runnable, Double) => Unit,
      unscheduleDrawable: (Drawable, Runnable) => Unit
    ): Callback = {
      val __obj = js.Dynamic.literal(invalidateDrawable = js.Any.fromFunction1(invalidateDrawable), scheduleDrawable = js.Any.fromFunction3(scheduleDrawable), unscheduleDrawable = js.Any.fromFunction2(unscheduleDrawable))
      __obj.asInstanceOf[Callback]
    }
    
    @scala.inline
    implicit class CallbackMutableBuilder[Self <: Callback] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDrawableSizeChange(value: /* who */ Drawable => Unit): Self = StObject.set(x, "drawableSizeChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDrawableSizeChangeUndefined: Self = StObject.set(x, "drawableSizeChange", js.undefined)
      
      @scala.inline
      def setInvalidateDrawable(value: Drawable => Unit): Self = StObject.set(x, "invalidateDrawable", js.Any.fromFunction1(value))
      
      @scala.inline
      def setScheduleDrawable(value: (Drawable, Runnable, Double) => Unit): Self = StObject.set(x, "scheduleDrawable", js.Any.fromFunction3(value))
      
      @scala.inline
      def setUnscheduleDrawable(value: (Drawable, Runnable) => Unit): Self = StObject.set(x, "unscheduleDrawable", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait ConstantState extends StObject {
    
    def newDrawable(): Drawable = js.native
  }
  object ConstantState {
    
    @scala.inline
    def apply(newDrawable: () => Drawable): ConstantState = {
      val __obj = js.Dynamic.literal(newDrawable = js.Any.fromFunction0(newDrawable))
      __obj.asInstanceOf[ConstantState]
    }
    
    @scala.inline
    implicit class ConstantStateMutableBuilder[Self <: ConstantState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNewDrawable(value: () => Drawable): Self = StObject.set(x, "newDrawable", js.Any.fromFunction0(value))
    }
  }
}
