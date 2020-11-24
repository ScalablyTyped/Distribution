package typings.angularTooltips.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TooltipsConfProvider extends js.Object {
  
  def configure(options: TooltipsConfProviderOptions): Unit = js.native
}
object TooltipsConfProvider {
  
  @scala.inline
  def apply(configure: TooltipsConfProviderOptions => Unit): TooltipsConfProvider = {
    val __obj = js.Dynamic.literal(configure = js.Any.fromFunction1(configure))
    __obj.asInstanceOf[TooltipsConfProvider]
  }
  
  @scala.inline
  implicit class TooltipsConfProviderOps[Self <: TooltipsConfProvider] (val x: Self) extends AnyVal {
    
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
    def setConfigure(value: TooltipsConfProviderOptions => Unit): Self = this.set("configure", js.Any.fromFunction1(value))
  }
}
