package typings.activexOffice.global.Office

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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Office.ThreeDFormat")
@js.native
/* private */ class ThreeDFormat ()
  extends StObject
     with typings.activexOffice.Office.ThreeDFormat {
  
  /* CompleteClass */
  override val Application: js.Any = js.native
  
  /* CompleteClass */
  var BevelBottomDepth: Double = js.native
  
  /* CompleteClass */
  var BevelBottomInset: Double = js.native
  
  /* CompleteClass */
  var BevelBottomType: MsoBevelType = js.native
  
  /* CompleteClass */
  var BevelTopDepth: Double = js.native
  
  /* CompleteClass */
  var BevelTopInset: Double = js.native
  
  /* CompleteClass */
  var BevelTopType: MsoBevelType = js.native
  
  /* CompleteClass */
  override val ContourColor: typings.activexOffice.Office.ColorFormat = js.native
  
  /* CompleteClass */
  var ContourWidth: Double = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  var Depth: Double = js.native
  
  /* CompleteClass */
  override val ExtrusionColor: typings.activexOffice.Office.ColorFormat = js.native
  
  /* CompleteClass */
  var ExtrusionColorType: MsoExtrusionColorType = js.native
  
  /* CompleteClass */
  var FieldOfView: Double = js.native
  
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
  var LightAngle: Double = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Office.ThreeDFormat_typekey")
  var OfficeDotThreeDFormat_typekey: typings.activexOffice.Office.ThreeDFormat = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  var Perspective: MsoTriState = js.native
  
  /* CompleteClass */
  override val PresetCamera: MsoPresetCamera = js.native
  
  /* CompleteClass */
  override val PresetExtrusionDirection: MsoPresetExtrusionDirection = js.native
  
  /* CompleteClass */
  var PresetLighting: MsoLightRigType = js.native
  
  /* CompleteClass */
  var PresetLightingDirection: MsoPresetLightingDirection = js.native
  
  /* CompleteClass */
  var PresetLightingSoftness: MsoPresetLightingSoftness = js.native
  
  /* CompleteClass */
  var PresetMaterial: MsoPresetMaterial = js.native
  
  /* CompleteClass */
  override val PresetThreeDFormat: MsoPresetThreeDFormat = js.native
  
  /* CompleteClass */
  var ProjectText: MsoTriState = js.native
  
  /* CompleteClass */
  override def ResetRotation(): Unit = js.native
  
  /* CompleteClass */
  var RotationX: Double = js.native
  
  /* CompleteClass */
  var RotationY: Double = js.native
  
  /* CompleteClass */
  var RotationZ: Double = js.native
  
  /* CompleteClass */
  override def SetExtrusionDirection(PresetExtrusionDirection: MsoPresetExtrusionDirection): Unit = js.native
  
  /* CompleteClass */
  override def SetPresetCamera(PresetCamera: MsoPresetCamera): Unit = js.native
  
  /* CompleteClass */
  override def SetThreeDFormat(PresetThreeDFormat: MsoPresetThreeDFormat): Unit = js.native
  
  /* CompleteClass */
  var Visible: MsoTriState = js.native
  
  /* CompleteClass */
  var Z: Double = js.native
}
