package typings.activexAccess.Access

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Section extends StObject {
  
  /* private */ @JSName("Access.Section_typekey")
  var AccessDotSection_typekey: Section
  
  var AlternateBackColor: Double
  
  var AlternateBackShade: Double
  
  var AlternateBackThemeColorIndex: Double
  
  var AlternateBackTint: Double
  
  val Application: typings.activexAccess.Access.Application
  
  var AutoHeight: Boolean
  
  var BackColor: Double
  
  var BackShade: Double
  
  var BackThemeColorIndex: Double
  
  var BackTint: Double
  
  var CanGrow: Boolean
  
  var CanShrink: Boolean
  
  def Controls[T](Index: String): T
  // tslint:disable-next-line:no-unnecessary-generics
  def Controls[T](Index: Double): T
  @JSName("Controls")
  val Controls_Original: Children
  
  var DisplayWhen: Double
  
  var EventProcPrefix: String
  
  var ForceNewPage: Double
  
  var HasContinued: Boolean
  
  var Height: Double
  
  var InSelection: Boolean
  
  def IsMemberSafe(dispid: Double): Boolean
  
  var KeepTogether: Boolean
  
  var Name: String
  
  var NewRowOrCol: Double
  
  var OnClick: String
  
  var OnClickMacro: String
  
  var OnDblClick: String
  
  var OnDblClickMacro: String
  
  var OnFormat: String
  
  var OnFormatMacro: String
  
  var OnMouseDown: String
  
  var OnMouseDownMacro: String
  
  var OnMouseMove: String
  
  var OnMouseMoveMacro: String
  
  var OnMouseUp: String
  
  var OnMouseUpMacro: String
  
  var OnPaint: String
  
  var OnPaintMacro: String
  
  var OnPrint: String
  
  var OnPrintMacro: String
  
  var OnRetreat: String
  
  var OnRetreatMacro: String
  
  val Parent: Any
  
  def Properties(Index: String): AccessProperty
  def Properties(Index: Double): AccessProperty
  @JSName("Properties")
  val Properties_Original: Properties
  
  var RepeatSection: Boolean
  
  def SetTabOrder(): Unit
  
  var SpecialEffect: Double
  
  var Tag: String
  
  var Visible: Boolean
  
  var WillContinue: Boolean
  
  var _Name: String
}
object Section {
  
