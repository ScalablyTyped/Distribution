package typings.antvGBase.typesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @antv/g-base.@antv/g-base/lib/types.AnimateCfg & {  id :string,   fromAttrs :{[key: string] : any},   toAttrs :{[key: string] : any},   startTime :number,   pathFormatted :boolean,   onFrame :@antv/g-base.@antv/g-base/lib/types.OnFrame | undefined,   _paused :boolean | undefined,   _pauseTime :number | undefined} */
@js.native
trait Animation extends js.Object {
  
  var _pauseTime: js.UndefOr[Double] = js.native
  
  var _paused: js.UndefOr[Boolean] = js.native
  
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
  
  var fromAttrs: StringDictionary[js.Any] = js.native
  
  var id: String = js.native
  
  var onFrame: js.UndefOr[OnFrame] = js.native
  
  var pathFormatted: Boolean = js.native
  
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
  
  var startTime: Double = js.native
  
  var toAttrs: StringDictionary[js.Any] = js.native
}
object Animation {
  
  @scala.inline
  def apply(
    duration: Double,
    fromAttrs: StringDictionary[js.Any],
    id: String,
    pathFormatted: Boolean,
    startTime: Double,
    toAttrs: StringDictionary[js.Any]
  ): Animation = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], fromAttrs = fromAttrs.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], pathFormatted = pathFormatted.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], toAttrs = toAttrs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animation]
  }
  
  @scala.inline
  implicit class AnimationOps[Self <: Animation] (val x: Self) extends AnyVal {
    
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
    def setFromAttrs(value: StringDictionary[js.Any]): Self = this.set("fromAttrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathFormatted(value: Boolean): Self = this.set("pathFormatted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: Double): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToAttrs(value: StringDictionary[js.Any]): Self = this.set("toAttrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_pauseTime(value: Double): Self = this.set("_pauseTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_pauseTime: Self = this.set("_pauseTime", js.undefined)
    
    @scala.inline
    def set_paused(value: Boolean): Self = this.set("_paused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_paused: Self = this.set("_paused", js.undefined)
    
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
    def setOnFrame(value: /* ratio */ Double => ElementAttrs): Self = this.set("onFrame", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFrame: Self = this.set("onFrame", js.undefined)
    
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
