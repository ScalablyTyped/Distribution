package typings.activexDashOffice.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShapeRange extends js.Object {
  @JSName("Adjustments")
  val Adjustments_Original: Adjustments = js.native
  var AlternativeText: String = js.native
  val Application: js.Any = js.native
  var AutoShapeType: MsoAutoShapeType = js.native
  var BackgroundStyle: MsoBackgroundStyleIndex = js.native
  var BlackWhiteMode: MsoBlackWhiteMode = js.native
  val Callout: CalloutFormat = js.native
  @JSName("CanvasItems")
  val CanvasItems_Original: CanvasShapes = js.native
  val Chart: IMsoChart = js.native
  val Child: MsoTriState = js.native
  val ConnectionSiteCount: Double = js.native
  val Connector: MsoTriState = js.native
  val ConnectorFormat: typings.activexDashOffice.OfficeNs.ConnectorFormat = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Diagram: IMsoDiagram = js.native
  val DiagramNode: typings.activexDashOffice.OfficeNs.DiagramNode = js.native
  val Fill: FillFormat = js.native
  val Glow: GlowFormat = js.native
  @JSName("GroupItems")
  val GroupItems_Original: GroupShapes = js.native
  val HasChart: MsoTriState = js.native
  val HasDiagram: MsoTriState = js.native
  val HasDiagramNode: MsoTriState = js.native
  var Height: Double = js.native
  val HorizontalFlip: MsoTriState = js.native
  val Id: Double = js.native
  var Left: Double = js.native
  val Line: LineFormat = js.native
  var LockAspectRatio: MsoTriState = js.native
  var Name: String = js.native
  @JSName("Nodes")
  val Nodes_Original: ShapeNodes = js.native
  val Parent: js.Any = js.native
  val ParentGroup: Shape = js.native
  val PictureFormat: typings.activexDashOffice.OfficeNs.PictureFormat = js.native
  val RTF: String = js.native
  val Reflection: ReflectionFormat = js.native
  var Rotation: Double = js.native
  val Script: typings.activexDashOffice.OfficeNs.Script = js.native
  val Shadow: ShadowFormat = js.native
  var ShapeStyle: MsoShapeStyleIndex = js.native
  val SoftEdge: SoftEdgeFormat = js.native
  val TextEffect: TextEffectFormat = js.native
  val TextFrame: typings.activexDashOffice.OfficeNs.TextFrame = js.native
  val TextFrame2: typings.activexDashOffice.OfficeNs.TextFrame2 = js.native
  val ThreeD: ThreeDFormat = js.native
  var Title: String = js.native
  var Top: Double = js.native
  val Type: MsoShapeType = js.native
  val VerticalFlip: MsoTriState = js.native
  val Vertices: js.Any = js.native
  var Visible: MsoTriState = js.native
  var Width: Double = js.native
  val ZOrderPosition: Double = js.native
  def apply(Index: js.Any): Shape = js.native
  def Adjustments(Index: Double): Double = js.native
  def Align(AlignCmd: MsoAlignCmd, RelativeTo: MsoTriState): Unit = js.native
  def Apply(): Unit = js.native
  def CanvasCropBottom(Increment: Double): Unit = js.native
  def CanvasCropLeft(Increment: Double): Unit = js.native
  def CanvasCropRight(Increment: Double): Unit = js.native
  def CanvasCropTop(Increment: Double): Unit = js.native
  def CanvasItems(Index: String): Shape = js.native
  def CanvasItems(Index: Double): Shape = js.native
  def Copy(): Unit = js.native
  def Cut(): Unit = js.native
  def Delete(): Unit = js.native
  def Distribute(DistributeCmd: MsoDistributeCmd, RelativeTo: MsoTriState): Unit = js.native
  def Duplicate(): ShapeRange = js.native
  def Flip(FlipCmd: MsoFlipCmd): Unit = js.native
  def Group(): Shape = js.native
  def GroupItems(Index: js.Any): Shape = js.native
  def IncrementLeft(Increment: Double): Unit = js.native
  def IncrementRotation(Increment: Double): Unit = js.native
  def IncrementTop(Increment: Double): Unit = js.native
  def Item(Index: js.Any): Shape = js.native
  /** @param PrimaryShape [PrimaryShape=0] */
  def MergeShapes(MergeCmd: MsoMergeCmd): Unit = js.native
  def MergeShapes(MergeCmd: MsoMergeCmd, PrimaryShape: Shape): Unit = js.native
  def Nodes(Index: js.Any): ShapeNode = js.native
  def PickUp(): Unit = js.native
  def Regroup(): Shape = js.native
  def RerouteConnections(): Unit = js.native
  /** @param fScale [fScale=0] */
  def ScaleHeight(Factor: Double, RelativeToOriginalSize: MsoTriState): Unit = js.native
  def ScaleHeight(Factor: Double, RelativeToOriginalSize: MsoTriState, fScale: MsoScaleFrom): Unit = js.native
  /** @param fScale [fScale=0] */
  def ScaleWidth(Factor: Double, RelativeToOriginalSize: MsoTriState): Unit = js.native
  def ScaleWidth(Factor: Double, RelativeToOriginalSize: MsoTriState, fScale: MsoScaleFrom): Unit = js.native
  def Select(): Unit = js.native
  def Select(Replace: js.Any): Unit = js.native
  def SetShapesDefaultProperties(): Unit = js.native
  def Ungroup(): ShapeRange = js.native
  def ZOrder(ZOrderCmd: MsoZOrderCmd): Unit = js.native
}

