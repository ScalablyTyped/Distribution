package typings.activexWord.Word

import typings.activexOffice.Office.MsoTriState
import typings.activexOffice.Office.Script
import typings.activexOffice.Office.SmartArt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InlineShape extends StObject {
  
  def Activate(): Unit = js.native
  
  var AlternativeText: String = js.native
  
  val AnchorID: Double = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  var Borders: typings.activexWord.Word.Borders = js.native
  
  val Chart: typings.activexWord.Word.Chart = js.native
  
  def ConvertToShape(): Shape = js.native
  
  val Creator: Double = js.native
  
  def Delete(): Unit = js.native
  
  val EditID: Double = js.native
  
  val Field: typings.activexWord.Word.Field = js.native
  
  val Fill: FillFormat = js.native
  
  val Glow: GlowFormat = js.native
  
  val GroupItems: GroupShapes = js.native
  
  val HasChart: MsoTriState = js.native
  
  val HasSmartArt: MsoTriState = js.native
  
  var Height: Double = js.native
  
  val HorizontalLineFormat: typings.activexWord.Word.HorizontalLineFormat = js.native
  
  val Hyperlink: typings.activexWord.Word.Hyperlink = js.native
  
  val IsPictureBullet: Boolean = js.native
  
  val Line: LineFormat = js.native
  
  val LinkFormat: typings.activexWord.Word.LinkFormat = js.native
  
  var LockAspectRatio: MsoTriState = js.native
  
  val OLEFormat: typings.activexWord.Word.OLEFormat = js.native
  
  val OWSAnchor: Double = js.native
  
  val Parent: js.Any = js.native
  
  var PictureFormat: typings.activexWord.Word.PictureFormat = js.native
  
  val Range: typings.activexWord.Word.Range = js.native
  
  val Reflection: ReflectionFormat = js.native
  
  def Reset(): Unit = js.native
  
  var ScaleHeight: Double = js.native
  
  var ScaleWidth: Double = js.native
  
  val Script: typings.activexOffice.Office.Script = js.native
  
  def Select(): Unit = js.native
  
  val Shadow: ShadowFormat = js.native
  
  val SmartArt: typings.activexOffice.Office.SmartArt = js.native
  
  val SoftEdge: SoftEdgeFormat = js.native
  
  var TextEffect: TextEffectFormat = js.native
  
  var Title: String = js.native
  
  val Type: WdInlineShapeType = js.native
  
  var Width: Double = js.native
  
  @JSName("Word.InlineShape_typekey")
  var WordDotInlineShape_typekey: InlineShape = js.native
}
object InlineShape {
  
