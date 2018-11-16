package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.ThreeDFormat")
@js.native
class ThreeDFormat protected () extends js.Object {
  val Application: js.Any = js.native
  var BevelBottomDepth: scala.Double = js.native
  var BevelBottomInset: scala.Double = js.native
  var BevelBottomType: MsoBevelType = js.native
  var BevelTopDepth: scala.Double = js.native
  var BevelTopInset: scala.Double = js.native
  var BevelTopType: MsoBevelType = js.native
  val ContourColor: ColorFormat = js.native
  var ContourWidth: scala.Double = js.native
  val Creator: scala.Double = js.native
  var Depth: scala.Double = js.native
  val ExtrusionColor: ColorFormat = js.native
  var ExtrusionColorType: MsoExtrusionColorType = js.native
  var FieldOfView: scala.Double = js.native
  var LightAngle: scala.Double = js.native
  var `Office.ThreeDFormat_typekey`: ThreeDFormat = js.native
  val Parent: js.Any = js.native
  var Perspective: MsoTriState = js.native
  val PresetCamera: MsoPresetCamera = js.native
  val PresetExtrusionDirection: MsoPresetExtrusionDirection = js.native
  var PresetLighting: MsoLightRigType = js.native
  var PresetLightingDirection: MsoPresetLightingDirection = js.native
  var PresetLightingSoftness: MsoPresetLightingSoftness = js.native
  var PresetMaterial: MsoPresetMaterial = js.native
  val PresetThreeDFormat: MsoPresetThreeDFormat = js.native
  var ProjectText: MsoTriState = js.native
  var RotationX: scala.Double = js.native
  var RotationY: scala.Double = js.native
  var RotationZ: scala.Double = js.native
  var Visible: MsoTriState = js.native
  var Z: scala.Double = js.native
  def IncrementRotationHorizontal(Increment: scala.Double): scala.Unit = js.native
  def IncrementRotationVertical(Increment: scala.Double): scala.Unit = js.native
  def IncrementRotationX(Increment: scala.Double): scala.Unit = js.native
  def IncrementRotationY(Increment: scala.Double): scala.Unit = js.native
  def IncrementRotationZ(Increment: scala.Double): scala.Unit = js.native
  def ResetRotation(): scala.Unit = js.native
  def SetExtrusionDirection(PresetExtrusionDirection: MsoPresetExtrusionDirection): scala.Unit = js.native
  def SetPresetCamera(PresetCamera: MsoPresetCamera): scala.Unit = js.native
  def SetThreeDFormat(PresetThreeDFormat: MsoPresetThreeDFormat): scala.Unit = js.native
}

