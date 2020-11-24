package typings.androiduix.android.app.Application

import typings.androiduix.android.app.Activity
import typings.androiduix.android.os.Bundle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivityLifecycleCallbacks extends js.Object {
  
  def onActivityCreated(activity: Activity, savedInstanceState: Bundle): Unit = js.native
  
  def onActivityDestroyed(activity: Activity): Unit = js.native
  
  def onActivityPaused(activity: Activity): Unit = js.native
  
  def onActivityResumed(activity: Activity): Unit = js.native
  
  def onActivitySaveInstanceState(activity: Activity, outState: Bundle): Unit = js.native
  
  def onActivityStarted(activity: Activity): Unit = js.native
  
  def onActivityStopped(activity: Activity): Unit = js.native
}
object ActivityLifecycleCallbacks {
  
  @scala.inline
  def apply(
    onActivityCreated: (Activity, Bundle) => Unit,
    onActivityDestroyed: Activity => Unit,
    onActivityPaused: Activity => Unit,
    onActivityResumed: Activity => Unit,
    onActivitySaveInstanceState: (Activity, Bundle) => Unit,
    onActivityStarted: Activity => Unit,
    onActivityStopped: Activity => Unit
  ): ActivityLifecycleCallbacks = {
    val __obj = js.Dynamic.literal(onActivityCreated = js.Any.fromFunction2(onActivityCreated), onActivityDestroyed = js.Any.fromFunction1(onActivityDestroyed), onActivityPaused = js.Any.fromFunction1(onActivityPaused), onActivityResumed = js.Any.fromFunction1(onActivityResumed), onActivitySaveInstanceState = js.Any.fromFunction2(onActivitySaveInstanceState), onActivityStarted = js.Any.fromFunction1(onActivityStarted), onActivityStopped = js.Any.fromFunction1(onActivityStopped))
    __obj.asInstanceOf[ActivityLifecycleCallbacks]
  }
  
  @scala.inline
  implicit class ActivityLifecycleCallbacksOps[Self <: ActivityLifecycleCallbacks] (val x: Self) extends AnyVal {
    
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
    def setOnActivityCreated(value: (Activity, Bundle) => Unit): Self = this.set("onActivityCreated", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnActivityDestroyed(value: Activity => Unit): Self = this.set("onActivityDestroyed", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnActivityPaused(value: Activity => Unit): Self = this.set("onActivityPaused", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnActivityResumed(value: Activity => Unit): Self = this.set("onActivityResumed", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnActivitySaveInstanceState(value: (Activity, Bundle) => Unit): Self = this.set("onActivitySaveInstanceState", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnActivityStarted(value: Activity => Unit): Self = this.set("onActivityStarted", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnActivityStopped(value: Activity => Unit): Self = this.set("onActivityStopped", js.Any.fromFunction1(value))
  }
}
