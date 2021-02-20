package typings.activexPowerpoint.PowerPoint

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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThreeDFormat extends StObject {
  
  val Application: js.Any = js.native
  
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
  
  def IncrementRotationHorizontal(Increment: Double): Unit = js.native
  
  def IncrementRotationVertical(Increment: Double): Unit = js.native
  
  def IncrementRotationX(Increment: Double): Unit = js.native
  
  def IncrementRotationY(Increment: Double): Unit = js.native
  
  def IncrementRotationZ(Increment: Double): Unit = js.native
  
  var LightAngle: Double = js.native
  
  val Parent: js.Any = js.native
  
  var Perspective: MsoTriState = js.native
  
  @JSName("PowerPoint.ThreeDFormat_typekey")
  var PowerPointDotThreeDFormat_typekey: ThreeDFormat = js.native
  
  val PresetCamera: MsoPresetCamera = js.native
  
  val PresetExtrusionDirection: MsoPresetExtrusionDirection = js.native
  
  var PresetLighting: MsoLightRigType = js.native
  
  var PresetLightingDirection: MsoPresetLightingDirection = js.native
  
  var PresetLightingSoftness: MsoPresetLightingSoftness = js.native
  
  var PresetMaterial: MsoPresetMaterial = js.native
  
  val PresetThreeDFormat: MsoPresetThreeDFormat = js.native
  
  var ProjectText: MsoTriState = js.native
  
  def ResetRotation(): Unit = js.native
  
  var RotationX: Double = js.native
  
  var RotationY: Double = js.native
  
  var RotationZ: Double = js.native
  
  def SetExtrusionDirection(PresetExtrusionDirection: MsoPresetExtrusionDirection): Unit = js.native
  
  def SetPresetCamera(PresetCamera: MsoPresetCamera): Unit = js.native
  
  def SetThreeDFormat(PresetThreeDFormat: MsoPresetThreeDFormat): Unit = js.native
  
  var Visible: MsoTriState = js.native
  
  var Z: Double = js.native
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
    PowerPointDotThreeDFormat_typekey: ThreeDFormat,
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
    __obj.updateDynamic("PowerPoint.ThreeDFormat_typekey")(PowerPointDotThreeDFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreeDFormat]
  }
  
  @scala.inline
  implicit class ThreeDFormatMutableBuilder[Self <: ThreeDFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBevelBottomDepth(value: Double): Self = StObject.set(x, "BevelBottomDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBevelBottomInset(value: Double): Self = StObject.set(x, "BevelBottomInset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBevelBottomType(value: MsoBevelType): Self = StObject.set(x, "BevelBottomType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBevelTopDepth(value: Double): Self = StObject.set(x, "BevelTopDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBevelTopInset(value: Double): Self = StObject.set(x, "BevelTopInset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBevelTopType(value: MsoBevelType): Self = StObject.set(x, "BevelTopType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContourColor(value: ColorFormat): Self = StObject.set(x, "ContourColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContourWidth(value: Double): Self = StObject.set(x, "ContourWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepth(value: Double): Self = StObject.set(x, "Depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtrusionColor(value: ColorFormat): Self = StObject.set(x, "ExtrusionColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtrusionColorType(value: MsoExtrusionColorType): Self = StObject.set(x, "ExtrusionColorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldOfView(value: Double): Self = StObject.set(x, "FieldOfView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncrementRotationHorizontal(value: Double => Unit): Self = StObject.set(x, "IncrementRotationHorizontal", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIncrementRotationVertical(value: Double => Unit): Self = StObject.set(x, "IncrementRotationVertical", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIncrementRotationX(value: Double => Unit): Self = StObject.set(x, "IncrementRotationX", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIncrementRotationY(value: Double => Unit): Self = StObject.set(x, "IncrementRotationY", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIncrementRotationZ(value: Double => Unit): Self = StObject.set(x, "IncrementRotationZ", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLightAngle(value: Double): Self = StObject.set(x, "LightAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerspective(value: MsoTriState): Self = StObject.set(x, "Perspective", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotThreeDFormat_typekey(value: ThreeDFormat): Self = StObject.set(x, "PowerPoint.ThreeDFormat_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresetCamera(value: MsoPresetCamera): Self = StObject.set(x, "PresetCamera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresetExtrusionDirection(value: MsoPresetExtrusionDirection): Self = StObject.set(x, "PresetExtrusionDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresetLighting(value: MsoLightRigType): Self = StObject.set(x, "PresetLighting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresetLightingDirection(value: MsoPresetLightingDirection): Self = StObject.set(x, "PresetLightingDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresetLightingSoftness(value: MsoPresetLightingSoftness): Self = StObject.set(x, "PresetLightingSoftness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresetMaterial(value: MsoPresetMaterial): Self = StObject.set(x, "PresetMaterial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresetThreeDFormat(value: MsoPresetThreeDFormat): Self = StObject.set(x, "PresetThreeDFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectText(value: MsoTriState): Self = StObject.set(x, "ProjectText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResetRotation(value: () => Unit): Self = StObject.set(x, "ResetRotation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRotationX(value: Double): Self = StObject.set(x, "RotationX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationY(value: Double): Self = StObject.set(x, "RotationY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationZ(value: Double): Self = StObject.set(x, "RotationZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetExtrusionDirection(value: MsoPresetExtrusionDirection => Unit): Self = StObject.set(x, "SetExtrusionDirection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPresetCamera(value: MsoPresetCamera => Unit): Self = StObject.set(x, "SetPresetCamera", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetThreeDFormat(value: MsoPresetThreeDFormat => Unit): Self = StObject.set(x, "SetThreeDFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def setVisible(value: MsoTriState): Self = StObject.set(x, "Visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZ(value: Double): Self = StObject.set(x, "Z", value.asInstanceOf[js.Any])
  }
}
