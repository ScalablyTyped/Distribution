package typings.amplitudeJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Carrier extends js.Object {
  
  var carrier: js.UndefOr[Boolean] = js.native
  
  var city: js.UndefOr[Boolean] = js.native
  
  var country: js.UndefOr[Boolean] = js.native
  
  var device_manufacturer: js.UndefOr[Boolean] = js.native
  
  var device_model: js.UndefOr[Boolean] = js.native
  
  var dma: js.UndefOr[Boolean] = js.native
  
  var ip_address: js.UndefOr[Boolean] = js.native
  
  var language: js.UndefOr[Boolean] = js.native
  
  var os_name: js.UndefOr[Boolean] = js.native
  
  var os_version: js.UndefOr[Boolean] = js.native
  
  var platform: js.UndefOr[Boolean] = js.native
  
  var region: js.UndefOr[Boolean] = js.native
  
  var version_name: js.UndefOr[Boolean] = js.native
}
object Carrier {
  
  @scala.inline
  def apply(): Carrier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Carrier]
  }
  
  @scala.inline
  implicit class CarrierOps[Self <: Carrier] (val x: Self) extends AnyVal {
    
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
    def setCarrier(value: Boolean): Self = this.set("carrier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCarrier: Self = this.set("carrier", js.undefined)
    
    @scala.inline
    def setCity(value: Boolean): Self = this.set("city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCity: Self = this.set("city", js.undefined)
    
    @scala.inline
    def setCountry(value: Boolean): Self = this.set("country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    
    @scala.inline
    def setDevice_manufacturer(value: Boolean): Self = this.set("device_manufacturer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevice_manufacturer: Self = this.set("device_manufacturer", js.undefined)
    
    @scala.inline
    def setDevice_model(value: Boolean): Self = this.set("device_model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevice_model: Self = this.set("device_model", js.undefined)
    
    @scala.inline
    def setDma(value: Boolean): Self = this.set("dma", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDma: Self = this.set("dma", js.undefined)
    
    @scala.inline
    def setIp_address(value: Boolean): Self = this.set("ip_address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIp_address: Self = this.set("ip_address", js.undefined)
    
    @scala.inline
    def setLanguage(value: Boolean): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setOs_name(value: Boolean): Self = this.set("os_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOs_name: Self = this.set("os_name", js.undefined)
    
    @scala.inline
    def setOs_version(value: Boolean): Self = this.set("os_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOs_version: Self = this.set("os_version", js.undefined)
    
    @scala.inline
    def setPlatform(value: Boolean): Self = this.set("platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatform: Self = this.set("platform", js.undefined)
    
    @scala.inline
    def setRegion(value: Boolean): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    
    @scala.inline
    def setVersion_name(value: Boolean): Self = this.set("version_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion_name: Self = this.set("version_name", js.undefined)
  }
}
