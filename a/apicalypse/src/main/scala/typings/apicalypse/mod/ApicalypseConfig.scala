package typings.apicalypse.mod

import typings.axios.mod.AxiosRequestConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApicalypseConfig extends AxiosRequestConfig {
  
  var queryMethod: js.UndefOr[QueryMethod] = js.native
}
object ApicalypseConfig {
  
  @scala.inline
  def apply(): ApicalypseConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApicalypseConfig]
  }
  
  @scala.inline
  implicit class ApicalypseConfigOps[Self <: ApicalypseConfig] (val x: Self) extends AnyVal {
    
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
    def setQueryMethod(value: QueryMethod): Self = this.set("queryMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryMethod: Self = this.set("queryMethod", js.undefined)
  }
}
