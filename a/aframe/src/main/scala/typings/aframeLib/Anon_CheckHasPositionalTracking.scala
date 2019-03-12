package typings
package aframeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CheckHasPositionalTracking extends js.Object {
  var isWebXRAvailable: scala.Boolean
  def PolyfillControls(object3D: threeLib.threeMod.Object3D): scala.Unit
  def checkHasPositionalTracking(): scala.Boolean
  def checkHeadsetConnected(): scala.Boolean
  def getVRDisplay(): js.Array[stdLib.VRDisplay]
  def isBrowserEnvironment(): scala.Boolean
  def isGearVR(): scala.Boolean
  def isIOS(): scala.Boolean
  def isLandscape(): scala.Boolean
  def isMobile(): scala.Boolean
  def isNodeEnvironment(): scala.Boolean
  def isOculusGo(): scala.Boolean
  def isR7(): scala.Boolean
  def isTablet(): scala.Boolean
}

object Anon_CheckHasPositionalTracking {
  @scala.inline
  def apply(
    PolyfillControls: threeLib.threeMod.Object3D => scala.Unit,
    checkHasPositionalTracking: () => scala.Boolean,
    checkHeadsetConnected: () => scala.Boolean,
    getVRDisplay: () => js.Array[stdLib.VRDisplay],
    isBrowserEnvironment: () => scala.Boolean,
    isGearVR: () => scala.Boolean,
    isIOS: () => scala.Boolean,
    isLandscape: () => scala.Boolean,
    isMobile: () => scala.Boolean,
    isNodeEnvironment: () => scala.Boolean,
    isOculusGo: () => scala.Boolean,
    isR7: () => scala.Boolean,
    isTablet: () => scala.Boolean,
    isWebXRAvailable: scala.Boolean
  ): Anon_CheckHasPositionalTracking = {
    val __obj = js.Dynamic.literal(PolyfillControls = js.Any.fromFunction1(PolyfillControls), checkHasPositionalTracking = js.Any.fromFunction0(checkHasPositionalTracking), checkHeadsetConnected = js.Any.fromFunction0(checkHeadsetConnected), getVRDisplay = js.Any.fromFunction0(getVRDisplay), isBrowserEnvironment = js.Any.fromFunction0(isBrowserEnvironment), isGearVR = js.Any.fromFunction0(isGearVR), isIOS = js.Any.fromFunction0(isIOS), isLandscape = js.Any.fromFunction0(isLandscape), isMobile = js.Any.fromFunction0(isMobile), isNodeEnvironment = js.Any.fromFunction0(isNodeEnvironment), isOculusGo = js.Any.fromFunction0(isOculusGo), isR7 = js.Any.fromFunction0(isR7), isTablet = js.Any.fromFunction0(isTablet), isWebXRAvailable = isWebXRAvailable)
  
    __obj.asInstanceOf[Anon_CheckHasPositionalTracking]
  }
}

