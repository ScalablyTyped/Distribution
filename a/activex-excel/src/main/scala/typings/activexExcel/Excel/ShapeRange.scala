package typings.activexExcel.Excel

import typings.activexOffice.Office.CanvasShapes
import typings.activexOffice.Office.GlowFormat
import typings.activexOffice.Office.MsoAlignCmd
import typings.activexOffice.Office.MsoAutoShapeType
import typings.activexOffice.Office.MsoBackgroundStyleIndex
import typings.activexOffice.Office.MsoBlackWhiteMode
import typings.activexOffice.Office.MsoDistributeCmd
import typings.activexOffice.Office.MsoFlipCmd
import typings.activexOffice.Office.MsoScaleFrom
import typings.activexOffice.Office.MsoShapeStyleIndex
import typings.activexOffice.Office.MsoShapeType
import typings.activexOffice.Office.MsoTriState
import typings.activexOffice.Office.MsoZOrderCmd
import typings.activexOffice.Office.ReflectionFormat
import typings.activexOffice.Office.SoftEdgeFormat
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShapeRange extends js.Object {
  @JSName("Adjustments")
  val Adjustments_Original: Adjustments = js.native
  var AlternativeText: String = js.native
  val Application: typings.activexExcel.Excel.Application = js.native
  var AutoShapeType: MsoAutoShapeType = js.native
  var BackgroundStyle: MsoBackgroundStyleIndex = js.native
  var BlackWhiteMode: MsoBlackWhiteMode = js.native
  val Callout: CalloutFormat = js.native
  @JSName("CanvasItems")
  val CanvasItems_Original: CanvasShapes = js.native
  val Chart: typings.activexExcel.Excel.Chart = js.native
  val Child: MsoTriState = js.native
  val ConnectionSiteCount: Double = js.native
  val Connector: MsoTriState = js.native
  val ConnectorFormat: typings.activexExcel.Excel.ConnectorFormat = js.native
  val Count: Double = js.native
  val Creator: XlCreator = js.native
  val Diagram: typings.activexExcel.Excel.Diagram = js.native
  val DiagramNode: typings.activexExcel.Excel.DiagramNode = js.native
  val Fill: FillFormat = js.native
  val Glow: GlowFormat = js.native
  @JSName("GroupItems")
  val GroupItems_Original: GroupShapes = js.native
  val HasChart: MsoTriState = js.native
  val HasDiagram: MsoTriState = js.native
  val HasDiagramNode: MsoTriState = js.native
  var Height: Double = js.native
  val HorizontalFlip: MsoTriState = js.native
  val ID: Double = js.native
  var Left: Double = js.native
  val Line: LineFormat = js.native
  var LockAspectRatio: MsoTriState = js.native
  var Name: String = js.native
  @JSName("Nodes")
  val Nodes_Original: ShapeNodes = js.native
  val Parent: js.Any = js.native
  val ParentGroup: Shape = js.native
  val PictureFormat: typings.activexExcel.Excel.PictureFormat = js.native
  val Reflection: ReflectionFormat = js.native
  var Rotation: Double = js.native
  val Shadow: ShadowFormat = js.native
  var ShapeStyle: MsoShapeStyleIndex = js.native
  val SoftEdge: SoftEdgeFormat = js.native
  val TextEffect: TextEffectFormat = js.native
  val TextFrame: typings.activexExcel.Excel.TextFrame = js.native
  val TextFrame2: typings.activexExcel.Excel.TextFrame2 = js.native
  val ThreeD: ThreeDFormat = js.native
  var Title: String = js.native
  var Top: Double = js.native
  val Type: MsoShapeType = js.native
  val VerticalFlip: MsoTriState = js.native
  val Vertices: SafeArray[Double] = js.native
  var Visible: MsoTriState = js.native
  var Width: Double = js.native
  val ZOrderPosition: Double = js.native
  def apply(Index: String): Shape = js.native
  def apply(Index: Double): Shape = js.native
  def Adjustments(Index: Double): Double = js.native
  def Align(AlignCmd: MsoAlignCmd, RelativeTo: MsoTriState): Unit = js.native
  def Apply(): Unit = js.native
  def CanvasCropBottom(Increment: Double): Unit = js.native
  def CanvasCropLeft(Increment: Double): Unit = js.native
  def CanvasCropRight(Increment: Double): Unit = js.native
  def CanvasCropTop(Increment: Double): Unit = js.native
  def CanvasItems(Index: String): typings.activexOffice.Office.Shape = js.native
  def CanvasItems(Index: Double): typings.activexOffice.Office.Shape = js.native
  def Delete(): Unit = js.native
  def Distribute(DistributeCmd: MsoDistributeCmd, RelativeTo: MsoTriState): Unit = js.native
  def Duplicate(): ShapeRange = js.native
  def Flip(FlipCmd: MsoFlipCmd): Unit = js.native
  def Group(): Shape = js.native
  def GroupItems(Index: String): Shape = js.native
  def GroupItems(Index: Double): Shape = js.native
  def IncrementLeft(Increment: Double): Unit = js.native
  def IncrementRotation(Increment: Double): Unit = js.native
  def IncrementTop(Increment: Double): Unit = js.native
  def Item(Index: String): Shape = js.native
  def Item(Index: Double): Shape = js.native
  def Nodes(Index: String): ShapeNode = js.native
  def Nodes(Index: Double): ShapeNode = js.native
  def PickUp(): Unit = js.native
  def Regroup(): Shape = js.native
  def RerouteConnections(): Unit = js.native
  def ScaleHeight(Factor: Double, RelativeToOriginalSize: MsoTriState): Unit = js.native
  def ScaleHeight(Factor: Double, RelativeToOriginalSize: MsoTriState, Scale: MsoScaleFrom): Unit = js.native
  def ScaleWidth(Factor: Double, RelativeToOriginalSize: MsoTriState): Unit = js.native
  def ScaleWidth(Factor: Double, RelativeToOriginalSize: MsoTriState, Scale: MsoScaleFrom): Unit = js.native
  def Select(): Unit = js.native
  def Select(Replace: Boolean): Unit = js.native
  def SetShapesDefaultProperties(): Unit = js.native
  def Ungroup(): ShapeRange = js.native
  def ZOrder(ZOrderCmd: MsoZOrderCmd): Unit = js.native
  def _Default(Index: js.Any): Shape = js.native
}

