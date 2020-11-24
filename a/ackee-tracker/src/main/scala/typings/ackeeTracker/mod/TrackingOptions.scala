package typings.ackeeTracker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrackingOptions extends js.Object {
  
  /**
    * Defaults to `false`
    */
  var detailed: js.UndefOr[Boolean] = js.native
  
  /**
    * Defaults to `true`
    */
  var ignoreLocalhost: js.UndefOr[Boolean] = js.native
}
object TrackingOptions {
  
  @scala.inline
  def apply(): TrackingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrackingOptions]
  }
  
  @scala.inline
  implicit class TrackingOptionsOps[Self <: TrackingOptions] (val x: Self) extends AnyVal {
    
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
    def setDetailed(value: Boolean): Self = this.set("detailed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetailed: Self = this.set("detailed", js.undefined)
    
    @scala.inline
    def setIgnoreLocalhost(value: Boolean): Self = this.set("ignoreLocalhost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreLocalhost: Self = this.set("ignoreLocalhost", js.undefined)
  }
}
