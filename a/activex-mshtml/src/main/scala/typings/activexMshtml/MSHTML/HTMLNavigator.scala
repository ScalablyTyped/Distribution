package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLNavigator extends js.Object {
  @JSName("MSHTML.HTMLNavigator_typekey")
  var MSHTMLDotHTMLNavigator_typekey: HTMLNavigator = js.native
  val appCodeName: String = js.native
  val appMinorVersion: String = js.native
  val appName: String = js.native
  val appVersion: String = js.native
  val browserLanguage: String = js.native
  val connectionSpeed: Double = js.native
  val constructor: js.Any = js.native
  val cookieEnabled: Boolean = js.native
  val cpuClass: String = js.native
  val geolocation: IWebGeolocation = js.native
  val mimeTypes: CMimeTypes = js.native
  val msDoNotTrack: String = js.native
  val onLine: Boolean = js.native
  val opsProfile: COpsProfile = js.native
  val platform: String = js.native
  val plugins: IHTMLPluginsCollection = js.native
  val systemLanguage: String = js.native
  val userAgent: String = js.native
  val userLanguage: String = js.native
  val userProfile: COpsProfile = js.native
  def javaEnabled(): Boolean = js.native
  def taintEnabled(): Boolean = js.native
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
  implicit class HTMLNavigatorOps[Self <: HTMLNavigator] (val x: Self) extends AnyVal {
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
    def setMSHTMLDotHTMLNavigator_typekey(value: HTMLNavigator): Self = this.set("MSHTML.HTMLNavigator_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setAppCodeName(value: String): Self = this.set("appCodeName", value.asInstanceOf[js.Any])
    @scala.inline
    def setAppMinorVersion(value: String): Self = this.set("appMinorVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setAppName(value: String): Self = this.set("appName", value.asInstanceOf[js.Any])
    @scala.inline
    def setAppVersion(value: String): Self = this.set("appVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setBrowserLanguage(value: String): Self = this.set("browserLanguage", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionSpeed(value: Double): Self = this.set("connectionSpeed", value.asInstanceOf[js.Any])
    @scala.inline
    def setConstructor(value: js.Any): Self = this.set("constructor", value.asInstanceOf[js.Any])
    @scala.inline
    def setCookieEnabled(value: Boolean): Self = this.set("cookieEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setCpuClass(value: String): Self = this.set("cpuClass", value.asInstanceOf[js.Any])
    @scala.inline
    def setGeolocation(value: IWebGeolocation): Self = this.set("geolocation", value.asInstanceOf[js.Any])
    @scala.inline
    def setJavaEnabled(value: () => Boolean): Self = this.set("javaEnabled", js.Any.fromFunction0(value))
    @scala.inline
    def setMimeTypes(value: CMimeTypes): Self = this.set("mimeTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def setMsDoNotTrack(value: String): Self = this.set("msDoNotTrack", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnLine(value: Boolean): Self = this.set("onLine", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpsProfile(value: COpsProfile): Self = this.set("opsProfile", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlatform(value: String): Self = this.set("platform", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlugins(value: IHTMLPluginsCollection): Self = this.set("plugins", value.asInstanceOf[js.Any])
    @scala.inline
    def setSystemLanguage(value: String): Self = this.set("systemLanguage", value.asInstanceOf[js.Any])
    @scala.inline
    def setTaintEnabled(value: () => Boolean): Self = this.set("taintEnabled", js.Any.fromFunction0(value))
    @scala.inline
    def setUserAgent(value: String): Self = this.set("userAgent", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserLanguage(value: String): Self = this.set("userLanguage", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserProfile(value: COpsProfile): Self = this.set("userProfile", value.asInstanceOf[js.Any])
  }
  
}

