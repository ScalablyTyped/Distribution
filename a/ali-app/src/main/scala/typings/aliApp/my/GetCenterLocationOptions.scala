package typings.aliApp.my

import typings.aliApp.anon.Latitude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region 地图 https://docs.alipay.com/mini/api/ui-map
@js.native
trait GetCenterLocationOptions
  extends BaseOptions[js.Any, js.Any] {
  
  @JSName("success")
  var success_GetCenterLocationOptions: js.UndefOr[js.Function1[/* res */ Latitude, Unit]] = js.native
}
object GetCenterLocationOptions {
  
  @scala.inline
  def apply(): GetCenterLocationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCenterLocationOptions]
  }
  
  @scala.inline
  implicit class GetCenterLocationOptionsOps[Self <: GetCenterLocationOptions] (val x: Self) extends AnyVal {
    
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
    def setSuccess(value: /* res */ Latitude => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
}
