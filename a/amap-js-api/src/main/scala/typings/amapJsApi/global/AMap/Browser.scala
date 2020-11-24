package typings.amapJsApi.global.AMap

import typings.amapJsApi.amapJsApiStrings.other
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("AMap.Browser")
@js.native
object Browser extends js.Object {
  
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
    * 判断是否支持webgl
    */
  def isWebGL(): Boolean = js.native
  
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
}
