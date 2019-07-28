package typings.aframe

import typings.std.VRDisplay
import typings.three.threeMod.Object3D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CheckHasPositionalTracking extends js.Object {
  var isWebXRAvailable: Boolean
  def PolyfillControls(object3D: Object3D): Unit
  def checkHasPositionalTracking(): Boolean
  def checkHeadsetConnected(): Boolean
  def getVRDisplay(): js.Array[VRDisplay]
  def isBrowserEnvironment(): Boolean
  def isGearVR(): Boolean
  def isIOS(): Boolean
  def isLandscape(): Boolean
  def isMobile(): Boolean
  def isNodeEnvironment(): Boolean
  def isOculusGo(): Boolean
  def isR7(): Boolean
  def isTablet(): Boolean
}

object Anon_CheckHasPositionalTracking {
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
  ): Anon_CheckHasPositionalTracking = {
    val __obj = js.Dynamic.literal(PolyfillControls = js.Any.fromFunction1(PolyfillControls), checkHasPositionalTracking = js.Any.fromFunction0(checkHasPositionalTracking), checkHeadsetConnected = js.Any.fromFunction0(checkHeadsetConnected), getVRDisplay = js.Any.fromFunction0(getVRDisplay), isBrowserEnvironment = js.Any.fromFunction0(isBrowserEnvironment), isGearVR = js.Any.fromFunction0(isGearVR), isIOS = js.Any.fromFunction0(isIOS), isLandscape = js.Any.fromFunction0(isLandscape), isMobile = js.Any.fromFunction0(isMobile), isNodeEnvironment = js.Any.fromFunction0(isNodeEnvironment), isOculusGo = js.Any.fromFunction0(isOculusGo), isR7 = js.Any.fromFunction0(isR7), isTablet = js.Any.fromFunction0(isTablet), isWebXRAvailable = isWebXRAvailable)
  
    __obj.asInstanceOf[Anon_CheckHasPositionalTracking]
  }
}

