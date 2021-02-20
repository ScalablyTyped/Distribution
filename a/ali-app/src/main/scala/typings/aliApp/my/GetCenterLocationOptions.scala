package typings.aliApp.my

import typings.aliApp.anon.Latitude
import org.scalablytyped.runtime.StObject
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
  implicit class GetCenterLocationOptionsMutableBuilder[Self <: GetCenterLocationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuccess(value: /* res */ Latitude => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
