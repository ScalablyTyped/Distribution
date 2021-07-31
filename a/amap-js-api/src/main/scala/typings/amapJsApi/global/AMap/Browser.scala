package typings.amapJsApi.global.AMap

import typings.amapJsApi.amapJsApiStrings.other
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Browser {
  
  @JSGlobal("AMap.Browser")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * 是否安卓设备
    */
  @JSGlobal("AMap.Browser.android")
  @js.native
  val android: Boolean = js.native
  
  /**
    * 是否安卓4以下系统
    */
  @JSGlobal("AMap.Browser.android23")
  @js.native
  val android23: Boolean = js.native
  
  /**
    * 是否支持Css3D的浏览器
    */
  @JSGlobal("AMap.Browser.any3d")
  @js.native
  val any3d: Boolean = js.native
  
  /**
    *     是否百度浏览器
    */
  @JSGlobal("AMap.Browser.baidu")
  @js.native
  val baidu: Boolean = js.native
  
  /**
    * 是否Chrome浏览器
    */
  @JSGlobal("AMap.Browser.chrome")
  @js.native
  val chrome: Boolean = js.native
  
  /**
    *     是否Edge浏览器
    */
  @JSGlobal("AMap.Browser.edge")
  @js.native
  val edge: Boolean = js.native
  
  /**
    * 是否火狐浏览器
    */
  @JSGlobal("AMap.Browser.firefox")
  @js.native
  val firefox: Boolean = js.native
  
  /**
    * 是否支持Css3D的gecko浏览器
    */
  @JSGlobal("AMap.Browser.gecko3d")
  @js.native
  val gecko3d: Boolean = js.native
  
  /**
    * 是否iPad
    */
  @JSGlobal("AMap.Browser.iPad")
  @js.native
  val iPad: Boolean = js.native
  
  /**
    * 是否iPhone
    */
  @JSGlobal("AMap.Browser.iPhone")
  @js.native
  val iPhone: Boolean = js.native
  
  /**
    * 是否IE
    */
  @JSGlobal("AMap.Browser.ie")
  @js.native
  val ie: Boolean = js.native
  
  /**
    * 是否IE10
    */
  @JSGlobal("AMap.Browser.ie10")
  @js.native
  val ie10: Boolean = js.native
  
  /**
    * 是否IE11
    */
  @JSGlobal("AMap.Browser.ie11")
  @js.native
  val ie11: Boolean = js.native
  
  /**
    * 是否支持Css3D的ie浏览器
    */
  @JSGlobal("AMap.Browser.ie3d")
  @js.native
  val ie3d: Boolean = js.native
  
  /**
    * 是否IE6
    */
  @JSGlobal("AMap.Browser.ie6")
  @js.native
  val ie6: Boolean = js.native
  
  /**
    * 是否IE7
    */
  @JSGlobal("AMap.Browser.ie7")
  @js.native
  val ie7: Boolean = js.native
  
  /**
    * 是否IE8
    */
  @JSGlobal("AMap.Browser.ie8")
  @js.native
  val ie8: Boolean = js.native
  
  /**
    * 是否IE9
    */
  @JSGlobal("AMap.Browser.ie9")
  @js.native
  val ie9: Boolean = js.native
  
  /**
    * 是否IE9以下
    */
  @JSGlobal("AMap.Browser.ielt9")
  @js.native
  val ielt9: Boolean = js.native
  
  /**
    * 是否iOS设备
    */
  @JSGlobal("AMap.Browser.ios")
  @js.native
  val ios: Boolean = js.native
  
  /**
    * 是否支持canvas
    */
  @JSGlobal("AMap.Browser.isCanvas")
  @js.native
  val isCanvas: Boolean = js.native
  
  /**
    * 是否支持Geolocation
    */
  @JSGlobal("AMap.Browser.isGeolocation")
  @js.native
  val isGeolocation: Boolean = js.native
  
  /**
    * 是否支持LocaStorage
    */
  @JSGlobal("AMap.Browser.isLocalStorage")
  @js.native
  val isLocalStorage: Boolean = js.native
  
  /**
    * 是否支持svg
    */
  @JSGlobal("AMap.Browser.isSvg")
  @js.native
  val isSvg: Boolean = js.native
  
  /**
    * 是否支持vml
    */
  @JSGlobal("AMap.Browser.isVML")
  @js.native
  val isVML: Boolean = js.native
  
  /**
    * 判断是否支持webgl
    */
  @scala.inline
  def isWebGL(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWebGL")().asInstanceOf[Boolean]
  
  /**
    * 是否支持WebSocket
    */
  @JSGlobal("AMap.Browser.isWebsocket")
  @js.native
  val isWebsocket: Boolean = js.native
  
  /**
    * 是否支持WebWorker
    */
  @JSGlobal("AMap.Browser.isWorker")
  @js.native
  val isWorker: Boolean = js.native
  
  /**
    * 是否mac设备
    */
  @JSGlobal("AMap.Browser.mac")
  @js.native
  val mac: Boolean = js.native
  
  /**
    * 是否移动设备
    */
  @JSGlobal("AMap.Browser.mobile")
  @js.native
  val mobile: Boolean = js.native
  
  /**
    * 是否Opera移动浏览器
    */
  @JSGlobal("AMap.Browser.mobileOpera")
  @js.native
  val mobileOpera: Boolean = js.native
  
  /**
    * 是否Webkit移动浏览器
    */
  @JSGlobal("AMap.Browser.mobileWebkit")
  @js.native
  val mobileWebkit: Boolean = js.native
  
  /**
    * 是否支持Css3D的Webkit移动端浏览器
    */
  @JSGlobal("AMap.Browser.mobileWebkit3d")
  @js.native
  val mobileWebkit3d: Boolean = js.native
  
  /**
    * 是否msPointer设备
    */
  @JSGlobal("AMap.Browser.msPointer")
  @js.native
  val msPointer: Boolean = js.native
  
  /**
    * 是否支持Css3D的opera浏览器
    */
  @JSGlobal("AMap.Browser.opera3d")
  @js.native
  val opera3d: Boolean = js.native
  
  /**
    * 平台类型，如：'windows'、'mac'、'ios'、'android'、'other'
    */
  @JSGlobal("AMap.Browser.plat")
  @js.native
  val plat: typings.amapJsApi.amapJsApiStrings.android | typings.amapJsApi.amapJsApiStrings.ios | typings.amapJsApi.amapJsApiStrings.windows | typings.amapJsApi.amapJsApiStrings.mac | other = js.native
  
  /**
    * 是否pointer设备
    */
  @JSGlobal("AMap.Browser.pointer")
  @js.native
  val pointer: Boolean = js.native
  
  /**
    * 是否QQ或者QQ浏览器
    */
  @JSGlobal("AMap.Browser.qq")
  @js.native
  val qq: Boolean = js.native
  
  /**
    * 是否高清屏幕，devicePixelRatio>1
    */
  @JSGlobal("AMap.Browser.retina")
  @js.native
  val retina: Boolean = js.native
  
  /**
    * 是否Safari浏览器
    */
  @JSGlobal("AMap.Browser.safari")
  @js.native
  val safari: Boolean = js.native
  
  /**
    *     是否触屏
    */
  @JSGlobal("AMap.Browser.touch")
  @js.native
  val touch: Boolean = js.native
  
  /**
    * 当前浏览器userAgent
    */
  @JSGlobal("AMap.Browser.ua")
  @js.native
  val ua: String = js.native
  
  /**
    * 是否UC浏览器
    */
  @JSGlobal("AMap.Browser.uc")
  @js.native
  val uc: Boolean = js.native
  
  /**
    * 是否webkit浏览器
    */
  @JSGlobal("AMap.Browser.webkit")
  @js.native
  val webkit: Boolean = js.native
  
  /**
    * 是否支持Css3D的Webkit浏览器
    */
  @JSGlobal("AMap.Browser.webkit3d")
  @js.native
  val webkit3d: Boolean = js.native
  
  /**
    * 是否微信
    */
  @JSGlobal("AMap.Browser.wechat")
  @js.native
  val wechat: Boolean = js.native
  
  /**
    * 是否windows设备
    */
  @JSGlobal("AMap.Browser.windows")
  @js.native
  val windows: Boolean = js.native
}
