package typings.antvGBase.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimateCfg extends js.Object {
  
  /**
    * 动画执行完时的回调函数
    * @type {function}}
    */
  var callback: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * 动画执行的延迟时间
    * @type {function}}
    */
  var delay: js.UndefOr[Double] = js.native
  
  /**
    * 动画执行时间
    * @type {number}
    */
  var duration: Double = js.native
  
  /**
    * 动画缓动效果
    * @type {string}}
    */
  var easing: js.UndefOr[String] = js.native
  
  /**
    * 动画暂停时的回调函数
    * @type {function}}
    */
  var pauseCallback: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * 是否重复执行动画
    * @type {boolean}}
    */
  var repeat: js.UndefOr[Boolean] = js.native
  
  /**
    * 动画恢复(重新唤醒)时的回调函数
    * @type {function}}
    */
  var resumeCallback: js.UndefOr[js.Function0[Unit]] = js.native
}
object AnimateCfg {
  
  @scala.inline
  def apply(duration: Double): AnimateCfg = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimateCfg]
  }
  
  @scala.inline
  implicit class AnimateCfgOps[Self <: AnimateCfg] (val x: Self) extends AnyVal {
    
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
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallback(value: () => Unit): Self = this.set("callback", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setEasing(value: String): Self = this.set("easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    
    @scala.inline
    def setPauseCallback(value: () => Unit): Self = this.set("pauseCallback", js.Any.fromFunction0(value))
    
    @scala.inline
    def deletePauseCallback: Self = this.set("pauseCallback", js.undefined)
    
    @scala.inline
    def setRepeat(value: Boolean): Self = this.set("repeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepeat: Self = this.set("repeat", js.undefined)
    
    @scala.inline
    def setResumeCallback(value: () => Unit): Self = this.set("resumeCallback", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteResumeCallback: Self = this.set("resumeCallback", js.undefined)
  }
}
