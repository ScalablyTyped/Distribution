package typings.amapJsApi.anon

import typings.amapJsApi.amapJsApiStrings.android
import typings.amapJsApi.amapJsApiStrings.ios
import typings.amapJsApi.amapJsApiStrings.mac
import typings.amapJsApi.amapJsApiStrings.other
import typings.amapJsApi.amapJsApiStrings.windows
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofBrowser extends js.Object {
  /**
    * 是否安卓设备
    */
  val android: Boolean = js.native
  /**
    * 是否安卓4以下系统
    */
  val android23: Boolean = js.native
  /**
    * 是否支持Css3D的浏览器
    */
  val any3d: Boolean = js.native
  /**
    *     是否百度浏览器
    */
  val baidu: Boolean = js.native
  /**
    * 是否Chrome浏览器
    */
  val chrome: Boolean = js.native
  /**
    *     是否Edge浏览器
    */
  val edge: Boolean = js.native
  /**
    * 是否火狐浏览器
    */
  val firefox: Boolean = js.native
  /**
    * 是否支持Css3D的gecko浏览器
    */
  val gecko3d: Boolean = js.native
  /**
    * 是否iPad
    */
  val iPad: Boolean = js.native
  /**
    * 是否iPhone
    */
  val iPhone: Boolean = js.native
  /**
    * 是否IE
    */
  val ie: Boolean = js.native
  /**
    * 是否IE10
    */
  val ie10: Boolean = js.native
  /**
    * 是否IE11
    */
  val ie11: Boolean = js.native
  /**
    * 是否支持Css3D的ie浏览器
    */
  val ie3d: Boolean = js.native
  /**
    * 是否IE6
    */
  val ie6: Boolean = js.native
  /**
    * 是否IE7
    */
  val ie7: Boolean = js.native
  /**
    * 是否IE8
    */
  val ie8: Boolean = js.native
  /**
    * 是否IE9
    */
  val ie9: Boolean = js.native
  /**
    * 是否IE9以下
    */
  val ielt9: Boolean = js.native
  /**
    * 是否iOS设备
    */
  val ios: Boolean = js.native
  /**
    * 是否支持canvas
    */
  val isCanvas: Boolean = js.native
  /**
    * 是否支持Geolocation
    */
  val isGeolocation: Boolean = js.native
  /**
    * 是否支持LocaStorage
    */
  val isLocalStorage: Boolean = js.native
  /**
    * 是否支持svg
    */
  val isSvg: Boolean = js.native
  /**
    * 是否支持vml
    */
  val isVML: Boolean = js.native
  /**
    * 是否支持WebSocket
    */
  val isWebsocket: Boolean = js.native
  /**
    * 是否支持WebWorker
    */
  val isWorker: Boolean = js.native
  /**
    * 是否mac设备
    */
  val mac: Boolean = js.native
  /**
    * 是否移动设备
    */
  val mobile: Boolean = js.native
  /**
    * 是否Opera移动浏览器
    */
  val mobileOpera: Boolean = js.native
  /**
    * 是否Webkit移动浏览器
    */
  val mobileWebkit: Boolean = js.native
  /**
    * 是否支持Css3D的Webkit移动端浏览器
    */
  val mobileWebkit3d: Boolean = js.native
  /**
    * 是否msPointer设备
    */
  val msPointer: Boolean = js.native
  /**
    * 是否支持Css3D的opera浏览器
    */
  val opera3d: Boolean = js.native
  /**
    * 平台类型，如：'windows'、'mac'、'ios'、'android'、'other'
    */
  val plat: typings.amapJsApi.amapJsApiStrings.android | typings.amapJsApi.amapJsApiStrings.ios | typings.amapJsApi.amapJsApiStrings.windows | typings.amapJsApi.amapJsApiStrings.mac | other = js.native
  /**
    * 是否pointer设备
    */
  val pointer: Boolean = js.native
  /**
    * 是否QQ或者QQ浏览器
    */
  val qq: Boolean = js.native
  /**
    * 是否高清屏幕，devicePixelRatio>1
    */
  val retina: Boolean = js.native
  /**
    * 是否Safari浏览器
    */
  val safari: Boolean = js.native
  /**
    *     是否触屏
    */
  val touch: Boolean = js.native
  /**
    * 当前浏览器userAgent
    */
  val ua: String = js.native
  /**
    * 是否UC浏览器
    */
  val uc: Boolean = js.native
  /**
    * 是否webkit浏览器
    */
  val webkit: Boolean = js.native
  /**
    * 是否支持Css3D的Webkit浏览器
    */
  val webkit3d: Boolean = js.native
  /**
    * 是否微信
    */
  val wechat: Boolean = js.native
  /**
    * 是否windows设备
    */
  val windows: Boolean = js.native
  /**
    * 判断是否支持webgl
    */
  def isWebGL(): Boolean = js.native
}

