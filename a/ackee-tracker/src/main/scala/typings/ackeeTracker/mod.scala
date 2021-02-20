package typings.ackeeTracker

import typings.ackeeTracker.ackeeTrackerBooleans.`false`
import typings.ackeeTracker.ackeeTrackerBooleans.`true`
import typings.ackeeTracker.anon.FnCall
import typings.ackeeTracker.anon.Stop
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ackee-tracker", "attributes")
  @js.native
  def attributes(): DefaultData = js.native
  @JSImport("ackee-tracker", "attributes")
  @js.native
  def attributes_false(detailed: `false`): DefaultData = js.native
  @JSImport("ackee-tracker", "attributes")
  @js.native
  def attributes_true(detailed: `true`): DefaultData with DetailedData = js.native
  
  @JSImport("ackee-tracker", "create")
  @js.native
  def create(server: ServerDetails): AckeeInstance = js.native
  @JSImport("ackee-tracker", "create")
  @js.native
  def create(server: ServerDetails, options: TrackingOptions): AckeeInstance = js.native
  
  @JSImport("ackee-tracker", "detect")
  @js.native
  def detect(): Unit = js.native
  
  @js.native
  trait AckeeInstance extends StObject {
    
    def record(): Stop = js.native
    def record(attrs: ReturnType[FnCall]): Stop = js.native
  }
  
  @js.native
  trait DefaultData extends StObject {
    
    var siteLocation: String = js.native
    
    var siteReferrer: String = js.native
  }
  object DefaultData {
    
    @scala.inline
    def apply(siteLocation: String, siteReferrer: String): DefaultData = {
      val __obj = js.Dynamic.literal(siteLocation = siteLocation.asInstanceOf[js.Any], siteReferrer = siteReferrer.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultData]
    }
    
    @scala.inline
    implicit class DefaultDataMutableBuilder[Self <: DefaultData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSiteLocation(value: String): Self = StObject.set(x, "siteLocation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSiteReferrer(value: String): Self = StObject.set(x, "siteReferrer", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DetailedData extends StObject {
    
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
    implicit class DetailedDataMutableBuilder[Self <: DetailedData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBrowserHeight(value: Double): Self = StObject.set(x, "browserHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrowserName(value: String): Self = StObject.set(x, "browserName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrowserNameNull: Self = StObject.set(x, "browserName", null)
      
      @scala.inline
      def setBrowserVersion(value: String): Self = StObject.set(x, "browserVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrowserVersionNull: Self = StObject.set(x, "browserVersion", null)
      
      @scala.inline
      def setBrowserWidth(value: Double): Self = StObject.set(x, "browserWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceManufacturer(value: String): Self = StObject.set(x, "deviceManufacturer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceManufacturerNull: Self = StObject.set(x, "deviceManufacturer", null)
      
      @scala.inline
      def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceNameNull: Self = StObject.set(x, "deviceName", null)
      
      @scala.inline
      def setOsName(value: String): Self = StObject.set(x, "osName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOsNameNull: Self = StObject.set(x, "osName", null)
      
      @scala.inline
      def setOsVersion(value: String): Self = StObject.set(x, "osVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOsVersionNull: Self = StObject.set(x, "osVersion", null)
      
      @scala.inline
      def setScreenColorDepth(value: Double): Self = StObject.set(x, "screenColorDepth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScreenHeight(value: Double): Self = StObject.set(x, "screenHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScreenWidth(value: Double): Self = StObject.set(x, "screenWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSiteLanguage(value: String): Self = StObject.set(x, "siteLanguage", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ServerDetails extends StObject {
    
    var domainId: String = js.native
    
    var server: String = js.native
  }
  object ServerDetails {
    
    @scala.inline
    def apply(domainId: String, server: String): ServerDetails = {
      val __obj = js.Dynamic.literal(domainId = domainId.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServerDetails]
    }
    
    @scala.inline
    implicit class ServerDetailsMutableBuilder[Self <: ServerDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDomainId(value: String): Self = StObject.set(x, "domainId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServer(value: String): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TrackingOptions extends StObject {
    
    /**
      * Defaults to `false`
      */
    var detailed: js.UndefOr[Boolean] = js.native
    
    /**
      * Defaults to `true`
      */
    var ignoreLocalhost: js.UndefOr[Boolean] = js.native
  }
  object TrackingOptions {
    
    @scala.inline
    def apply(): TrackingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TrackingOptions]
    }
    
    @scala.inline
    implicit class TrackingOptionsMutableBuilder[Self <: TrackingOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDetailed(value: Boolean): Self = StObject.set(x, "detailed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetailedUndefined: Self = StObject.set(x, "detailed", js.undefined)
      
      @scala.inline
      def setIgnoreLocalhost(value: Boolean): Self = StObject.set(x, "ignoreLocalhost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreLocalhostUndefined: Self = StObject.set(x, "ignoreLocalhost", js.undefined)
    }
  }
}
