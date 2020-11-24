package typings.appleMapkitJsBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Adaptive extends js.Object {
  
  /**
    * A constant indicating the measurement system is adaptive, and determined
    * based on the map's language.
    */
  val Adaptive: String = js.native
  
  /**
    * A constant indicating the measurement system is imperial.
    */
  val Imperial: String = js.native
  
  /**
    * A constant indicating the measurement system is metric.
    */
  val Metric: String = js.native
}
object Adaptive {
  
  @scala.inline
  def apply(Adaptive: String, Imperial: String, Metric: String): Adaptive = {
    val __obj = js.Dynamic.literal(Adaptive = Adaptive.asInstanceOf[js.Any], Imperial = Imperial.asInstanceOf[js.Any], Metric = Metric.asInstanceOf[js.Any])
    __obj.asInstanceOf[Adaptive]
  }
  
  @scala.inline
  implicit class AdaptiveOps[Self <: Adaptive] (val x: Self) extends AnyVal {
    
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
    def setAdaptive(value: String): Self = this.set("Adaptive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImperial(value: String): Self = this.set("Imperial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetric(value: String): Self = this.set("Metric", value.asInstanceOf[js.Any])
  }
}
