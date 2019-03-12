package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShapeRange extends js.Object {
  @JSName("Adjustments")
  val Adjustments_Original: Adjustments = js.native
  var AlternativeText: java.lang.String = js.native
  val Application: activexDashExcelLib.ExcelNs.Application = js.native
  var AutoShapeType: activexDashOfficeLib.OfficeNs.MsoAutoShapeType = js.native
  var BackgroundStyle: activexDashOfficeLib.OfficeNs.MsoBackgroundStyleIndex = js.native
  var BlackWhiteMode: activexDashOfficeLib.OfficeNs.MsoBlackWhiteMode = js.native
  val Callout: CalloutFormat = js.native
  @JSName("CanvasItems")
  val CanvasItems_Original: activexDashOfficeLib.OfficeNs.CanvasShapes = js.native
  val Chart: activexDashExcelLib.ExcelNs.Chart = js.native
  val Child: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  val ConnectionSiteCount: scala.Double = js.native
  val Connector: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  val ConnectorFormat: activexDashExcelLib.ExcelNs.ConnectorFormat = js.native
  val Count: scala.Double = js.native
  val Creator: XlCreator = js.native
  val Diagram: activexDashExcelLib.ExcelNs.Diagram = js.native
  val DiagramNode: activexDashExcelLib.ExcelNs.DiagramNode = js.native
  val Fill: FillFormat = js.native
  val Glow: activexDashOfficeLib.OfficeNs.GlowFormat = js.native
  @JSName("GroupItems")
  val GroupItems_Original: GroupShapes = js.native
  val HasChart: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  val HasDiagram: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  val HasDiagramNode: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  var Height: scala.Double = js.native
  val HorizontalFlip: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  val ID: scala.Double = js.native
  var Left: scala.Double = js.native
  val Line: LineFormat = js.native
  var LockAspectRatio: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  var Name: java.lang.String = js.native
  @JSName("Nodes")
  val Nodes_Original: ShapeNodes = js.native
  val Parent: js.Any = js.native
  val ParentGroup: Shape = js.native
  val PictureFormat: activexDashExcelLib.ExcelNs.PictureFormat = js.native
  val Reflection: activexDashOfficeLib.OfficeNs.ReflectionFormat = js.native
  var Rotation: scala.Double = js.native
  val Shadow: ShadowFormat = js.native
  var ShapeStyle: activexDashOfficeLib.OfficeNs.MsoShapeStyleIndex = js.native
  val SoftEdge: activexDashOfficeLib.OfficeNs.SoftEdgeFormat = js.native
  val TextEffect: TextEffectFormat = js.native
  val TextFrame: activexDashExcelLib.ExcelNs.TextFrame = js.native
  val TextFrame2: activexDashExcelLib.ExcelNs.TextFrame2 = js.native
  val ThreeD: ThreeDFormat = js.native
  var Title: java.lang.String = js.native
  var Top: scala.Double = js.native
  val Type: activexDashOfficeLib.OfficeNs.MsoShapeType = js.native
  val VerticalFlip: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  val Vertices: stdLib.SafeArray[scala.Double] = js.native
  var Visible: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  var Width: scala.Double = js.native
  val ZOrderPosition: scala.Double = js.native
  def apply(Index: java.lang.String): Shape = js.native
  def apply(Index: scala.Double): Shape = js.native
  def Adjustments(Index: scala.Double): scala.Double = js.native
  def Align(
    AlignCmd: activexDashOfficeLib.OfficeNs.MsoAlignCmd,
    RelativeTo: activexDashOfficeLib.OfficeNs.MsoTriState
  ): scala.Unit = js.native
  def Apply(): scala.Unit = js.native
  def CanvasCropBottom(Increment: scala.Double): scala.Unit = js.native
  def CanvasCropLeft(Increment: scala.Double): scala.Unit = js.native
  def CanvasCropRight(Increment: scala.Double): scala.Unit = js.native
  def CanvasCropTop(Increment: scala.Double): scala.Unit = js.native
  def CanvasItems(Index: java.lang.String): activexDashOfficeLib.OfficeNs.Shape = js.native
  def CanvasItems(Index: scala.Double): activexDashOfficeLib.OfficeNs.Shape = js.native
  def Delete(): scala.Unit = js.native
  def Distribute(
    DistributeCmd: activexDashOfficeLib.OfficeNs.MsoDistributeCmd,
    RelativeTo: activexDashOfficeLib.OfficeNs.MsoTriState
  ): scala.Unit = js.native
  def Duplicate(): ShapeRange = js.native
  def Flip(FlipCmd: activexDashOfficeLib.OfficeNs.MsoFlipCmd): scala.Unit = js.native
  def Group(): Shape = js.native
  def GroupItems(Index: java.lang.String): Shape = js.native
  def GroupItems(Index: scala.Double): Shape = js.native
  def IncrementLeft(Increment: scala.Double): scala.Unit = js.native
  def IncrementRotation(Increment: scala.Double): scala.Unit = js.native
  def IncrementTop(Increment: scala.Double): scala.Unit = js.native
  def Item(Index: java.lang.String): Shape = js.native
  def Item(Index: scala.Double): Shape = js.native
  def Nodes(Index: java.lang.String): ShapeNode = js.native
  def Nodes(Index: scala.Double): ShapeNode = js.native
  def PickUp(): scala.Unit = js.native
  def Regroup(): Shape = js.native
  def RerouteConnections(): scala.Unit = js.native
  def ScaleHeight(Factor: scala.Double, RelativeToOriginalSize: activexDashOfficeLib.OfficeNs.MsoTriState): scala.Unit = js.native
  def ScaleHeight(
    Factor: scala.Double,
    RelativeToOriginalSize: activexDashOfficeLib.OfficeNs.MsoTriState,
    Scale: activexDashOfficeLib.OfficeNs.MsoScaleFrom
  ): scala.Unit = js.native
  def ScaleWidth(Factor: scala.Double, RelativeToOriginalSize: activexDashOfficeLib.OfficeNs.MsoTriState): scala.Unit = js.native
  def ScaleWidth(
    Factor: scala.Double,
    RelativeToOriginalSize: activexDashOfficeLib.OfficeNs.MsoTriState,
    Scale: activexDashOfficeLib.OfficeNs.MsoScaleFrom
  ): scala.Unit = js.native
  def Select(): scala.Unit = js.native
  def Select(Replace: scala.Boolean): scala.Unit = js.native
  def SetShapesDefaultProperties(): scala.Unit = js.native
  def Ungroup(): ShapeRange = js.native
  def ZOrder(ZOrderCmd: activexDashOfficeLib.OfficeNs.MsoZOrderCmd): scala.Unit = js.native
  def _Default(Index: js.Any): Shape = js.native
}

