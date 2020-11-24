package typings.angularCore.timingStrategyMod

import typings.angularCore.queryDefinitionMod.NgQueryDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimingStrategy extends js.Object {
  
  /** Detects the timing result for a given query. */
  def detectTiming(query: NgQueryDefinition): TimingResult = js.native
  
  /** Sets up the given strategy. Throws if the strategy could not be set up. */
  def setup(): Unit = js.native
}
object TimingStrategy {
  
  @scala.inline
  def apply(detectTiming: NgQueryDefinition => TimingResult, setup: () => Unit): TimingStrategy = {
    val __obj = js.Dynamic.literal(detectTiming = js.Any.fromFunction1(detectTiming), setup = js.Any.fromFunction0(setup))
    __obj.asInstanceOf[TimingStrategy]
  }
  
  @scala.inline
  implicit class TimingStrategyOps[Self <: TimingStrategy] (val x: Self) extends AnyVal {
    
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
    def setDetectTiming(value: NgQueryDefinition => TimingResult): Self = this.set("detectTiming", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetup(value: () => Unit): Self = this.set("setup", js.Any.fromFunction0(value))
  }
}
