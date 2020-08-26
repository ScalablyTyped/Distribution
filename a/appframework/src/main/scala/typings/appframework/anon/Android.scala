package typings.appframework.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Android extends js.Object {
  var android: Boolean = js.native
  var androidICS: Boolean = js.native
  var blackberry: Boolean = js.native
  var blackberry10: Boolean = js.native
  var chrome: Boolean = js.native
  var fennec: Boolean = js.native
  var ie: Boolean = js.native
  var ieTouch: Boolean = js.native
  var ios: Boolean = js.native
  var ios7: Boolean = js.native
  var ipad: Boolean = js.native
  var iphone: Boolean = js.native
  var opera: Boolean = js.native
  var playbook: Boolean = js.native
  var supportsTouch: Boolean = js.native
  var touchpad: Boolean = js.native
  var webkit: Boolean = js.native
  var webos: Boolean = js.native
}

object Android {
  @scala.inline
  def apply(
    android: Boolean,
    androidICS: Boolean,
    blackberry: Boolean,
    blackberry10: Boolean,
    chrome: Boolean,
    fennec: Boolean,
    ie: Boolean,
    ieTouch: Boolean,
    ios: Boolean,
    ios7: Boolean,
    ipad: Boolean,
    iphone: Boolean,
    opera: Boolean,
    playbook: Boolean,
    supportsTouch: Boolean,
    touchpad: Boolean,
    webkit: Boolean,
    webos: Boolean
  ): Android = {
    val __obj = js.Dynamic.literal(android = android.asInstanceOf[js.Any], androidICS = androidICS.asInstanceOf[js.Any], blackberry = blackberry.asInstanceOf[js.Any], blackberry10 = blackberry10.asInstanceOf[js.Any], chrome = chrome.asInstanceOf[js.Any], fennec = fennec.asInstanceOf[js.Any], ie = ie.asInstanceOf[js.Any], ieTouch = ieTouch.asInstanceOf[js.Any], ios = ios.asInstanceOf[js.Any], ios7 = ios7.asInstanceOf[js.Any], ipad = ipad.asInstanceOf[js.Any], iphone = iphone.asInstanceOf[js.Any], opera = opera.asInstanceOf[js.Any], playbook = playbook.asInstanceOf[js.Any], supportsTouch = supportsTouch.asInstanceOf[js.Any], touchpad = touchpad.asInstanceOf[js.Any], webkit = webkit.asInstanceOf[js.Any], webos = webos.asInstanceOf[js.Any])
    __obj.asInstanceOf[Android]
  }
  @scala.inline
  implicit class AndroidOps[Self <: Android] (val x: Self) extends AnyVal {
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
    def setAndroidICS(value: Boolean): Self = this.set("androidICS", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlackberry(value: Boolean): Self = this.set("blackberry", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlackberry10(value: Boolean): Self = this.set("blackberry10", value.asInstanceOf[js.Any])
    @scala.inline
    def setChrome(value: Boolean): Self = this.set("chrome", value.asInstanceOf[js.Any])
    @scala.inline
    def setFennec(value: Boolean): Self = this.set("fennec", value.asInstanceOf[js.Any])
    @scala.inline
    def setIe(value: Boolean): Self = this.set("ie", value.asInstanceOf[js.Any])
    @scala.inline
    def setIeTouch(value: Boolean): Self = this.set("ieTouch", value.asInstanceOf[js.Any])
    @scala.inline
    def setIos(value: Boolean): Self = this.set("ios", value.asInstanceOf[js.Any])
    @scala.inline
    def setIos7(value: Boolean): Self = this.set("ios7", value.asInstanceOf[js.Any])
    @scala.inline
    def setIpad(value: Boolean): Self = this.set("ipad", value.asInstanceOf[js.Any])
    @scala.inline
    def setIphone(value: Boolean): Self = this.set("iphone", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpera(value: Boolean): Self = this.set("opera", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlaybook(value: Boolean): Self = this.set("playbook", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupportsTouch(value: Boolean): Self = this.set("supportsTouch", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchpad(value: Boolean): Self = this.set("touchpad", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebkit(value: Boolean): Self = this.set("webkit", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebos(value: Boolean): Self = this.set("webos", value.asInstanceOf[js.Any])
  }
  
}

