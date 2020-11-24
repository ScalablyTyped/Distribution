package typings.accedoAccedoOne.mod

import typings.accedoAccedoOne.anon.Alpha2Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccedoLocale extends js.Object {
  
  var code: String = js.native
  
  var countryInfo: Alpha2Code = js.native
  
  var displayName: String = js.native
}
object AccedoLocale {
  
  @scala.inline
  def apply(code: String, countryInfo: Alpha2Code, displayName: String): AccedoLocale = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], countryInfo = countryInfo.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccedoLocale]
  }
  
  @scala.inline
  implicit class AccedoLocaleOps[Self <: AccedoLocale] (val x: Self) extends AnyVal {
    
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryInfo(value: Alpha2Code): Self = this.set("countryInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
  }
}
