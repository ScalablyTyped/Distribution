package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLNavigator extends js.Object {
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
  val mimeTypes: CMimeTypes
  val msDoNotTrack: String
  val onLine: Boolean
  val opsProfile: COpsProfile
  val platform: String
  val plugins: IHTMLPluginsCollection
  val systemLanguage: String
  val userAgent: String
  val userLanguage: String
  val userProfile: COpsProfile
  def javaEnabled(): Boolean
  def taintEnabled(): Boolean
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
}

