package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOmNavigator extends js.Object {
  @JSName("MSHTML.IOmNavigator_typekey")
  var MSHTMLDotIOmNavigator_typekey: IOmNavigator
  val appCodeName: String
  val appMinorVersion: String
  val appName: String
  val appVersion: String
  val browserLanguage: String
  val connectionSpeed: Double
  val cookieEnabled: Boolean
  val cpuClass: String
  val mimeTypes: CMimeTypes
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

object IOmNavigator {
  @scala.inline
  def apply(
    MSHTMLDotIOmNavigator_typekey: IOmNavigator,
    appCodeName: String,
    appMinorVersion: String,
    appName: String,
    appVersion: String,
    browserLanguage: String,
    connectionSpeed: Double,
    cookieEnabled: Boolean,
    cpuClass: String,
    javaEnabled: () => Boolean,
    mimeTypes: CMimeTypes,
    onLine: Boolean,
    opsProfile: COpsProfile,
    platform: String,
    plugins: IHTMLPluginsCollection,
    systemLanguage: String,
    taintEnabled: () => Boolean,
    userAgent: String,
    userLanguage: String,
    userProfile: COpsProfile
  ): IOmNavigator = {
    val __obj = js.Dynamic.literal(appCodeName = appCodeName.asInstanceOf[js.Any], appMinorVersion = appMinorVersion.asInstanceOf[js.Any], appName = appName.asInstanceOf[js.Any], appVersion = appVersion.asInstanceOf[js.Any], browserLanguage = browserLanguage.asInstanceOf[js.Any], connectionSpeed = connectionSpeed.asInstanceOf[js.Any], cookieEnabled = cookieEnabled.asInstanceOf[js.Any], cpuClass = cpuClass.asInstanceOf[js.Any], javaEnabled = js.Any.fromFunction0(javaEnabled), mimeTypes = mimeTypes.asInstanceOf[js.Any], onLine = onLine.asInstanceOf[js.Any], opsProfile = opsProfile.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], systemLanguage = systemLanguage.asInstanceOf[js.Any], taintEnabled = js.Any.fromFunction0(taintEnabled), userAgent = userAgent.asInstanceOf[js.Any], userLanguage = userLanguage.asInstanceOf[js.Any], userProfile = userProfile.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.IOmNavigator_typekey")(MSHTMLDotIOmNavigator_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOmNavigator]
  }
}

