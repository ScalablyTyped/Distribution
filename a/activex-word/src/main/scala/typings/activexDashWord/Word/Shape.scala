package typings.activexDashWord.Word

import typings.activexDashOffice.Office.IMsoDiagram
import typings.activexDashOffice.Office.MsoAutoShapeType
import typings.activexDashOffice.Office.MsoBackgroundStyleIndex
import typings.activexDashOffice.Office.MsoFlipCmd
import typings.activexDashOffice.Office.MsoScaleFrom
import typings.activexDashOffice.Office.MsoShapeStyleIndex
import typings.activexDashOffice.Office.MsoShapeType
import typings.activexDashOffice.Office.MsoTriState
import typings.activexDashOffice.Office.MsoZOrderCmd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Shape")
@js.native
class Shape protected () extends js.Object {
  val Adjustments: typings.activexDashWord.Word.Adjustments = js.native
  var AlternativeText: String = js.native
  val Anchor: Range = js.native
  val AnchorID: Double = js.native
  val Application: typings.activexDashWord.Word.Application = js.native
  var AutoShapeType: MsoAutoShapeType = js.native
  var BackgroundStyle: MsoBackgroundStyleIndex = js.native
  val Callout: CalloutFormat = js.native
  val CanvasItems: CanvasShapes = js.native
  val Chart: typings.activexDashWord.Word.Chart = js.native
  val Child: MsoTriState = js.native
  val ConnectionSiteCount: Double = js.native
  val Connector: MsoTriState = js.native
  val ConnectorFormat: typings.activexDashWord.Word.ConnectorFormat = js.native
  val Creator: Double = js.native
  val Diagram: IMsoDiagram = js.native
  val DiagramNode: typings.activexDashWord.Word.DiagramNode = js.native
  val EditID: Double = js.native
  val Fill: FillFormat = js.native
  val Glow: GlowFormat = js.native
  val GroupItems: GroupShapes = js.native
  val HasChart: MsoTriState = js.native
  val HasDiagram: MsoTriState = js.native
  val HasDiagramNode: MsoTriState = js.native
  val HasSmartArt: MsoTriState = js.native
  var Height: Double = js.native
  var HeightRelative: Double = js.native
  val HorizontalFlip: MsoTriState = js.native
  val Hyperlink: typings.activexDashWord.Word.Hyperlink = js.native
  val ID: Double = js.native
  var LayoutInCell: Double = js.native
  var Left: Double = js.native
  var LeftRelative: Double = js.native
  val Line: LineFormat = js.native
  val LinkFormat: typings.activexDashWord.Word.LinkFormat = js.native
  var LockAnchor: Double = js.native
  var LockAspectRatio: MsoTriState = js.native
  var Name: String = js.native
  val Nodes: ShapeNodes = js.native
  val OLEFormat: typings.activexDashWord.Word.OLEFormat = js.native
  val Parent: js.Any = js.native
  val ParentGroup: Shape = js.native
  val PictureFormat: typings.activexDashWord.Word.PictureFormat = js.native
  val RTF: String = js.native
  val Reflection: ReflectionFormat = js.native
  var RelativeHorizontalPosition: WdRelativeHorizontalPosition = js.native
  var RelativeHorizontalSize: WdRelativeHorizontalSize = js.native
  var RelativeVerticalPosition: WdRelativeVerticalPosition = js.native
  var RelativeVerticalSize: WdRelativeVerticalSize = js.native
  var Rotation: Double = js.native
  val Script: typings.activexDashOffice.Office.Script = js.native
  val Shadow: ShadowFormat = js.native
  var ShapeStyle: MsoShapeStyleIndex = js.native
  val SmartArt: typings.activexDashOffice.Office.SmartArt = js.native
  val SoftEdge: SoftEdgeFormat = js.native
  val TextEffect: TextEffectFormat = js.native
  val TextFrame: typings.activexDashWord.Word.TextFrame = js.native
  val TextFrame2: typings.activexDashOffice.Office.TextFrame2 = js.native
  val ThreeD: ThreeDFormat = js.native
  var Title: String = js.native
  var Top: Double = js.native
  var TopRelative: Double = js.native
  val Type: MsoShapeType = js.native
  val VerticalFlip: MsoTriState = js.native
  val Vertices: js.Any = js.native
  var Visible: MsoTriState = js.native
  var Width: Double = js.native
  var WidthRelative: Double = js.native
  var `Word.Shape_typekey`: Shape = js.native
  val WrapFormat: typings.activexDashWord.Word.WrapFormat = js.native
  val ZOrderPosition: Double = js.native
  def Activate(): Unit = js.native
  def Apply(): Unit = js.native
  def CanvasCropBottom(Increment: Double): Unit = js.native
  def CanvasCropLeft(Increment: Double): Unit = js.native
  def CanvasCropRight(Increment: Double): Unit = js.native
  def CanvasCropTop(Increment: Double): Unit = js.native
  def ConvertToFrame(): Frame = js.native
  def ConvertToInlineShape(): InlineShape = js.native
  def Delete(): Unit = js.native
  def Duplicate(): Shape = js.native
  def Flip(FlipCmd: MsoFlipCmd): Unit = js.native
  def IncrementLeft(Increment: Double): Unit = js.native
  def IncrementRotation(Increment: Double): Unit = js.native
  def IncrementTop(Increment: Double): Unit = js.native
  def PickUp(): Unit = js.native
  def RerouteConnections(): Unit = js.native
  /** @param Office.MsoScaleFrom [Scale=0] */
  def ScaleHeight(Factor: Double, RelativeToOriginalSize: MsoTriState): Unit = js.native
  def ScaleHeight(Factor: Double, RelativeToOriginalSize: MsoTriState, Scale: MsoScaleFrom): Unit = js.native
  /** @param Office.MsoScaleFrom [Scale=0] */
  def ScaleWidth(Factor: Double, RelativeToOriginalSize: MsoTriState): Unit = js.native
  def ScaleWidth(Factor: Double, RelativeToOriginalSize: MsoTriState, Scale: MsoScaleFrom): Unit = js.native
  def Select(): Unit = js.native
  def Select(Replace: js.Any): Unit = js.native
  def SetShapesDefaultProperties(): Unit = js.native
  def Ungroup(): ShapeRange = js.native
  def ZOrder(ZOrderCmd: MsoZOrderCmd): Unit = js.native
}

