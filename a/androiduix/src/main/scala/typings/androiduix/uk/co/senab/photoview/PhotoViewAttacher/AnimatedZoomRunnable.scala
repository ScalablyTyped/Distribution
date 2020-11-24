package typings.androiduix.uk.co.senab.photoview.PhotoViewAttacher

import typings.androiduix.java_.lang.Runnable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimatedZoomRunnable extends Runnable {
  
  var _PhotoViewAttacher_this: typings.androiduix.uk.co.senab.photoview.PhotoViewAttacher = js.native
  
  /* private */ def interpolate(): js.Any = js.native
  
  var mFocalX: js.Any = js.native
  
  var mFocalY: js.Any = js.native
  
  var mStartTime: js.Any = js.native
  
  var mZoomEnd: js.Any = js.native
  
  var mZoomStart: js.Any = js.native
}
object AnimatedZoomRunnable {
  
  @scala.inline
  def apply(
    _PhotoViewAttacher_this: typings.androiduix.uk.co.senab.photoview.PhotoViewAttacher,
    interpolate: () => js.Any,
    mFocalX: js.Any,
    mFocalY: js.Any,
    mStartTime: js.Any,
    mZoomEnd: js.Any,
    mZoomStart: js.Any,
    run: () => js.Any
  ): AnimatedZoomRunnable = {
    val __obj = js.Dynamic.literal(_PhotoViewAttacher_this = _PhotoViewAttacher_this.asInstanceOf[js.Any], interpolate = js.Any.fromFunction0(interpolate), mFocalX = mFocalX.asInstanceOf[js.Any], mFocalY = mFocalY.asInstanceOf[js.Any], mStartTime = mStartTime.asInstanceOf[js.Any], mZoomEnd = mZoomEnd.asInstanceOf[js.Any], mZoomStart = mZoomStart.asInstanceOf[js.Any], run = js.Any.fromFunction0(run))
    __obj.asInstanceOf[AnimatedZoomRunnable]
  }
  
  @scala.inline
  implicit class AnimatedZoomRunnableOps[Self <: AnimatedZoomRunnable] (val x: Self) extends AnyVal {
    
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
    def setInterpolate(value: () => js.Any): Self = this.set("interpolate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMFocalX(value: js.Any): Self = this.set("mFocalX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMFocalY(value: js.Any): Self = this.set("mFocalY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMStartTime(value: js.Any): Self = this.set("mStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMZoomEnd(value: js.Any): Self = this.set("mZoomEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMZoomStart(value: js.Any): Self = this.set("mZoomStart", value.asInstanceOf[js.Any])
  }
}
