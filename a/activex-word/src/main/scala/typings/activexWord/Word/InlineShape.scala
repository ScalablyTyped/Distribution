package typings.activexWord.Word

import typings.activexOffice.Office.MsoTriState
import typings.activexOffice.Office.Script
import typings.activexOffice.Office.SmartArt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineShape extends js.Object {
  var AlternativeText: String
  val AnchorID: Double
  val Application: typings.activexWord.Word.Application
  var Borders: typings.activexWord.Word.Borders
  val Chart: typings.activexWord.Word.Chart
  val Creator: Double
  val EditID: Double
  val Field: typings.activexWord.Word.Field
  val Fill: FillFormat
  val Glow: GlowFormat
  val GroupItems: GroupShapes
  val HasChart: MsoTriState
  val HasSmartArt: MsoTriState
  var Height: Double
  val HorizontalLineFormat: typings.activexWord.Word.HorizontalLineFormat
  val Hyperlink: typings.activexWord.Word.Hyperlink
  val IsPictureBullet: Boolean
  val Line: LineFormat
  val LinkFormat: typings.activexWord.Word.LinkFormat
  var LockAspectRatio: MsoTriState
  val OLEFormat: typings.activexWord.Word.OLEFormat
  val OWSAnchor: Double
  val Parent: js.Any
  var PictureFormat: typings.activexWord.Word.PictureFormat
  val Range: typings.activexWord.Word.Range
  val Reflection: ReflectionFormat
  var ScaleHeight: Double
  var ScaleWidth: Double
  val Script: typings.activexOffice.Office.Script
  val Shadow: ShadowFormat
  val SmartArt: typings.activexOffice.Office.SmartArt
  val SoftEdge: SoftEdgeFormat
  var TextEffect: TextEffectFormat
  var Title: String
  val Type: WdInlineShapeType
  var Width: Double
  @JSName("Word.InlineShape_typekey")
  var WordDotInlineShape_typekey: InlineShape
  def Activate(): Unit
  def ConvertToShape(): Shape
  def Delete(): Unit
  def Reset(): Unit
  def Select(): Unit
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
}

