package typings.aframe.anon

import typings.std.VRDisplay
import typings.three.mod.Object3D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckHasPositionalTracking extends js.Object {
  var isWebXRAvailable: Boolean = js.native
  def PolyfillControls(object3D: Object3D): Unit = js.native
  def checkHasPositionalTracking(): Boolean = js.native
  def checkHeadsetConnected(): Boolean = js.native
  def getVRDisplay(): js.Array[VRDisplay] = js.native
  def isBrowserEnvironment(): Boolean = js.native
  def isGearVR(): Boolean = js.native
  def isIOS(): Boolean = js.native
  def isLandscape(): Boolean = js.native
  def isMobile(): Boolean = js.native
  def isNodeEnvironment(): Boolean = js.native
  def isOculusGo(): Boolean = js.native
  def isR7(): Boolean = js.native
  def isTablet(): Boolean = js.native
}

object CheckHasPositionalTracking {
  @scala.inline
  def apply(
    PolyfillControls: Object3D => Unit,
    checkHasPositionalTracking: () => Boolean,
    checkHeadsetConnected: () => Boolean,
    getVRDisplay: () => js.Array[VRDisplay],
    isBrowserEnvironment: () => Boolean,
    isGearVR: () => Boolean,
    isIOS: () => Boolean,
    isLandscape: () => Boolean,
    isMobile: () => Boolean,
    isNodeEnvironment: () => Boolean,
    isOculusGo: () => Boolean,
    isR7: () => Boolean,
    isTablet: () => Boolean,
    isWebXRAvailable: Boolean
  ): CheckHasPositionalTracking = {
    val __obj = js.Dynamic.literal(PolyfillControls = js.Any.fromFunction1(PolyfillControls), checkHasPositionalTracking = js.Any.fromFunction0(checkHasPositionalTracking), checkHeadsetConnected = js.Any.fromFunction0(checkHeadsetConnected), getVRDisplay = js.Any.fromFunction0(getVRDisplay), isBrowserEnvironment = js.Any.fromFunction0(isBrowserEnvironment), isGearVR = js.Any.fromFunction0(isGearVR), isIOS = js.Any.fromFunction0(isIOS), isLandscape = js.Any.fromFunction0(isLandscape), isMobile = js.Any.fromFunction0(isMobile), isNodeEnvironment = js.Any.fromFunction0(isNodeEnvironment), isOculusGo = js.Any.fromFunction0(isOculusGo), isR7 = js.Any.fromFunction0(isR7), isTablet = js.Any.fromFunction0(isTablet), isWebXRAvailable = isWebXRAvailable.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckHasPositionalTracking]
  }
  @scala.inline
  implicit class CheckHasPositionalTrackingOps[Self <: CheckHasPositionalTracking] (val x: Self) extends AnyVal {
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
    def setPolyfillControls(value: Object3D => Unit): Self = this.set("PolyfillControls", js.Any.fromFunction1(value))
    @scala.inline
    def setCheckHasPositionalTracking(value: () => Boolean): Self = this.set("checkHasPositionalTracking", js.Any.fromFunction0(value))
    @scala.inline
    def setCheckHeadsetConnected(value: () => Boolean): Self = this.set("checkHeadsetConnected", js.Any.fromFunction0(value))
    @scala.inline
    def setGetVRDisplay(value: () => js.Array[VRDisplay]): Self = this.set("getVRDisplay", js.Any.fromFunction0(value))
    @scala.inline
    def setIsBrowserEnvironment(value: () => Boolean): Self = this.set("isBrowserEnvironment", js.Any.fromFunction0(value))
    @scala.inline
    def setIsGearVR(value: () => Boolean): Self = this.set("isGearVR", js.Any.fromFunction0(value))
    @scala.inline
    def setIsIOS(value: () => Boolean): Self = this.set("isIOS", js.Any.fromFunction0(value))
    @scala.inline
    def setIsLandscape(value: () => Boolean): Self = this.set("isLandscape", js.Any.fromFunction0(value))
    @scala.inline
    def setIsMobile(value: () => Boolean): Self = this.set("isMobile", js.Any.fromFunction0(value))
    @scala.inline
    def setIsNodeEnvironment(value: () => Boolean): Self = this.set("isNodeEnvironment", js.Any.fromFunction0(value))
    @scala.inline
    def setIsOculusGo(value: () => Boolean): Self = this.set("isOculusGo", js.Any.fromFunction0(value))
    @scala.inline
    def setIsR7(value: () => Boolean): Self = this.set("isR7", js.Any.fromFunction0(value))
    @scala.inline
    def setIsTablet(value: () => Boolean): Self = this.set("isTablet", js.Any.fromFunction0(value))
    @scala.inline
    def setIsWebXRAvailable(value: Boolean): Self = this.set("isWebXRAvailable", value.asInstanceOf[js.Any])
  }
  
}