  @scala.inline
  def apply(
    Activate: () => Unit,
    AlternativeText: String,
    AnchorID: Double,
    Application: Application,
    Borders: Borders,
    Chart: Chart,
    ConvertToShape: () => Shape,
    Creator: Double,
    Delete: () => Unit,
    EditID: Double,
    Field: Field,
    Fill: FillFormat,
    Glow: GlowFormat,
    GroupItems: GroupShapes,
    HasChart: MsoTriState,
    HasSmartArt: MsoTriState,
    Height: Double,
    HorizontalLineFormat: HorizontalLineFormat,
    Hyperlink: Hyperlink,
    IsPictureBullet: Boolean,
    Line: LineFormat,
    LinkFormat: LinkFormat,
    LockAspectRatio: MsoTriState,
    OLEFormat: OLEFormat,
    OWSAnchor: Double,
    Parent: js.Any,
    PictureFormat: PictureFormat,
    Range: Range,
    Reflection: ReflectionFormat,
    Reset: () => Unit,
    ScaleHeight: Double,
    ScaleWidth: Double,
    Script: Script,
    Select: () => Unit,
    Shadow: ShadowFormat,
    SmartArt: SmartArt,
    SoftEdge: SoftEdgeFormat,
    TextEffect: TextEffectFormat,
    Title: String,
    Type: WdInlineShapeType,
    Width: Double,
    WordDotInlineShape_typekey: InlineShape
  ): InlineShape = {
    val __obj = js.Dynamic.literal(Activate = js.Any.fromFunction0(Activate), AlternativeText = AlternativeText.asInstanceOf[js.Any], AnchorID = AnchorID.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Borders = Borders.asInstanceOf[js.Any], Chart = Chart.asInstanceOf[js.Any], ConvertToShape = js.Any.fromFunction0(ConvertToShape), Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), EditID = EditID.asInstanceOf[js.Any], Field = Field.asInstanceOf[js.Any], Fill = Fill.asInstanceOf[js.Any], Glow = Glow.asInstanceOf[js.Any], GroupItems = GroupItems.asInstanceOf[js.Any], HasChart = HasChart.asInstanceOf[js.Any], HasSmartArt = HasSmartArt.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], HorizontalLineFormat = HorizontalLineFormat.asInstanceOf[js.Any], Hyperlink = Hyperlink.asInstanceOf[js.Any], IsPictureBullet = IsPictureBullet.asInstanceOf[js.Any], Line = Line.asInstanceOf[js.Any], LinkFormat = LinkFormat.asInstanceOf[js.Any], LockAspectRatio = LockAspectRatio.asInstanceOf[js.Any], OLEFormat = OLEFormat.asInstanceOf[js.Any], OWSAnchor = OWSAnchor.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PictureFormat = PictureFormat.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], Reflection = Reflection.asInstanceOf[js.Any], Reset = js.Any.fromFunction0(Reset), ScaleHeight = ScaleHeight.asInstanceOf[js.Any], ScaleWidth = ScaleWidth.asInstanceOf[js.Any], Script = Script.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select), Shadow = Shadow.asInstanceOf[js.Any], SmartArt = SmartArt.asInstanceOf[js.Any], SoftEdge = SoftEdge.asInstanceOf[js.Any], TextEffect = TextEffect.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.InlineShape_typekey")(WordDotInlineShape_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineShape]
  }
  
  @scala.inline
  implicit class InlineShapeMutableBuilder[Self <: InlineShape] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivate(value: () => Unit): Self = StObject.set(x, "Activate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAlternativeText(value: String): Self = StObject.set(x, "AlternativeText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorID(value: Double): Self = StObject.set(x, "AnchorID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorders(value: Borders): Self = StObject.set(x, "Borders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChart(value: Chart): Self = StObject.set(x, "Chart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConvertToShape(value: () => Shape): Self = StObject.set(x, "ConvertToShape", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEditID(value: Double): Self = StObject.set(x, "EditID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setField(value: Field): Self = StObject.set(x, "Field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFill(value: FillFormat): Self = StObject.set(x, "Fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlow(value: GlowFormat): Self = StObject.set(x, "Glow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupItems(value: GroupShapes): Self = StObject.set(x, "GroupItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasChart(value: MsoTriState): Self = StObject.set(x, "HasChart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasSmartArt(value: MsoTriState): Self = StObject.set(x, "HasSmartArt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalLineFormat(value: HorizontalLineFormat): Self = StObject.set(x, "HorizontalLineFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHyperlink(value: Hyperlink): Self = StObject.set(x, "Hyperlink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPictureBullet(value: Boolean): Self = StObject.set(x, "IsPictureBullet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine(value: LineFormat): Self = StObject.set(x, "Line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkFormat(value: LinkFormat): Self = StObject.set(x, "LinkFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockAspectRatio(value: MsoTriState): Self = StObject.set(x, "LockAspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOLEFormat(value: OLEFormat): Self = StObject.set(x, "OLEFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOWSAnchor(value: Double): Self = StObject.set(x, "OWSAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPictureFormat(value: PictureFormat): Self = StObject.set(x, "PictureFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: Range): Self = StObject.set(x, "Range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReflection(value: ReflectionFormat): Self = StObject.set(x, "Reflection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReset(value: () => Unit): Self = StObject.set(x, "Reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setScaleHeight(value: Double): Self = StObject.set(x, "ScaleHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleWidth(value: Double): Self = StObject.set(x, "ScaleWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScript(value: Script): Self = StObject.set(x, "Script", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelect(value: () => Unit): Self = StObject.set(x, "Select", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShadow(value: ShadowFormat): Self = StObject.set(x, "Shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmartArt(value: SmartArt): Self = StObject.set(x, "SmartArt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoftEdge(value: SoftEdgeFormat): Self = StObject.set(x, "SoftEdge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextEffect(value: TextEffectFormat): Self = StObject.set(x, "TextEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: WdInlineShapeType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotInlineShape_typekey(value: InlineShape): Self = StObject.set(x, "Word.InlineShape_typekey", value.asInstanceOf[js.Any])
  }
}
