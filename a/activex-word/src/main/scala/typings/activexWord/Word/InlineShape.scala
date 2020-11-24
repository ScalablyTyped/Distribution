package typings.activexWord.Word

import typings.activexOffice.Office.MsoTriState
import typings.activexOffice.Office.Script
import typings.activexOffice.Office.SmartArt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InlineShape extends js.Object {
  
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
  implicit class InlineShapeOps[Self <: InlineShape] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActivate(value: () => Unit): Self = this.set("Activate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAlternativeText(value: String): Self = this.set("AlternativeText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorID(value: Double): Self = this.set("AnchorID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorders(value: Borders): Self = this.set("Borders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChart(value: Chart): Self = this.set("Chart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConvertToShape(value: () => Shape): Self = this.set("ConvertToShape", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = this.set("Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEditID(value: Double): Self = this.set("EditID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setField(value: Field): Self = this.set("Field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFill(value: FillFormat): Self = this.set("Fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlow(value: GlowFormat): Self = this.set("Glow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupItems(value: GroupShapes): Self = this.set("GroupItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasChart(value: MsoTriState): Self = this.set("HasChart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasSmartArt(value: MsoTriState): Self = this.set("HasSmartArt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("Height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalLineFormat(value: HorizontalLineFormat): Self = this.set("HorizontalLineFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHyperlink(value: Hyperlink): Self = this.set("Hyperlink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPictureBullet(value: Boolean): Self = this.set("IsPictureBullet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine(value: LineFormat): Self = this.set("Line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkFormat(value: LinkFormat): Self = this.set("LinkFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockAspectRatio(value: MsoTriState): Self = this.set("LockAspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOLEFormat(value: OLEFormat): Self = this.set("OLEFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOWSAnchor(value: Double): Self = this.set("OWSAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPictureFormat(value: PictureFormat): Self = this.set("PictureFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: Range): Self = this.set("Range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReflection(value: ReflectionFormat): Self = this.set("Reflection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("Reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setScaleHeight(value: Double): Self = this.set("ScaleHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleWidth(value: Double): Self = this.set("ScaleWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScript(value: Script): Self = this.set("Script", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelect(value: () => Unit): Self = this.set("Select", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShadow(value: ShadowFormat): Self = this.set("Shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmartArt(value: SmartArt): Self = this.set("SmartArt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoftEdge(value: SoftEdgeFormat): Self = this.set("SoftEdge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextEffect(value: TextEffectFormat): Self = this.set("TextEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("Title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: WdInlineShapeType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("Width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotInlineShape_typekey(value: InlineShape): Self = this.set("Word.InlineShape_typekey", value.asInstanceOf[js.Any])
  }
}
