package typings.akamaiEdgeworkers.EW

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Notes:
  * * If device properties can not be supplied for any reason,
  *   undefined is returned for each property
  */
@js.native
trait Device extends js.Object {
  
  /**
    * Indicates if the browser accepts third party cookies.
    */
  val acceptsThirdPartyCookie: js.UndefOr[Boolean] = js.native
  
  /**
    * Brand name of the device.
    */
  val brandName: js.UndefOr[String] = js.native
  
  /**
    * Indicates if the device supports all of the following
    * JavaScript functions: "alert confirm access form elements
    * setTimeout setInterval and document.location"
    */
  val hasAjaxSupport: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates if the browser supports cookies.
    */
  val hasCookieSupport: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates if the browser supports Flash.
    */
  val hasFlashSupport: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates if the device is a mobile device.
    */
  val isMobile: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates if the device is a tablet.
    */
  val isTablet: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates if the device is a wireless device.
    */
  val isWireless: js.UndefOr[Boolean] = js.native
  
  /**
    * Marketing name of the device.
    */
  val marketingName: js.UndefOr[String] = js.native
  
  /**
    * The mobile browser name.
    */
  val mobileBrowser: js.UndefOr[String] = js.native
  
  /**
    * The mobile browser version.
    */
  val mobileBrowserVersion: js.UndefOr[String] = js.native
  
  /**
    * Model name of the device.
    */
  val modelName: js.UndefOr[String] = js.native
  
  /**
    * The device operation system.
    */
  val os: js.UndefOr[String] = js.native
  
  /**
    * The device operating system version.
    */
  val osVersion: js.UndefOr[String] = js.native
  
  /**
    * The physical screen height, in millimeters.
    */
  val physicalScreenHeight: js.UndefOr[Double] = js.native
  
  /**
    * The physical screen width, in millimeters.
    */
  val physicalScreenWidth: js.UndefOr[Double] = js.native
  
  /**
    * The screen resolution height, in pixels.
    */
  val resolutionHeight: js.UndefOr[Double] = js.native
  
  /**
    * The screen resolution width, in pixels.
    */
  val resolutionWidth: js.UndefOr[Double] = js.native
  
  /**
    * Indicates the level of support for XHTML.
    */
  val xhtmlSupportLevel: js.UndefOr[Double] = js.native
}
object Device {
  
  @scala.inline
  def apply(): Device = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Device]
  }
  
  @scala.inline
  implicit class DeviceOps[Self <: Device] (val x: Self) extends AnyVal {
    
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
    def setAcceptsThirdPartyCookie(value: Boolean): Self = this.set("acceptsThirdPartyCookie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcceptsThirdPartyCookie: Self = this.set("acceptsThirdPartyCookie", js.undefined)
    
    @scala.inline
    def setBrandName(value: String): Self = this.set("brandName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrandName: Self = this.set("brandName", js.undefined)
    
    @scala.inline
    def setHasAjaxSupport(value: Boolean): Self = this.set("hasAjaxSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasAjaxSupport: Self = this.set("hasAjaxSupport", js.undefined)
    
    @scala.inline
    def setHasCookieSupport(value: Boolean): Self = this.set("hasCookieSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasCookieSupport: Self = this.set("hasCookieSupport", js.undefined)
    
    @scala.inline
    def setHasFlashSupport(value: Boolean): Self = this.set("hasFlashSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasFlashSupport: Self = this.set("hasFlashSupport", js.undefined)
    
    @scala.inline
    def setIsMobile(value: Boolean): Self = this.set("isMobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsMobile: Self = this.set("isMobile", js.undefined)
    
    @scala.inline
    def setIsTablet(value: Boolean): Self = this.set("isTablet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsTablet: Self = this.set("isTablet", js.undefined)
    
    @scala.inline
    def setIsWireless(value: Boolean): Self = this.set("isWireless", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsWireless: Self = this.set("isWireless", js.undefined)
    
    @scala.inline
    def setMarketingName(value: String): Self = this.set("marketingName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarketingName: Self = this.set("marketingName", js.undefined)
    
    @scala.inline
    def setMobileBrowser(value: String): Self = this.set("mobileBrowser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMobileBrowser: Self = this.set("mobileBrowser", js.undefined)
    
    @scala.inline
    def setMobileBrowserVersion(value: String): Self = this.set("mobileBrowserVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMobileBrowserVersion: Self = this.set("mobileBrowserVersion", js.undefined)
    
    @scala.inline
    def setModelName(value: String): Self = this.set("modelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModelName: Self = this.set("modelName", js.undefined)
    
    @scala.inline
    def setOs(value: String): Self = this.set("os", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOs: Self = this.set("os", js.undefined)
    
    @scala.inline
    def setOsVersion(value: String): Self = this.set("osVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOsVersion: Self = this.set("osVersion", js.undefined)
    
    @scala.inline
    def setPhysicalScreenHeight(value: Double): Self = this.set("physicalScreenHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhysicalScreenHeight: Self = this.set("physicalScreenHeight", js.undefined)
    
    @scala.inline
    def setPhysicalScreenWidth(value: Double): Self = this.set("physicalScreenWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhysicalScreenWidth: Self = this.set("physicalScreenWidth", js.undefined)
    
    @scala.inline
    def setResolutionHeight(value: Double): Self = this.set("resolutionHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolutionHeight: Self = this.set("resolutionHeight", js.undefined)
    
    @scala.inline
    def setResolutionWidth(value: Double): Self = this.set("resolutionWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolutionWidth: Self = this.set("resolutionWidth", js.undefined)
    
    @scala.inline
    def setXhtmlSupportLevel(value: Double): Self = this.set("xhtmlSupportLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXhtmlSupportLevel: Self = this.set("xhtmlSupportLevel", js.undefined)
  }
}
