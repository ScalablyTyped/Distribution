package typings.activexWord.Word

import typings.activexOffice.Office.IMsoDiagram
import typings.activexOffice.Office.MsoAlignCmd
import typings.activexOffice.Office.MsoAutoShapeType
import typings.activexOffice.Office.MsoBackgroundStyleIndex
import typings.activexOffice.Office.MsoDistributeCmd
import typings.activexOffice.Office.MsoFlipCmd
import typings.activexOffice.Office.MsoScaleFrom
import typings.activexOffice.Office.MsoShapeStyleIndex
import typings.activexOffice.Office.MsoShapeType
import typings.activexOffice.Office.MsoTriState
import typings.activexOffice.Office.MsoZOrderCmd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShapeRange extends js.Object {
  val Adjustments: typings.activexWord.Word.Adjustments = js.native
  var AlternativeText: String = js.native
  val Anchor: Range = js.native
  val Application: typings.activexWord.Word.Application = js.native
  var AutoShapeType: MsoAutoShapeType = js.native
  var BackgroundStyle: MsoBackgroundStyleIndex = js.native
  val Callout: CalloutFormat = js.native
  val CanvasItems: CanvasShapes = js.native
  val Child: MsoTriState = js.native
  val ConnectionSiteCount: Double = js.native
  val Connector: MsoTriState = js.native
  val ConnectorFormat: typings.activexWord.Word.ConnectorFormat = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Diagram: IMsoDiagram = js.native
  val DiagramNode: typings.activexWord.Word.DiagramNode = js.native
  val Fill: FillFormat = js.native
  val Glow: GlowFormat = js.native
  val GroupItems: GroupShapes = js.native
  val HasDiagram: MsoTriState = js.native
  val HasDiagramNode: MsoTriState = js.native
  var Height: Double = js.native
  var HeightRelative: Double = js.native
  val HorizontalFlip: MsoTriState = js.native
  val Hyperlink: typings.activexWord.Word.Hyperlink = js.native
  val ID: Double = js.native
  var LayoutInCell: Double = js.native
  var Left: Double = js.native
  var LeftRelative: Double = js.native
  val Line: LineFormat = js.native
  var LockAnchor: Double = js.native
  var LockAspectRatio: MsoTriState = js.native
  var Name: String = js.native
  val Nodes: ShapeNodes = js.native
  val Parent: js.Any = js.native
  val ParentGroup: Shape = js.native
  val PictureFormat: typings.activexWord.Word.PictureFormat = js.native
  val RTF: String = js.native
  val Reflection: ReflectionFormat = js.native
  var RelativeHorizontalPosition: WdRelativeHorizontalPosition = js.native
  var RelativeHorizontalSize: WdRelativeHorizontalSize = js.native
  var RelativeVerticalPosition: WdRelativeVerticalPosition = js.native
  var RelativeVerticalSize: WdRelativeVerticalSize = js.native
  var Rotation: Double = js.native
  val Shadow: ShadowFormat = js.native
  var ShapeStyle: MsoShapeStyleIndex = js.native
  val SoftEdge: SoftEdgeFormat = js.native
  val TextEffect: TextEffectFormat = js.native
  val TextFrame: typings.activexWord.Word.TextFrame = js.native
  val TextFrame2: typings.activexOffice.Office.TextFrame2 = js.native
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
  @JSName("Word.ShapeRange_typekey")
  var WordDotShapeRange_typekey: ShapeRange = js.native
  val WrapFormat: typings.activexWord.Word.WrapFormat = js.native
  val ZOrderPosition: Double = js.native
  def Activate(): Unit = js.native
  def Align(Align: MsoAlignCmd, RelativeTo: Double): Unit = js.native
  def Apply(): Unit = js.native
  def CanvasCropBottom(Increment: Double): Unit = js.native
  def CanvasCropLeft(Increment: Double): Unit = js.native
  def CanvasCropRight(Increment: Double): Unit = js.native
  def CanvasCropTop(Increment: Double): Unit = js.native
  def ConvertToFrame(): Frame = js.native
  def ConvertToInlineShape(): InlineShape = js.native
  def Delete(): Unit = js.native
  def Distribute(Distribute: MsoDistributeCmd, RelativeTo: Double): Unit = js.native
  def Duplicate(): ShapeRange = js.native
  def Flip(FlipCmd: MsoFlipCmd): Unit = js.native
  def Group(): Shape = js.native
  def IncrementLeft(Increment: Double): Unit = js.native
  def IncrementRotation(Increment: Double): Unit = js.native
  def IncrementTop(Increment: Double): Unit = js.native
  def Item(Index: js.Any): Shape = js.native
  def PickUp(): Unit = js.native
  def Regroup(): Shape = js.native
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

