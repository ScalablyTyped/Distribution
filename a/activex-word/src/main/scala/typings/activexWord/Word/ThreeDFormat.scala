package typings.activexWord.Word

import typings.activexOffice.Office.MsoBevelType
import typings.activexOffice.Office.MsoExtrusionColorType
import typings.activexOffice.Office.MsoLightRigType
import typings.activexOffice.Office.MsoPresetCamera
import typings.activexOffice.Office.MsoPresetExtrusionDirection
import typings.activexOffice.Office.MsoPresetLightingDirection
import typings.activexOffice.Office.MsoPresetLightingSoftness
import typings.activexOffice.Office.MsoPresetMaterial
import typings.activexOffice.Office.MsoPresetThreeDFormat
import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.ThreeDFormat")
@js.native
class ThreeDFormat protected () extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  var BevelBottomDepth: Double = js.native
  var BevelBottomInset: Double = js.native
  var BevelBottomType: MsoBevelType = js.native
  var BevelTopDepth: Double = js.native
  var BevelTopInset: Double = js.native
  var BevelTopType: MsoBevelType = js.native
  val ContourColor: ColorFormat = js.native
  var ContourWidth: Double = js.native
  val Creator: Double = js.native
  var Depth: Double = js.native
  val ExtrusionColor: ColorFormat = js.native
  var ExtrusionColorType: MsoExtrusionColorType = js.native
  var FieldOfView: Double = js.native
  var LightAngle: Double = js.native
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
  var RotationX: Double = js.native
  var RotationY: Double = js.native
  var RotationZ: Double = js.native
  var Visible: MsoTriState = js.native
  @JSName("Word.ThreeDFormat_typekey")
  var WordDotThreeDFormat_typekey: ThreeDFormat = js.native
  var Z: Double = js.native
  def IncrementRotationHorizontal(Increment: Double): Unit = js.native
  def IncrementRotationVertical(Increment: Double): Unit = js.native
  def IncrementRotationX(Increment: Double): Unit = js.native
  def IncrementRotationY(Increment: Double): Unit = js.native
  def IncrementRotationZ(Increment: Double): Unit = js.native
  def ResetRotation(): Unit = js.native
  def SetExtrusionDirection(PresetExtrusionDirection: MsoPresetExtrusionDirection): Unit = js.native
  def SetPresetCamera(PresetCamera: MsoPresetCamera): Unit = js.native
  def SetThreeDFormat(PresetThreeDFormat: MsoPresetThreeDFormat): Unit = js.native
}

