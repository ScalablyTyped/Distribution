package typings.angularAnimate.mod.angularAugmentingMod.animate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAnimateCssRunner extends js.Object {
  
  /**
    * Ends (aborts) the animation
    */
  def end(): Unit = js.native
  
  /**
    * Starts the animation
    *
    * @returns The animation runner with a done function for supplying a callback.
    */
  def start(): IAnimateCssRunnerStart = js.native
}
object IAnimateCssRunner {
  
  @scala.inline
  def apply(end: () => Unit, start: () => IAnimateCssRunnerStart): IAnimateCssRunner = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end), start = js.Any.fromFunction0(start))
    __obj.asInstanceOf[IAnimateCssRunner]
  }
  
  @scala.inline
  implicit class IAnimateCssRunnerOps[Self <: IAnimateCssRunner] (val x: Self) extends AnyVal {
    
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
    def setEnd(value: () => Unit): Self = this.set("end", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStart(value: () => IAnimateCssRunnerStart): Self = this.set("start", js.Any.fromFunction0(value))
  }
}
