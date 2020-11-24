package typings.ackeeTracker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetailedData extends js.Object {
  
  var browserHeight: Double = js.native
  
  var browserName: String | Null = js.native
  
  var browserVersion: String | Null = js.native
  
  var browserWidth: Double = js.native
  
  var deviceManufacturer: String | Null = js.native
  
  var deviceName: String | Null = js.native
  
  var osName: String | Null = js.native
  
  var osVersion: String | Null = js.native
  
  var screenColorDepth: Double = js.native
  
  var screenHeight: Double = js.native
  
  var screenWidth: Double = js.native
  
  var siteLanguage: String = js.native
}
object DetailedData {
  
  @scala.inline
  def apply(
    browserHeight: Double,
    browserWidth: Double,
    screenColorDepth: Double,
    screenHeight: Double,
    screenWidth: Double,
    siteLanguage: String
  ): DetailedData = {
    val __obj = js.Dynamic.literal(browserHeight = browserHeight.asInstanceOf[js.Any], browserWidth = browserWidth.asInstanceOf[js.Any], screenColorDepth = screenColorDepth.asInstanceOf[js.Any], screenHeight = screenHeight.asInstanceOf[js.Any], screenWidth = screenWidth.asInstanceOf[js.Any], siteLanguage = siteLanguage.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetailedData]
  }
  
  @scala.inline
  implicit class DetailedDataOps[Self <: DetailedData] (val x: Self) extends AnyVal {
    
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
    def setBrowserHeight(value: Double): Self = this.set("browserHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserWidth(value: Double): Self = this.set("browserWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenColorDepth(value: Double): Self = this.set("screenColorDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenHeight(value: Double): Self = this.set("screenHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenWidth(value: Double): Self = this.set("screenWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSiteLanguage(value: String): Self = this.set("siteLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserName(value: String): Self = this.set("browserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserNameNull: Self = this.set("browserName", null)
    
    @scala.inline
    def setBrowserVersion(value: String): Self = this.set("browserVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserVersionNull: Self = this.set("browserVersion", null)
    
    @scala.inline
    def setDeviceManufacturer(value: String): Self = this.set("deviceManufacturer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceManufacturerNull: Self = this.set("deviceManufacturer", null)
    
    @scala.inline
    def setDeviceName(value: String): Self = this.set("deviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceNameNull: Self = this.set("deviceName", null)
    
    @scala.inline
    def setOsName(value: String): Self = this.set("osName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOsNameNull: Self = this.set("osName", null)
    
    @scala.inline
    def setOsVersion(value: String): Self = this.set("osVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOsVersionNull: Self = this.set("osVersion", null)
  }
}
