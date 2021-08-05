package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThreeDFormat extends StObject {
  
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
  
  val ExtrusionColor: ColorFormat
  
  var ExtrusionColorType: MsoExtrusionColorType
  
  var FieldOfView: Double
  
  def IncrementRotationHorizontal(Increment: Double): Unit
  
  def IncrementRotationVertical(Increment: Double): Unit
  
  def IncrementRotationX(Increment: Double): Unit
  
  def IncrementRotationY(Increment: Double): Unit
  
  def IncrementRotationZ(Increment: Double): Unit
  
  var LightAngle: Double
  
  /* private */ @JSName("Office.ThreeDFormat_typekey")
  var OfficeDotThreeDFormat_typekey: ThreeDFormat
  
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
  
  def ResetRotation(): Unit
  
  var RotationX: Double
  
  var RotationY: Double
  
  var RotationZ: Double
  
  def SetExtrusionDirection(PresetExtrusionDirection: MsoPresetExtrusionDirection): Unit
  
  def SetPresetCamera(PresetCamera: MsoPresetCamera): Unit
  
  def SetThreeDFormat(PresetThreeDFormat: MsoPresetThreeDFormat): Unit
  
  var Visible: MsoTriState
  
  var Z: Double
}
object ThreeDFormat {
  
  inline def apply(
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
    OfficeDotThreeDFormat_typekey: ThreeDFormat,
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
    __obj.updateDynamic("Office.ThreeDFormat_typekey")(OfficeDotThreeDFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreeDFormat]
  }
  
  extension [Self <: ThreeDFormat](x: Self) {
    
    inline def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBevelBottomDepth(value: Double): Self = StObject.set(x, "BevelBottomDepth", value.asInstanceOf[js.Any])
    
    inline def setBevelBottomInset(value: Double): Self = StObject.set(x, "BevelBottomInset", value.asInstanceOf[js.Any])
    
    inline def setBevelBottomType(value: MsoBevelType): Self = StObject.set(x, "BevelBottomType", value.asInstanceOf[js.Any])
    
    inline def setBevelTopDepth(value: Double): Self = StObject.set(x, "BevelTopDepth", value.asInstanceOf[js.Any])
    
    inline def setBevelTopInset(value: Double): Self = StObject.set(x, "BevelTopInset", value.asInstanceOf[js.Any])
    
    inline def setBevelTopType(value: MsoBevelType): Self = StObject.set(x, "BevelTopType", value.asInstanceOf[js.Any])
    
    inline def setContourColor(value: ColorFormat): Self = StObject.set(x, "ContourColor", value.asInstanceOf[js.Any])
    
    inline def setContourWidth(value: Double): Self = StObject.set(x, "ContourWidth", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDepth(value: Double): Self = StObject.set(x, "Depth", value.asInstanceOf[js.Any])
    
    inline def setExtrusionColor(value: ColorFormat): Self = StObject.set(x, "ExtrusionColor", value.asInstanceOf[js.Any])
    
    inline def setExtrusionColorType(value: MsoExtrusionColorType): Self = StObject.set(x, "ExtrusionColorType", value.asInstanceOf[js.Any])
    
    inline def setFieldOfView(value: Double): Self = StObject.set(x, "FieldOfView", value.asInstanceOf[js.Any])
    
    inline def setIncrementRotationHorizontal(value: Double => Unit): Self = StObject.set(x, "IncrementRotationHorizontal", js.Any.fromFunction1(value))
    
    inline def setIncrementRotationVertical(value: Double => Unit): Self = StObject.set(x, "IncrementRotationVertical", js.Any.fromFunction1(value))
    
    inline def setIncrementRotationX(value: Double => Unit): Self = StObject.set(x, "IncrementRotationX", js.Any.fromFunction1(value))
    
    inline def setIncrementRotationY(value: Double => Unit): Self = StObject.set(x, "IncrementRotationY", js.Any.fromFunction1(value))
    
    inline def setIncrementRotationZ(value: Double => Unit): Self = StObject.set(x, "IncrementRotationZ", js.Any.fromFunction1(value))
    
    inline def setLightAngle(value: Double): Self = StObject.set(x, "LightAngle", value.asInstanceOf[js.Any])
    
    inline def setOfficeDotThreeDFormat_typekey(value: ThreeDFormat): Self = StObject.set(x, "Office.ThreeDFormat_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPerspective(value: MsoTriState): Self = StObject.set(x, "Perspective", value.asInstanceOf[js.Any])
    
    inline def setPresetCamera(value: MsoPresetCamera): Self = StObject.set(x, "PresetCamera", value.asInstanceOf[js.Any])
    
    inline def setPresetExtrusionDirection(value: MsoPresetExtrusionDirection): Self = StObject.set(x, "PresetExtrusionDirection", value.asInstanceOf[js.Any])
    
    inline def setPresetLighting(value: MsoLightRigType): Self = StObject.set(x, "PresetLighting", value.asInstanceOf[js.Any])
    
    inline def setPresetLightingDirection(value: MsoPresetLightingDirection): Self = StObject.set(x, "PresetLightingDirection", value.asInstanceOf[js.Any])
    
    inline def setPresetLightingSoftness(value: MsoPresetLightingSoftness): Self = StObject.set(x, "PresetLightingSoftness", value.asInstanceOf[js.Any])
    
    inline def setPresetMaterial(value: MsoPresetMaterial): Self = StObject.set(x, "PresetMaterial", value.asInstanceOf[js.Any])
    
    inline def setPresetThreeDFormat(value: MsoPresetThreeDFormat): Self = StObject.set(x, "PresetThreeDFormat", value.asInstanceOf[js.Any])
    
    inline def setProjectText(value: MsoTriState): Self = StObject.set(x, "ProjectText", value.asInstanceOf[js.Any])
    
    inline def setResetRotation(value: () => Unit): Self = StObject.set(x, "ResetRotation", js.Any.fromFunction0(value))
    
    inline def setRotationX(value: Double): Self = StObject.set(x, "RotationX", value.asInstanceOf[js.Any])
    
    inline def setRotationY(value: Double): Self = StObject.set(x, "RotationY", value.asInstanceOf[js.Any])
    
    inline def setRotationZ(value: Double): Self = StObject.set(x, "RotationZ", value.asInstanceOf[js.Any])
    
    inline def setSetExtrusionDirection(value: MsoPresetExtrusionDirection => Unit): Self = StObject.set(x, "SetExtrusionDirection", js.Any.fromFunction1(value))
    
    inline def setSetPresetCamera(value: MsoPresetCamera => Unit): Self = StObject.set(x, "SetPresetCamera", js.Any.fromFunction1(value))
    
    inline def setSetThreeDFormat(value: MsoPresetThreeDFormat => Unit): Self = StObject.set(x, "SetThreeDFormat", js.Any.fromFunction1(value))
    
    inline def setVisible(value: MsoTriState): Self = StObject.set(x, "Visible", value.asInstanceOf[js.Any])
    
    inline def setZ(value: Double): Self = StObject.set(x, "Z", value.asInstanceOf[js.Any])
  }
}
