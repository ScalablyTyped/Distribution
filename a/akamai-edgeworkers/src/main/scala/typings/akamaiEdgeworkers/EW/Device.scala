package typings.akamaiEdgeworkers.EW

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Notes:
  * * If device properties can not be supplied for any reason,
  *   undefined is returned for each property
  */
trait Device extends StObject {
  
  /**
    * Indicates if the browser accepts third party cookies.
    */
  val acceptsThirdPartyCookie: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Brand name of the device.
    */
  val brandName: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates if the device supports all of the following
    * JavaScript functions: "alert confirm access form elements
    * setTimeout setInterval and document.location"
    */
  val hasAjaxSupport: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates if the browser supports cookies.
    */
  val hasCookieSupport: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates if the browser supports Flash.
    */
  val hasFlashSupport: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates if the device is a mobile device.
    */
  val isMobile: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates if the device is a tablet.
    */
  val isTablet: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates if the device is a wireless device.
    */
  val isWireless: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Marketing name of the device.
    */
  val marketingName: js.UndefOr[String] = js.undefined
  
  /**
    * The mobile browser name.
    */
  val mobileBrowser: js.UndefOr[String] = js.undefined
  
  /**
    * The mobile browser version.
    */
  val mobileBrowserVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Model name of the device.
    */
  val modelName: js.UndefOr[String] = js.undefined
  
  /**
    * The device operation system.
    */
  val os: js.UndefOr[String] = js.undefined
  
  /**
    * The device operating system version.
    */
  val osVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The physical screen height, in millimeters.
    */
  val physicalScreenHeight: js.UndefOr[Double] = js.undefined
  
  /**
    * The physical screen width, in millimeters.
    */
  val physicalScreenWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * The screen resolution height, in pixels.
    */
  val resolutionHeight: js.UndefOr[Double] = js.undefined
  
  /**
    * The screen resolution width, in pixels.
    */
  val resolutionWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * Indicates the level of support for XHTML.
    */
  val xhtmlSupportLevel: js.UndefOr[Double] = js.undefined
}
object Device {
  
  @scala.inline
  def apply(): Device = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Device]
  }
  
  @scala.inline
  implicit class DeviceMutableBuilder[Self <: Device] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceptsThirdPartyCookie(value: Boolean): Self = StObject.set(x, "acceptsThirdPartyCookie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptsThirdPartyCookieUndefined: Self = StObject.set(x, "acceptsThirdPartyCookie", js.undefined)
    
    @scala.inline
    def setBrandName(value: String): Self = StObject.set(x, "brandName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrandNameUndefined: Self = StObject.set(x, "brandName", js.undefined)
    
    @scala.inline
    def setHasAjaxSupport(value: Boolean): Self = StObject.set(x, "hasAjaxSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasAjaxSupportUndefined: Self = StObject.set(x, "hasAjaxSupport", js.undefined)
    
    @scala.inline
    def setHasCookieSupport(value: Boolean): Self = StObject.set(x, "hasCookieSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasCookieSupportUndefined: Self = StObject.set(x, "hasCookieSupport", js.undefined)
    
    @scala.inline
    def setHasFlashSupport(value: Boolean): Self = StObject.set(x, "hasFlashSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasFlashSupportUndefined: Self = StObject.set(x, "hasFlashSupport", js.undefined)
    
    @scala.inline
    def setIsMobile(value: Boolean): Self = StObject.set(x, "isMobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMobileUndefined: Self = StObject.set(x, "isMobile", js.undefined)
    
    @scala.inline
    def setIsTablet(value: Boolean): Self = StObject.set(x, "isTablet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsTabletUndefined: Self = StObject.set(x, "isTablet", js.undefined)
    
    @scala.inline
    def setIsWireless(value: Boolean): Self = StObject.set(x, "isWireless", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsWirelessUndefined: Self = StObject.set(x, "isWireless", js.undefined)
    
    @scala.inline
    def setMarketingName(value: String): Self = StObject.set(x, "marketingName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarketingNameUndefined: Self = StObject.set(x, "marketingName", js.undefined)
    
    @scala.inline
    def setMobileBrowser(value: String): Self = StObject.set(x, "mobileBrowser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobileBrowserUndefined: Self = StObject.set(x, "mobileBrowser", js.undefined)
    
    @scala.inline
    def setMobileBrowserVersion(value: String): Self = StObject.set(x, "mobileBrowserVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobileBrowserVersionUndefined: Self = StObject.set(x, "mobileBrowserVersion", js.undefined)
    
    @scala.inline
    def setModelName(value: String): Self = StObject.set(x, "modelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelNameUndefined: Self = StObject.set(x, "modelName", js.undefined)
    
    @scala.inline
    def setOs(value: String): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOsUndefined: Self = StObject.set(x, "os", js.undefined)
    
    @scala.inline
    def setOsVersion(value: String): Self = StObject.set(x, "osVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOsVersionUndefined: Self = StObject.set(x, "osVersion", js.undefined)
    
    @scala.inline
    def setPhysicalScreenHeight(value: Double): Self = StObject.set(x, "physicalScreenHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhysicalScreenHeightUndefined: Self = StObject.set(x, "physicalScreenHeight", js.undefined)
    
    @scala.inline
    def setPhysicalScreenWidth(value: Double): Self = StObject.set(x, "physicalScreenWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhysicalScreenWidthUndefined: Self = StObject.set(x, "physicalScreenWidth", js.undefined)
    
    @scala.inline
    def setResolutionHeight(value: Double): Self = StObject.set(x, "resolutionHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolutionHeightUndefined: Self = StObject.set(x, "resolutionHeight", js.undefined)
    
    @scala.inline
    def setResolutionWidth(value: Double): Self = StObject.set(x, "resolutionWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolutionWidthUndefined: Self = StObject.set(x, "resolutionWidth", js.undefined)
    
    @scala.inline
    def setXhtmlSupportLevel(value: Double): Self = StObject.set(x, "xhtmlSupportLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXhtmlSupportLevelUndefined: Self = StObject.set(x, "xhtmlSupportLevel", js.undefined)
  }
}
