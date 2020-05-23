package typings.activexWord.global.Word

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
class ThreeDFormat protected ()
  extends typings.activexWord.Word.ThreeDFormat {
  /* CompleteClass */
  override val Application: typings.activexWord.Word.Application = js.native
  /* CompleteClass */
  override var BevelBottomDepth: Double = js.native
  /* CompleteClass */
  override var BevelBottomInset: Double = js.native
  /* CompleteClass */
  override var BevelBottomType: MsoBevelType = js.native
  /* CompleteClass */
  override var BevelTopDepth: Double = js.native
  /* CompleteClass */
  override var BevelTopInset: Double = js.native
  /* CompleteClass */
  override var BevelTopType: MsoBevelType = js.native
  /* CompleteClass */
  override val ContourColor: typings.activexWord.Word.ColorFormat = js.native
  /* CompleteClass */
  override var ContourWidth: Double = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override var Depth: Double = js.native
  /* CompleteClass */
  override val ExtrusionColor: typings.activexWord.Word.ColorFormat = js.native
  /* CompleteClass */
  override var ExtrusionColorType: MsoExtrusionColorType = js.native
  /* CompleteClass */
  override var FieldOfView: Double = js.native
  /* CompleteClass */
  override var LightAngle: Double = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override var Perspective: MsoTriState = js.native
  /* CompleteClass */
  override val PresetCamera: MsoPresetCamera = js.native
  /* CompleteClass */
  override val PresetExtrusionDirection: MsoPresetExtrusionDirection = js.native
  /* CompleteClass */
  override var PresetLighting: MsoLightRigType = js.native
  /* CompleteClass */
  override var PresetLightingDirection: MsoPresetLightingDirection = js.native
  /* CompleteClass */
  override var PresetLightingSoftness: MsoPresetLightingSoftness = js.native
  /* CompleteClass */
  override var PresetMaterial: MsoPresetMaterial = js.native
  /* CompleteClass */
  override val PresetThreeDFormat: MsoPresetThreeDFormat = js.native
  /* CompleteClass */
  override var ProjectText: MsoTriState = js.native
  /* CompleteClass */
  override var RotationX: Double = js.native
  /* CompleteClass */
  override var RotationY: Double = js.native
  /* CompleteClass */
  override var RotationZ: Double = js.native
  /* CompleteClass */
  override var Visible: MsoTriState = js.native
  /* CompleteClass */
  @JSName("Word.ThreeDFormat_typekey")
  override var WordDotThreeDFormat_typekey: typings.activexWord.Word.ThreeDFormat = js.native
  /* CompleteClass */
  override var Z: Double = js.native
  /* CompleteClass */
  override def IncrementRotationHorizontal(Increment: Double): Unit = js.native
  /* CompleteClass */
  override def IncrementRotationVertical(Increment: Double): Unit = js.native
  /* CompleteClass */
  override def IncrementRotationX(Increment: Double): Unit = js.native
  /* CompleteClass */
  override def IncrementRotationY(Increment: Double): Unit = js.native
  /* CompleteClass */
  override def IncrementRotationZ(Increment: Double): Unit = js.native
  /* CompleteClass */
  override def ResetRotation(): Unit = js.native
  /* CompleteClass */
  override def SetExtrusionDirection(PresetExtrusionDirection: MsoPresetExtrusionDirection): Unit = js.native
  /* CompleteClass */
  override def SetPresetCamera(PresetCamera: MsoPresetCamera): Unit = js.native
  /* CompleteClass */
  override def SetThreeDFormat(PresetThreeDFormat: MsoPresetThreeDFormat): Unit = js.native
}