  inline def apply(
    AccessDotSection_typekey: Section,
    AlternateBackColor: Double,
    AlternateBackShade: Double,
    AlternateBackThemeColorIndex: Double,
    AlternateBackTint: Double,
    Application: Application,
    AutoHeight: Boolean,
    BackColor: Double,
    BackShade: Double,
    BackThemeColorIndex: Double,
    BackTint: Double,
    CanGrow: Boolean,
    CanShrink: Boolean,
    Controls: Children,
    DisplayWhen: Double,
    EventProcPrefix: String,
    ForceNewPage: Double,
    HasContinued: Boolean,
    Height: Double,
    InSelection: Boolean,
    IsMemberSafe: Double => Boolean,
    KeepTogether: Boolean,
    Name: String,
    NewRowOrCol: Double,
    OnClick: String,
    OnClickMacro: String,
    OnDblClick: String,
    OnDblClickMacro: String,
    OnFormat: String,
    OnFormatMacro: String,
    OnMouseDown: String,
    OnMouseDownMacro: String,
    OnMouseMove: String,
    OnMouseMoveMacro: String,
    OnMouseUp: String,
    OnMouseUpMacro: String,
    OnPaint: String,
    OnPaintMacro: String,
    OnPrint: String,
    OnPrintMacro: String,
    OnRetreat: String,
    OnRetreatMacro: String,
    Parent: Any,
    Properties: Properties,
    RepeatSection: Boolean,
    SetTabOrder: () => Unit,
    SpecialEffect: Double,
    Tag: String,
    Visible: Boolean,
    WillContinue: Boolean,
    _Name: String
  ): Section = {
    val __obj = js.Dynamic.literal(AlternateBackColor = AlternateBackColor.asInstanceOf[js.Any], AlternateBackShade = AlternateBackShade.asInstanceOf[js.Any], AlternateBackThemeColorIndex = AlternateBackThemeColorIndex.asInstanceOf[js.Any], AlternateBackTint = AlternateBackTint.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], AutoHeight = AutoHeight.asInstanceOf[js.Any], BackColor = BackColor.asInstanceOf[js.Any], BackShade = BackShade.asInstanceOf[js.Any], BackThemeColorIndex = BackThemeColorIndex.asInstanceOf[js.Any], BackTint = BackTint.asInstanceOf[js.Any], CanGrow = CanGrow.asInstanceOf[js.Any], CanShrink = CanShrink.asInstanceOf[js.Any], Controls = Controls.asInstanceOf[js.Any], DisplayWhen = DisplayWhen.asInstanceOf[js.Any], EventProcPrefix = EventProcPrefix.asInstanceOf[js.Any], ForceNewPage = ForceNewPage.asInstanceOf[js.Any], HasContinued = HasContinued.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], InSelection = InSelection.asInstanceOf[js.Any], IsMemberSafe = js.Any.fromFunction1(IsMemberSafe), KeepTogether = KeepTogether.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NewRowOrCol = NewRowOrCol.asInstanceOf[js.Any], OnClick = OnClick.asInstanceOf[js.Any], OnClickMacro = OnClickMacro.asInstanceOf[js.Any], OnDblClick = OnDblClick.asInstanceOf[js.Any], OnDblClickMacro = OnDblClickMacro.asInstanceOf[js.Any], OnFormat = OnFormat.asInstanceOf[js.Any], OnFormatMacro = OnFormatMacro.asInstanceOf[js.Any], OnMouseDown = OnMouseDown.asInstanceOf[js.Any], OnMouseDownMacro = OnMouseDownMacro.asInstanceOf[js.Any], OnMouseMove = OnMouseMove.asInstanceOf[js.Any], OnMouseMoveMacro = OnMouseMoveMacro.asInstanceOf[js.Any], OnMouseUp = OnMouseUp.asInstanceOf[js.Any], OnMouseUpMacro = OnMouseUpMacro.asInstanceOf[js.Any], OnPaint = OnPaint.asInstanceOf[js.Any], OnPaintMacro = OnPaintMacro.asInstanceOf[js.Any], OnPrint = OnPrint.asInstanceOf[js.Any], OnPrintMacro = OnPrintMacro.asInstanceOf[js.Any], OnRetreat = OnRetreat.asInstanceOf[js.Any], OnRetreatMacro = OnRetreatMacro.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Properties = Properties.asInstanceOf[js.Any], RepeatSection = RepeatSection.asInstanceOf[js.Any], SetTabOrder = js.Any.fromFunction0(SetTabOrder), SpecialEffect = SpecialEffect.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any], WillContinue = WillContinue.asInstanceOf[js.Any], _Name = _Name.asInstanceOf[js.Any])
    __obj.updateDynamic("Access.Section_typekey")(AccessDotSection_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Section]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Section] (val x: Self) extends AnyVal {
    
    inline def setAccessDotSection_typekey(value: Section): Self = StObject.set(x, "Access.Section_typekey", value.asInstanceOf[js.Any])
    
    inline def setAlternateBackColor(value: Double): Self = StObject.set(x, "AlternateBackColor", value.asInstanceOf[js.Any])
    
    inline def setAlternateBackShade(value: Double): Self = StObject.set(x, "AlternateBackShade", value.asInstanceOf[js.Any])
    
    inline def setAlternateBackThemeColorIndex(value: Double): Self = StObject.set(x, "AlternateBackThemeColorIndex", value.asInstanceOf[js.Any])
    
    inline def setAlternateBackTint(value: Double): Self = StObject.set(x, "AlternateBackTint", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setAutoHeight(value: Boolean): Self = StObject.set(x, "AutoHeight", value.asInstanceOf[js.Any])
    
    inline def setBackColor(value: Double): Self = StObject.set(x, "BackColor", value.asInstanceOf[js.Any])
    
    inline def setBackShade(value: Double): Self = StObject.set(x, "BackShade", value.asInstanceOf[js.Any])
    
    inline def setBackThemeColorIndex(value: Double): Self = StObject.set(x, "BackThemeColorIndex", value.asInstanceOf[js.Any])
    
    inline def setBackTint(value: Double): Self = StObject.set(x, "BackTint", value.asInstanceOf[js.Any])
    
    inline def setCanGrow(value: Boolean): Self = StObject.set(x, "CanGrow", value.asInstanceOf[js.Any])
    
    inline def setCanShrink(value: Boolean): Self = StObject.set(x, "CanShrink", value.asInstanceOf[js.Any])
    
    inline def setControls(value: Children): Self = StObject.set(x, "Controls", value.asInstanceOf[js.Any])
    
    inline def setDisplayWhen(value: Double): Self = StObject.set(x, "DisplayWhen", value.asInstanceOf[js.Any])
    
    inline def setEventProcPrefix(value: String): Self = StObject.set(x, "EventProcPrefix", value.asInstanceOf[js.Any])
    
    inline def setForceNewPage(value: Double): Self = StObject.set(x, "ForceNewPage", value.asInstanceOf[js.Any])
    
    inline def setHasContinued(value: Boolean): Self = StObject.set(x, "HasContinued", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    inline def setInSelection(value: Boolean): Self = StObject.set(x, "InSelection", value.asInstanceOf[js.Any])
    
    inline def setIsMemberSafe(value: Double => Boolean): Self = StObject.set(x, "IsMemberSafe", js.Any.fromFunction1(value))
    
    inline def setKeepTogether(value: Boolean): Self = StObject.set(x, "KeepTogether", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNewRowOrCol(value: Double): Self = StObject.set(x, "NewRowOrCol", value.asInstanceOf[js.Any])
    
    inline def setOnClick(value: String): Self = StObject.set(x, "OnClick", value.asInstanceOf[js.Any])
    
    inline def setOnClickMacro(value: String): Self = StObject.set(x, "OnClickMacro", value.asInstanceOf[js.Any])
    
    inline def setOnDblClick(value: String): Self = StObject.set(x, "OnDblClick", value.asInstanceOf[js.Any])
    
    inline def setOnDblClickMacro(value: String): Self = StObject.set(x, "OnDblClickMacro", value.asInstanceOf[js.Any])
    
    inline def setOnFormat(value: String): Self = StObject.set(x, "OnFormat", value.asInstanceOf[js.Any])
    
    inline def setOnFormatMacro(value: String): Self = StObject.set(x, "OnFormatMacro", value.asInstanceOf[js.Any])
    
    inline def setOnMouseDown(value: String): Self = StObject.set(x, "OnMouseDown", value.asInstanceOf[js.Any])
    
    inline def setOnMouseDownMacro(value: String): Self = StObject.set(x, "OnMouseDownMacro", value.asInstanceOf[js.Any])
    
    inline def setOnMouseMove(value: String): Self = StObject.set(x, "OnMouseMove", value.asInstanceOf[js.Any])
    
    inline def setOnMouseMoveMacro(value: String): Self = StObject.set(x, "OnMouseMoveMacro", value.asInstanceOf[js.Any])
    
    inline def setOnMouseUp(value: String): Self = StObject.set(x, "OnMouseUp", value.asInstanceOf[js.Any])
    
    inline def setOnMouseUpMacro(value: String): Self = StObject.set(x, "OnMouseUpMacro", value.asInstanceOf[js.Any])
    
    inline def setOnPaint(value: String): Self = StObject.set(x, "OnPaint", value.asInstanceOf[js.Any])
    
    inline def setOnPaintMacro(value: String): Self = StObject.set(x, "OnPaintMacro", value.asInstanceOf[js.Any])
    
    inline def setOnPrint(value: String): Self = StObject.set(x, "OnPrint", value.asInstanceOf[js.Any])
    
    inline def setOnPrintMacro(value: String): Self = StObject.set(x, "OnPrintMacro", value.asInstanceOf[js.Any])
    
    inline def setOnRetreat(value: String): Self = StObject.set(x, "OnRetreat", value.asInstanceOf[js.Any])
    
    inline def setOnRetreatMacro(value: String): Self = StObject.set(x, "OnRetreatMacro", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: Properties): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
    
    inline def setRepeatSection(value: Boolean): Self = StObject.set(x, "RepeatSection", value.asInstanceOf[js.Any])
    
    inline def setSetTabOrder(value: () => Unit): Self = StObject.set(x, "SetTabOrder", js.Any.fromFunction0(value))
    
    inline def setSpecialEffect(value: Double): Self = StObject.set(x, "SpecialEffect", value.asInstanceOf[js.Any])
    
    inline def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "Visible", value.asInstanceOf[js.Any])
    
    inline def setWillContinue(value: Boolean): Self = StObject.set(x, "WillContinue", value.asInstanceOf[js.Any])
    
    inline def set_Name(value: String): Self = StObject.set(x, "_Name", value.asInstanceOf[js.Any])
  }
}
