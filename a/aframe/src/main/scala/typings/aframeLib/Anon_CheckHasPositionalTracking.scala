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
    PolyfillControls: js.Function1[threeLib.threeMod.Object3D, scala.Unit],
    checkHasPositionalTracking: js.Function0[scala.Boolean],
    checkHeadsetConnected: js.Function0[scala.Boolean],
    getVRDisplay: js.Function0[js.Array[stdLib.VRDisplay]],
    isBrowserEnvironment: js.Function0[scala.Boolean],
    isGearVR: js.Function0[scala.Boolean],
    isIOS: js.Function0[scala.Boolean],
    isLandscape: js.Function0[scala.Boolean],
    isMobile: js.Function0[scala.Boolean],
    isNodeEnvironment: js.Function0[scala.Boolean],
    isOculusGo: js.Function0[scala.Boolean],
    isR7: js.Function0[scala.Boolean],
    isTablet: js.Function0[scala.Boolean],
    isWebXRAvailable: scala.Boolean
  ): Anon_CheckHasPositionalTracking = {
    val __obj = js.Dynamic.literal(PolyfillControls = PolyfillControls, checkHasPositionalTracking = checkHasPositionalTracking, checkHeadsetConnected = checkHeadsetConnected, getVRDisplay = getVRDisplay, isBrowserEnvironment = isBrowserEnvironment, isGearVR = isGearVR, isIOS = isIOS, isLandscape = isLandscape, isMobile = isMobile, isNodeEnvironment = isNodeEnvironment, isOculusGo = isOculusGo, isR7 = isR7, isTablet = isTablet, isWebXRAvailable = isWebXRAvailable)
  
    __obj.asInstanceOf[Anon_CheckHasPositionalTracking]
  }
}

