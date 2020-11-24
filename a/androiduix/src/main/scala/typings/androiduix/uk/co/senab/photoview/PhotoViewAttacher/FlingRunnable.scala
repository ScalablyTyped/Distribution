package typings.androiduix.uk.co.senab.photoview.PhotoViewAttacher

import typings.androiduix.java_.lang.Runnable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlingRunnable extends Runnable {
  
  var _PhotoViewAttacher_this: typings.androiduix.uk.co.senab.photoview.PhotoViewAttacher = js.native
  
  def cancelFling(): Unit = js.native
  
  def fling(viewWidth: Double, viewHeight: Double, velocityX: Double, velocityY: Double): Unit = js.native
  
  var mCurrentX: js.Any = js.native
  
  var mCurrentY: js.Any = js.native
  
  var mScroller: js.Any = js.native
}
object FlingRunnable {
  
  @scala.inline
  def apply(
    _PhotoViewAttacher_this: typings.androiduix.uk.co.senab.photoview.PhotoViewAttacher,
    cancelFling: () => Unit,
    fling: (Double, Double, Double, Double) => Unit,
    mCurrentX: js.Any,
    mCurrentY: js.Any,
    mScroller: js.Any,
    run: () => js.Any
  ): FlingRunnable = {
    val __obj = js.Dynamic.literal(_PhotoViewAttacher_this = _PhotoViewAttacher_this.asInstanceOf[js.Any], cancelFling = js.Any.fromFunction0(cancelFling), fling = js.Any.fromFunction4(fling), mCurrentX = mCurrentX.asInstanceOf[js.Any], mCurrentY = mCurrentY.asInstanceOf[js.Any], mScroller = mScroller.asInstanceOf[js.Any], run = js.Any.fromFunction0(run))
    __obj.asInstanceOf[FlingRunnable]
  }
  
  @scala.inline
  implicit class FlingRunnableOps[Self <: FlingRunnable] (val x: Self) extends AnyVal {
    
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
    def set_PhotoViewAttacher_this(value: typings.androiduix.uk.co.senab.photoview.PhotoViewAttacher): Self = this.set("_PhotoViewAttacher_this", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelFling(value: () => Unit): Self = this.set("cancelFling", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFling(value: (Double, Double, Double, Double) => Unit): Self = this.set("fling", js.Any.fromFunction4(value))
    
    @scala.inline
    def setMCurrentX(value: js.Any): Self = this.set("mCurrentX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMCurrentY(value: js.Any): Self = this.set("mCurrentY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMScroller(value: js.Any): Self = this.set("mScroller", value.asInstanceOf[js.Any])
  }
}
