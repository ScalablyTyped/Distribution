package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTMLNavigator extends StObject {
  
  @JSName("MSHTML.HTMLNavigator_typekey")
  var MSHTMLDotHTMLNavigator_typekey: HTMLNavigator
  
  val appCodeName: String
  
  val appMinorVersion: String
  
  val appName: String
  
  val appVersion: String
  
  val browserLanguage: String
  
  val connectionSpeed: Double
  
  val constructor: js.Any
  
  val cookieEnabled: Boolean
  
  val cpuClass: String
  
  val geolocation: IWebGeolocation
  
  def javaEnabled(): Boolean
  
  val mimeTypes: CMimeTypes
  
  val msDoNotTrack: String
  
  val onLine: Boolean
  
  val opsProfile: COpsProfile
  
  val platform: String
  
  val plugins: IHTMLPluginsCollection
  
  val systemLanguage: String
  
  def taintEnabled(): Boolean
  
  val userAgent: String
  
  val userLanguage: String
  
  val userProfile: COpsProfile
}
object HTMLNavigator {
  
  @scala.inline
  def apply(
    MSHTMLDotHTMLNavigator_typekey: HTMLNavigator,
    appCodeName: String,
    appMinorVersion: String,
    appName: String,
    appVersion: String,
    browserLanguage: String,
    connectionSpeed: Double,
    constructor: js.Any,
    cookieEnabled: Boolean,
    cpuClass: String,
    geolocation: IWebGeolocation,
    javaEnabled: () => Boolean,
    mimeTypes: CMimeTypes,
    msDoNotTrack: String,
    onLine: Boolean,
    opsProfile: COpsProfile,
    platform: String,
    plugins: IHTMLPluginsCollection,
    systemLanguage: String,
    taintEnabled: () => Boolean,
    userAgent: String,
    userLanguage: String,
    userProfile: COpsProfile
  ): HTMLNavigator = {
    val __obj = js.Dynamic.literal(appCodeName = appCodeName.asInstanceOf[js.Any], appMinorVersion = appMinorVersion.asInstanceOf[js.Any], appName = appName.asInstanceOf[js.Any], appVersion = appVersion.asInstanceOf[js.Any], browserLanguage = browserLanguage.asInstanceOf[js.Any], connectionSpeed = connectionSpeed.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], cookieEnabled = cookieEnabled.asInstanceOf[js.Any], cpuClass = cpuClass.asInstanceOf[js.Any], geolocation = geolocation.asInstanceOf[js.Any], javaEnabled = js.Any.fromFunction0(javaEnabled), mimeTypes = mimeTypes.asInstanceOf[js.Any], msDoNotTrack = msDoNotTrack.asInstanceOf[js.Any], onLine = onLine.asInstanceOf[js.Any], opsProfile = opsProfile.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], systemLanguage = systemLanguage.asInstanceOf[js.Any], taintEnabled = js.Any.fromFunction0(taintEnabled), userAgent = userAgent.asInstanceOf[js.Any], userLanguage = userLanguage.asInstanceOf[js.Any], userProfile = userProfile.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.HTMLNavigator_typekey")(MSHTMLDotHTMLNavigator_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLNavigator]
  }
  
  @scala.inline
  implicit class HTMLNavigatorMutableBuilder[Self <: HTMLNavigator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppCodeName(value: String): Self = StObject.set(x, "appCodeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppMinorVersion(value: String): Self = StObject.set(x, "appMinorVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppVersion(value: String): Self = StObject.set(x, "appVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserLanguage(value: String): Self = StObject.set(x, "browserLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionSpeed(value: Double): Self = StObject.set(x, "connectionSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstructor(value: js.Any): Self = StObject.set(x, "constructor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCookieEnabled(value: Boolean): Self = StObject.set(x, "cookieEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpuClass(value: String): Self = StObject.set(x, "cpuClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeolocation(value: IWebGeolocation): Self = StObject.set(x, "geolocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJavaEnabled(value: () => Boolean): Self = StObject.set(x, "javaEnabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMSHTMLDotHTMLNavigator_typekey(value: HTMLNavigator): Self = StObject.set(x, "MSHTML.HTMLNavigator_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeTypes(value: CMimeTypes): Self = StObject.set(x, "mimeTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsDoNotTrack(value: String): Self = StObject.set(x, "msDoNotTrack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnLine(value: Boolean): Self = StObject.set(x, "onLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpsProfile(value: COpsProfile): Self = StObject.set(x, "opsProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlugins(value: IHTMLPluginsCollection): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemLanguage(value: String): Self = StObject.set(x, "systemLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaintEnabled(value: () => Boolean): Self = StObject.set(x, "taintEnabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserLanguage(value: String): Self = StObject.set(x, "userLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserProfile(value: COpsProfile): Self = StObject.set(x, "userProfile", value.asInstanceOf[js.Any])
  }
}