object TypeofBrowser {
  @scala.inline
  def apply(
    android: Boolean,
    android23: Boolean,
    any3d: Boolean,
    baidu: Boolean,
    chrome: Boolean,
    edge: Boolean,
    firefox: Boolean,
    gecko3d: Boolean,
    iPad: Boolean,
    iPhone: Boolean,
    ie: Boolean,
    ie10: Boolean,
    ie11: Boolean,
    ie3d: Boolean,
    ie6: Boolean,
    ie7: Boolean,
    ie8: Boolean,
    ie9: Boolean,
    ielt9: Boolean,
    ios: Boolean,
    isCanvas: Boolean,
    isGeolocation: Boolean,
    isLocalStorage: Boolean,
    isSvg: Boolean,
    isVML: Boolean,
    isWebGL: () => Boolean,
    isWebsocket: Boolean,
    isWorker: Boolean,
    mac: Boolean,
    mobile: Boolean,
    mobileOpera: Boolean,
    mobileWebkit: Boolean,
    mobileWebkit3d: Boolean,
    msPointer: Boolean,
    opera3d: Boolean,
    plat: android | ios | windows | mac | other,
    pointer: Boolean,
    qq: Boolean,
    retina: Boolean,
    safari: Boolean,
    touch: Boolean,
    ua: String,
    uc: Boolean,
    webkit: Boolean,
    webkit3d: Boolean,
    wechat: Boolean,
    windows: Boolean
  ): TypeofBrowser = {
    val __obj = js.Dynamic.literal(android = android.asInstanceOf[js.Any], android23 = android23.asInstanceOf[js.Any], any3d = any3d.asInstanceOf[js.Any], baidu = baidu.asInstanceOf[js.Any], chrome = chrome.asInstanceOf[js.Any], edge = edge.asInstanceOf[js.Any], firefox = firefox.asInstanceOf[js.Any], gecko3d = gecko3d.asInstanceOf[js.Any], iPad = iPad.asInstanceOf[js.Any], iPhone = iPhone.asInstanceOf[js.Any], ie = ie.asInstanceOf[js.Any], ie10 = ie10.asInstanceOf[js.Any], ie11 = ie11.asInstanceOf[js.Any], ie3d = ie3d.asInstanceOf[js.Any], ie6 = ie6.asInstanceOf[js.Any], ie7 = ie7.asInstanceOf[js.Any], ie8 = ie8.asInstanceOf[js.Any], ie9 = ie9.asInstanceOf[js.Any], ielt9 = ielt9.asInstanceOf[js.Any], ios = ios.asInstanceOf[js.Any], isCanvas = isCanvas.asInstanceOf[js.Any], isGeolocation = isGeolocation.asInstanceOf[js.Any], isLocalStorage = isLocalStorage.asInstanceOf[js.Any], isSvg = isSvg.asInstanceOf[js.Any], isVML = isVML.asInstanceOf[js.Any], isWebGL = js.Any.fromFunction0(isWebGL), isWebsocket = isWebsocket.asInstanceOf[js.Any], isWorker = isWorker.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any], mobile = mobile.asInstanceOf[js.Any], mobileOpera = mobileOpera.asInstanceOf[js.Any], mobileWebkit = mobileWebkit.asInstanceOf[js.Any], mobileWebkit3d = mobileWebkit3d.asInstanceOf[js.Any], msPointer = msPointer.asInstanceOf[js.Any], opera3d = opera3d.asInstanceOf[js.Any], plat = plat.asInstanceOf[js.Any], pointer = pointer.asInstanceOf[js.Any], qq = qq.asInstanceOf[js.Any], retina = retina.asInstanceOf[js.Any], safari = safari.asInstanceOf[js.Any], touch = touch.asInstanceOf[js.Any], ua = ua.asInstanceOf[js.Any], uc = uc.asInstanceOf[js.Any], webkit = webkit.asInstanceOf[js.Any], webkit3d = webkit3d.asInstanceOf[js.Any], wechat = wechat.asInstanceOf[js.Any], windows = windows.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofBrowser]
  }
  @scala.inline
  implicit class TypeofBrowserOps[Self <: TypeofBrowser] (val x: Self) extends AnyVal {
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
    def setAndroid(value: Boolean): Self = this.set("android", value.asInstanceOf[js.Any])
    @scala.inline
    def setAndroid23(value: Boolean): Self = this.set("android23", value.asInstanceOf[js.Any])
    @scala.inline
    def setAny3d(value: Boolean): Self = this.set("any3d", value.asInstanceOf[js.Any])
    @scala.inline
    def setBaidu(value: Boolean): Self = this.set("baidu", value.asInstanceOf[js.Any])
    @scala.inline
    def setChrome(value: Boolean): Self = this.set("chrome", value.asInstanceOf[js.Any])
    @scala.inline
    def setEdge(value: Boolean): Self = this.set("edge", value.asInstanceOf[js.Any])
    @scala.inline
    def setFirefox(value: Boolean): Self = this.set("firefox", value.asInstanceOf[js.Any])
    @scala.inline
    def setGecko3d(value: Boolean): Self = this.set("gecko3d", value.asInstanceOf[js.Any])
    @scala.inline
    def setIPad(value: Boolean): Self = this.set("iPad", value.asInstanceOf[js.Any])
    @scala.inline
    def setIPhone(value: Boolean): Self = this.set("iPhone", value.asInstanceOf[js.Any])
    @scala.inline
    def setIe(value: Boolean): Self = this.set("ie", value.asInstanceOf[js.Any])
    @scala.inline
    def setIe10(value: Boolean): Self = this.set("ie10", value.asInstanceOf[js.Any])
    @scala.inline
    def setIe11(value: Boolean): Self = this.set("ie11", value.asInstanceOf[js.Any])
    @scala.inline
    def setIe3d(value: Boolean): Self = this.set("ie3d", value.asInstanceOf[js.Any])
    @scala.inline
    def setIe6(value: Boolean): Self = this.set("ie6", value.asInstanceOf[js.Any])
    @scala.inline
    def setIe7(value: Boolean): Self = this.set("ie7", value.asInstanceOf[js.Any])
    @scala.inline
    def setIe8(value: Boolean): Self = this.set("ie8", value.asInstanceOf[js.Any])
    @scala.inline
    def setIe9(value: Boolean): Self = this.set("ie9", value.asInstanceOf[js.Any])
    @scala.inline
    def setIelt9(value: Boolean): Self = this.set("ielt9", value.asInstanceOf[js.Any])
    @scala.inline
    def setIos(value: Boolean): Self = this.set("ios", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsCanvas(value: Boolean): Self = this.set("isCanvas", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsGeolocation(value: Boolean): Self = this.set("isGeolocation", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsLocalStorage(value: Boolean): Self = this.set("isLocalStorage", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsSvg(value: Boolean): Self = this.set("isSvg", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsVML(value: Boolean): Self = this.set("isVML", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsWebGL(value: () => Boolean): Self = this.set("isWebGL", js.Any.fromFunction0(value))
    @scala.inline
    def setIsWebsocket(value: Boolean): Self = this.set("isWebsocket", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsWorker(value: Boolean): Self = this.set("isWorker", value.asInstanceOf[js.Any])
    @scala.inline
    def setMac(value: Boolean): Self = this.set("mac", value.asInstanceOf[js.Any])
    @scala.inline
    def setMobile(value: Boolean): Self = this.set("mobile", value.asInstanceOf[js.Any])
    @scala.inline
    def setMobileOpera(value: Boolean): Self = this.set("mobileOpera", value.asInstanceOf[js.Any])
    @scala.inline
    def setMobileWebkit(value: Boolean): Self = this.set("mobileWebkit", value.asInstanceOf[js.Any])
    @scala.inline
    def setMobileWebkit3d(value: Boolean): Self = this.set("mobileWebkit3d", value.asInstanceOf[js.Any])
    @scala.inline
    def setMsPointer(value: Boolean): Self = this.set("msPointer", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpera3d(value: Boolean): Self = this.set("opera3d", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlat(value: android | ios | windows | mac | other): Self = this.set("plat", value.asInstanceOf[js.Any])
    @scala.inline
    def setPointer(value: Boolean): Self = this.set("pointer", value.asInstanceOf[js.Any])
    @scala.inline
    def setQq(value: Boolean): Self = this.set("qq", value.asInstanceOf[js.Any])
    @scala.inline
    def setRetina(value: Boolean): Self = this.set("retina", value.asInstanceOf[js.Any])
    @scala.inline
    def setSafari(value: Boolean): Self = this.set("safari", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouch(value: Boolean): Self = this.set("touch", value.asInstanceOf[js.Any])
    @scala.inline
    def setUa(value: String): Self = this.set("ua", value.asInstanceOf[js.Any])
    @scala.inline
    def setUc(value: Boolean): Self = this.set("uc", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebkit(value: Boolean): Self = this.set("webkit", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebkit3d(value: Boolean): Self = this.set("webkit3d", value.asInstanceOf[js.Any])
    @scala.inline
    def setWechat(value: Boolean): Self = this.set("wechat", value.asInstanceOf[js.Any])
    @scala.inline
    def setWindows(value: Boolean): Self = this.set("windows", value.asInstanceOf[js.Any])
  }
  
}

