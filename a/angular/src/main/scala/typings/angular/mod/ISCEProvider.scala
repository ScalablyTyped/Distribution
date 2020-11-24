package typings.angular.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

///////////////////////////////////////////////////////////////////////////
// SCEProvider
// see http://docs.angularjs.org/api/ng/provider/$sceProvider
///////////////////////////////////////////////////////////////////////////
@js.native
trait ISCEProvider extends IServiceProvider {
  
  def enabled(value: Boolean): Unit = js.native
}
object ISCEProvider {
  
  @scala.inline
  def apply($get: js.Any, enabled: Boolean => Unit): ISCEProvider = {
    val __obj = js.Dynamic.literal($get = $get.asInstanceOf[js.Any], enabled = js.Any.fromFunction1(enabled))
    __obj.asInstanceOf[ISCEProvider]
  }
  
  @scala.inline
  implicit class ISCEProviderOps[Self <: ISCEProvider] (val x: Self) extends AnyVal {
    
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
    def setEnabled(value: Boolean => Unit): Self = this.set("enabled", js.Any.fromFunction1(value))
  }
}
