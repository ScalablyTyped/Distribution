package typings.aliApp.anon

import typings.aliApp.my.City
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<ali-app.my.ChooseCityOptions> */
@js.native
trait PartialChooseCityOptions extends js.Object {
  
  var cities: js.UndefOr[js.Array[City]] = js.native
  
  var complete: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.native
  
  var fail: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.native
  
  var hotCities: js.UndefOr[js.Array[City]] = js.native
  
  var showHotCities: js.UndefOr[Boolean] = js.native
  
  var showLocatedCity: js.UndefOr[Boolean] = js.native
  
  var success: js.UndefOr[js.Function1[/* result */ AdCode, Unit]] = js.native
}
object PartialChooseCityOptions {
  
  @scala.inline
  def apply(): PartialChooseCityOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialChooseCityOptions]
  }
  
  @scala.inline
  implicit class PartialChooseCityOptionsOps[Self <: PartialChooseCityOptions] (val x: Self) extends AnyVal {
    
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
    def setCitiesVarargs(value: City*): Self = this.set("cities", js.Array(value :_*))
    
    @scala.inline
    def setCities(value: js.Array[City]): Self = this.set("cities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCities: Self = this.set("cities", js.undefined)
    
    @scala.inline
    def setComplete(value: /* res */ js.Any => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ js.Any => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    
    @scala.inline
    def setHotCitiesVarargs(value: City*): Self = this.set("hotCities", js.Array(value :_*))
    
    @scala.inline
    def setHotCities(value: js.Array[City]): Self = this.set("hotCities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHotCities: Self = this.set("hotCities", js.undefined)
    
    @scala.inline
    def setShowHotCities(value: Boolean): Self = this.set("showHotCities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowHotCities: Self = this.set("showHotCities", js.undefined)
    
    @scala.inline
    def setShowLocatedCity(value: Boolean): Self = this.set("showLocatedCity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowLocatedCity: Self = this.set("showLocatedCity", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* result */ AdCode => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
}
