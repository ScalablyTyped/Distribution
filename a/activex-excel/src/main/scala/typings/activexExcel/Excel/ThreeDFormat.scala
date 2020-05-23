package typings.activexExcel.Excel

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

trait ThreeDFormat extends js.Object {
  val Application: js.Any
  var BevelBottomDepth: Double
  var BevelBottomInset: Double
  var BevelBottomType: MsoBevelType
  var BevelTopDepth: Double
  var BevelTopInset: Double
  var BevelTopType: MsoBevelType
  val ContourColor: ColorFormat
  var ContourWidth: Double
  val Creator: Double
  var Depth: Double
  @JSName("Excel.ThreeDFormat_typekey")
  var ExcelDotThreeDFormat_typekey: ThreeDFormat
  val ExtrusionColor: ColorFormat
  var ExtrusionColorType: MsoExtrusionColorType
  var FieldOfView: Double
  var LightAngle: Double
  val Parent: js.Any
  var Perspective: MsoTriState
  val PresetCamera: MsoPresetCamera
  val PresetExtrusionDirection: MsoPresetExtrusionDirection
  var PresetLighting: MsoLightRigType
  var PresetLightingDirection: MsoPresetLightingDirection
  var PresetLightingSoftness: MsoPresetLightingSoftness
  var PresetMaterial: MsoPresetMaterial
  val PresetThreeDFormat: MsoPresetThreeDFormat
  var ProjectText: MsoTriState
  var RotationX: Double
  var RotationY: Double
  var RotationZ: Double
  var Visible: MsoTriState
  var Z: Double
  def IncrementRotationHorizontal(Increment: Double): Unit
  def IncrementRotationVertical(Increment: Double): Unit
  def IncrementRotationX(Increment: Double): Unit
  def IncrementRotationY(Increment: Double): Unit
  def IncrementRotationZ(Increment: Double): Unit
  def ResetRotation(): Unit
  def SetExtrusionDirection(PresetExtrusionDirection: MsoPresetExtrusionDirection): Unit
  def SetPresetCamera(PresetCamera: MsoPresetCamera): Unit
  def SetThreeDFormat(PresetThreeDFormat: MsoPresetThreeDFormat): Unit
}

object ThreeDFormat {
  @scala.inline
  def apply(
    Application: js.Any,
    BevelBottomDepth: Double,
    BevelBottomInset: Double,
    BevelBottomType: MsoBevelType,
    BevelTopDepth: Double,
    BevelTopInset: Double,
    BevelTopType: MsoBevelType,
    ContourColor: ColorFormat,
    ContourWidth: Double,
    Creator: Double,
    Depth: Double,
    ExcelDotThreeDFormat_typekey: ThreeDFormat,
    ExtrusionColor: ColorFormat,
    ExtrusionColorType: MsoExtrusionColorType,
    FieldOfView: Double,
    IncrementRotationHorizontal: Double => Unit,
    IncrementRotationVertical: Double => Unit,
    IncrementRotationX: Double => Unit,
    IncrementRotationY: Double => Unit,
    IncrementRotationZ: Double => Unit,
    LightAngle: Double,
    Parent: js.Any,
    Perspective: MsoTriState,
    PresetCamera: MsoPresetCamera,
    PresetExtrusionDirection: MsoPresetExtrusionDirection,
    PresetLighting: MsoLightRigType,
    PresetLightingDirection: MsoPresetLightingDirection,
    PresetLightingSoftness: MsoPresetLightingSoftness,
    PresetMaterial: MsoPresetMaterial,
    PresetThreeDFormat: MsoPresetThreeDFormat,
    ProjectText: MsoTriState,
    ResetRotation: () => Unit,
    RotationX: Double,
    RotationY: Double,
    RotationZ: Double,
    SetExtrusionDirection: MsoPresetExtrusionDirection => Unit,
    SetPresetCamera: MsoPresetCamera => Unit,
    SetThreeDFormat: MsoPresetThreeDFormat => Unit,
    Visible: MsoTriState,
    Z: Double
  ): ThreeDFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], BevelBottomDepth = BevelBottomDepth.asInstanceOf[js.Any], BevelBottomInset = BevelBottomInset.asInstanceOf[js.Any], BevelBottomType = BevelBottomType.asInstanceOf[js.Any], BevelTopDepth = BevelTopDepth.asInstanceOf[js.Any], BevelTopInset = BevelTopInset.asInstanceOf[js.Any], BevelTopType = BevelTopType.asInstanceOf[js.Any], ContourColor = ContourColor.asInstanceOf[js.Any], ContourWidth = ContourWidth.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Depth = Depth.asInstanceOf[js.Any], ExtrusionColor = ExtrusionColor.asInstanceOf[js.Any], ExtrusionColorType = ExtrusionColorType.asInstanceOf[js.Any], FieldOfView = FieldOfView.asInstanceOf[js.Any], IncrementRotationHorizontal = js.Any.fromFunction1(IncrementRotationHorizontal), IncrementRotationVertical = js.Any.fromFunction1(IncrementRotationVertical), IncrementRotationX = js.Any.fromFunction1(IncrementRotationX), IncrementRotationY = js.Any.fromFunction1(IncrementRotationY), IncrementRotationZ = js.Any.fromFunction1(IncrementRotationZ), LightAngle = LightAngle.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Perspective = Perspective.asInstanceOf[js.Any], PresetCamera = PresetCamera.asInstanceOf[js.Any], PresetExtrusionDirection = PresetExtrusionDirection.asInstanceOf[js.Any], PresetLighting = PresetLighting.asInstanceOf[js.Any], PresetLightingDirection = PresetLightingDirection.asInstanceOf[js.Any], PresetLightingSoftness = PresetLightingSoftness.asInstanceOf[js.Any], PresetMaterial = PresetMaterial.asInstanceOf[js.Any], PresetThreeDFormat = PresetThreeDFormat.asInstanceOf[js.Any], ProjectText = ProjectText.asInstanceOf[js.Any], ResetRotation = js.Any.fromFunction0(ResetRotation), RotationX = RotationX.asInstanceOf[js.Any], RotationY = RotationY.asInstanceOf[js.Any], RotationZ = RotationZ.asInstanceOf[js.Any], SetExtrusionDirection = js.Any.fromFunction1(SetExtrusionDirection), SetPresetCamera = js.Any.fromFunction1(SetPresetCamera), SetThreeDFormat = js.Any.fromFunction1(SetThreeDFormat), Visible = Visible.asInstanceOf[js.Any], Z = Z.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.ThreeDFormat_typekey")(ExcelDotThreeDFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreeDFormat]
  }
}

