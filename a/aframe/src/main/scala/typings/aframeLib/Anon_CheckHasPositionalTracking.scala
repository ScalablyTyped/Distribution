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

